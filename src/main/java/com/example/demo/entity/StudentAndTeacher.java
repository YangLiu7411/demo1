package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "stu_tea")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAndTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    @JsonIgnore
    private Student stu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "t_id")
    @JsonIgnore
    private Teacher tea;

}
