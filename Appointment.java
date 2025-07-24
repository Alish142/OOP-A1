public class Appointment {
    private String patientName;
    private String mobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(){
        this.patientName = "Unknown";
        this.mobile = "Unknown";
        this.timeSlot = "Not set";
        this.doctor = null;


    }
    
}
