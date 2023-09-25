import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        myfirstpackage.MySecondClass element = new myfirstpackage.MySecondClass(1, 2);
        System.out.println(element.multiply());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                element.setchislo1(i);
                element.setchislo2(j);
                System.out.print(element.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}