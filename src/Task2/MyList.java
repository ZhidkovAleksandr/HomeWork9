package Task2;

import java.util.ArrayList;

public class MyList <T>{

   private ArrayList<T> arrayList = new ArrayList<T>();

   public void addSome(T value){

        arrayList.add(value);


   }

   public void whatInIndex(int i) throws IndexOutOfBoundsException{

       try {
           System.out.println(arrayList.get(i));
       }catch (IndexOutOfBoundsException exception){
           System.out.println("you have typed the index which does not exist");
       }




   }

   public void howMuchElements(){

       System.out.println("Capacity of list: " +arrayList.size());

   }


}
