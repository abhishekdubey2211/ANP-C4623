package com.moviebs.model;
import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="customer_details")
public class Customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 	
 	@Column(length = 20)
    private String name;
    
 	@Column(length = 30)
    private String email;
 	
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
