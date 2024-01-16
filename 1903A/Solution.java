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

	int nArr=0;
	int k=0;
	for (int i=0; i<nLines; i++) {
		readln();
		if (i%2 == 0) {
			nArr = nextInt();
			k = nextInt();
			continue;
		}

		if (k>1) {
			System.out.println("YES");
		}

		if (k==1) {
			var arr = new ArrayList<Integer>();
			readln();

			var crt = 0;
			for (int j=0; j<nArr; j++) {
				var elt = nextInt();
				if (elt < crt) {
					System.out.println("NO");
				}
				crt = elt;
			}

			System.out.println("YES");
		}
	}
    }
}
