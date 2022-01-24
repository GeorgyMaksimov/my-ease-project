package my.ease.project.lesson.strings;

public class Example {
    public static void main(String[] args) {
        sayHello("Sergey", "Pinigin");
    }

    static void sayHello(String firstName, String secondName) {
        String joinedNames = joinName(firstName, secondName);
        System.out.printf("Hello " + joinedNames);
    }

    static String joinName(String firstName, String secondName) {
        return "Mr. "+ firstName + " " + secondName;
    }
}
