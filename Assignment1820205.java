import java.util.Arrays;
public class Assignment1820205 {
    public static void main(String[] args)
    {
        String str="overloadingu";
        //o/p  oelaig
        //o/p  vrodnu

//        char[] charar=str.toCharArray();
//        System.out.println(Arrays.toString(charar));
        //...............................................
//        for(int i=0;i<charar.length-1;i+=2)
//        {
//            System.out.print(charar[i]);
//        }
        //........................................
//        for(int i=1;i<=charar.length-1;i+=2)
//        {
//            System.out.print(charar[i]);
//
//...................................................
        //o/p  oeoaiu vrldng
//        String res=str.replaceAll("[^AEIOUaeiou]","");
//        String re=str.replaceAll("[AEIOUaeiou]","");
//        System.out.print(res+" "+re);
        //o/p oeoaiu gndlrv
//        String res=str.replaceAll("[^AEIOUaeiou]","");
//        String re=str.replaceAll("[AEIOUaeiou]","");
//        String result="";
//        for(int i=re.length()-1;i>=0;i--)
//        {
//            result += re.charAt(i);
//        }
//        System.out.print(res+" "+result);
        // //o/p  uiaoeo  gndlrv
        String res=str.replaceAll("[^AEIOUaeiou]","");
        String re=str.replaceAll("[AEIOUaeiou]","");
        String result="";
        for(int i=res.length()-1;i>=0;i--)
        {
            result += res.charAt(i);
        }
        System.out.print(result+" "+re);

        if(res.length()==re.length())
        {
            System.out.println(" "+res.length());
        }
        if(str.length()==res.length())
        {
            System.out.print(("true"));
        }
    }
}
