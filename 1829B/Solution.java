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

	for (int i = 0; i<nLines; i++) {
		var maxBlankSpace = computeMaximumBlankSpace();
		System.out.println(maxBlankSpace);
	}
    }

    private static Integer getNLines() {
	    readln();
	    return nextInt();
    }

    private static Integer computeMaximumBlankSpace() throws IOException {
	    readln();
	    var arrayLength = nextInt();

	    readln();
	    var crt = nextInt();
	    int cpt;

	    if ( crt == 0 ) {
		    cpt = 1;
	    } else {
		    cpt = 0;
	    }

	    int max = cpt;

	    for (int i=0; i<arrayLength-1; i++) {
		    var newInt = nextInt();

		    if ( crt == newInt && newInt == 0 ) {
			    cpt += 1;
		    } else {
			    cpt = 0;
		    }

		    if (cpt > max) {
			    max = cpt;
		    }
	    }

	    return max;
    }
}
