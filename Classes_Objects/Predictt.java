// class Predictt{
//     String a;
//     String b;

//     public static void main(String args[])
//     {
//         Predictt a1=new Predictt();
//         a1.a="hello";
//         a1.b="bye";
//         Predictt a2= new Predictt();
//         a2.a="how's";
//         a2.b="hey";
//         Predictt a3=new Predictt();
//         a2.a="good";
//         a2.b="you?";
//         Predictt a4=new Predictt();
//         a4.b=a3.b;
//         a3.a=a1.a;
//         a2.b=a4.b;
//         a2.a=a3.b;
//         a1.b=a4.a;
//         a2.a=a1.a;
//         a4.a=a3.a;
//         a2.a=a1.b;
//         a3.b=a4.b;
//         a4.b=a2.a;
//         a3.b=a1.b;
//         a1.b=a4.b;
//         a4.b=a3.b;
//         a4.a=a2.a;
//         System.out.println(a1.a+a2.a+a3.a+a4.a); 

//     }
// }

class Predictt{
    int n=200;
    int k=100;
    String s="Success";

    public static void main(String args[])
    {
        Predictt p1=new Predictt();
        p1.n=p1.k;
        Predictt p2=new Predictt();
        p2.k=p1.n;
        p2.k=800;
        Predictt p3=new Predictt();
        p2=p3;
        p3.s="Hello";
        p3.n=p1.k+200;
        System.out.println(p2.s+(p2.k+p2.n+p1.k+p1.n));
        System.out.println(p2+" " +(p2.k+p2.n+p1.k+p1.n));
    }
}
