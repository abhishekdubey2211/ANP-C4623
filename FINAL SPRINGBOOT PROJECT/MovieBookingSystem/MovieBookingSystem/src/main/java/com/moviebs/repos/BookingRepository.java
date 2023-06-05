package com.moviebs.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebs.model.*;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> 
{

}
