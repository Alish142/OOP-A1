public class Appointment {
    private String patientName;
    private String patientmobile;
    private String preferredtimeSlot;
    private HealthProfessional doctor;

    // Default constructer
    public Appointment(){
        this.patientName = "Unknown";
        this.patientmobile = "Unknown";
        this.preferredtimeSlot = "Not set";
        this.doctor = null;
    }

    //parameterized constructor 

    public Appointment(String patientName, String mobile, String timeSlot, HealthProfessional doctor){
        this.patientName = patientName;
        this.patientmobile = mobile;
        this.preferredtimeSlot = timeSlot;
        this.doctor = doctor;
    }
    // print 
    public void printAppointmentDetails(){
        System.out.println("Patient Name:" + patientName);
        System.out.println("Mobile: " + patientmobile);
        System.out.println("Preferred Time Slot: " + preferredtimeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null) {
        doctor.printDetails();
        } else {
        System.out.println("No doctor assigned.");
        }
    }

    //Getter 
    public String getPatientMobile(){
        return patientmobile;
    }

    public String getPatientName(){
        return patientName;
    }


    }
    

