package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SpringBootApplication
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
//
//package com.udacity.pricing;
//
//        import com.udacity.pricing.domain.price.Price;
//        import org.apache.commons.lang.builder.ToStringBuilder;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.boot.CommandLineRunner;
//        import org.springframework.boot.SpringApplication;
//        import org.springframework.boot.autoconfigure.SpringBootApplication;
//        import org.springframework.cloud.client.ServiceInstance;
//        import org.springframework.cloud.client.discovery.DiscoveryClient;
//        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//        import org.springframework.cloud.openfeign.EnableFeignClients;
//        import org.springframework.cloud.openfeign.FeignClient;
//        import org.springframework.stereotype.Component;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RequestMethod;
//
//        import java.util.List;
//
///**
// * Creates a Spring Boot Application to run the Pricing Service.
// * TODO: Convert the application from a REST API to a microservice.
// */
//@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//public class PricingServiceApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(PricingServiceApplication.class, args);
//    }
//
//    @Component
//    class DiscoveryClientExample implements CommandLineRunner {
//
//        @Autowired
//        private DiscoveryClient discoveryClient;
//
//        @Override
//        public void run(String... strings) throws Exception {
//            discoveryClient.getInstances("price-service").forEach((ServiceInstance s) -> {
//                System.out.println(ToStringBuilder.reflectionToString(s));
//            });
//        }
//    }
//
//    @FeignClient("price-service")
//    interface PriceClient {
//
//        @RequestMapping(method = RequestMethod.GET, value = "/prices")
//        List<Price> getBookmarks();
//    }
//}
