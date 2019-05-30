package com.demo.dao;

import java.util.List;

import com.demo.vo.InfoData;

public interface IM_InfoData {
	public List<InfoData> findByAll();
	
	public List<InfoData> findByAddress(String address);
	
	public List<InfoData> findByReaction(String reaction);
}
