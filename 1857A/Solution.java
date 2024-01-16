import java.io.*;
import java.math.*;
import java.util.*;

public class SolutionAA {
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

	for (int k=0; k<nLines; k++) {
		readln();
		var nElements = nextInt();
		var arr = readArrayFromLine(nElements);
		System.out.println(isColorationPossible(arr));
	}
    }

    public static List<Integer> readArrayFromLine(Integer nElts) throws IOException {
	    var arr = new ArrayList<Integer>();
	    readln();
	    for (int k=0; k<nElts; k++) {
		    arr.add(nextInt());
	    }
	    return arr;
    }

    static boolean isColorationPossible(List<Integer> arr) {
	    var cpt = 0;
	    for (var elt : arr) {
		cpt += elt%2;
	    }
	    return cpt%2 == 0;
    }
}
