import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(23);
		l.add(23);
		
// 		frequency 
        System.out.println(Collections.frequency(l,23));   
        
// 		binary search 
        System.out.println(Collections.binarySearch(l,12));
        System.out.println(Collections.binarySearch(l,44)); 
// 		sort funtion
		Collections.sort(l);
		System.out.println(l);
		
// 		reverse funtion
        Collections.reverse(l);
        System.out.println(l);
        
        // max function
        System.out.println(Collections.max(l));
        
        // min function 
        System.out.println(Collections.min(l));
        
// 		fill function
		Collections.fill(l,2);
		System.out.println(l);
		

	}
}
