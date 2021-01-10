public class Chaining {
    Chaining(){
        this(5);
        System.out.println("Default Constructor");
    }
    Chaining(int x)
    {
        this(x,5);
        System.out.println("One param Constructor : " + x);
    }
    Chaining(int x, int y)
    {
        System.out.println("Two param Constructor : " + x * y);
    }

    public static void main(String[] args) {
        Chaining chaining = new Chaining();
    }
}
