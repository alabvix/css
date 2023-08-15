package com.css.framework.component.repository;

import com.css.framework.component.entity.ComponentEntity;
import org.springframework.data.repository.CrudRepository;

public interface ComponentCrudRepository extends CrudRepository<ComponentEntity, Integer> {
}
