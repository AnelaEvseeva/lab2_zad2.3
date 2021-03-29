import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static Scanner sc;

    public static void fillArr(int i){
        if(i< arr.length){
            System.out.println("Введите " + i + " элемент");
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }

    public static void printArr(int i) {
        if(i < arr.length) {
            System.out.println(arr[i]);
            printArr(++i);
        }
    }
    public static void main(String[] args) {
	sc = new Scanner(System.in);
	arr = new int[5];
	fillArr(0);
	printArr(0);
    }
}
