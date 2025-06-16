public class lpa8 {
    public static void main(String[] args) {
        String str = "work2shop3";
        // output=workworkshop workworkshop workworkshop;
         String str1=str.replaceAll("[^a-zA-Z]"," ");//only words are there
         String str2=str.replaceAll("[A-za-z]","");//only number remain

        String[] first=str1.split(" ");//["word","shop"]
        char[] num=str2.toCharArray();//['2','3']
        int no=num[0]-48;//2
        int no1=num[1]-48;//3
        String res="";
        for(int i=0;i<no1;i++)
        {
            for(int j=0;j<no;j++)
            {
                res+=first[0];
            }
            res+=first[1];
        }
        System.out.println(res);
        int k=10;
        System.out.println(res.charAt(k-1));
    }

}
