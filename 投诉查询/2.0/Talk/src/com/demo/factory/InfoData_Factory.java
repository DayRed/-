package com.demo.factory;

import com.demo.dao.IM_InfoData;
import com.demo.proxy.InfoData_Proxy;
import com.demo.vo.InfoData;

public class InfoData_Factory {
	public static IM_InfoData getInfoDataInstance() throws Exception{
		return new InfoData_Proxy();
	}
}
