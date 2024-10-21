// class Predict{
//     String name;

//     public static void main(String args[])
//     {
//         Predict p1= new Predict();
//         p1.name="Ethnus";
//         Predict p2 = new Predict();
//         p2.name="Bangalore";
//         Predict p3=p2;
//         p2.name=null;
//         System.out.println(p3.name);
//         System.out.println(p1.name);
//     }
// }

// class Predict{
//     int x;
//     int y;

//     public static void main(String args[])
//     {
//         Predict p1= new Predict();
//         p1.x=5;
//         p1.y=10;
//         Predict p2= new Predict();
//         p2.x=15;
//         p2.y=20;
//         Predict p3= new Predict();
//         p3.x=p2.y;
//         p3.y=p1.x;
//         p1.x=p3.x;
//         p1.y=p3.y;
//         p2.x=p1.y;
//         System.out.println(p1.x+p2.x+p3.x);
//     }
// }

class Predict
{
    int n=25;

    public static void main(String args[])
    {
        Predict c2= new Predict();
        c2.n=15;
        Predict c3= new Predict();
        c3=c2;
        System.out.println(c3.n);
    }
}