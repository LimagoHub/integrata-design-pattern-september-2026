package de.integrata.dependency.inner;

import de.integrata.dependency.MyDependency;

public class MyDependencyImpl implements MyDependency {

    @Override
    public void foo() {
        System.out.println("Hier ist Foo");
    }
}