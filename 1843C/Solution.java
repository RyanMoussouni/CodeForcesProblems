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

	for (int i =0; i<nLines; i++) {
		readln();
		var n = nextInt();
		var s = computeSum(n);
		System.out.println(s);
	}
    }

    private static int computeSum(int n) {
	    var sum = 0;
	    var u = n;

	    while (u>0) {
		    sum += u;
		    u = u/2;
	    }
	    return sum;
    }
}
