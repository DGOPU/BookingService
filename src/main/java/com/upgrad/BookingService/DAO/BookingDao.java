package com.upgrad.BookingService.DAO;

import com.upgrad.BookingService.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
