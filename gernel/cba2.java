package gernel;

public class cba2 {

    public static int calculate (String text) {
        if (text == null || text.length() <= 1) {
            return 0;
        }

        int totaldist = 0;
        for(int i=1;i<text.length();i++)
        {
            char precvchar=text.charAt(i-1);
            char currentchar =text.charAt(i);
            int prevpos=precvchar-'a';
            int currentpos=currentchar-'a';
            totaldist+=Math.abs(currentpos - prevpos);
        }
        return totaldist;
    }
    public static void main(String[] ars)
    {
        String text="abcd";
      System.out.print(calculate(text));
    }
}
