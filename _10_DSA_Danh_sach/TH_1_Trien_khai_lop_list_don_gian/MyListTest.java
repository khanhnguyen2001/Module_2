package _10_DSA_Danh_sach.TH_1_Trien_khai_lop_list_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

        // Trường hợp 2: Hiển thị phần tử ở vị trí -1
//         listInteger.get(-1);
//         System.out.println("element -1: " + listInteger.get(-1));
    }
}
