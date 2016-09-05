 class HelloA {

    public HelloA() {
        System.out.println("HelloA");
    }

    { System.out.println("I'm A class"); }

    static { System.out.println("static A"); }

}

public class Test extends HelloA {
    public Test() {
        System.out.println("HelloB");
    }

    { System.out.println("I'm B class"); }

    static { System.out.println("static B"); }

    public static void main(String[] args) { 
    new Test();;  }

}
