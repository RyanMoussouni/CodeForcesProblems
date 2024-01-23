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

	var line = getLineNumber();

	for (int i=0; i<line; i++) {
		var arr = computeArray();
		var prefixSize = computePrefixSize(arr);

		System.out.println(prefixSize);
	}
    }

    private static Integer getLineNumber() throws IOException {
	    readln();
	    return nextInt();
    }

    private static List<Integer> computeArray() throws IOException {
	    readln();
	    var nElts = nextInt();
	    readln();
	    var arr = new ArrayList<Integer>();

	    for ( int i=0; i<nElts; i++ ) {
		    arr.add(nextInt());
	    }

	    return arr;
    }

    private static Integer computePrefixSize(List<Integer> arr) {
	    var hashTable = new HashSet<Integer>();
	    var n = arr.size();

	    for ( int i=n-1; i>=0; i-- ) {
		    var elt = arr.get(i);
		    if (hashTable.contains(elt)) {
			    return i;
		    }
		    hashTable.add(elt);
	    }

	    return 0;
    }
}
