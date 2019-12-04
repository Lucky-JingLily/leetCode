package testForLeetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BullsAndCows {
    public String getHit(String secret, String guess) {
        int secretLength = secret.length();
//        for (int i = 0; i < secretLength; i++) {
//            System.out.println(secret.toCharArray()[i]);
//        }

        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < secretLength; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                if (result.containsKey(guess.charAt(i))) {
                    int keyValue = result.get(secret.charAt(i));
                    result.put(secret.charAt(i), keyValue + 1);
                    continue;
                } else {
                    result.put(secret.charAt(i), 1);
                    continue;
                }
            }
            if (result.containsKey(guess.charAt(i))) {
                int keyValue = result.get(guess.charAt(i));
                result.put(guess.charAt(i), keyValue + 1);
            }
        }
        int Acount = result.size();
        int Bcount = secretLength - result.size();
        if (result.isEmpty()) {
            return Acount + "A" + result.size() + "B";
        }
        for (char temp :
                result.keySet()) {
//            System.out.println(result.get(temp));
            Bcount = Bcount - (result.get(temp) - 1);
        }
        return Acount + "A" + Bcount + "B";
    }

    public static void main(String[] args) {
        String secret = "11";
        String guess = "10";
        System.out.println(new BullsAndCows().getHit(secret, guess));

    }
}