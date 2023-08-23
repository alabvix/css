package com.css.core.component.usecase.createcomponent;

import com.css.core.component.converter.ComponentConverter;
import com.css.core.component.gateway.ComponentGateway;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.output.CreateComponentOutput;
import com.css.core.component.usecase.createcomponent.output.OutputStatusEnum;
import com.css.core.validator.GenericValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateComponentUseCase {

    private final ComponentGateway gateway;

    private final ComponentConverter converter;

    private final GenericValidator<CreateComponentInput> validator;

    public CreateComponentUseCase(ComponentGateway gateway,
                                  ComponentConverter converter,
                                  GenericValidator<CreateComponentInput> validator) {
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
                setViolationsOutput(violations, input.name(), output, outputList);
                continue;
            }

            output.setId(gateway.create(converter.toComponent(input)));
            output.setStatus(OutputStatusEnum.CREATED);
            outputList.add(output);
        }

        return outputList;
    }

    private void setViolationsOutput(List<String> violations,
                                     String componentName,
                                     CreateComponentOutput output,
                                     List<CreateComponentOutput> outputList){
        output.setName(componentName);
        output.setStatus(OutputStatusEnum.FAIL);
        output.setMessage(violations.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
        );
        outputList.add(output);
    }
}