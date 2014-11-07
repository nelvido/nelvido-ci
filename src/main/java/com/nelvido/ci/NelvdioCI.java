package com.nelvido.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
public class NelvdioCI {

    public static void main(String[] args) {
        SpringApplication.run(NelvdioCI.class, args);
    }

}
