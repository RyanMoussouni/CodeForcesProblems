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


	for (int i = 0; i<nLines; i++) {
	    readln();
	    var n = nextInt();
	    var q = nextInt();
	    var prefixSum = computePrefixSum(n);

	    for (int j=0; j<q; j++) {
		    readln();
		    var l = nextInt();
		    var r = nextInt();
		    var k = nextInt();

		    var csn = prefixSum.get(n);
		    var csl = prefixSum.get(l);
		    var csr = prefixSum.get(r-1); 

		    var isOdd =(csn - csr + csl + k*(r-l))%2 == 1; 
                    System.out.println(csn - csr + csl + k*(r-l));

		    if (isOdd) {
			    System.out.println("YES");
		    } else {
			    System.out.println("NO");
		    }
	    }
	}
    }

    private static List<Integer> computePrefixSum(Integer n) throws IOException {
	    readln();

	    var arr = new ArrayList<Integer>();
	    var crt = 0;
	    arr.add(crt);
	    for (int i=0; i<n; i++) {
		    crt += nextInt();
		    arr.add(crt);
	    }

	    return arr;
    }
}
