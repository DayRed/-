package com.demo.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.dao.IM_InfoData;
import com.demo.vo.InfoData;

public class InfoData_ImpleMent implements IM_InfoData{
	private Connection con;
	private PreparedStatement ps;
	
	public InfoData_ImpleMent(Connection coon){
		this.con=coon;
	}
	@Override
	public List<InfoData> findByAll() {
		List<InfoData> all=new ArrayList<InfoData>();
		String sql = "select * from infodata LIMIT 50";
		try {
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				InfoData id=new InfoData();
				id.setCity(rs.getString(1));
				id.setCounty(rs.getString(2));
				id.setName(rs.getString(3));
				id.setHandletimes(rs.getString(4));
				id.setState(rs.getString(5));
				id.setText(rs.getString(6));
				id.setReflecttimes(rs.getString(7));
				id.setSource(rs.getString(8));
				id.setCompany(rs.getString(9));
				id.setReplytimes(rs.getString(10));
				id.setReplytext(rs.getString(11));
				all.add(id);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return all;
	}
	@Override
	public List<InfoData> findByAddress(String address) {
		List<InfoData> all=new ArrayList<InfoData>();
		String sql = "select * from infodata where county = ?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, address);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				InfoData id=new InfoData();
				id.setCity(rs.getString(1));
				id.setCounty(rs.getString(2));
				id.setName(rs.getString(3));
				id.setHandletimes(rs.getString(4));
				id.setState(rs.getString(5));
				id.setText(rs.getString(6));
				id.setReflecttimes(rs.getString(7));
				id.setSource(rs.getString(8));
				id.setCompany(rs.getString(9));
				id.setReplytimes(rs.getString(10));
				id.setReplytext(rs.getString(11));
				all.add(id);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return all;
	}
	@Override
	public List<InfoData> findByReaction(String reaction) {
		List<InfoData> all=new ArrayList<InfoData>();
		String sql = "select * from infodata where reflecttimes =?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, reaction);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				InfoData id=new InfoData();
				id.setCity(rs.getString(1));
				id.setCounty(rs.getString(2));
				id.setName(rs.getString(3));
				id.setHandletimes(rs.getString(4));
				id.setState(rs.getString(5));
				id.setText(rs.getString(6));
				id.setReflecttimes(rs.getString(7));
				id.setSource(rs.getString(8));
				id.setCompany(rs.getString(9));
				id.setReplytimes(rs.getString(10));
				id.setReplytext(rs.getString(11));
				all.add(id);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return all;
	}
}
