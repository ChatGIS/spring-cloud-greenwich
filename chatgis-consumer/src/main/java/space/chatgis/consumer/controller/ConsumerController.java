package space.chatgis.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.chatgis.consumer.feign.ProviderClient;

@RestController
public class ConsumerController {
    @Autowired
    private ProviderClient providerClient;
    @RequestMapping("/hello")
    public String hello() {
        return "Consumer Feign: " + providerClient.hello();
    }
}
