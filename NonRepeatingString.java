import java.util.HashMap;

public class NonRepeatingString {

    public static int nonRep(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c = 'a'; c<='z'; c++) {
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(nonRep(str));
    }
}
