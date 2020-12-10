import java.io.Console;
import java.util.*;


class App {
    public static void main(String[] args) {
        String given = "a12bcbc6789a";
        int temp = 0, k = 0;
        int arr[] = new int[4];


        //read string and sum consecutive numerical value and push it to array
        // for example if string is a12bcbc6789a
        // output array should be [3,30]

        for(int i = 0 ; i < given.length() ; i++){
            if (!(Character.isAlphabetic(given.charAt(i)))) {
                 temp =  Character.getNumericValue(given.charAt(i));
                 arr[k] = temp;
                   for(int j = i + 1 ; j < given.length() ; j++){
                      if (!(Character.isAlphabetic(given.charAt(j)))) { 
                          temp = temp + Character.getNumericValue(given.charAt(j));
                          arr[k] = temp;
                          i++;
                       }else{
                           k++;
                           break;
                       }
                   }
            }
        }
        for(int j : arr){
            System.out.println(j);
        }
    }
}
