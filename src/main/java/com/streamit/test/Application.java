package com.streamit.test;

import com.streamit.configuration.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableFeignClients
@ImportResource({
        "classpath:inquery-statement.xml"
})
@PropertySources({
        @PropertySource(value = "file:/Users/jakkit/properties/eKYC/config.yaml", factory = YamlPropertySourceFactory.class,ignoreResourceNotFound = true),
        @PropertySource(value = "file:/Users/jakkit/properties/eKYC/application.yml", factory = YamlPropertySourceFactory.class,ignoreResourceNotFound = true),
        @PropertySource(value = "file:C:/properties/sep/test/config.yaml", factory = YamlPropertySourceFactory.class,ignoreResourceNotFound = true),
        @PropertySource(value = "file:C:/properties/sep/test/application.yml", factory = YamlPropertySourceFactory.class,ignoreResourceNotFound = true)
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
