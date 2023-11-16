package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int someValue;
        String someString;
        int i;
        MyList someList = new MyList();
        Scanner scan =  new Scanner(System.in);
        System.out.println("type in some value int value");
        someValue =  scan.nextInt();
        someList.addSome(someValue);
        System.out.println("type in some string value");
        scan.nextLine();
        someString =  scan.nextLine();
        someList.addSome(someString);

        System.out.println("type in the index of element you whant to know");
        i = scan.nextInt();
        someList.whatInIndex(i);

        someList.howMuchElements();


    }

}
