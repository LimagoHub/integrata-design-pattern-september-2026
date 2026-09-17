package de.integrata.dependency;

import java.util.ServiceLoader;

public interface MyDependency {

    void foo();

    static MyDependency create() {
        return ServiceLoader.load(MyDependency.class)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Kein Provider gefunden"));
    }
}