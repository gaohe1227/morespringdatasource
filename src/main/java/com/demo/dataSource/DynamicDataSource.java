package com.demo.dataSource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.jdbc.datasource.lookup.DataSourceLookup;

public class DynamicDataSource extends AbstractRoutingDataSource {
  private String defaultTargetDataSource1;
 
	@Override
	public void setDefaultTargetDataSource(Object defaultTargetDataSource) {
		// TODO Auto-generated method stub
		this.defaultTargetDataSource1=defaultTargetDataSource.toString();
		System.err.println(defaultTargetDataSource);
		super.setDefaultTargetDataSource(defaultTargetDataSource);
	}

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return DataSourceContextHolder.getDataSourceType();
	}

 
 
 

 

 

 
 

 

}
