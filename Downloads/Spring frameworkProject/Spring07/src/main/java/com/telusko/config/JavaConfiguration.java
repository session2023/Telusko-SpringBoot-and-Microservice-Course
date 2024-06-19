package com.telusko.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.telusko"})
public class JavaConfiguration
{
	
	public JavaConfiguration()
	{
		System.out.println("JavaConfig bean also created");
	}
	
	@Bean
   public LocalDateTime createDateBean()
   {
	   System.out.println("LocalDateTime Bean created manually and then considered as Bean");
	    return LocalDateTime.now();
   }
   
}
