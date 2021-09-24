package automationtask.tugas;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set = new TreeSet<>();
	        set.add(3);
	        set.add(4);
	        set.add(3);
	        set.add(5);
	  
	        TreeMap<Integer, Integer> tm = new TreeMap<>();
	        tm.put(2, 4);
	        tm.put(3, 5);
	        tm.put(4, 5);
	        tm.put(2, 3);
	        
	        System.out.println(set);
	        System.out.println(tm);
	}

}
