package design_patterns.CreationalDP.PrototypeAndRegistryDP;

public interface Prototype<T> {
    //T -> Generics.
    T clone();
}
