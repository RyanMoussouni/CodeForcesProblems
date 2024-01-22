import java.io.*;
import java.util.*;
import java.lang.Math;

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

	var nLines = readNLines();

	for (int i = 0; i <nLines; i++) {
		var pouring = computePouring();
		System.out.println(pouring);
	}
    }

    private static Integer readNLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static Integer computePouring() throws IOException {
	    readln();
	    var a = nextInt();
	    var b = nextInt();
	    float c = nextInt();

	    float d;
	    if (a-b<0) {
		    d = b-a;
	    } else {
		    d = a-b;
	    }
	    return (int) Math.ceil(d/(2*c)); 
    }
}
