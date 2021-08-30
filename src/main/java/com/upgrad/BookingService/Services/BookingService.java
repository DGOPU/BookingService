package com.upgrad.BookingService.Services;

import com.upgrad.BookingService.Entity.Booking;

import java.util.List;

public interface BookingService {

    public Booking acceptBookingDetails(Booking booking);

    public List<Booking> acceptMultipleBookingDetails(List<Booking> bookings);

    public Booking getBookingDetails(int id);

    public Booking updateBookingDetails(int id , Booking booking);

    public boolean deleteBooking(int id );

    public List<Booking> getAllBookings();


}
