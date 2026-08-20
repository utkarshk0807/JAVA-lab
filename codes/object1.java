class Box{
    double width;
    double height;
    double depth;
}
class object1{
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.depth * mybox.height;
        System.out.println("Volume is: " + vol);
    }
}
