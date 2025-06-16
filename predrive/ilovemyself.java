package predrive;
public class ilovemyself {
    public static void main(String[] args) {
        String str= "I love myself"; //  F LESY MEVOL
        String[] words =str.split(" ");
        String result = "";
        for (int i = str.length()-1; i >=0; i--) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                result += currentChar;
            }
        }
        System.out.println(result);
        String firstPart = result.substring(0, words[0].length());
        String secondPart =result.substring(1, words[1].length()+1);
        String thirdPart = result.substring(words[2].length()-1);
        //  output
        String output = firstPart + " " + secondPart + " " + thirdPart;
        // final output
        System.out.println(output.toUpperCase());
    }
}
