
//JPA- Java Persistence API
//JPA entity class
//@Entity- It identifies a class as an entity class
//@Table- It specifies he table in the database
//@Id- define the mapping to the primary key
//@GeneratedValue-used to automatically generate the primary key value

package com.maven.model;
import javax.persistence.*;
@Entity  
@Table(name = "hotel")
public class Hotel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Hotel_Name")
    private String hotel_name;

    @Column(name = "Guest_Name")
    private String guest_name;

    @Column(name = "Guest_Email")
    private String guest_email;
    
    @Column(name = "Guest_Contact_no..")
    private long guest_contact;
    
    @Column(name = "Guest_Room_no..")
    private int room;

  //default constructor
	public Hotel() 
	{
		
	}

	//parameterized constructor
public Hotel(String hotel_name, String guest_name, String guest_email, long guest_contact, int room) {
	super();
	this.hotel_name = hotel_name;
	this.guest_name = guest_name;
	this.guest_email = guest_email;
	this.guest_contact = guest_contact;
	this.room = room;
}

//getter setter method
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getHotel_name() {
	return hotel_name;
}

public void setHotel_name(String hotel_name) {
	this.hotel_name = hotel_name;
}

public String getGuest_name(String getGuest_name) {
	return guest_name;
}

public void setGuest_name(String guest_name) {
	this.guest_name = guest_name;
}

public String getGuest_email() {
	return guest_email;
}

public void setGuest_email(String guest_email) {
	this.guest_email = guest_email;
}

public long getGuest_contact() {
	return guest_contact;
}

public void setGuest_contact(long guest_contact) {
	this.guest_contact = guest_contact;
}

public int getRoom() {
	return room;
}

public void setRoom(int room) {
	this.room = room;
}

//to string method
@Override
public String toString() {
	return "Hotel [id=" + id + ", hotel_name=" + hotel_name + ", guest_name=" + guest_name + ", guest_email="
			+ guest_email + ", guest_contact=" + guest_contact + ", room=" + room + ", getId()=" + getId()
			+ ", getHotel_name()=" + getHotel_name() + ", getGuest_name()=" + getGuest_name() + ", getGuest_email()="
			+ getGuest_email() + ", getGuest_contact()=" + getGuest_contact() + ", getRoom()=" + getRoom() + "]";
}

}

