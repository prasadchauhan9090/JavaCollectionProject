package CollectionsMap;


import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String args[])
    {

        //Creations of the Map
        Map<Integer,String> map = new Hashtable<>();

        //Addition of the elements into map
        map.put(500050, "HYDERABAD");
        map.put(603103, "CHENNAI");
        map.put(123211, "DELHI");



        //Retrieval the Keys from the map
        Set<Integer> keys =  map.keySet();
        for(Integer key : keys)
        {
            System.out.println(key);
        }

        System.out.println(" ------------------------------- ");

        //Retrieval the Values from the map
        Collection<String> values = map.values();
        for(String val : values)
        {
            System.out.println(val);
        }

        System.out.println(" ------------------------------- ");


        //Retrieval the Values from the map based on a key
        System.out.println(map.get(123211));


        System.out.println(" ------------------------------- ");
        //Retrieval the key and values
        Set<Integer> keyAndValue = map.keySet();
        for(Integer key3 : keyAndValue)
        {
            System.out.println(key3 + " ---> " + map.get(key3));
        }


        System.out.println(" ------------------------------- ");
        //Retrieval the key and values

        for(Integer key4 : keyAndValue)
        {
            System.out.println(key4 + " ---> " + map.get(key4));
        }

        System.out.println(map);



        //Remove the city from the above Mapys
        map.remove(123211);

        System.out.println(map);


    }
}
