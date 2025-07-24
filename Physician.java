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

    
}

