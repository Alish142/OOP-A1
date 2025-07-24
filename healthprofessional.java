public class HealthProfessional {
    protected int id ;
    protected String name ;
    protected String qualification;


    public HealthProfessional(){
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }

    public HealthProfessional(int id, String name, String qualification){
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }

    public int getID(){
        return id;

    }
    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public void printDetails(){
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Qualification:" + qualification);

    }

    
}
