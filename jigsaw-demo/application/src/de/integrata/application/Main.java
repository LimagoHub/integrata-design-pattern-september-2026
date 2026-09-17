package de.integrata.application;

import de.integrata.dependency.MyDependency;

public class Main {

    public static void main(String[] args) {
        MyDependency dep = MyDependency.create();
        dep.foo();
    }
}