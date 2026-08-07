class employee{
    static int empid= 500;
    static void emp1(){
        empid++;
        System.out.println("Employee id: "+ empid);
    }
}
class Staticvariable{
    public static void main(String[] args) {
        employee.emp1();
        employee.emp1();
        employee.emp1();
        employee.emp1();
        employee.emp1();
        employee.emp1();
    }
}