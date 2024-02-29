
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
		Collections.sort(arr);

		int nOp = 5;

		if (k==2) {
			if (arr.contains(2) || 
			    arr.contains(4) || 
			    arr.contains(6) || 
			    arr.contains(8) || 
		            arr.contains(10)) {
				nOp = 0;
			    }
			for (int j=0; j<n; j++) {
				if (arr.get(j) % 2 == 1) {
					nOp = 1;
				}	
				break;
			}
		}

		if (k==3) {
			nOp = 2;
			for (int j=0; j<n; j++) {
				if (arr.get(j) % 3 == 0) {
					nOp = Math.min(nOp, 0);
				}
				if (arr.get(j) % 3 == 1) {
					nOp = Math.min(nOp, 2);
				}
				if (arr.get(j) % 3 == 2) {
					nOp = Math.min(nOp, 1); 
				}
			}
		}

		if (k==4) {
			nOp = 3;
			int nEven = 0;
			for (int j=0; j<n; j++) {
				if (arr.get(j) == 3 || arr.get(j) == 7) {
					nOp = Math.min(nOp, 1);
				}
				if (arr.get(j) == 4 || arr.get(j) == 8) {
					nOp = Math.min(nOp, 0);
				}
				if (arr.get(j) % 2 == 0) {
					nEven += 1;
				}
		        }
			nOp = Math.min(nOp, nEven > 1 ? 0 : nEven == 1 ? 1 : 2);
		}

		if (k==5) {
			nOp = 4;
			for (int j=0; j<n; j++) {
				if (arr.get(j) % 5 == 0) {
					nOp = Math.min(nOp, 0);
				}
				if (arr.get(j) % 5 == 1) {
					nOp = Math.min(nOp, 4);
				}
				if (arr.get(j) % 5 == 2) {
					nOp = Math.min(nOp, 3); 
				}
				if (arr.get(j) % 5 == 3) {
					nOp = Math.min(nOp, 2);
				}
				if (arr.get(j) % 5 == 4) {
					nOp = Math.min(nOp, 1);
				}
			}
		}
		System.out.println(nOp);
	}
    }
}
