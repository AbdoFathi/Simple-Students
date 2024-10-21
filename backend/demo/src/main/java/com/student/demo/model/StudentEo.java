package com.student.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
public class StudentEo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone")
    private  String phone;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "address")
    private String address;

    @CreationTimestamp
    @Column(name = "created_by")
    private Date createdBy;

   @UpdateTimestamp
   @Column(name = "modified_by")
   private Date modifiedBy;

}
