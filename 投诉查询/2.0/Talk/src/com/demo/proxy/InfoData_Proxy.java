package com.demo.proxy;

import java.util.List;

import com.demo.dao.IM_InfoData;
import com.demo.dbc.DatabaseConnection;
import com.demo.implement.InfoData_ImpleMent;
import com.demo.vo.InfoData;

public class InfoData_Proxy implements IM_InfoData{
	public DatabaseConnection dbc;
	public IM_InfoData dao;
	public InfoData_Proxy() throws Exception{
		this.dbc=new DatabaseConnection();
		dao=new InfoData_ImpleMent(this.dbc.getConnection());
	}
	
	@Override
	public List<InfoData> findByAll() {
		List<InfoData> all = null;
		try {
			all = this.dao.findByAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return all;
	}

	@Override
	public List<InfoData> findByAddress(String address) {
		List<InfoData> all = null;
		try {
			all = this.dao.findByAddress(address);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return all;
	}

	@Override
	public List<InfoData> findByReaction(String reaction) {
		List<InfoData> all = null;
		try {
			all = this.dao.findByReaction(reaction);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return all;
	}

}
