public class Overloading {
    int add(int x) {
        return x + 10;
    }

    int add(int x, int y) {
        return x + y;
    }

    float add(float x, float y)
    {
        return x + y;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        int result = overloading.add(10);
        System.out.println("Addition is " + result);
        result = overloading.add(10,20);
        System.out.println("Addition is " + result);
        float floatResult = overloading.add(10.5f,10.5f);
        System.out.println("Addition is " + floatResult);
    }
}
