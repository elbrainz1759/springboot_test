package com.example.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> bookings =  new ArrayList<>();
        bookings.add(new HotelBooking("James", 34, 3));
        bookings.add(new HotelBooking("Idris", 20, 1));
        bookings.add(new HotelBooking("Samuel", 4, 4));
        bookings.add(new HotelBooking("jerry", 10, 7));
        bookings.add(new HotelBooking("King", 76, 9));
        bookingRepository.saveAll(bookings);

    }
}







