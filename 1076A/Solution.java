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

	var line = readln();
	var m = line.length();
	var found = false;
	int index = m-1;
	for (int j=0; j<m-1; j++) {
		if (!found && line.charAt(j+1) < line.charAt(j)) {
			index = j;
		}
	}
	var sb = new StringBuilder();
	for (int j=0; j<m-1; j++) {
		if (j != index) {
			sb.append(line.charAt(j));
		}
	}
	System.out.println(sb.toString());
    }
}
