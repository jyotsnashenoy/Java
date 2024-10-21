class Library{
    String name="City Library";
    String location = "Jayanagar";
    int No_of_books=10000;
    String timings="8am to 10pm";

    void details()
    {
        System.out.println(name);
        System.out.println(location);
        System.out.println(No_of_books);
        System.out.println(timings);
    }
    public static void main(String args[])
    {
        Library l=new Library();
        l.details();
    }
}