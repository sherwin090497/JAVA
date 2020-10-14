package MainClass;
import java.io.*; 
import java.util.*; 
  
class MainClass { 
    
	
	private LinkedList<Integer> insertionSort(LinkedList<Integer> list) {
		// TODO Auto-generated method stub
		for(int j = 1; j < list.size(); j++) {
			int key = list.get(j);
			int i = j-1;
			
			while ((i >= 0) && ((list.get(i)>key))) {
				list.set(i + 1, list.get(i));
				i--;
			}
			list.set(i + 1,  key);
		}
		return list;
	}	
}

