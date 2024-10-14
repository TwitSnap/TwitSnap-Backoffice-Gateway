package com.example.twitsnapbackofficegateway;

import com.example.twitsnapbackofficegateway.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitSnapGatewayApplication{
    public static void main(String[] args){
        Config.setEnv();
        SpringApplication.run(TwitSnapGatewayApplication.class, args);
    }
}
