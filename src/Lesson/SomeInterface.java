package Lesson;

public interface SomeInterface {

      default void justAbtract(){
          System.out.println("Method from interface");
    }

    static void secondFromInt(){
        System.out.println("second and static from interface");
    }

    void method();



}
