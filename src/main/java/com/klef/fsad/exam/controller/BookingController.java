package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController 
{
    @Autowired
    private BookingService service;

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking b) 
    {
        return service.addBooking(b);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable int id) 
    {
        service.deleteBooking(id);
        return "Booking Deleted Successfully";
    }
}