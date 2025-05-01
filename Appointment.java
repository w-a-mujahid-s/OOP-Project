import java.util.Date;
public class Appointment {
    private String apptId;
    private Date date;
    private String venue;

    public String getApptId() { 
        return apptId; 
    }
    
    public Date getDate() { 
        return date; 
    }
    
    public String getVenue() { 
        return venue; 
    }

    public void setDate(Date date) { 
        this.date = date; 
    }

    public void schedule(String apptId, Date date, String venue) {
        this.apptId = apptId;
        this.date = date;
        this.venue = venue;
    }

    public void cancelAppointment() {
        this.apptId = null;
        this.date = null;
        this.venue = null;
        System.out.println("Appointment has been cancelled.");
    }
}
