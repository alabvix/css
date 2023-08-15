package com.css.framework.component.repository;

import com.css.core.component.domain.Component;
import com.css.core.component.gateway.ComponentGateway;
import com.css.framework.component.ComponentEntityConverter;
import com.css.framework.component.entity.ComponentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentRepository implements ComponentGateway {

    private final ComponentCrudRepository crudRepository;

    private final ComponentEntityConverter converter;

    public ComponentRepository(
            ComponentCrudRepository crudRepository,
            ComponentEntityConverter converter)
    {
        this.crudRepository = crudRepository;
        this.converter = converter;
    }

    @Override
    public Integer create(Component component) {
        final ComponentEntity entity = converter.toEntity(component);
        crudRepository.save(entity);
        return entity.getId();
    }
}
