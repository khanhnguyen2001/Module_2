package _10_DSA_Danh_sach.EXC_1_Trien_khai_phuong_thuc_ArrayList_theo_thu_vien_java_util_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println("Size: " + myList.size());

        System.out.println("Elements:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.remove(1);
        System.out.println("Size after removing an element: " + myList.size());

        System.out.println("Elements after removing:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("Index of 'C': " + myList.indexOf("C"));
        System.out.println("Contains 'B'? " + myList.contain("B"));

        myList.clear();
        System.out.println("Size after clearing: " + myList.size());
    }
}

