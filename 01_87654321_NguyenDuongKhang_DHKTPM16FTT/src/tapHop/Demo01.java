package tapHop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo01 {
	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		s.add("Tôi yêu Việt Nam");
		s.add("Tôi yêu trường tôi");
		s.add("Tôi yêu Việt Nam");
		s.add("Tôi yêu trường tôi");
		for (String str : s) {
			System.out.println(str);
		}
		Set<String> tt= new TreeSet<String>();
		tt.add("LTC");
		tt.add("LT java");
		tt.add("LT .NET");
		tt.add("LTC");
		Iterator<String> itr=tt.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		
		
	}
	
	

}
