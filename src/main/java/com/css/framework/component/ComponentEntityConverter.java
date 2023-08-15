package com.css.framework.component;

import com.css.core.component.domain.Component;
import com.css.framework.component.entity.ComponentEntity;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Component
public class ComponentEntityConverter {
    public ComponentEntity toEntity(Component component){
        final ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(component, ComponentEntity.class);
    }
}
