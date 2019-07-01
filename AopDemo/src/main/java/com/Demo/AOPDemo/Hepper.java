package com.Demo.AOPDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Hepper {
@After("execution (public void show())")
	public void log()
	{
		System.out.println("Show the log file");
	}
}
