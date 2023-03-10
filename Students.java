// Here are simple java problem with UML: create two object
public class Students {
    private String name;
    private int id;
    private double cgpa;

    public static void main(String[] args) {
        Students myObj = new Students();
        myObj.name = "mahafuj";
        myObj.id = 23765;
        myObj.cgpa = 3.94;

        System.out.println("Student name: " + myObj.name);
        System.out.println("Student id: " + myObj.id);
        System.out.println("Student cgp: " + myObj.cgpa);

        Students myObj1 = new Students();
        myObj1.name = "rakib";
        myObj1.id = 024231;
        myObj1.cgpa = 3.96;

        System.out.println("\n\nStudent name: " + myObj1.name);
        System.out.println("Student id: " + myObj1.id);
        System.out.println("Student cgp: " + myObj1.cgpa);


    }
}
