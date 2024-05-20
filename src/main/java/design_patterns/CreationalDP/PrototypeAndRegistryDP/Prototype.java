package design_patterns.CreationalDP.PrototypeAndRegistryDP;

public interface Prototype<T> {
    //T -> Generics.
    T clone();

    /*
        We create this Prototype Interface of generic type and Implements it to our class so that every class is bound
        to implement clone method .
     */
}
