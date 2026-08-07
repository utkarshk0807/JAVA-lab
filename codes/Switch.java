public class Switch {
    public static void main(String[] args) {
        char color = 'g';
        switch(color){
            case 'r':
                System.out.println("RED");
                break;
            case 'g':
                System.out.println("GREEN");
                break;
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("No color");
        }
    }
}
