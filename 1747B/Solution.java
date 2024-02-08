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

	var nLines = readLines();

	for (int i = 0; i < nLines; i++) {
		readln();
	        var n = nextInt();

		var nSwaps = getNSwaps(n);
		var swaps = getSwaps(n);

		System.out.println(nSwaps); 
		
		for (int j = 0; j < swaps.size(); j++) {
			var swap = swaps.get(j);
			System.out.println(swap);
		}
	}
    }

    private static Integer readLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static Integer getNSwaps(int n) {
	    if (n%2 == 0) {
		    return n/2;
	    } else {
		    return n/2 + 1;
	    }
    }

    private static List<String> getSwaps(int n) {
	    var swaps = new ArrayList<String>();

	    for (int k = 0; k < n; k++) {
		    swaps.add(String.format("%d %d", 3*k+1, 3*k+2));
	    }

	    return swaps;
    }
}
