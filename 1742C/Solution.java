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
	var nLines = readNLines();

	for (int k=0; k<nLines; k++) {
		var arr = readArray();
		var isRed = false;
		for (int i = 0; i < 8; i++) {
			var isFullLine = true;
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == "B"
				    || arr[i][j] == ".")
						 {
					isFullLine = false;
				};
			}

			if (isFullLine) {
				isRed = true;
			}
		}
		System.out.println(isRed ? 'R' : 'B');
	}
    }

    private static Integer readNLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static String[][] readArray() throws IOException {
	    String[][] array = new String[8][8];

	    readln();
	    for (int i = 0; i<8; i++) {
		    var line = readln();
		    for (int j = 0; j < 8; j++) {
			    array[i][j] =  String.valueOf(line.charAt(j));
		    }
	    }

	    return array;
    }
}
