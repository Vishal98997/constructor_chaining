class vehicle{
    public vehicle(){
        System.out.println("vehicle constructor called...");
    }
}
class car extends vehicle{
    public car(){
    System.out.println("car constructor called...");
    }

}

public class constrbehav {
    public static void main(String[] args) {
        car audi=new car();    
    }
    
    
}
