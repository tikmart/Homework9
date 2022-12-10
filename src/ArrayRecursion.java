public class ArrayRecursion {


    public static void main(String[] args) {
        int[] arr = {1,3,5,32,2,6};
        arrSum(arr);
    }

    static int i = 0;
    static void arrSum(int [] array){

        System.out.println(array[i]);
        if (i < array.length-1) {
            i++;
            arrSum(array);
        }

    }





}