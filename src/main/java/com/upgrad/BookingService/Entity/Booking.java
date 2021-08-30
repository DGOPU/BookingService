package com.upgrad.BookingService.Entity;
import javax.persistence.*;
import java.util.Date;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

@Entity
    public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int bookingId;

        @Column(nullable = true)
        private Date fromDate;

        @Column(nullable = true)
        private Date toDate;

        @Column(nullable = true)
        private String aadharNumber;

        @Column
        private int numOfRooms;

        @Column
        private String roomNumbers;

        @Column(nullable = false)
        private int roomPrice;

        @Column(nullable = true)
        private Date bookedOn;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Date transactionId;


        public int getBookingId() {
            return bookingId;
        }

        public void setBookingId(int bookingId) {
            this.bookingId = bookingId;
        }

         public Date getFromDate() {
            return fromDate;
        }

        public void setFromDate(Date fromDate) {
            this.fromDate = fromDate;
        }

        public Date getToDate() {
            return toDate;
        }

        public void setToDate(Date toDate) {
            this.toDate = toDate;
        }

        public String getAadharNumber() {
            return aadharNumber;
        }

        public void setAadharNumber(String aadharNumber) {
            this.aadharNumber = aadharNumber;
        }

        public int getNumOfRooms() {
            return numOfRooms;
        }

        public void setNumOfRooms(int numOfRooms) {
            this.numOfRooms = numOfRooms;
        }

        public String getRoomNumbers() {
            return roomNumbers;
        }

        public void setRoomNumbers(String roomNumbers) {
            this.roomNumbers = roomNumbers;
        }



        public void setRoomPrice(int roomPrice) {
            this.roomPrice = roomPrice;
        }

        public Date getBookedOn() {
            return bookedOn;
        }

        public void setBookedOn(Date bookedOn) {
            this.bookedOn = bookedOn;
        }

        public Date getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Date transactionId) {
            this.transactionId = transactionId;
        }

        public int getRoomPrice() {
           // int noOfDaysBetween = this.fromDate.until(this.toDate, DAYS);
           // int noOfDaysBetween = DAYS.between(this.fromDate,this.toDate);

          return (this.numOfRooms * 1000);
        }


    }

