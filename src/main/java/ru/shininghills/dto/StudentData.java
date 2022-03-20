package ru.shininghills.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StudentData implements Serializable {

    @JsonProperty("firstName")
    @ApiModelProperty(value = "имя студента")// value description for front-end developers
    private String firstName;

    @JsonProperty("lastName")
    @ApiModelProperty(value = "фамилия студента")
    private String lastName;

    @JsonProperty("grade")
    @ApiModelProperty(value = "оценка студента")
    private int grade;

    // not needed to use getters/setters if we use @Data lombok-annotation for auto-creation
}
