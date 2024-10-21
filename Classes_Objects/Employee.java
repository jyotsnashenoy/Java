class Employee{
    String name ;
    String EmpId;
    static String Company = "ABC Company";

    public static void main (String args[])
    {
        System.out.println("Hi I am main()");
        System.out.println("Everyone works for " + Company);
        Employee e1= new Employee();
        e1.name="Raja";
        e1.EmpId="Emp101";
        System.out.println("Employee name : " + e1.name);
        System.out.println("Employee ID : " + e1.EmpId);

        Employee e2=new Employee();
        e2.name="ramu";
        e2.EmpId="Emp102";
        System.out.println("Employee name : " + e2.name);
        System.out.println("Employee ID : " + e2.EmpId);

    }
} 