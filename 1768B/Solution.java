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

	for (int i = 0; i <nLines; i++) {
		readln();
		var n = nextInt();
		var k = nextInt();

		var arr = new ArrayList<Integer>();
		readln();
		for (int j = 0; j < n; j++) {
			arr.add(nextInt());
		}

		int cpt = 0;
		int crt = 1;
		for (int j = 0; j < n; j++) {
			if (arr.get(j) == crt) {
				cpt += 1;
				crt += 1;
			}
		}
		System.out.println(n-cpt);
	}
    }

    private static Integer getNLines() throws IOException {
        readln();
	return nextInt();
    }


}
