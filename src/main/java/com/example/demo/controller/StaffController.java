package com.example.demo.controller;

import com.example.demo.module.staff;
import com.example.demo.view.viewstaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestController;

import java.util.List;

@RestController
@RequestMapping("/")

public class StaffController {
    @Autowired
    private viewstaff viewstaff;

    @GetMapping
    public List<staff> getAllStaffs() {
        return viewstaff.findAll();
    }
}
