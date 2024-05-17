import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                .max()
                .orElse(0);
        System.out.println(result4);

        //문제: 배열에서 홀수를 찾아 제곱한 값의 합 구하기
        //정수 배열이 주어졌을 때, 해당 배열에서 홀수인 요소들을 찾고, 이 홀수들을 제곱하여 그 값을 모두 더한 결과를 반환하는 프로그램을 작성하세요.

        //요구사항:
        //주어진 배열에서 홀수인 요소들을 찾습니다.
        //찾은 홀수들을 제곱하여 그 값을 모두 더한 결과를 반환합니다.
        int result5 = Arrays.stream(numbers)
                .filter(n -> n%2 == 1)
                .sum();
        System.out.println("5번답" + result5);

        //문제: 숫자 배열에서 중복된 값 찾기
        //주어진 정수 배열에는 중복된 숫자가 포함되어 있습니다. 이 중복된 숫자를 모두 찾아내고, 각 중복된 숫자가 배열에서 몇 번 등장하는지를 카운트하여 출력하는 프로그램을 작성하세요.
        //
        //요구사항:
        //주어진 배열에서 중복된 숫자를 찾습니다.
        //각 중복된 숫자의 등장 횟수를 카운트하여 출력합니다.

        int[] numbers2 = {1, 2, 3, 4, 5, 2, 3, 4, 2, 1, 6, 7, 8, 9, 9, 5};

        int result6 = (int) Arrays.stream(numbers2)
                .distinct()
                .count();
        System.out.println("6번답" + result6);

        //문제: 문자열의 길이가 5 이상인 문자열만 필터링
        //문자열 리스트가 주어졌을 때, 길이가 5 이상인 문자열만 필터링하여 리스트로 반환하세요
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> result7 = words.stream()
                .filter(str-> str.length()>=5)
                .collect(Collectors.toList());

        // 특정 접두사가 있는 문자열 개수 세기
        //문자열 리스트가 주어졌을 때, 특정 접두사("pre")로 시작하는 문자열의 개수를 세어 보세요.
        List<String> words2 = Arrays.asList("preach", "prefix", "presentation", "apple", "prelude", "banana");
        int result8 = words2.stream()
                .filter(str->str.contains("pre"))
                .mapToInt(str->1)
                .sum();


        //문제: 가장 큰 숫자 찾기
        //정수 배열이 주어졌을 때, 배열에서 가장 큰 숫자를 찾아 출력하세요.
        int[] numbers3 = {3, 5, 7, 2, 8, 6, 4, 7, 9, 1};
        int result9 = Arrays.stream(numbers3)
                .max()
                .orElse(0);
    }
    //문제 : 중복 제거 후 오름차순 정렬
    //정수 배열이 주어졌을 때, 배열에서 중복을 제거하고 오름차순으로 정렬한 리스트를 반환하세요.
    int[] numbers4 = {3, 5, 7, 2, 8, 6, 4, 7, 9, 1, 3, 6};
    List<Integer> result10 = Arrays.stream(numbers4)
            .distinct()
            .sorted()
            .boxed()
            .collect(Collectors.toList());


    //문자열 리스트가 주어졌을 때, 모든 문자열을 하나의 문자열로 병합하되, 각 문자열은 쉼표(",")로 구분되게 하세요.
    List<String> words4 = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
    String result11 = words4.stream()
            .collect(Collectors.joining(", "));

    //문제 : 배열의 평균 값 구하기
    //정수 배열이 주어졌을 때, 배열의 평균 값을 구하세요.
    int[] numbers5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double result12 = Arrays.stream(numbers5)
            .mapToDouble(n->n)
            .average()
            .orElse(0);

    //문제 8: 문자열을 정수로 변환하여 합계 구하기
    //문자열 리스트가 주어졌을 때, 문자열을 정수로 변환하여 합계를 구하세요.

    List<String> numbers6 = Arrays.asList("1", "2", "3", "4", "5");
    int result13 = numbers6.stream()
            .mapToInt(Integer::parseInt)
            .sum();


    //문제 9: 문자열 리스트에서 모음 개수 세기
    //문자열 리스트가 주어졌을 때, 각 문자열에 포함된 모음('a', 'e', 'i', 'o', 'u')의 개수를 세고 이를 리스트로 반환하세요.
//    List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
//    List<Integer> result14 = words.stream()
//            .filter()

    //문제 10: 특정 범위의 숫자 필터링
    //정수 배열이 주어졌을 때, 배열에서 10보다 크고 20보다 작은 숫자만 필터링하여 리스트로 반환하세요.

    int[] numbers = {3, 15, 7, 22, 18, 6, 14, 9, 21, 11};
    List<Integer>result15 = Arrays.stream(numbers)
            .filter(n -> n > 10 && n < 20)
            .boxed()
            .toList();

}