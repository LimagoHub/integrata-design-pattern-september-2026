module de.integrata.dependency {
    exports de.integrata.dependency;

    uses de.integrata.dependency.MyDependency;

    provides de.integrata.dependency.MyDependency with de.integrata.dependency.inner.MyDependencyImpl;
}