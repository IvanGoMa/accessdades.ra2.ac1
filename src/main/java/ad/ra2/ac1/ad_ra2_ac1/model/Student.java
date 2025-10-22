package ad.ra2.ac1.ad_ra2_ac1.model;

// Model de Student, amb els constructors, setter i getters
public class Student {
    private long id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int anyo;

    public Student(long id, String nom, String cognom, int age, String cicle, int anyo) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.anyo = anyo;
    }

    public Student(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString(){
        return String.format("Student[id=%d, nom='%s', cognom='%s', age=%d, cicle='%s', any='%d']",getId(), getNom(), getCognom(), getAge(),getCicle(),getAnyo());
    }

    

    
}
