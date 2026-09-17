package main;

import creator.BeanCreator;
import tiere.Schwein;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {


        Object obj = new BeanCreator().createAndFillBean("beans.Person");
        System.out.println(obj);

        /*
        // 1. Fall
        Class clazz = Schwein.class;

        // 2. Fall
        clazz = new Schwein().getClass();

        // 3. Fall
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Method [] methods = clazz.getMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        System.out.println("_".repeat(20));
        methods = clazz.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Constructor<?> constructor = clazz.getConstructor();
        constructor = clazz.getConstructor(String.class);

        Object obj = constructor.newInstance("Miss Piggy");
        System.out.println(obj);

        //Method method = clazz.getMethod("fuettern");
        //method.invoke(obj);
        Method method = clazz.getDeclaredMethod("setGewicht", int.class);
        method.setAccessible(true);
        method.invoke(obj, -100);
        System.out.println(obj);

         */
    }
}
