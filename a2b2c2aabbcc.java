public class a2b2c2aabbcc {
    public static void main(String[] args) {
        String str = "a2b3c4d2";
        // output=aabbbccccdd
        String string = str.replaceAll("[0-9]", "");//only words are there
        String number = str.replaceAll("[^0-9]", "");//only number remain
//       System.out.print(string);
//       System.out.print(number);
  char[] arr1=string.toCharArray();//['a','b','c','d'];
  char[] arr2=number.toCharArray();//[2,3,4,2]

        for(int i=0;i< arr2.length;i++)
        {
            for(int j=0;j<arr2[i]-48;j++)
            {
                System.out.print(arr1[i]);
            }
        }
    }
}
