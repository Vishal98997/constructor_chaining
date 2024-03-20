class circle{
    private int rad;
    private final double pi;
    public circle(int p){
        pi=p;
    }
    public void show(){
       System.out.println(pi*rad*rad);
    }
}

public class finalkey {
    public static void main(String[] args) {
        circle obj=new circle(12);
        obj.show();

    }
}
