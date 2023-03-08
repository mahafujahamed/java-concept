public class concept {
    public static void main(String[] args) {
        // simple expression
        int x = 5;
        int y = 50;
        System.out.println(x + y);
        // adding String
        String name = "mahafuj";
        System.out.println("Developer " + name);
        // comma separated in same types
        int first = 5,second = 4,third = 10;
        System.out.println(first + second + third); 
        // Automatic casting: int to double
        int myNumber = 40;
        double myDouble = myNumber;
        System.out.println(myNumber);
        System.out.println(myDouble);
        // Narrowing Casting: double to int
        double numDouble = 45.89d;
        int numInt = (int) numDouble;
        System.out.println(numDouble);
        System.out.println(numInt);
        // String length for example {toUpperCase() and toLowercase()}
        String text = "Welcome Developer";
        System.out.println(text.length());
        // More String Methods
        String txt = "Your Name";
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        // Finding a character in a String(indexof())
        String motive = "Just 'relax', keep it up";
        System.out.println(motive.indexOf("relax"));
        // String Concatination
        String firstName = "firstname";
        String lastName = "lastname";
        System.out.println(firstName + " " + lastName); //using + operator
        // ------------//
        String firstName1 = "firstname";
        String lastName2 = "lastname";
        System.out.println(firstName1.concat(lastName2));//using concat() method
        //Math.max() mwthod can used to find the heighest value
        System.out.println(Math.max(30, 60));
        int num1 = 34, num2 = 56;
        System.out.println(Math.min(num1, num2));//lowest value
        
    }
}
