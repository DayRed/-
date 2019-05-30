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

public class FIND_Reaction extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String reaction = req.getParameter("reaction");
		String year = reaction.substring(0, 4);
		String month = reaction.substring(6,7);
		String dd = reaction.substring(8,10);
		if(dd.startsWith("0")){
			dd = dd.substring(1,2);
		}
		String time = year+month+dd;
		StringBuffer sb = new StringBuffer(time);
		sb.insert(4, "/");
		sb.insert(6, "/");
		if(sb.length()>8){
			sb.append(" 00:00:00");
		}else{
			sb.append(" 00:00:00");
		}
		time = sb.toString();
		try {
			IM_InfoData dao = InfoData_Factory.getInfoDataInstance();
			List<InfoData> list=dao.findByReaction(time);
			if(list.size()!=0){
				req.setAttribute("info", list);
				RequestDispatcher reds=req.getRequestDispatcher("reaction.jsp");
				reds.forward(req, res);
			}else{
				RequestDispatcher reds=req.getRequestDispatcher("lo.jsp");
				reds.forward(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		this.doGet(req,res);
	}
}
