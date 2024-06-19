package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Beta;
import com.telusko.config.Config;
import com.telusko.controller.Weblayer;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
        
		
		Weblayer webBean=container.getBean(Weblayer.class);
		
		webBean.disp();
		
		Config configBean=(Config) container.getBean("c");
		configBean.disp();
		
		Beta betaBean=container.getBean(Beta.class);
		betaBean.disp();

	}

}
