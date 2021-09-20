public class Example {
    public static void main(String[] args) {
        sayHello("Sergey", "Pinigin");
    }

    static void sayHello(String firstName, String secondName) {
        System.out.printf("Hello " + joinName(firstName, secondName));
    }

    static String joinName(String firstName, String secondName) {
        return "Mr. "+ firstName + " " + secondName;
    }
}
