package gernel;

public class a2b2aabb {
    public static void main(String[] args)
    {
        String str="aabbcccdd";//a2b2c3d2
        String output=characters(str);
        System.out.print(output);
    }
    public static String characters(String str)
    {
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }else{
                result.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        return result.toString();
    }
}
