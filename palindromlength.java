public class palindromlength {
    public static void palindroncheck(String s)
    {
        String[] sp=s.split(" ");
       // System.out.print(sp);
        for(int i=0;i<sp.length;i++) {

            String streac = sp[i];
            String result = "";
            for (int j = streac.length() - 1; j >= 0; j--) {
                result = result + streac.charAt(j);
            }
            if (result.equalsIgnoreCase(streac)) {
                System.out.println(streac+" "+streac.length()+" ");
            }
        }
    }


    public static void main(String[] args)
    {
        String s="my mom said to lern malayalam but i am from katak place it is gadag district";
        palindroncheck(s);
    }
}
