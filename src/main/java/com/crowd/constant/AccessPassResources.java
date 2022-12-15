package com.crowd.constant;

import java.util.HashSet;
import java.util.Set;

public class AccessPassResources {
	public static final Set<String> PASS_RES_SET=new HashSet<>();
	
	public static final Set<String> STATIC_RES_SET=new HashSet<>();
	
	static{
		PASS_RES_SET.add("/");
		PASS_RES_SET.add("/auth/to/login/page.html");
		PASS_RES_SET.add("/auth/to/reg/page.html");
		PASS_RES_SET.add("/auth/do/login");
		PASS_RES_SET.add("/auth/do/register");
		PASS_RES_SET.add("/auth/logout");
		PASS_RES_SET.add("/auth/send/message.json");
	}
	
	static {
		STATIC_RES_SET.add("bootstrap");
		STATIC_RES_SET.add("css");
		STATIC_RES_SET.add("fonts");
		STATIC_RES_SET.add("img");
		STATIC_RES_SET.add("jquery");
		STATIC_RES_SET.add("layer");
		STATIC_RES_SET.add("script");
		STATIC_RES_SET.add("ztree");
	}
	
	public static boolean judgeWhetherStaticRes(String servletPath) {
		if(servletPath==null||servletPath.length()==0) {
			throw new RuntimeException(CrowdConstant.MESSAGE_STRING_INVALIDATE);
		}
		String[] split = servletPath.split("/");
		String firstPath=split[1];
		return STATIC_RES_SET.contains(firstPath);
	}
}
