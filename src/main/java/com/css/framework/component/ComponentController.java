package com.css.framework.component;

import com.css.core.component.usecase.createcomponent.output.CreateComponentOutput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComponentController {

    private final ComponentService service;

    public ComponentController(ComponentService service) {
        this.service = service;
    }

    @PostMapping("/components")
    public List<CreateComponentOutput> createComponent(@RequestBody ComponentPayload components){
        return service.create(components.getComponents());
    }
}
