public class revercesemtes {
    public static void main(String[] args) {
        String sentence = "hi we hio heiio";


        String[] words = sentence.split(" ");


        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("beforr " + sentence);
        System.out.println("after " + reversed.toString());
    }
}
