package com.moviebs.dto;
import lombok.*;
import java.util.*;

import com.moviebs.model.*;


@Data
public class BookingDTO 
{
	private List<Ticket> ticket;
	private String customerEmail;
	private String customerName;

}
