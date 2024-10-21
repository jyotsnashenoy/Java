class Char02{
    public static void main(String args[])
    {
        char letter1='A';
        char letter2 ='a';

        boolean areEqual = letter1==letter2;
        boolean isLetter1Smaller = letter1 < letter2;

        System.out.println("Are both letters equal? "+areEqual);
        System.out.println("Is letter1 ('A') smaller than letter2 "+isLetter1Smaller);
    }
}