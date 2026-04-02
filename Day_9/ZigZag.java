import java.util.*;
public class ZigZag {
    public static String Zig_Zag(String s, int n) {
        if (n == 1) return s;
        StringBuilder[] rows = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            rows[i] = new StringBuilder();
        }
        int cur = 0;
        boolean goDown = true;
        for (char c : s.toCharArray()) {
            rows[cur].append(c);
            if (cur == 0) {
                goDown = true;
            } else if (cur == n - 1) {
                goDown = false;
            }
            if (goDown) {
                cur++;
            } else {
                cur--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) {
            ans.append(row);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(Zig_Zag(s, n));
        sc.close();
    }
}