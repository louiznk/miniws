package com.github.vdemeester.miniws.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {

    private final Integer id;
    private final String name;
    private final Boolean completed;
    private final String description;
    private final LocalDateTime due;


    @JsonCreator
    public Todo(@JsonProperty("id") Integer id,
                @JsonProperty("name") String name,
                @JsonProperty("completed") Boolean completed,
                @JsonProperty("description") String description,
                @JsonProperty("dueDateTime") LocalDateTime due) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.description = description;
        this.due = due;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getDue() {
        return due;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) &&
                Objects.equals(name, todo.name) &&
                Objects.equals(description, todo.description) &&
                Objects.equals(completed, todo.completed) &&
                Objects.equals(due, todo.due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, completed, due);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Todo{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", completed=").append(completed);
        sb.append(", due=").append(due);
        sb.append('}');
        return sb.toString();
    }
}
