public class Methods {
    // Static metods
    static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");  
    }   

// Public methods 
public void myPublicMethod () {
    System.out.println("publuic methodds must be called by creating objects");
}

// Main methods 
public static void main(String[] args){
    staticMethod(); //call the static method

    Methods myobj = new Methods(); //creaete an objects of main
    myobj.myPublicMethod(); // call the public method on the object
  }

}