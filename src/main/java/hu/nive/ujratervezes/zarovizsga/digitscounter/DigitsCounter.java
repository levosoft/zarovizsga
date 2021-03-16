package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s){

        int result = 0;
        List<Integer> numbers = new ArrayList<>();

        if(s != null){
            for (int i = 0; i <= s.length()-1; i++) {
                //String myS = "" + s.charAt(i);

                if(Character.isDigit(s.charAt(i))){
                    int x = s.charAt(i) - '0';
                    if(!numbers.contains(x)){
                        numbers.add(x);
                    }
                }
            }
        }

        result = numbers.size();
        return result;
    }
}
