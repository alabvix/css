package com.css.framework.component;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComponentController {

    private final ComponentService service;

    public ComponentController(ComponentService service) {
        this.service = service;
    }

    @PostMapping("/components")
    public String createComponent(@RequestBody ComponentPayload components){
        service.create(components.getComponents());
        return "ok";
    }
}
