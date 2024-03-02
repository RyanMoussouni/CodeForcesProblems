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

	var arr = new ArrayList<Integer>();

	for (int i=0; i<nLines; i++) {
		readln();
		var n = nextInt();
		for (int k=0; k<n; k++) {
			readln();
			var nArr = nextInt();

			readln();
			for (int j=0; j<nArr; j++) {
				arr.add(nextInt());
			}

		}
		Collections.sort(arr);
				
		var beauty = 0;

		var min = arr.get(0);
		beauty += min;
		for (int k=0; k<n; k++) {
			beauty += arr.get(arr.size() - (k+1));
		}

		System.out.println(beauty);
	}
    }
}
