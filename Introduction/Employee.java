class Employee{
    String name ="Aditi";
    int e_id=82;
    String department="IT";

    void details()
    {
        System.out.println(name);
        System.out.println(e_id);
        System.out.println(department);
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.details();
    }
}