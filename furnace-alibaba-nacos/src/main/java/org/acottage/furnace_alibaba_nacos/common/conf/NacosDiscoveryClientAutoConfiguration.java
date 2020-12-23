//package org.acottage.furnace_alibaba_nacos.common.conf;
//
//import com.alibaba.cloud.nacos.ConditionalOnNacosDiscoveryEnabled;
//import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
//import com.alibaba.cloud.nacos.discovery.NacosDiscoveryClient;
//import com.alibaba.cloud.nacos.discovery.NacosWatch;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.cloud.client.CommonsClientAutoConfiguration;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.discovery.simple.SimpleDiscoveryClientAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//
///**
// * @Author liuli
// * @Email liulitongxue@126.com
// * @Date 2020/12/23 下午 10:16
// * @Version 1.0
// *
// * nacos客户端注册至服务端时，更改服务详情中的元数据，元数据显示服务注册时间
// */
//@Configuration
//@ConditionalOnNacosDiscoveryEnabled
//@AutoConfigureBefore({SimpleDiscoveryClientAutoConfiguration.class, CommonsClientAutoConfiguration.class})
//public class NacosDiscoveryClientAutoConfiguration {
//
//    @Value("${spring.profiles.active}")
//    public String profile;
//
//    public NacosDiscoveryClientAutoConfiguration() {
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public NacosDiscoveryProperties nacosProperties() {
//        return new NacosDiscoveryProperties();
//    }
//
//    @Bean
//    public DiscoveryClient nacosDiscoveryClient(NacosDiscoveryProperties discoveryProperties) {
//        return new NacosDiscoveryClient(discoveryProperties);
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    @ConditionalOnProperty(value = {"spring.cloud.nacos.discovery.watch.enabled"}, matchIfMissing = true)
//    public NacosWatch nacosWatch(NacosDiscoveryProperties nacosDiscoveryProperties) {
//        //原来的元数据全部清空
//        nacosDiscoveryProperties.setMetadata(new HashMap<>());
//        //更改服务详情中的元数据，增加服务注册时间
//        nacosDiscoveryProperties.getMetadata().put("startup.time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        nacosDiscoveryProperties.getMetadata().put("spring.profiles.active", profile);
//        return new NacosWatch(nacosDiscoveryProperties);
//    }
//}
