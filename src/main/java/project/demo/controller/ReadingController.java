package project.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.demo.model.Reading;
import project.demo.service.Reading.ReadingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/readings")
public class ReadingController {
    
    private final ReadingService readingService;

    public ReadingController(ReadingService readingService)
    {
        this.readingService = readingService;
    }   


    @PostMapping
    public Reading createReading(@RequestBody Reading reading)
    {
        
        Reading createdReading = readingService.createReading(reading);
        
        return createdReading;
    }

    @GetMapping("/{id}")
    public Reading getReadingById(@RequestParam Long id)
    {
        Reading dbReading = readingService.getReadingById(id);

        return dbReading;
    }
    
    

}
