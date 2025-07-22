public class Healthprofessional {
    protected int id ;
    protected String name ;
    protected String qualification;


    public Healthprofessional(){
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }

    public Healthprofessional(int id, String name, String qualification){
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }
    
    public void printDetails(){
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Qualification:" + qualification);

    }

    
}
