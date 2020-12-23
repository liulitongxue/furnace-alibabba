package org.acottage.furnace_alibaba_nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/10/23 上午 12:13
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FurnaceAlibabaNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(FurnaceAlibabaNacosApplication.class, args);
    }

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }
    }
}
