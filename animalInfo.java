public abstract class animalInfo {
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}
class Pig extends animalInfo{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
