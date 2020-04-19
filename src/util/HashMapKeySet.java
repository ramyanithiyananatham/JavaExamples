package util;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap; 
public class HashMapKeySet {
	
	  
	/*If you want to store key-value pair without duplicate key, use Map ,
	Hash Map If you want output in any order
	 *  or TreeMap if you want sorted ordering without null values, 
	 *  or LinkedHashMap if you want to maintain insertion order. 
	*/
	    public static void main(String[] args) 
	    { 
	    	HashMapKeySet h= new HashMapKeySet();
	    	h.hahMapExample();
	    	h.linkedHashMap();
	    }
	        void hahMapExample()
	        {// Creating an empty HashMap 
	        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
	        System.out.println("Is the map empty before put? " + hash_map.isEmpty()); 
	        // Mapping int values to string keys 
	        hash_map.put("Geeks", 10); 
	        hash_map.put("4", 15); 
	        hash_map.put("Geeks", 20); 
	        hash_map.put("Welcomes", 25); 
	        hash_map.put("You", 30); 
	        System.out.println("Is the map empty? " + hash_map.isEmpty()+" The size of the map is " + hash_map.size()); 
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Using keySet() to get the set view of keys 
	        System.out.println("The set is: " + hash_map.keySet()); 
	        
	        // Creating a new hash map and copying 
	        HashMap<String, Integer> nHash = new HashMap<String, Integer>(); 
	        nHash.putAll(hash_map); 
	      
	        // Displaying the final HashMap 
	        System.out.println("The new map looks like this: " + nHash); 
	        
	        
	     // Checking for the Value 'Geeks' 
	        System.out.println("Is the value 'Geeks' present? " +nHash.containsValue(25)); 
	    } 
	    
	    
	    
	    void linkedHashMap()
	    {
	    	LinkedHashMap<Integer, String> lhm; 
	        lhm = new LinkedHashMap<Integer, String>(); 
	  
	        // insert element in LinkedHashMap 
	        lhm.put(101, "Vijay"); 
	        lhm.put(100, "Amit"); 
	  
	        // insert first null key 
	   //    lhm.put(null, "Ajay"); 
	        lhm.put(102, "Rahul"); 
	  
	        // insert second null key 
	        // which replace first null key value 
	      //  lhm.put(null, "Anuj"); 
	  
	        // insert duplicate 
	        // which replace first 102 key value 
	        lhm.put(102, "Saurav"); 
	  
	        lhm.entrySet().stream().forEach((m) -> { 
	            System.out.println(m.getKey() + " " + m.getValue()); 	        
	         
	     }); 
	               
	        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); 
	        
	        // Pass the hashMap to putAll() method 
	        treeMap.putAll(lhm);
	        System.out.println("TreeMap: "
                    + treeMap); 
	    }
	} 