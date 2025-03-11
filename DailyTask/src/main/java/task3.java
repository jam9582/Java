import java.util.Scanner;

public class task3 {

    //아래 모든 메소드들에 static을 넣은 이유:
    //task3의 생성자를 안 만들어도,즉, 객체를 안 만들어도 실행할 수 있게 하기위함
    public static void bubbleSort(int[] arr) { //버블정렬: 인접한 두 값을 비교하여 큰 값을 오른쪽으로
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void selectionSort(int[] arr) { //선택정렬: 최솟값을 찾아 첫번째, 두번째, ... 배치
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArr(String message, int[] arr) {
        System.out.println(message);

        // System.out.println(arr); 아래 반복문 대신에 이거 쓰면 해쉬코드 보여줌

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("배열의 요소를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        sc.close();

        printArr("정렬 전 배열: ", num);

        bubbleSort(num);
        printArr("버블 정렬 후 배열: ", num);

        selectionSort(num);
        printArr("선택 정렬 후 배열: ", num);

    }

}
