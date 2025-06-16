import java.util.HashMap;
import java.util.Map;
public class uniqeusinghasmap {
    public static void main(String[] strings)
    {
        int[] arr={1,2,2,3,3,4,5,6,6};//1
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr)
        {
            if(m.containsKey(i))
            {
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> ent:m.entrySet())
                {
                    if(ent.getValue()==1)
                    {
                        System.out.println(ent.getKey()+" "+ent.getValue());
                    }
                }
    }
}
