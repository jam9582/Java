import java.util.Scanner;

//함수형 인터페이스, 안 써도 작동 되지만 가독성을 위하여 추가
//람다 표현식 사용을 위해 단 하나의 추상 메서드만 존재하는 인터페이스라는 선언 필요
@FunctionalInterface
interface Calculator {
    double operate(double a, double b);
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator add = (a, b) -> a + b;
        Calculator minus = (a, b) -> a - b;
        Calculator multi = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("계산할 숫자 2개를 입력해주세요: ");
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println("연산자 ( +, -, *, / ) 중 한가지를 입력해주세요: ");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println(a + operator + b + " 는 " + add.operate(a, b) + " 입니다.");
        } else if (operator.equals("-")) {
            System.out.println(a + operator + b + " 는 " + minus.operate(a, b) + " 입니다.");
        } else if (operator.equals("*")) {
            System.out.println(a + operator + b + " 는 " + multi.operate(a, b) + " 입니다.");
        } else if (operator.equals("/")) {
            System.out.println(a + operator + b + " 는 " + div.operate(a, b) + " 입니다.");
        } else {
            System.out.println("잘못된 연산자 입력입니다.");
        }
        sc.close();
    }
}

/*
import map, hashmap, bifunction 쓴 다음

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

- 이거 해주면 간단해짐, 두 개의 입력 값을 받아 하나의 결과를 반환하는 함수형 인터페이스
- T,U,R은 각각 입력타입, 입력타입, 반환타입
- 람다식은 BiFunction을 구현하는 방법 중 하나, 즉 람다식을 사용할 수 있는 틀(인터페이스)

(예시)
public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20)); // 출력: 30
    }
}

- Map<K, V>은 키(Key)와 값(Value)의 쌍으로 데이터를 저장하는 인터페이스
- HashMap<K, V>은 Map 인터페이스를 구현한 대표적인 클래스
- 이 2개를 이용해서 Map<연산기호, (A,B)>을 만들어 BiFunction에 넣고 연산자마다 결과값 나오게 하면 됨

        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> b != 0 ? a / b : Double.NaN);

        BiFunction<Double, Double, Double> operation = operations.get(operator);
        if (operation != null) {
            double result = operation.apply(num1, num2);
            System.out.println("결과: " + result);
        } else {
            System.out.println("잘못된 연산자입니다.");
        }
 */