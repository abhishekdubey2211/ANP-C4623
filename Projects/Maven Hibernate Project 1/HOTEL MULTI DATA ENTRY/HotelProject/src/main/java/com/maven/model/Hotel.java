
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

    @Column(name = "Hotel_name")
    private String hotelname;

    @Column(name = "Room_no")
    private int roomno;
    
    @Column(name = "Guest_name")
    private String guestname;

    @Column(name = "Guest_email")
    private String guestemail;
    
    @Column(name = "Hotel_contact")
    private long contact;

  //default constructor
	public Hotel() 
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public String getGuestemail() {
		return guestemail;
	}

	public void setGuestemail(String guestemail) {
		this.guestemail = guestemail;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Hotel(String hotelname, int roomno, String guestname, String guestemail, long contact) {
		super();
		this.hotelname = hotelname;
		this.roomno = roomno;
		this.guestname = guestname;
		this.guestemail = guestemail;
		this.contact = contact;
	}

}