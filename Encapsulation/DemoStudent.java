class Student {
    private String name;
    private int age;
    private int regno;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}

public class DemoStudent {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Anil");
        obj.setAge(30);
        obj.setRegno(1002);
        obj.setPlace("Bengaluru");
        System.out.println("Name : " + obj.getName());
        System.out.println("Age : " + obj.getAge());
        System.out.println("Reg No : " + obj.getRegno());
        System.out.println("Place : " + obj.getPlace());

    }
}
