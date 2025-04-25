package Hierarchical;

public class cat extends animal {
    public void meow() {
        System.out.println("The cat meows.");
    }

    public class Main {
        public static void main(String[] args) {
            dog myDog = new dog();
            cat myCat = new cat();
    
            myDog.eat();  
            myDog.bark(); 
    
            myCat.eat();  
            myCat.meow(); 
        }
    }
    
}
