package dateService;


public class DatePayload {

    private String date;

    private String time;

    public DatePayload(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
