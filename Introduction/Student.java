class Student{
    String name ="Jyotsna";
    int id=82;
    String branch="Computer Science";

    void details()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(branch);
    }
    void read()
    {
        System.out.println("Student is Reading.");
    }
    public static void main(String args[])
    {
        Student s=new Student();
        s.details();
        s.read();
    }
}