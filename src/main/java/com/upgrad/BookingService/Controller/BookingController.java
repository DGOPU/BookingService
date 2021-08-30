package com.upgrad.BookingService.Controller;

import com.upgrad.BookingService.DTO.BookingDTO;
import com.upgrad.BookingService.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/booking_app/v1")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    ModelMapper modelMapper;

    public ResponseEntity createBooking(BookingDTO bookingDTO) {
        return null;
    }

}
