package com.springbootjwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "auth_user")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull 
    @Column(name="User_Name")
    private String name;

    @Column(name="Email_Address",unique=true)
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Size(max=20, message = "Email must be at least 20 characters")
    private String emailAddress;

    @NotNull
    @Column(name="Password")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @NotNull
    @Column(name="City")
    @Size(max=15, message = "City must be at least 15 characters")
    @NotBlank(message = "Name is required")
    private String address;

    //A single role assigned to many users
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Role role;
}