package ser;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.IM_InfoData;
import com.demo.factory.InfoData_Factory;
import com.demo.vo.InfoData;

public class FIND_Address extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String address = req.getParameter("projectPorperty");
		try {
			IM_InfoData dao = InfoData_Factory.getInfoDataInstance();
			List<InfoData> list=dao.findByAddress(address);
			req.setAttribute("info", list);
			RequestDispatcher reds=req.getRequestDispatcher("address.jsp");
			reds.forward(req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		this.doGet(req,res);
	}
}
