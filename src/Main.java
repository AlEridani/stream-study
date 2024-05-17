import java.util.Arrays;
import java.util.stream.Collectors;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        문제 1: 배열에서 짝수만 걸러내기
//정수 배열이 주어졌을 때, 이 배열에서 짝수만 걸러내어 새로운 배열을 생성하는 프로그램을 작성하세요.
//
        int[] result1 = Arrays.stream(numbers)
                .filter(n -> n%2==0)
                .toArray();
        System.out.println(Arrays.toString(result1));

//문제 2: 배열의 모든 요소의 제곱값 출력하기
//정수 배열이 주어졌을 때, 이 배열의 각 요소를 제곱한 값을 출력하세요.
//
        int[] result2 = Arrays.stream(numbers)
                .map(n -> n* n)
                .toArray();
        Arrays.stream(result2)
                .forEach(System.out::println);
//문제 3: 배열의 요소들의 총합 구하기
//정수 배열이 주어졌을 때, 이 배열의 모든 요소의 총합을 구하세요.

        int result3 = Arrays.stream(numbers)
                .sum();
        System.out.println(result3);

        //주어진 배열에서 가장 큰 값을 찾습니다.
        int result4 = Arrays.stream(numbers)

        //Math 클래스의 메서드를 사용하여 최대값을 구합니다.
        //구한 최대값을 출력합니다.
    }

}