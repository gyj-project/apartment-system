package cn.bzu.manageconsumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageconsumerApplication.class, args);
    }

}
