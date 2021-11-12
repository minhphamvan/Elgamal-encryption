
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Minh Pham
 */
public class Main {

    public static void main(String[] args) {
        String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
        
//        var copyArr = brands; // cả 2 mảng sẽ cùng tham chiều đến vùng bộ nhớ chung --> cùng giá trị
        var copyArr = Arrays.copyOf(brands, 2); // tạo 1 mảng mới bằng cách copy mảng cũ ra vùng nhớ mới
        System.out.println(copyArr[1]); // kết quả in ra: Samsung

        brands[1] = "Iphone";
        System.out.println(brands[1]);
        System.out.println(copyArr[1]);
    }
}
