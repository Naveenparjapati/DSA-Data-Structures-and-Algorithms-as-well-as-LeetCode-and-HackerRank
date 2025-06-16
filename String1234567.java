import java.util.Arrays;

public class String1234567 {
    public static void main(String[] args)
    {
        String s="1-2,3-4,@,5-6,7-8";
        //output:[[[1,2],[3,4]],[[5,6],[7,8]]];
        s=s.replaceAll("@","");
        s=s.replace("[]",",");
        s=s.replace(",","][");
        s=s.replace("-",",");
        System.out.print("[[["+s+"]]]");
    }
}
