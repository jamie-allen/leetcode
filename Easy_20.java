import java.lang.reflect.Array;

class Solution {
    public boolean isValid(String s) {
        System.out.printf("Got String: %s\n", s);
        if (s.length() == 0) {
            return false;
        }
        Stack<Character> parensStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char currentIChar = s.charAt(i);
            if (currentIChar == '(') {
                parensStack.push(currentIChar);
                for (int j = i + 1; j < s.length(); j++) {
                    char currentJChar = s.charAt(j);
                    if (currentJChar == '(') {
                        return false;
                    }
                    if (currentJChar == ')') {
                        parensStack.pop();
                    }
                    else {
                        isValid(s.substring(j, s.length()));
                    }
                }
            }
            else if (currentIChar == '[') {
                parensStack.push(currentIChar);
                for (int j = i + 1; j < s.length(); j++) {
                    char currentJChar = s.charAt(j);
                    if (currentJChar == '[') {
                        return false;
                    }
                    if (currentJChar == ']') {
                        parensStack.pop();
                    }
                    else {
                        isValid(s.substring(j, s.length()));
                    }
                }
            }
            else if (currentIChar == '{') {
                parensStack.push(currentIChar);
                for (int j = i + 1; j < s.length(); j++) {
                    char currentJChar = s.charAt(j);
                    if (currentJChar == '{') {
                        return false;
                    }
                    if (currentJChar == '}') {
                        parensStack.pop();
                    }
                    else {
                        isValid(s.substring(j, s.length()));
                    }
                }
            }
        }
        if (parensStack.size() == 0) {
            return true;
        }

        return false;
    }
}