package questions;

/**
 * Created by Shuvashish on 2/15/2018.
 */
public class Question1 {

    public String reverseEntireString(String sampleString){

        StringBuilder reverseString = new StringBuilder();

        for(int i = sampleString.length()-1; i>=0; i--){

            reverseString.append(sampleString.charAt(i));
        }

        return reverseString.toString();
    }


}
