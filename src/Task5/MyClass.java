package Task5;

import java.lang.reflect.Constructor;

public class MyClass {



    public static Class retClass (String nameOfClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class nClazz = Class.forName(nameOfClass);


        nClazz.newInstance();

        return nClazz;
    }

}


