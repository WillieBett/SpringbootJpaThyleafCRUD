package com.wiliebett.springbootjpathyleafcrud.Model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @NotBlank(message = "name is required")
    @Column(name = "NAME")
    private String name;
    @NotBlank(message = "Email is required")
    @Column(name = "Email")
    private String email;
    @NotBlank(message = "Phone is required")
    @Column(name = "PHONE")
    private long phoneNo;

}
