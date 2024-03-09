import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.IntStream;

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
		var nArr = nextInt();

		readln();
		var arr = new ArrayList<Integer>();
		for (int j=0; j<nArr; j++) {
			arr.add(nextInt());
		}
		Collections.sort(arr);

		var isPossible = false;
		var firstElements = new int[] { arr.get(0) - 1, arr.get(0), arr.get(0) + 1 };
		for (var firstElt : firstElements) {
			isPossible = isPossible || IntStream.range(0, arr.size())
			.mapToObj(k -> Math.abs(arr.get(k) - arr.get(0) + k - 1) <= 1)
			.allMatch(Boolean::booleanValue);
		}

		if (isPossible) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
    }
}
