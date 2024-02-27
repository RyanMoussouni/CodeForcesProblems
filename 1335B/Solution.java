
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
		var arr = new ArrayList<String>();
		readln();

		var n = nextInt();
		var a = nextInt();
		var b = nextInt();

		int k=0;
		while (k < n) {
			int cpt = 0;
			while ( cpt < a && k < n) {
				for (int j=0; j<b; j++) {
					if ( k< n ) {
						arr.add(String.valueOf(alphabet.charAt(j)));
						cpt += 1;
						k+=1;
					}
				}
			}
		}
		System.out.println(String.join("", arr));
	}
    }
}
