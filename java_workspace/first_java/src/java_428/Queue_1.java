package java_428;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
	public static void main(String[] args) throws InterruptedException{
		
		int time = 10;
		Queue<Integer> qq = new LinkedList<Integer>();
		
		for (int i = 0; i < time; i++) {
			qq.add(i);
		}
		/*
		 * for(int i = 1; i < time; 1+=2)
		 * 	{qq.offer(i);}
		 */
		
		while (!qq.isEmpty()) {
			// System.out.println(qq.poll() + " aaa " );  // remove
			
			System.out.println(qq.remove() +  " 333");
			System.out.println(qq);
			Thread.sleep(1000);
		}
	}
}
