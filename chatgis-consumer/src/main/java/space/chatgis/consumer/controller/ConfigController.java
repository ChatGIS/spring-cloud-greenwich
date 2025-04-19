package space.chatgis.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${name}")
    private String name;
    @RequestMapping("/getConfig")
    public String getConfig() {
        return "Consumer Get Cofig: " + name;
    }
}
