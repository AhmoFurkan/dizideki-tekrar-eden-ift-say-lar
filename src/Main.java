import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr){
            if ((i==value)  ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,200, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1,12,2,12,6,8,77,998,8,198,199,200,400,200,198};
        int[] dublicate = new int[list.length];

        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i]%2==0) ) {
                    if (!isFind(dublicate,list[i])) {
                        dublicate[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }

       for (int value :dublicate){
           if (value!=0){
               System.out.println(value);
           }
       }


    }
}



