package com.devsuperior.bds04.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private static final long serialVersionUID = 1L;

    private final List<FieldMessage> errors = new ArrayList<FieldMessage>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addErrors (String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}

