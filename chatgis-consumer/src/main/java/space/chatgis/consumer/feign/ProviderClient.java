package space.chatgis.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "chatgis-eureka-provider")
public interface ProviderClient {
    @GetMapping("hello")
    String hello();
}
