package ru.shininghills.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StudentData implements Serializable {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("grade")
    private int grade;

    // not needed to use getters/setters if we use @Data lombok-annotation for auto-creation
}
