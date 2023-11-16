package Lesson;

public class TestClass implements SomeInterface {

    @Override
    public void method() {
        System.out.println( 10+10);
    }

    public static void main(String[] args) {
        TestClass ourTestClass = new TestClass();
        ourTestClass.method();

        new TestClass().method();

        SomeInterface.secondFromInt();
        ourTestClass.justAbtract();
    }
}
