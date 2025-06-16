package gernel;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class todat2 {
    public static void main(String[] args) {
        int[] arr={2,2,1,3,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
//            if(map.containsKey(i))
//            {
//                map.put(i,map.get(i)+1);
//            }
//            else{
//                map.put(i,1);
//            }
        }
        map.forEach((a,b)->{
            System.out.println(a +"-> "+b);
        });
    }
}
