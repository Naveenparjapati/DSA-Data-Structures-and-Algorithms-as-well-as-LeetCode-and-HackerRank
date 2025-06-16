package DSATASK;

public class task2 {

    public static boolean rotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {

        String s1 = "JavaJ2ee";
        String s2 = "J2eeJava";

        if (rotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }
}