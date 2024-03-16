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

	for (int j=0; j<nLines; j++) {
		var a = readln();
		var b = readln();

		String right;
		String left;
		if (b.length() < a.length()) {
			right = a;
			left = b;
		} else {
			right = b;
			left = a;
		}

		var nR = right.length();
		var nL = left.length();

		for (int k=0; k<nR; k++) {
			for (int i=0; i<nR-k; i++) {
				var cdt = left.substring(i, i+k);
				if (right.contains(cdt)) {
					System.out.println(nR + nL - 2*k);
				}
			}
		}
	}
    }
}
