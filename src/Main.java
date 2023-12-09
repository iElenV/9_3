import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int number  = scanner.nextInt();

        String [] arr = CreateArr(number);
        System.out.println("Содержимое массива в строку через пробел:");
        PrintArr(arr);
        Get_Reverse_Arr(arr);

        System.out.println("Содержимое массива в обратном порядке по алфавиту:");
        PrintArr(arr);

        System.out.println("Содержимое массива по количеству слов в строке");
        Sort_By_WordsNumber(arr);
        PrintArr(arr);






    }
    public static String [] CreateArr(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки в массив последовательно:");
        String[] arr = new String [number];
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextLine();
                }

        return arr; }

    public static void PrintArr (String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static String [] Get_Reverse_Arr (String[] arr) {

       Arrays.sort(arr, Collections.reverseOrder());

   return arr; }

    private static String [] Sort_By_WordsNumber (String[] arr) {
        int [] CountArr = new int[arr.length];

        for (int i = 0; i< arr.length; i++) {
            String [] Words_in_String = arr[i].split(" ");

            int CountWords = 0;
            for (int j=0; j<Words_in_String.length; j++) {
                CountWords++;
                CountArr[i] = CountWords;
            }

            // System.out.println(CountWords);
        }

        boolean NeedIt = true;
        while (NeedIt) {
            NeedIt = false;
            for (int k = 1; k<arr.length; k++) {
            if (CountArr[k] <CountArr[k-1]) {
                change(arr, k, k-1);
                NeedIt = true;
            }

            }

        }



        // System.out.println(Arrays.toString(arr));
    return arr;}

    private static void change(String[] arr, int index1, int index2) {
        String temp = arr [index1];
        arr [index1] = arr [index2];
        arr [index2] = temp;

    }




    }