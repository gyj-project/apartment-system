package cn.bzu.fixprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FixproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FixproviderApplication.class, args);
    }

}
