package com.css.core.component.usecase.createcomponent;

public class CreateComponentOutput {
    private String name;
    private OutputStatusEnum status;
    private Integer id;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OutputStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OutputStatusEnum status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
