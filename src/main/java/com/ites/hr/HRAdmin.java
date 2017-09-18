package com.ites.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ites.hr")
public class HRAdmin
{
    public static void main( String[] args )
    {
        SpringApplication.run(HRAdmin.class, args);

    }
}
