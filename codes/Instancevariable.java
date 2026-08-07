class Instancevariable {
    int x = 100;
    public void show(){
        System.out.println("Inside show method, x = "+x);
        x=x+100;
    }
    public void display(){
        System.out.println("Inside display method, x = "+x);
    }
    public static void main(String[] args) {
        Instancevariable obj = new Instancevariable();
        obj.show();
        obj.display();
        
    }
}
