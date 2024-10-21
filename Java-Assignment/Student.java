class Student {
    String student_id;
    int marks1;
    int marks2;
    int marks3;

    void marks(String id, int m1, int m2, int m3) {
        student_id = id;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        int totalMarks = m1 + m2 + m3;
        System.out.println("Student id : " + student_id);
        System.out.println("Total Marks : " + totalMarks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.marks("M19", 78, 91, 87);
    }
}
