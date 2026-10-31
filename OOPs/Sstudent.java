public class Sstudent {
    // Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    //Default Constructor --> by default set attribute value as garbage
    public Sstudent(){
        System.out.println("Student default contructor called");
    }
//  Parameterized Constructor
    public Sstudent(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterised constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
//  Copy Constructor
    public Sstudent(Sstudent X){
        System.out.println("Student Parameterised constructor called");
        this.id = X.id;
        this.age = X.age;
        this.name = X.name;
        this.nos = X.nos;
        this.gf = X.gf;
    }

    public void gfChatting(){
        System.out.println("Chatting...");
    }

    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }

    public String getName(){
           return this.name;
    }
    public int getId(){
           return this.id;
    }
    public int getAge(){
           return this.age;
    }
    public int getNos(){
           return this.nos;
    }
    public String getGf(){
           return this.gf;
    }
    public int setAge(int a){
        if(a<26){
           this.age = a;
        }
        return this.age;
    }
}
