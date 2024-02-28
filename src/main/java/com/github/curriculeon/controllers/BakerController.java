package com.github.curriculeon.controllers;

import com.github.curriculeon.services.BakerService;
import com.github.curriculeon.models.Baker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/bakers")
public class BakerController {
    private BakerService service;

    @Autowired
    public BakerController(BakerService service) {
        this.service = service;
    }

    @GetMapping(value = "/readAll")
    public ResponseEntity<Iterable<Baker>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Baker> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Baker> create(@RequestBody Baker baker) {
        return new ResponseEntity<>(service.create(baker), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Baker> update(Long id, Baker baker) {
        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Boolean> destroy(Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
