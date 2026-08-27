class Box {
    double width, height, depth;

    void volume() {
        System.out.println("Volume is: ");
        System.out.println(width * height * depth);
    }
}

public class callmethod {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox1.width = 3;
        mybox1.height = 6;
        mybox1.depth = 9;

        mybox1.volume();
        mybox1.volume();
    }
}
