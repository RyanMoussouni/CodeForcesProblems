
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
		var k = nextInt();

		readln();
		var arr = new ArrayList<Integer>();
		for (int j=0; j<n; j++) {
			arr.add(nextInt());
		}

		if (arr.get(0) == arr.get(n-1)) {
			var nColor = arr.stream()
			.filter(clr -> clr == arr.get(0))
		        .count();	

			var message = nColor >= k ? "YES" : "NO";
			System.out.println(message);
		}
		if (arr.get(0) != arr.get(n-1)) {
			var nFirstColor = arr.stream()
				.filter(clr -> clr==arr.get(0))
				.count();

			int ic=-1;
			int cpt=0;
			for (int j=0; j<n; j++) {
				if (arr.get(j) == arr.get(0)) {
					cpt += 1;
				}
				if (cpt == k) {
					ic = j;
				}
			}

			if (nFirstColor >=k) {
				var nSecondColor = arr.subList(ic, n-1).stream()
					.filter(clr -> clr == arr.get(n-1))
					.count();
				var message = nSecondColor >= k ? "YES" : "NO";  
				System.out.println(message);
			} else {
				var message = "NO";
				System.out.println(message);
			}
		}
	}
    }
}
