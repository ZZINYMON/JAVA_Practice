package section01.array.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */



        int[] arr = new int[10];
        for (int i =0, value = 0; i < arr.length; i++) {

            arr[i] = value += 1;
//            arr[i] = value = i++;

            System.out.println(i + " 번째 인덱스 : " + arr[i] + " ");

        }



    }

}
