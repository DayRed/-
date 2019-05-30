package ser;

import javax.servlet.*;
import javax.servlet.http.*;

import com.demo.dao.IM_InfoData;
import com.demo.factory.InfoData_Factory;
import com.demo.vo.InfoData;

import java.io.*;
import java.util.*;


public class FIND extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		try {
			IM_InfoData dao = InfoData_Factory.getInfoDataInstance();
			List<InfoData> list=dao.findByAll();
			req.setAttribute("info", list);
			RequestDispatcher reds=req.getRequestDispatcher("f1.jsp");
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
