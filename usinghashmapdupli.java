import java.util.HashMap;
import java.util.Map;

public class usinghashmapdupli {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,6,6,3};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr)
        {
            if(m.containsKey(i))
            {
                m.put(i, m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> ent: m.entrySet())
        {
            if(ent.getValue()>=2)
            {
                System.out.println(ent.getKey()+" "+ent.getValue());
            }
        }
    }
}
