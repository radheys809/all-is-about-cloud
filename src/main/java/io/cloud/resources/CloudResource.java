package io.cloud.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cloud")
public class CloudResource {

    @GetMapping({"", "/"})

    public String home() {
        return "Hello from home";
    }
}
