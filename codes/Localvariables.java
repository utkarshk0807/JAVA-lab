class Localvariables{
    public static void show(){
        int a =10;
        System.out.println("Inside show method,a = "+ a);
    }
    public void display(){
        int b =20;
        System.out.println("Inside display method, b = "+ b);
    }
    public static void main(String[] args){
        Localvariables obj = new Localvariables();
        obj.show();
        obj.display();
    }
}