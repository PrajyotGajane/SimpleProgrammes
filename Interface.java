interface Implement{
    default void defaultMethod() {
        System.out.println("This is the default method in the interface");
    }

    static void staticMethod() {
        System.out.println("This is the static method in the interface");
    }

    void existingMethod();
}

public class Interface implements Implement{
    @Override
    public void existingMethod() {
        System.out.println("Method from interface that needed to be overridden");
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.existingMethod();
        obj.defaultMethod();
        Implement.staticMethod();
    }
}
