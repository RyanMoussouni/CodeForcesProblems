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

	var nLines = getNLines();

	for (int i=0; i<nLines; i++) {
		var numberOfPasswords = computeNumberOfPasswords();
		System.out.println(numberOfPasswords);
	}
    }

    private static int getNLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static int computeNumberOfPasswords() throws IOException {
	    readln();
	    var n = nextInt();
	    readln();

	    return 6*((10-n)*(9-n))/2;
    }
}
