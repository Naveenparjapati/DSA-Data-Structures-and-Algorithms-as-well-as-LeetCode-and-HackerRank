package gernel;
import java.util.Arrays;
public class sietas {
    public static void main(String[] args) {
            String s = "leetcode";//leotcede
            char[] c = s.toCharArray();
            System.out.println(Arrays.toString(c));
            int i=0;
            int j=c.length-1;
          while(i<j)
          {
              if ("aeiou".indexOf(c[i]) != -1 && "aeiou".indexOf(c[j]) != -1)
              {
                  char temp=c[i];
                  c[i]=c[j];
                  c[j]=temp;
              }
             i++;
              j--;
          }
          String result="";
        for (char value : c) {
           result+=value;
        }
        System.out.print(result);
        }
    }

