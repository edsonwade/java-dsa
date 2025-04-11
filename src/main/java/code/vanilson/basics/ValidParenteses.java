package code.vanilson.basics;

import java.util.Scanner;

/**
 * ValidParenteses
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-10
 */
public class ValidParenteses {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the worlds ?");
        var words = sca.nextLine();
        System.out.println(" is valid parentheses ? " + isValidParentheses(words));

    }

    public static boolean isValidParentheses(String s) {
        int parenthesesCurve = 0;
        int parenthesesCurl = 0;
        int parenthesesBracket = 0;
        if (s == null || s.isEmpty()) {
            return true;
        }
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    parenthesesCurve++;
                    break;
                case ')':
                    if (parenthesesCurve == 0) {
                        return false; // tentando fachar sem abrir antes.
                    }
                    parenthesesCurve--;
                    break;

                case '{':
                    parenthesesCurl++;
                    break;

                case '}':
                    if (parenthesesCurl == 0) {
                        return false;
                    }
                    parenthesesCurl--;
                    break;

                case '[':
                    parenthesesBracket++;
                    break;

                case ']':
                    if (parenthesesBracket == 0) {
                        return false;
                    }
                    parenthesesBracket--;
                    break;

                default:
                    break;

            }
        }
        return parenthesesCurl == 0 && parenthesesCurve == 0 && parenthesesBracket == 0;

    }
}