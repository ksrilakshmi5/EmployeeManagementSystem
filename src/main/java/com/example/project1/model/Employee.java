package com.example.project1.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Table(name = "employees", schema = "Springboot")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
     @Column(name="firstName",nullable=false)
     private String firstName;
     private String lastName;
     private String email;
    
}
