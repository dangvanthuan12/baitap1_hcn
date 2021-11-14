package modul1;

public class ThamTri {
	// Phương thức có tham số kiểu int, với kiểu int (kiểu nguyên thủy)
    // thì tham số truyền là giá trị (tham trị)
    static void them(int num) {
        num = num + 1;
    }

    public static void main(String[] args) {
    	 int x = 5;

         // giá trị biến x được truyền (copy) vào tham số hàm (biến cục bộ),
         // bản thân địa chỉ ô nhớ lưu giá trị biến x hàm không biết
         them(x);
         System.out.println(x);  // In ra 6
     }
}

