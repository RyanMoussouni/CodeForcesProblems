
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
		var nElt = nextInt();

		readln();
		var arr = new ArrayList<Integer>();
		for (int j=0; j<nElt; j++) {
			arr.add(nextInt());
		}

		var groups = new ArrayList<Integer>(); 
		for (int j = 0; j<nElt; j++) {
			groups.add(0);
		}

		int cpt = 0;
		for (int j=0; j<nElt; j++) {
			for (int k=0; k<j; k++) {
				if (arr.get(j) == arr.get(k)) {
					if (arr.get(k) != 0) {
						arr.set(j, arr.get(k));
					} else {
						groups.set(k, cpt+1);
					}
				}
			}
		}
	}
    }
}
