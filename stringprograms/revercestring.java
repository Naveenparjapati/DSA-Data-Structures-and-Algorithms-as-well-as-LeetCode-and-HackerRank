package stringprograms;

public class revercestring {
    public static void main(String[] args) {
        String str = "Nave en   huhuh hjdhdjd";
        String result = "";
        //iterating string
//        for(int i=0;i<str.length();i++)
//        {
//            result +=str.charAt(i);
//        }
//        System.out.println(result);
        //reversing a string
//        for(int i=str.length()-1;i>=0;i--)
//        {
//            result +=str.charAt(i);
//        }
//        System.out.print(result);

        //palindrom or not
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result += str.charAt(i);
//        }
//        if (str.equals(result)) {
//            System.out.print("palindrom");
//        } else {
//            System.out.print("not palindrom");
//        }
        //length of palindrom string
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result += str.charAt(i);
//        }
//        if (str.equals(result)) {
//            System.out.print("palindrom "+result+"length "+result.length());
//        } else {
//            System.out.print("not palindrom "+result+"length "+result.length());
//        }
//        //length of last word
//        String[] st=str.split(" ");
//        String asns="";
//        for (int i = 0; i <st.length; i++)
//        {
//            if(st[i]!=" ")
//                {
//                     asns=st[i];
//                }
//
//            }
//           System.out.print(asns+" "+asns.length());
//        }
//        //length of firs word
//        String[] st=str.split(" ");
//        String asns="";
//        for (int i = 0; i <st.length; i++)
//        {
//            if(st[i]==st[i])
//            {
//                asns=st[i];
//                break;
//            }
//
//        }
//        System.out.print(asns+" "+asns.length());
//    }
        //length of longest  word in a sentence
        String[] st=str.split(" ");
        String asns="";
        for (int i = 0; i <st.length; i++)
        {
            if(st[i].length()>asns.length())
            {
                asns=st[i];
            }

        }
        System.out.print(asns+" "+asns.length());
    }
    }

