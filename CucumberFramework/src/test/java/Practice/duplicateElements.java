package Practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElements {

	
	public  void duplicateElem(int[] inputarray) {
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
		for(int element:inputarray)
		{
			
			if (map.get(element)==null)
			{
				map.put(element, 1);
				
			}
			
			else 
			{
				map.put(element, map.get(element)+1);
			}
			
			
		Set<Entry<Integer, Integer>>	entryset=map.entrySet();
		
		for(Entry<Integer, Integer> entry:entryset)
		{
			if (entry.getValue()>1)
			{
				System.out.println(entry.getKey() + ":"+entry.getValue());
			}
		}
			
			
			
			
		}
		
		
	}
		

  
  public static void main(String[] args) {
	  
	  
	  int[] inputarray=new int[] {111,222,222,333};
	  
	  duplicateElements d=new duplicateElements();
	  
	  d.duplicateElem(inputarray);
	  
	  
  }
	
	
  }
	

