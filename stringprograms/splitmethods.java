
package stringprograms;

public class splitmethods {
    public static  void main(String[] args)
    {
        String str="hi hello hou are you";
        String[] spli=str.split(" ");

        //reverse a given sentence
        String result="";
        for(int i=spli.length-1;i>=0;i--)
        {
            result =result+spli[i];
        }
        System.out.println(" "+result);
    }
}
