public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.print("hello, world!\n");

        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "Deep Thought";
        System.out.println(myString);

        float myNumber =  3.14F;
        System.out.println(myNumber);



//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(y);

        int z = Integer.MAX_VALUE;
        z += 1;
        System.out.println("z = " + z);


    }
}
