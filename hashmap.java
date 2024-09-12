import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("India",140);
        map.put("PAKISTAN",20);
        map.put("ABDUL",160);

        map.put("India",130);

        System.out.println(map);

        //searching

        if(map.containsKey("ABDUL")){
            System.out.println("YES MAQSAD IS THERE");

        }
        else{
            System.out.println("WE ARE SAFE");
        }

        System.out.println(map.get("PAKISTAN"));     //20
        System.out.println(map.get("BANGLADESH"));   //null

        //iteration 1

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println("hello");


        //iteration 2
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+ " "+ map.get(key));
        }

        map.remove("ABDUL");
        System.out.println(map);
        
    }
    
}
