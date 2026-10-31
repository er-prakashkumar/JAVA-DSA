public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    //Default Constructor --> by default set attribute value as garbage
    public Student(){
        System.out.println("Student default contructor called");
    }
//  Parameterized Constructor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterised constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
//  Copy Constructor
    public Student(Student X){
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
}
