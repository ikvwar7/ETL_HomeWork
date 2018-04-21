package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import scheduled.Sheduled;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    static public final String exchangeName = "etl.status";
    static public final String queueName = "Kirill";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Sheduled shedulled(){
        return new Sheduled();
    }

}
