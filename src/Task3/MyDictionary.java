package Task3;

import java.util.ArrayList;

public class MyDictionary <T>{

    private ArrayList<T> arrayList = new ArrayList<T>();


    public void addToDictionary(String value1, String value2){
        String[][] twoAr = {{value1},{value2}};

        arrayList.add((T) twoAr);
    }

    public void whatInPair(int i){

        try {
            System.out.println(((String[][])arrayList.get(i))[0][0] + "-" + ((String[][])arrayList.get(i))[1][0]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("the index does not exist");
        }



    }

    public void howManyPairs(){

        System.out.println("Amount of pairs: " +arrayList.size());

    }

}
