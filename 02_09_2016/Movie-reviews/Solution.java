package hashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<String, MovieBuff> mp = new TreeMap<String , MovieBuff>();
		while(true) { 
			System.out.println("Enter the Choice:\n[1]-Insert\n[2]-Display\n[3]-Exit\n");
			int choice;
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				String name;
				double rev;
				System.out.println("Enter the name and review");
				name=scan.next();
				rev=scan.nextDouble();
			    if(mp.containsKey(name))
			    {
			    	MovieBuff mb = mp.get(name);
			    	mb.setCount(mb.getCount()+1);
			    	mb.setRating(mb.getRating()+rev);
			    }
			    else
			    	mp.put(name,new MovieBuff(1,rev));
				break;
			case 2:
				String str = String.format("%-10s %-10s\n","Movie name","Rating");
				System.out.println(str);
				String str1;
				for(Map.Entry<String, MovieBuff> each:mp.entrySet()) {
					str1 = String.format("%-10s %10.2f (%d)reviews",each.getKey(),each.getValue().getRating()/(double)each.getValue().getCount(),each.getValue().getCount());
					System.out.println(str1);
				}
				
				break;
			}
			if(choice == 3)
				break;
		}
	}
}
