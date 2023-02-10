package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar(@RequestParam String id, @RequestParam String modelName, @RequestParam(required = false) Integer price){
        return new CarDTO(id, modelName, price);
    }

    @PostMapping
    public ResponseEntity<String> postCar(@RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body("Car created successfully");
    }
}