package com.tensquare.recruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import utils.IdWorker;

@SpringBootApplication
@EnableEurekaClient
public class RecruitApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecruitApplication.class, args);
    }

    /**
     * 将id生成器放到容器中
     * @return
     */
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
