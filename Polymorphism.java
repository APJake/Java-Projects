
class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Peacock extends Bird{
    public void sing(){
        System.out.println("co co co");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Peacock pk = new Peacock();
        pk.sing();
    }
    
}
