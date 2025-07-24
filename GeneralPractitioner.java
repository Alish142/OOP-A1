public class GeneralPractitioner extends HealthProfessional{
    private String clinicName;

    public GeneralPractitioner(){
        super();
        this.clinicName = "Unknown Clinic";
    }
    
    public GeneralPractitioner(int id, String name, String qualification, String clinicName) {
        super(id, name, qualification); 
        this.clinicName = clinicName;
    }

    public String getClinicName(){
        return clinicName;
    }
    public void setclinicName(String clinicName){
        this.clinicName = clinicName;
    }
    @Override
    public void printDetails(){
        System.out.println("Type: General Practioner");
        super.printDetails();
        System.out.println("Clinic Name: " + clinicName);
    
    }
}
