public class Bai_2 {
    public static String checkPassword(String s) {
        String re = "";
        // Chuỗi có hoặc không có =, .* khớp với bất kì kí tự nào lặp lại 1 hoặc nhiều lần
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$";
        String regex2 = "[!@#$%^&*()_+=-]";
        char[] arrS = s.toCharArray();

        if (s.matches(regex)) {
            re = "Strong password";
        } else if (s.length() < 10) {
            re = "Weak password !!!";
        } else if (!s.matches(regex2) && s.length() >= 10) {
            re = "Password is not strong enough";
        }
        return re;
    }

    public static void main(String[] args) {
        String s = "Oanhnguyeh@1";
        System.out.println(checkPassword(s));
    }
}
