package project.demo.domain.service.Reading;

import java.util.List;

import project.demo.domain.entities.Reading;

public interface ReadingService {
    
    Reading createReading(Reading reading);

    Reading getReadingById (Long id);

    List<Reading> getReadingByCustomerId (Long customerId);
 
    List<Reading> getAllReadings();

    boolean deleleteReadingById (Long id);

    Reading updateReading (Long id, Reading reading);
}
