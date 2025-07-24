import java.util.ArrayList;

public class Main {
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

        System.out.println("Collection of Appointments");

        ArrayList<Appointment> Appointments = new ArrayList<>();

        public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
            if (doctor != null && patientName != null && patientMobile != null && preferredTimeSlot != null) {
                Appointment appointment = new Appointment(patientName, patientMobile, preferredTimeSlot, doctor);
                appointments.add(appointment);
                System.out.println("Appointment created for " + patientName);
            } else {
                System.out.println("Error: All fields must be provided to create an appointment.");
            }
        }
        
    }
}
