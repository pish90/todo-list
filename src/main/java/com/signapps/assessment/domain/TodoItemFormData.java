package com.signapps.assessment.domain;

import javax.validation.constraints.NotBlank;

public class TodoItemFormData {

    @NotBlank
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
