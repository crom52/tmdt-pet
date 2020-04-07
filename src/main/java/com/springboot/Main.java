package com.springboot;
import java.io.IOException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.springboot.ServiceController"})
@MapperScan("com.springboot.mapper")
@SpringBootApplication
public class Main 
{
    public static void main( String[] args ) throws IOException
    {	
        SpringApplication.run(Main.class, args);
        }              
}

