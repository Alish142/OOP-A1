import java.util.ArrayList;

public class Main {

     
     // Part 5- Collection of Appointments
     static ArrayList<Appointment> appointments = new ArrayList<>();


      public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
            if (doctor != null && patientName != null && patientMobile != null && preferredTimeSlot != null) {
                Appointment appointment = new Appointment(patientName, patientMobile, preferredTimeSlot, doctor);
                appointments.add(appointment);
                System.out.println("Appointment created for " + patientName);
            } else {
                System.out.println("Error: All fields must be provided to create an appointment.");
            }
        }
        
 
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments found.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");

            }
            
        }
    }
// deleteing exiting appointments
      
    public static void cancelAppointment(String patientmobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientmobile)) {
                System.out.println("Cancelling appointment for: " + appointments.get(i).getPatientName());
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile number: " + patientmobile);
        }
    }
    public static void Main (String[] args) {

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr Tariqul Islam", "MBBS, DPH NZ, DCH Aus", "My Doctors Clinic Surfers Paradise");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr Inayatullah", "MBBS", "My Doctors Clinic Surfers Paradise");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr Altaf Latif Ayyaril", "MBBS, AMC", "My Doctors Clinic Surfers Paradise");

        Physician specialist1 = new Physician(4, "Dr Day Hong Ma", "Bachelor of Medicine", "General Medicine");
        Physician specialist2 = new Physician(5, "Dr Greeshma Tummula", "Bachelor of Medicine", "Internal Medicine");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        System.out.println("------------------------------");
        specialist1.printDetails();
        specialist2.printDetails();
        System.out.println("------------------------------");


       / Part 5 – Collection of appointments
        System.out.println("------------------------------");

   // 2 appoinments are created   
        createAppointment("Alish Rana", "0412345678", "09:00", gp1);
        createAppointment("Ayush Bhat", "0423432289", "10:30", specialist2);
// printing all exiting ones 
        System.out.println("------------------------------");
        printExistingAppointments();
// cancel the apointment ment by a pateint number 
        System.out.println("------------------------------");
        cancelAppointment("0412345678");
// then printing exiting ones
        System.out.println("------------------------------");
        printExistingAppointments();  

      
    }
}
