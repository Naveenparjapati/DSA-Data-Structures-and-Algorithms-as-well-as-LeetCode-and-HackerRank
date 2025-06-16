public class lexographic {


        public static boolean isLexc(String sentence) {
            String[] sarr= sentence.split(" ");
            for (int i = 0; i < sarr.length - 1; i++) {
                if (sarr[i].compareTo(sarr[i + 1]) > 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {

            String sentence = "apple banana cherry";
            if (isLexc(sentence)) {
                System.out.println("The words are in lexicographic order.");
            } else {
                System.out.println("The words are not in lexicographic order.");
            }
        }
    }

