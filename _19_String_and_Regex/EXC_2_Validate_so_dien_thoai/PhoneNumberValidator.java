package _19_String_and_Regex.EXC_2_Validate_so_dien_thoai;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Kiểm tra độ dài và ký tự đầu tiên là dấu "("
        if (phoneNumber.length() != 15 || phoneNumber.charAt(0) != '(') {
            return false;
        }

        // Kiểm tra ký tự thứ 4 và 5 là dấu "-"
        if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(6) != '-') {
            return false;
        }

        // Kiểm tra ký tự từ 1-3 và 7-14 là ký tự số
        for (int i = 1; i < 4; i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }
        for (int i = 7; i < 15; i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }

        // Kiểm tra ký tự cuối cùng là dấu ")"
        if (phoneNumber.charAt(14) != ')') {
            return false;
        }

        // Tất cả các yêu cầu đều đáp ứng
        return true;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        String phoneNumber3 = "(84)-(22b22222)";
        String phoneNumber4 = "(84)-(9978489648)";

        System.out.println(phoneNumber1 + " hợp lệ: " + isValidPhoneNumber(phoneNumber1));
        System.out.println(phoneNumber2 + " hợp lệ: " + isValidPhoneNumber(phoneNumber2));
        System.out.println(phoneNumber3 + " hợp lệ: " + isValidPhoneNumber(phoneNumber3));
        System.out.println(phoneNumber4 + " hợp lệ: " + isValidPhoneNumber(phoneNumber4));
    }
}

