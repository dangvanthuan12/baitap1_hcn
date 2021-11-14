package tapHop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

	public static void main(String[] args) {
		Map<String, HashMapSinhVien> ls = new HashMap<String, HashMapSinhVien>();
		HashMapSinhVien sv1 =new HashMapSinhVien(1234567, "Trần Khoa");
		HashMapSinhVien sv2= new HashMapSinhVien(9876543, "Hồ Ca Thán");
		ls.put("CNTT", sv1);
		ls.put("TCNH", sv2);
        System.out.println("Size cua langMap la: " + ls.size());
        System.out.print("Cac phan tu cua ls của HashMap: ");
        Iterator<String> itr = ls.keySet().iterator();
        while (itr.hasNext()) {
            System.out.print(ls.get(itr.next()) + " ");
        }
        System.out.println("\nSize cua HashMap la: " + ls.size());
	}

}
