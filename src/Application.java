/**
 * Created a Main Class
 *  
 * @author Aaron McCarley
 * CS215
 * Assignment 5.1
 * Version 1.0
 *
 * @param <K>
 * @param <V>
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class Application<K, V> extends Dictionary<K, V>{

	public static void main(String[] args) throws FileNotFoundException {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		/**
		 * I first transferred saved the excel file as a csv. file to
		 * separate the content. Direct uploading into from the  
		 */
		
		File file = new File("/Users/amacc101/Desktop/DictionaryWordValuePairs.txt"); // Or file name could be read.
	    Scanner scan = new Scanner(file);
	      
	    /**
		 * Using a while loop to scan the entire txt.
		* and print the unsorted dictionary keys and definitions 
		* If I where to just use a nextLine without the while loop
		* it would only print the first line of the txt. file
		*/
	    while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		
	    /**
		 * Create an empty hash map by declaring object
		 * of integer and string types
		 */
	    HashMap<Integer, String> hashMap = new HashMap<>();
		
			
    		System.out.println();
    		
    		Iterator<Integer> itr = map.keySet().iterator();
    		
    		while(itr.hasNext()) 
    		{
    			Integer key  = itr.next();
    			String mapValue = map.get(key);
    			System.out.println("Key: " + key + ", Value: " + mapValue + hashMap.hashCode());
    		}	
    		/**
    		 * implementing HashCode into the sorted dictionary
    		 * and filling the HashMap with organized data
    		 */
    		 
    		hashMap.put(hashMap.hashCode()+ 04,"uncommon: remarkably");
			hashMap.put(hashMap.hashCode()+ 18,"cicisbeo: a married woman's male companion or lover: ");
			hashMap.put(hashMap.hashCode()+ 47,"sippet: a small piece of bread or toast for dipping into soup or sauce: ");
			hashMap.put(hashMap.hashCode()+ 104,"sciolist: a person who pretends to be knowledgeable: ");
			hashMap.put(hashMap.hashCode()+ 105,"mage: a magician or learned person: ");
			
			System.out.println(hashMap);
			
	    }
	}