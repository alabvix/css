package com.css.core.component.usecase.createcomponent;

import com.css.core.component.converter.ComponentConverter;
import com.css.core.component.gateway.ComponentGateway;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.validator.CreateComponentValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateComponentUseCase {

    private final ComponentGateway gateway;

    private final ComponentConverter converter;

    private final CreateComponentValidator validator;

    public CreateComponentUseCase(ComponentGateway gateway,
                                  ComponentConverter converter,
                                  CreateComponentValidator validator) {
        this.gateway = gateway;
        this.converter = converter;
        this.validator = validator;
    }

    public List<CreateComponentOutput> create(List<CreateComponentInput> inputList) {

        final List<CreateComponentOutput> outputList = new ArrayList<>();

        for (CreateComponentInput input:inputList){
            final CreateComponentOutput output = new CreateComponentOutput();
            final List<String> violations = validator.validate(input);

            if (violations.size() > 0) {
                setViolations(violations, input, output);
                continue;
            }

            final Integer id = gateway.create(converter.toComponent(input));
            output.setId(id);
            output.setStatus(OutputStatusEnum.CREATED);
            outputList.add(output);
        }

        return outputList;
    }

    private void setViolations(List<String> violations, CreateComponentInput input, CreateComponentOutput output){
        if (violations.size() == 0) {
            return;
        }
        output.setName(input.name());
        output.setStatus(OutputStatusEnum.FAIL);
        output.setMessage(violations.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
        );
    }
}