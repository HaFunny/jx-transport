package com.jx.transport;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@EnableCaching
@ImportResource("classpath*:config/spring.xml")
@MapperScan({"com.jx.transport.**.dao"})
@SpringBootApplication(scanBasePackages = {"com.jx"})
@EnableEncryptableProperties
@ServletComponentScan(basePackages = "com.jx")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class JxTransportGenericApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxTransportGenericApplication.class, args);
    }

}
