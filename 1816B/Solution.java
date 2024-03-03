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

	var alphabet  = "abcdefghijklmnopqrstuvwxyz";

	for (int i=0; i<nLines; i++) {
		readln();
		var n = nextInt();
		var k = nextInt();

		var str = readln();
		var hash = new HashMap<String>(); 

		for (int j=0; j<str.length(); j++) {
			var cnt = hash.getOrDefault(str.get(j), 0);
			hash.put(str.get(j), cnt+1); 
		}
		
		var count = 0;
		for (var letter : alphabet) {
			if (hash.isPresent(letter)) {
				var smallCount = hash.get(letter);
				var capsCount = hash.get(letter.toUpperCase());

				count += min(capsCount, smallCount);
			}
		}
	}
    }
}
