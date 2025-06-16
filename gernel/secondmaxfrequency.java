package gernel;

public class secondmaxfrequency {
    public static void main(String[] args)
    {
        String str = "heiio hi fr hi sbs hi";
        String[] str1 = str.split(" ");
        int max=0;
        for(int i=0;i<str1.length;i++)
        {
//            System.out.println(str1[i]+" "+str1[i].length()+" ");
            if(str1[i].length()>max)
            {
                max=str1[i].length();
            }
        }
        System.out.print(max);
    }
}
