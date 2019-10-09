package cn.bzu.recordprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RecordproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordproviderApplication.class, args);
    }

}
