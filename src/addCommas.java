/*
this class adds commas to numberic values
 */
import acm.program.*;

public class addCommas extends ConsoleProgram {
    public void run() {
        while(true) {
            String digits = Integer.toString(readInt("Enter number "));
            if (digits.length() == 0) break;
            println(addCommasToNumericString(digits));
        }
    }

    private String addCommasToNumericString(String original) {
        String revStr = "";
        String newStr = "";
        int count = 0;
        if (original.length() < 3) return original;
        // adding commas to number
        for (int i = original.length() - 1; i >= 0; i-- ) {
            if (count == 3) {
                revStr += ",";
                count = 0;
            }
            revStr += original.charAt(i);
            count ++;
        }
        // reversing back the number
        for (int i = revStr.length() - 1; i >= 0; i -- ) {
            newStr += revStr.charAt(i);
        }
        return newStr;

    }
}
