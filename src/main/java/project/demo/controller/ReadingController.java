package project.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.demo.model.Reading;
import project.demo.service.Reading.ReadingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/readings")
public class ReadingController {
    
    private final ReadingService readingService;

    public ReadingController(ReadingService readingService)
    {
        this.readingService = readingService;
    }   


    @PostMapping
    public Reading createReading(@RequestBody Reading reading) {
        //TODO: process POST request
        
        Reading createdReading = readingService.createReading(reading);
        
        return createdReading;
    }
    

}
