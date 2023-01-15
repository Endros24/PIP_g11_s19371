import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] genArr = generateArray(100);
        printArray(genArr);

        int[] sortedArr = sort(genArr);
        printArray(sortedArr);

        int[] revArr = reverse(sortedArr);
        printArray(revArr);

        System.out.println(equalsReverse(sortedArr,revArr));
//        should display true
    }


    public static int[] generateArray(int a){
        int[] array = new int[a];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
        }
        return array;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }


    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(array[i] < array[j]){
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        return array;
    }


    public static int[] reverse(int[] array){
        int[] revArr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for(int j = revArr.length - 1 - i; j < revArr.length - i; j++){
                revArr[j] = array[i];
            }
        }
        return revArr;
    }

    
    public static boolean equalsReverse(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length)
            return false;
        int[] array = reverse(secondArr);
        for(int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != array[i])
                return false;
        }
        return true;
    }
}