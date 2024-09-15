public class ExerciseThree {

    public static String backwardsString(String s) {
        StringBuilder backwards = new StringBuilder(s);
        return backwards.reverse().toString();
    }

    public static void main(String[] args) {

        String input = "Good Morning";
        System.out.println(input);
        String backwardString = backwardsString(input);
        System.out.println(backwardString);
    }

}
