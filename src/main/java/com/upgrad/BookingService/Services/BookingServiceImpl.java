package com.upgrad.BookingService.Services;

import com.upgrad.BookingService.DAO.BookingDao;
import com.upgrad.BookingService.Entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingDao bookingDao;
    @Override
    public Booking acceptBookingDetails(Booking booking) {
        return bookingDao.save(booking);
    }

    @Override
    public List<Booking> acceptMultipleBookingDetails(List<Booking> bookings) {
        List<Booking> savedBookings = new ArrayList<>();
        for(Booking booking : bookings){
            savedBookings.add(acceptBookingDetails(booking));

        }
        return savedBookings;
    }

    @Override
    public Booking getBookingDetails(int id) {
        return bookingDao.findById(id).get();
    }

    @Override
    public Booking updateBookingDetails(int id, Booking booking) {
        Booking savedBooking = getBookingDetails(id);
        savedBooking.setAadharNumber(booking.getAadharNumber());
        savedBooking.setBookedOn(booking.getBookedOn());
        savedBooking.setFromDate(booking.getFromDate());
        savedBooking.setNumOfRooms(booking.getNumOfRooms());
        savedBooking.setToDate(booking.getToDate());
        savedBooking.setRoomNumbers(booking.getRoomNumbers());
       bookingDao.save(savedBooking);
       return savedBooking;
    }

    @Override
    public boolean deleteBooking(int id) {
        Booking savedBooking = getBookingDetails(id);

        if(savedBooking == null){
            return false;

        }
        bookingDao.delete(savedBooking);
        return true;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingDao.findAll();
    }
}
