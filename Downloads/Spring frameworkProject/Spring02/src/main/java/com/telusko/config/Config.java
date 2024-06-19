package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("c")
public class Config  //config
{
	
	public Config()
	{
		System.out.println("Config bean is created");
	}
	
	public void disp()
	{
		System.out.println("Logic in config");
	}
	
	@Bean
	public Beta betaInstance()
	{
		Beta b=new Beta();
		return b;
	//	return new Beta();
	}
	
	@Bean
	public Password generatePassword()
	{
		Password p=new Password("SHA");
		return p;
	}

}
