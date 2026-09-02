package com.example.task_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;
import java.util.UUID;

public record TaskId(@Column(name = 'id')
                     UUID value) {
    public TaskId {
        Objects.requireNonNull(value, message:"O id da Task não pode ser nulo");
    }

    public static TaskId newId(){
        return new TaskId(UUID.randomUUID());
    }
}
