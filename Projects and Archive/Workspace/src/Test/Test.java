package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Ruben on 7/22/2015.
 */
public class Test {

    private String name;

    public static void main(String[] args) {
        Test t = new Test();
        Method[] array = t.getClass().getDeclaredMethods();

        for(int i =0; i< array.length; i++)
            System.out.println(array[i].getName());

        Field[] fields = t.getClass().getDeclaredFields();


        for(int i =0; i< fields.length; i++)
            System.out.println(fields[i].getName());



    }



}
