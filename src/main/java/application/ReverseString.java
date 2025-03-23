package application;

/*
사용자로부터 문자열을 입력받습니다.
입력받은 문자열을 뒤집어 출력합니다.
입력받은 문자열의 대소문자를 변환하여 출력합니다.
결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.
 */

public class ReverseString {
    public static String reverseAndToggleCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.insert(0, Character.toLowerCase(c));
            } else {
                sb.insert(0, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("변환된 문자열: " + reverseAndToggleCase(input));
    }
}
