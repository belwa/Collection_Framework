package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {

	public static void main(String[] args) {
		
		// create a new Hashmap
		Map <String, Integer> map  = new HashMap<>();
		
		// 1.put()- add key value pairs
		map.put("Alice", 25);
		map.put("Bob", 26);
		map.put("Charlie", 27);
		map.put("Eve", 29);
		
		System.out.println("the value of map: "+ map);
		
		// 2. size() Return the number of key value pair
		System.out.println("Map size is " + map.size());
		
		// 3. isEmpty() check is map is empty
		 System.out.println("check the map is: "+ map.isEmpty());
	
        // 4. containsKey()- check the key exist on map
		 System.out.println("Contains key Alice? "+ map.containsKey("Alice"));
		 System.out.println("contains Key Zoe "+ map.containsKey("Zoe"));
		 
		// 5  containsValue() - check the value exists or not
		 System.out.println("Contains key value 25 "+ map.containsValue(25));
		 System.out.println("Contains value is 11: "+ map.containsValue(11));
		 
		 // 6 get() - retrives the value associated with the key
		 System.out.println("Alice is age: "+ map.get("Alice"));
		 System.out.println("Non existence: "+ map.get("Zoe"));
		 
		 // 8 remove() the key- value pair by key
         map.remove("Charlie");		
         System.out.println("remove the value is map "+ map);
         
         // 9 clear() it is used to clear the map data
		 
         // 9. putAll() - copies All the key value in thr map
             Map<String, Integer> anotherMap = new HashMap<>();
             anotherMap.put("Frank", 45);
             anotherMap.put("Grace", 50);
             map.putAll(anotherMap);
             System.out.println("Map afer putAll: "+ map);
		 
             // 10 keySet()- returns a set of all the keys in the map
               Set <String> keys = map.keySet();
               System.out.println("the keys value is: "+ keys);
               
          //  values() - Retuens a collection of all values in the map
              Collection <Integer> values = map.values();
              System.out.println("values in the map: "+ values);
              
         //   replace() with a condition - Only replace if current value
              map.replace("Grace", 50, 60);
              System.out.println("Map after conditional replace for Grace:"+ map);
 	}

}
