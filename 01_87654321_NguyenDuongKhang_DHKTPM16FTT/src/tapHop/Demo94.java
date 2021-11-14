package tapHop;

import java.util.HashSet;

public class Demo94 {

	public static void main(String[] args) {
		 HashSet<String> setA = new HashSet<String>();
	        setA.add("Java");
	        setA.add("Python");
	        setA.add("Java");
	        setA.add("PHP");
	        System.out.println("Các phần tử của setA trước khi xóa: ");
	        for (String element : setA) {
	            System.out.println(element);
	        }
	        // xóa phần tử PHP khỏi setA
	        setA.remove("PHP");
	        System.out.println("Các phần tử của setA sau khi xóa: ");
	        for (String element : setA) {
	            System.out.println(element);
	        }
	}

}
