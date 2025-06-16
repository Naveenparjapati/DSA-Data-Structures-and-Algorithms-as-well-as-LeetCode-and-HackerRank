package gernel;
import java.util.HashMap;
public class stringmapfreq {
    public static void main(String[] args) {
        String str = "Hi Hello Java Hi Java";
        String[] dt = str.split(" ");
        HashMap<String,Integer> map=new   HashMap<>();
        for(String str1:dt)
        {
//            map.put(str1,map.getOrDefault(str1,0)+1);
            if(map.containsKey(str1))
            {
                map.put(str1,map.get(str1)+1);
            }
            else{
                map.put(str1,1);
            }
        }
        map.forEach((a,b)->{
            System.out.println(a +" "+b);
                });
    }
}
