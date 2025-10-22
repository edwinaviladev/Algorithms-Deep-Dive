package easy;

/***
 The substring algorithm, also known as the substring search algorithm, is used to find all occurrences of a substring within a larger string. The basic idea behind the algorithm is to search for the substring character by character in the main string.
 ***/

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static List<Integer> substring(String string, String substring) {
        int stringLength = string.length();
        int substringLength = substring.length();
        List<Integer> coincidences = new ArrayList<>();
        for (int i = 0; i < stringLength - substringLength + 1; i++) {
            int j = 0;
            while (j < substringLength) {
                if (string.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == substringLength) {
                coincidences.add(i);
            }
        }
        return coincidences;
    }

    void main () {
        String principalString = "abracadabra";
        String substringSearch = "abra";
        List<Integer> result = substring(principalString, substringSearch);

        IO.println("Ocurrencias encontradas en las posiciones: " + result);
    }
}
