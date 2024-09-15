public class ExerciseOne {
    public static void main(String[] args) {

    String a = "Good morning";
    String b = "Good night";
        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After");
        System.out.println(a);
        System.out.println(b);

    }
}
