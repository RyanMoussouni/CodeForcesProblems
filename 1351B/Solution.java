
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
		readln();
		var a1 = nextInt();
		var b1 = nextInt();
		readln();
		var a2 = nextInt();
		var b2 = nextInt();

		if (a1 == b2) {
			if (a2 + b1 == a1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}	
		if (a2 == b1) {
			if (a1 + b2 == a2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		else {
		    System.out.println("NO");
		}
	}
    }
}
