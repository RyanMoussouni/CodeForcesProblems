
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

	for (int i = 0; i<nLines; i++) {
		var top = readln();
		var middle = readln();
		var bottom = readln();

		var grid = new String[3][3];

		for (int j = 0; j<3; j++) {
			grid[0][j] = top[j];
			grid[1][j] = middle[j];
			grid[2][j] = bottom[j];
		}

		int iMin=0;
		int jMin=0;

		char minChar = grid[0][0].charAt(0);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				var cdt = grid[i][j].charAt(0);
				if (Character.compare(cdt, minChar) < 0) {
					minChar = cdt;
					iMin = i;
					jMin = i;
				}
			}
		}


	}
    }

}
