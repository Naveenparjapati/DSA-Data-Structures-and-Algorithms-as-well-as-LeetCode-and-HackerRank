package searching;

public class temp {
 static void printvowel(String str)
 {
     String st=str;
     st=str.replaceAll("[^aeiouAEIOU]","").toLowerCase();

     if( str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u"))
     {
        System.out.print(st+" ");
     }
 }
    public static void main(String[] args)
    {  String str="education is most precious part of student life to make unovoidable ambition in automobile";
        String[] str1=str.split(" ");
        for(int i=0;i<= str1.length-1;i++)
        {
            if(str1[i].length()>=5)
            {
                printvowel(str1[i]);
            }
        }
    }
}
