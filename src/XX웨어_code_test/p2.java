package XX웨어_code_test;

import java.util.*;
/* 아래와 같이 정수로 이루어진 배열이 있을때, 합집합의 배열을 출력하기
[9, 11, 16, 21, 28, 36, 5]
[3, 9, 10, 29, 40, 45, 7]
[2, 5, 12, 14, 24, 39, 33]
[1, 6, 13, 37, 38, 40, 9]
[1, 21, 25, 29, 34, 37, 36]
(제공되는 Set 구현체를 사용하지 않고 작성)
(반복문을 사용하여 작성)
* */
public class p2 { // 2차 배열에서 합집합 구하기
    public static void main(String[] args) {
        int[][] arrays = {
                {9, 11, 16, 21, 28, 36, 5},
                {3, 9, 10, 29, 40, 45, 7},
                {2, 5, 12, 14, 24, 39, 33},
                {1, 6, 13, 37, 38, 40, 9},
                {1, 21, 25, 29, 34, 37, 36}
        };
        int[] union = findUnion(arrays);
        System.out.print("합집합 배열: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
    public static int[] findUnion(int[][] arrays) {
        ArrayList<Integer> unionList = new ArrayList<>();
        for (int[] array : arrays) {
            for (int j = 0; j < array.length; j++) {
                unionList.add(array[j]);
            }
        }
        unionList = removeDuplicates(unionList);
        int[] unionArray = new int[unionList.size()];
        for (int i = 0; i < unionList.size(); i++) {
            unionArray[i] = unionList.get(i);
        }
        return unionArray;
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}