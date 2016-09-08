package com.demo.dataSource;



import org.aspectj.lang.JoinPoint;

public class DynamicDataSourceInterceptor {

	public void setTestDataSource1(JoinPoint jp) {
		System.err.println(jp.getTarget().getClass()+"--------------"+jp.getTarget());
		DataSourceContextHolder.setDataSourceType("testDataSource1");
	}
	
	public void setTestDataSource2(JoinPoint jp) {
		System.err.println(jp.getTarget().getClass());
		DataSourceContextHolder.setDataSourceType("testDataSource2");
	}
}