/*
this class removes all mentioned characters from string
 */

import acm.program.*;

public class cleanString extends ConsoleProgram {
    public void run() {
        String str = readLine("write a sentence ");
        String removingSymbol = readLine("write a char ");

        String newStr = removeAllOccurrences(str, removingSymbol);
        println(newStr);
    }

    //removes all characters from the string
    private String removeAllOccurrences(String str, String character) {
        String newString = "";
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) != character.charAt(0)) {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
}
