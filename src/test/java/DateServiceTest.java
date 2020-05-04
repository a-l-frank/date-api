import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dateService.DatePayload;
import dateService.DateService;
import org.junit.Assert;
import org.junit.Test;


public class DateServiceTest {

    DateService testDateService = new DateService();

    @Test
    public void testToJsonPayload() throws JsonProcessingException {
        Long dateMillis = 1588616953967L; // should be 2020-05-04 ~ 1:29 pm Chicago Time
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateMillis), ZoneOffset.UTC);
        String result = testDateService.toJsonPayload(zonedDateTime);
        System.out.println(result);
    }
}
