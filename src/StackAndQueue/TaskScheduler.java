package StackAndQueue;

import java.rmi.dgc.Lease;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
	
	 public static int leastInterval(char[] tasks, int n) {
	        // gives us the frequency of character
	        HashMap<Character,Integer> hm =  new HashMap<>();
	        
	        for(char c : tasks) {
	        	hm.put(c, hm.getOrDefault(c, 0)+1);
	        }
	        
	        // create a max heap
	        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>((a,b)->(b-a));
	        maxHeap.addAll(hm.values());
	        
	        int cycles = 0;
	        while(!maxHeap.isEmpty()) {
	        	List<Integer> temp =  new ArrayList<Integer>();
	        	for (int i = 0; i < n+1; i++) {
	        		if(!maxHeap.isEmpty()) {
	        			temp.add(maxHeap.remove());
	        		}
				}
	        	
	        	for(int i : temp) {
	        		if(--i > 0) {
	        			maxHeap.add(i);
	        		}
	        	}
	        	
	        	cycles += maxHeap.isEmpty()?temp.size():n+1;
	        }
	        
	      return cycles;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char[] tasks = {'A','A','A','B','B','B'};
		char[] tasks = {'A','A','B'};
		int n = 2;
		
		System.out.println(leastInterval(tasks, n));

	}

}
