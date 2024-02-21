
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
		readln();
		var n = nextInt();
		readln();

		var arr = new ArrayList<Integer>();
		for (int j=0; j<n; j++) {
			arr.add(nextInt());
		}

		var allEven = arr.stream()
		.mapToInt(Integer::intValue)
		.allMatch(e -> e%2==0);
		
		var allOdd = arr.stream()
		.mapToInt(Integer::intValue)
		.allMatch(e -> e%2==1);

		if (allEven || allOdd) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
    }
}
