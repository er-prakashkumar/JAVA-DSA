public class App {
    public static void main(String[] args) {

        // Default Constructor
        Student A = new Student();
        A.id = 1;
        A.age = 14;
        A.name = "Ramu";
        A.nos = 5;
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);
        A.bunk();
        A.study();
        A.sleep();

        // Parameterised Constructor
        Student B = new Student(2,17,"Shayamu",4,"Tina");
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);
        // System.out.println(B.gf);  ---> not visible
        B.gfChatting();


        // Copy constructor
        Student C = new Student(B);
        System.out.println(C.id);
        System.out.println(C.age);
        System.out.println(C.name);
        System.out.println(C.nos);

        Sstudent D = new Sstudent(3,17,"Shayam",4,"Rina");
    //     System.out.println(B.id);
    //     System.out.println(B.age);
        System.out.println(D.getName());
        System.out.println(D.getAge());
        D.setAge(167);
        System.out.println(D.getAge());
    //     System.out.println(B.nos);
    //     // System.out.println(B.gf);  ---> not visible
    //     B.gfChatting();
    }
}
