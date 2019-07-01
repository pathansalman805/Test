package com.Demo.AOPDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppCongif.class);
        Aian a=context.getBean(Aian.class);
        a.show();
    }
}
