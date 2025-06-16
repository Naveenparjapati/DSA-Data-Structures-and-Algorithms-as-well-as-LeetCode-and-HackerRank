class Main {
    public static void main(String[] args) {

        int num = 3553, rev = 0, rem;
        int ori = num;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }


        if (ori == rev) {
            System.out.println(ori + " is Palindrome.");
        }
        else {
            System.out.println(ori + " is not Palindrome.");
        }
    }
}