package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value ="/chocolates")
public class ChocolateController {

    @Autowired
    ChocolateController chocolateService;

    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolate(){
        List<Chocolate> chocolates = (List<Chocolate>) chocolateService.getAllChocolate();
        return new ResponseEntity<>(chocolates, HttpStatus.OK);
    }
}
