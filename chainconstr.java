class Box {
    private int length, breadth, height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(int side) {
        length = side;
        breadth = side;
        height = side;
    }

    public Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }

    public void show() {
        System.out.println("length " + length + " breadth " + breadth + " height " + height);
    }
}

public class chainconstr {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(15);
        Box b3 = new Box();

        b1.show(); // Display dimensions of b1
        b2.show(); // Display dimensions of b2
        b3.show(); // Display dimensions of b3
    }
}
