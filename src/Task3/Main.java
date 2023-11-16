package Task3;

import java.util.Scanner;

public class Main {

    static String value1;
    static String value2;

    static void workWithDictionary(MyDictionary nDictionary){

        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the word");
        value1 = scan.next();
        System.out.println("Type in translation");
        value2 = scan.next();

        nDictionary.addToDictionary(value1, value2);



    }

    public static void main(String[] args) {

        int i;

        MyDictionary nDictionary = new MyDictionary();

        workWithDictionary(nDictionary);

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the index to see the pair");

        i = sc.nextInt();



        nDictionary.whatInPair(i);


        workWithDictionary(nDictionary);
        System.out.println("Type in the index to see the pair");
        i = sc.nextInt();

        nDictionary.whatInPair(i);
        nDictionary.howManyPairs();

        sc.close();


    }
}
