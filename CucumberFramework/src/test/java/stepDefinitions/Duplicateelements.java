package stepDefinitions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicateelements {
	
	public void duplicateElements(int[] inputarray) {
		
		
		
		System.out.println(inputarray);
		
		  HashMap<Integer, Integer> map = new HashMap<>();
	         
		    for (int element : inputarray) 
		    {   
		        if(map.get(element) == null)
		        {
		            map.put(element, 1);
		        }
		        else
		        {
		            map.put(element, map.get(element)+1);
		        }
		    }
		    
	
		         
		    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		         
		    for (Entry<Integer, Integer> entry : entrySet) 
		    {               
		        if(entry.getValue() > 1)
		        {
		            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
		        }
		    }
		}

	
	
	
	
	public static void main(String[] args) {
		
		int[] inputarray=new int[]{111,222,111};
		
		Duplicateelements d=new Duplicateelements();
		
		d.duplicateElements(inputarray);
		
		
		
		
	}

}
