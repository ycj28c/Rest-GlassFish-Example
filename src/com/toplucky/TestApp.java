package com.toplucky;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.filter.LoggingFilter;
//import org.glassfish.jersey.jackson.JacksonFeature;

import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationPath("/rest")
public class TestApp extends ResourceConfig {

	public TestApp() {
		//���������ڵİ�·�� 
		packages("com.toplucky.resource");
		//��ӡ������־�����ڸ��ٵ��ԣ���ʽ���������
		register(LoggingFilter.class);
		//ע��JSONת���� (�������ֶ����ԣ�����tomcat���������⣬��Ҫʹ��glassfish4����)
		//register(JacksonFeature.class);
		register(JacksonJsonProvider.class); 
	}

}