// create a Constructor class
public class Constructor {
    int x; //create a class attribute
    public Constructor(){
        x = 69;  //set the value for the class attribute x
    }
    public static void main(String[] args){
        Constructor myObj = new Constructor();  //Create an object of class Constructor
        System.out.println(myObj.x);  //print the value of x
    }
}

// output 69
