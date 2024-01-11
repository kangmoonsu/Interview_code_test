package 위즈온X_code_test;

public class p4 { // 정렬 알고리즘을 이용하여 크기 100 배열 작은 순서로 정렬하는 함수 작성
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
