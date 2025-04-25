public class Dog extends animal{
    public void bark(){
        System.out.println("I can bark");
    }
    public class Main{
        public static void main(String [] args){
            Dog obj = new Dog();
            obj.eat();
            obj.bark();
        }
    }
}
