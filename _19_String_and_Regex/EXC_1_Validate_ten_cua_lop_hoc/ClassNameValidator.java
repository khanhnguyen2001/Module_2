package _19_String_and_Regex.EXC_1_Validate_ten_cua_lop_hoc;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        // Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
        if (!className.matches("[CAP].*")) {
            return false;
        }

        // Không chứa các ký tự đặc biệt
        if (className.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }

        // Theo sau ký tự bắt đầu là 4 ký tự số
        if (!className.matches("[CAP]\\d{4}.*")) {
            return false;
        }

        // Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K
        if (!className.matches(".*[GHIK]$")) {
            return false;
        }

        // Tất cả các yêu cầu đều đáp ứng
        return true;
    }

    public static void main(String[] args) {
        String className1 = "C0223G";
        String className2 = "A0323K";
        String className3 = "M0318G";
        String className4 = "P0323A";

        System.out.println(className1 + " hợp lệ: " + isValidClassName(className1));
        System.out.println(className2 + " hợp lệ: " + isValidClassName(className2));
        System.out.println(className3 + " hợp lệ: " + isValidClassName(className3));
        System.out.println(className4 + " hợp lệ: " + isValidClassName(className4));
    }
}

