//-------------------------------------------------------SIMPLIFY PATH---------------------------------------------------------------
import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> S = new Stack<>();
        String result = "";

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/') {
                temp.append(path.charAt(i));
                i++;
            }

            if (temp.toString().equals(".")) {
                continue;
            } 
            else if (temp.toString().equals("..")) 
            {
                if (!S.isEmpty()) {
                    S.pop();
                }
            } 
            else {
                S.push(temp.toString());
            }
        }

        while (!S.isEmpty()) {
            result = "/" + S.pop() + result;
        }

        if (result.length() == 0) {
            return "/";
        }

        return result;
    }
}

/*
 * Time Complexity:  O(N)
 * space Complexity: O(N)
 */