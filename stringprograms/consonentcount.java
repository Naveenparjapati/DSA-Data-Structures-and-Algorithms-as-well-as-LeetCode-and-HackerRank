package stringprograms;

public class consonentcount {


    public static void countvconsonent(String str)
    {
        // Remove all characters that are not consonants
        String replaceConsonants = str.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
        String consonantsOnly = replaceConsonants.replaceAll("[aeiouAEIOU]", ""); // Remove vowels
        System.out.println("Number of consonants: " + consonantsOnly.length());
    }
    public static void main(String[] args)
    {
        String str="hi how many vowels ooo";
        countvconsonent(str);
    }
}

