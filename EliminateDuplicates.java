// Name : Hasnat Jani Rafin
// ID : 20172507
import java.util.Scanner;
public class EliminateDuplicates {
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0; for (int e : list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;i++; }}
            return distinctList;}
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {return i;}}
            return -1;
    }   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] num = new int[10];
        System.out.print("Enter ten(10) numbers : ");
        for (int i = 0; i < num.length; i++) {num[i] = scn.nextInt();}
        int[] distinctNumbers = eliminateDuplicates(num);
        System.out.print("The distinct numbers are:");
        for (int e : distinctNumbers) 
        { if (e > 0) { System.out.print(" " + e);}}
        System.out.println(); System.out.println();
    }
}
