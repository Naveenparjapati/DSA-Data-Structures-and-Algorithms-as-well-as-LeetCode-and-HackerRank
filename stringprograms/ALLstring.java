package stringprograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ALLstring {
    //  reverce a string using charAt()
//   public static void reversestr(String str)
//   {
//       String result="";
//       for(int i=str.length()-1;i>=0;i--)
//       {
//       result=result+str.charAt(i);
//       }
//       System.out.println(result);
//   }

//..............................................
//palindrom
// public static void reversestr(String str)
//   {
//       String result="";
//       for(int i=str.length()-1;i>=0;i--)
//       {
//       result=result+str.charAt(i);
//       }
//       if(result.equals(str))
//       {
//           System.out.println("palindrom ");
//       }
//       else
//       {
//           System.out.println("not a palindrom");
//       }
//   }
//........................................
//without charAt() method revese a string

//     public static void main(String[] args) {
//         String str="hello";
//      char[] st=str.toCharArray();
//         int si=0;
//         int ei=st.length-1;
//         while(si<ei)
//         {
//             char temp=st[si];
//             st[si]=st[ei];
//             st[ei]=temp;

//             si++;
//             ei--;
//         }
//         System.out.println(st);
//   System.out.println(Arrays.toString(st));
//     }

//palindrom string without equals metod
// public static void main(String[] args)
// {
//     String str="naveen";
//     boolean flag=true;
//     int si=0;
//     int ei=str.length()-1;
//     while(si<ei)
//     {
//         if(str.charAt(si)!=str.charAt(ei))
//         {
//         flag=false;
//         break;
//         }
//         si++;
//         ei--;

//     }
//     if(flag)
//     {
//         System.out.println("palindrom");
//     }
//     else
//     {
//         System.out.println("not palindrom");
//     }

// }
//count words in a sentence
// public static void main(String[] args)
// {
//     //count words in a sentence
//     String str="hi naveen how are you";//o/p 21
//     str.split(" ");
//         int count=0;
//      for(int i=0;i<=str.length()-1;i++)
//     {
//         count++;
//     }
//     System.out.println(count);//21
//     int count2=0;
//     String[] s1=str.split(" ");
//     for(int i=0;i<=s1.length-1;i++)
//     {
//         count2++;
//     }
//     System.out.println(count2);
//     System.out.println(Arrays.toString(s1));


// }
// public static void main(String[] args)
// {
//     //longest word in a sentence
//     String str="hi naveen how are you";
//     String[] st=str.split(" ");
//     int count=0;
//     String longword="";
//     for(int i=0;i<=st.length-1;i++)
//     {
//             // System.out.println(st[i]+" "+st[i].length()+" ");
//             if(st[i].length()>count)
//             {
//                 count=st[i].length();
//                 longword=st[i];

//             }

//         }
//         System.out.println(longword);
//         System.out.println("longest word length  "+count);
//     }

//last word length
// public static void main(String[] args)
// {
//     //longest word in a sentence
//     String str="hi naveen how are you";
//     String[] st=str.split(" ");
//     String result="";
//     String longword="";
//     for(int i=0;i<=st.length-1;i++)
//     {
//             if(st[i]!=" ")
//             {
//             result=st[i];
//             }
//         }
//         System.out.print(result+" "+ result.length());
//      }
//.....  reverce each word........................
//  public static void main(String[] args)
// {
//     String str="hi naveen how are you";
//     String[] st=str.split(" ");
//     String result="";
//     String longword="";
//     for(int i=0;i<=st.length-1;i++)
//     {
//           String len=st[i];
//           for(int j=len.length()-1;j>=0;j--)
//           {
//               System.out.print(len.charAt(j));
//           }
//           System.out.print(" ");
//         }
//         }

    //..........................................
    public static void reverces(String[] st)
    {


        for(int i=0;i<st.length-1;i++)
        {
            String si=st[i];
            String rev="";
            for(int j=si.length()-1;j>=0;j--)
            {
                rev=rev+si.charAt(j);
            }
            if(si.equals(rev))
            {
                System.out.print(si+" "+si.length());
            }
        }

    }
    public static void main(String[] args)
    {
        String str="i am naveen asa hi hah loop";
        String[] st=str.split(" ");
        reverces(st);
    }
}
