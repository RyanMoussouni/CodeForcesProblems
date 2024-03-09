import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    static BufferedReader input;
    static StringTokenizer _stk;

    static String readln() throws IOException {
        String l = input.readLine();
        if (l != null)
            _stk = new StringTokenizer(l, " ");
        return l;
    }

    static String next() {
        return _stk.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static void dbg(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    static PrintWriter output = new PrintWriter(new BufferedWriter(
	new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));

	readln();
	var nLines = nextInt();

	for (int i=0; i<nLines; i++) {
		var s = readln();
		var t = readln();

		var n = s.length();
		
		if (t.contains("a") && t.length() == 1) {
			System.out.println(1);
		}

		if (t.contains("a") && t.length() > 1) {
			System.out.println(-1);
		}

		if (!t.contains("a")) {
			System.out.println((long) Math.pow(2, n));
		}
	}
    }
}
