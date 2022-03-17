package Veric.SkyPro;

public class Main {

    public static void main(String[] args) {
// 1-task
	int[] firstArray = new int[]{1, 2, 3};
    float[] secondArray = new float[]{1.57f, 7.654f, 9.986f};
    boolean[] thirdArray = {true, true, true, false, false, false};
//2-task
        System.out.print(firstArray[0]);
        for (int i = 1; i < firstArray.length; i++) {
            System.out.print(", " + firstArray[i]);
        }
        System.out.print("\n" + secondArray[0]);
        for (int i = 1; i < secondArray.length; i++) {
            System.out.print(", " + secondArray[i]);
        }
        System.out.print("\n" + thirdArray[0]);
        for (int i = 1; i < thirdArray.length; i++) {
            System.out.print(", " + thirdArray[i]);
        }
//3-task
        System.out.print("\n" + firstArray[firstArray.length-1]);
        for (int i = firstArray.length -2; i >= 0; i--) {
            System.out.print(", " + firstArray[i]);
        }
        System.out.print("\n" + secondArray[secondArray.length-1]);
        for (int i = secondArray.length -2; i >= 0; i--) {
            System.out.print(", " + secondArray[i]);
        }
        System.out.print("\n" + thirdArray[thirdArray.length-1]);
        for (int i = thirdArray.length -2; i >= 0; i--) {
            System.out.print(", " + thirdArray[i]);
        }
//4-task
        if ( firstArray[0] % 2 !=0) {
            firstArray[0] +=1;
        }
        System.out.print("\n" + firstArray[0]);
        for (int i = 1; i < firstArray.length; i++) {
            if ( firstArray[i] % 2 !=0) {
                firstArray[i] +=1;
            }
            System.out.print(", " + firstArray[i]);
        }
    }
}
