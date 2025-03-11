import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 영어 대소문자를 섞어서 입력하세요: ");
        String before = sc.nextLine();

        String after = new StringBuilder(before)
                .reverse()
                .toString()
                .chars()
                .mapToObj(ch -> Character.isUpperCase(ch) ?
                        Character.toLowerCase((char) ch) :
                        Character.toUpperCase((char) ch))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        // 결과 출력
        System.out.println("변환된 문자열: " + after);

        sc.close();



    }

}



/*

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 문자열 뒤집고 대소문자 변환
        String result = reverseAndToggleCase(input);

        // 결과 출력
        System.out.println("변환된 문자열: " + result);

        scanner.close();
    }

    // 문자열을 뒤집고 대소문자를 변환하는 함수
    public static String reverseAndToggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            // 대문자는 소문자로, 소문자는 대문자로 변환
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c); // 문자가 대소문자가 아니면 그대로 추가
            }
        }

        return sb.toString();
    }
}
 */