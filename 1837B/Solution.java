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

	var nLines = computeNLines();

	computeMinCost(nLines);
    }

    private static Integer computeNLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static void computeMinCost(Integer nLines) throws IOException {
	    for (int i=0; i<nLines; i++) {
		    var nChar = readln();
		    var line = readln();
		    var lgt = line.length();

		    var max=1;
		    var cpt=1;
		    var current = line.charAt(0);

		    for (int j=1; j<lgt; j++) {
			    var newCh = line.charAt(j);
			    if (newCh == current) {
				    cpt+=1;
			    } else {
				    cpt = 0;
			    }

			    if (cpt >= max) {
				    max = cpt;
			    }

			    current = newCh;
		    }

		    System.out.println(max + 1);
	    }
    }
}
