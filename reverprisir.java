public class reverprisir {
    public static void main(String[] args) {
        String input = "hi we his hello";
        String[] words = input.split(" ");


        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[i]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }


        String output = String.join(" ", words);
        System.out.println(output);
    }
}
