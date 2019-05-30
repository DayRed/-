package com.demo.test;

import java.util.List;

import com.demo.dao.IM_InfoData;
import com.demo.factory.InfoData_Factory;
import com.demo.vo.InfoData;

public class Test {
	public static void main(String[] args) throws Exception {
		IM_InfoData dao = InfoData_Factory.getInfoDataInstance();
//		
//		List<InfoData> all=dao.findByAll();
//		System.out.println(all.size());
		//System.out.println(all);
		
//		List<InfoData> all_Address=dao.findByAddress("ÏÂ³ÇÇø");
//		System.out.println(all_Address.size());
		
		List<InfoData> all_Reaction=dao.findByReaction("2019/3/5");
		System.out.println(all_Reaction);
		System.out.println(all_Reaction.size());
		
	}
}
