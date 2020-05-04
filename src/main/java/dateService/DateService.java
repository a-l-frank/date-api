package dateService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

@RestController
public class DateService {

    public static final String DATE_FORMAT = "YYYY-dd-MM HH:mm:ss z";
    private ObjectMapper om = new ObjectMapper();


    @GetMapping("/date-time")
    public String getDateTime() throws JsonProcessingException {
        return toJsonPayload(getDateObject());

    }

    public String toJsonPayload(ZonedDateTime dateObject) throws JsonProcessingException {
        return om.writeValueAsString(new DatePayload(dateObject.toLocalDate().toString(), dateObject.toLocalTime().toString()));
    }

    // separated this function because of testing, hate testing with dates that change
    public ZonedDateTime getDateObject() {
        return ZonedDateTime.now(ZoneOffset.UTC);
    }

}
