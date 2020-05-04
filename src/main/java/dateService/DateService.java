package dateService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RestController
public class DateService {

    public static final String DATE_FORMAT = "YYYY-dd-MM HH:mm:ss z";


    @GetMapping("/date-time")
    public String getDateTime() {

        return formatDate(getDateObject());
    }

    public String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(date);
    }

    // separated this function because of testing, hate testing with dates that change
    public Date getDateObject() {
        return new Date();
    }
}
