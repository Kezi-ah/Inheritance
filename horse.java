package multilevel;

public class horse extends animal {
    public void gallop(){
        System.out.println("I can gallop");
    }
    
    public class Main {
        public static void main(String[] args) {
            horse h = new horse();
            h.breathe();
            h.move();
            h.gallop();
        }
    }
}
