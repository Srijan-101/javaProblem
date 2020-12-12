import java.io.Console;
import java.util.*;

//read string and sum consecutive numerical value and push it to array 
// for example if string is a12bcbc6789a 
// output array should be [3,30]


class App {
    public static void main(String[] args) {
        String given = "6-3sd1a221a12bc78te8373";
        int temp = 0, k = 0;
        ArrayList<Integer> arrr = new ArrayList<Integer>();

        for(int i = 0 ; i < given.length() ; i++){
            if (Character.isDigit(given.charAt(i))) {
                 temp =  Character.getNumericValue(given.charAt(i));
                 arrr.add(k,temp);
                   for(int j = i + 1 ; j < given.length() ; j++){
                      if (Character.isDigit(given.charAt(j))) { 
                          temp = temp + Character.getNumericValue(given.charAt(j));
                          arrr.set(k,temp);
                          i++;
                       }else{
                           k++;
                           break;
                       }
                   }
            }
        }
        int[] arr = new int[arrr.size()];
        for(int i = 0 ; i < arrr.size();i++){
             arr[i] = arrr.get(i);
        }
       for(int i : arr){
           System.out.println(i);
       }
    }
}
