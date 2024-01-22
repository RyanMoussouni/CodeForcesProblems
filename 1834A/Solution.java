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
		var arr = readArray();
		var sum = computeSum(arr);
		var prod = computeProd(arr);

		var nOp = computeNOperations(sum, prod);
		System.out.println(nOp);
	}
    }

    private static List<Integer> readArray() throws IOException {
	    var arr = new ArrayList<Integer>();

	    readln();
	    var nElts = nextInt();

	    readln();
	    for (int k = 0; k<nElts; k++) {
		    arr.add(nextInt());
	    }
	    return arr;
    }

    private static Integer computeSum(List<Integer> arr) {
	    return arr.stream()
		    .mapToInt(Integer::intValue)
		    .sum();
    }

    private static Integer computeProd(List<Integer> arr) {
	    return arr.stream()
		    .reduce(1, (a,b) -> a*b);
    }

    private static Integer computeNOperations(Integer sum, Integer prod) {
	    if (sum >= 0 && prod == -1) {
		    return 1;
	    }

	    if (sum >= 0 && prod == 1) {
		    return 0;
	    }

	    if (sum <= 0 && prod == -1 && -sum%2 == 1) {
		    return sum;
	    }

	    if (sum <= 0 && prod == -1 && sum%2 == 0) {
		    return -(sum+1);
	    }

	    if (sum <= 0 && prod == 1 && sum%2 == 0) {
		    return -sum;
	    }

	    if (sum <= 0 && prod == 1 && -sum%2 == 1) {
		    return -(sum+1);
	    }
	    System.out.println(sum);
	    System.out.println(prod);
	    System.out.println(sum%2);
	    throw new RuntimeException();
    }
}
