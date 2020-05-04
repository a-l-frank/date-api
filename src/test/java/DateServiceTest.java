import java.util.Date;

import dateService.DateService;
import org.junit.Assert;
import org.junit.Test;


public class DateServiceTest {

    DateService testDateService = new DateService();

    @Test
    public void testFormatDate (){
        Long dateMillis = 1588616953967L; // should be 2020-05-04 ~ 1:29 pm Chicago Time
        Date testDate = new Date(dateMillis);
        String result = testDateService.formatDate( testDate );

        Assert.assertEquals("2020-04-05 18:29:13 UTC", result);
    }
}
