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
	var alphabet = "abcdefghijklmnopqrstuvwxyz";

	for (int i=0; i<nLines; i++) {
		readln();
		var n = nextInt();

		var str = readln();
		var arr = new int[26];
		for (int j=0; j<n; j++) {
			arr[j] = 0;
		}

		for (int j=0; j<n; j++) {
			var letter = str.charAt(j);
			int index = alphabet.indexOf(letter);

			arr[index] += 1;
		}

		for (int j=0; j<n; j++) {
			arr[j] = arr[j] / 2;
			arr[j] = Math.min(1, arr[j]); 
		}

		System.out.println(Arrays.stream(arr).sum());
	}
    }
}
