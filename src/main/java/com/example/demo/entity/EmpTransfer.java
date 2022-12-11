package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpTransfer {
    @JsonProperty("status")
    String status;
    @JsonProperty("data")
    List<Employee> data;

    @JsonProperty("message")
    String message;
}
