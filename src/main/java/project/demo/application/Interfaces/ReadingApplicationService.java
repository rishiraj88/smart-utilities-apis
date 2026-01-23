package project.demo.application.Interfaces;

import java.util.List;

import project.demo.model.Reading;

public interface ReadingApplicationService {
    
    Reading createReadingWithNewCustomer(Reading reading);

    Reading createReadingForExistingCustomer(Reading reading);

    Reading getReadingById (Long id);
 
    List<Reading> getAllReadings();

    void deleleteReadingById (Long id);

    Reading updateReading (Long id, Reading reading);
}
