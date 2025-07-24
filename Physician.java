public class Physician extends HealthProfessional {
     private String specialty;

     public Physician(){
        super();
        this.specialty = "Not specified";
     }

     public Physician(int id, String name, String qualification, String specialty) {
        super(id, name, qualification); 
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setSepcialty(String specialty){
        this.specialty = specialty;
    }

    @Override 
    public void printDetails(){
        System.out.println("Health Professional Type: Physician");
        super.printDetails();  
        System.out.println("Specialty: " + specialty);
    }

    
}
