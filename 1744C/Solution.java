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
		var c = next();

		var lights = readln();

		if (c == "r") {
			var timeToGreen = new int[lights.length()];

			int cpt=0;
			for (int l=0; l<2; i++) {
				for (int j=0; j<n; j++) {
					var color = lights.charAt(n-1-j);

					if (color == 'g') {
						cpt = 0;
						timeToGreen[n-1-j] = cpt;
					}

					if (color == 'r') {
						timeToGreen[n-1-j] = cpt;
					}

					if (color == 'y') {
						timeToGreen[n-1-j] = 2*n;
					}

					cpt += 1;
				}
			}
			System.out.println(Arrays.stream(timeToGreen).min().getAsInt());
		}

		if (c == "g") {
			System.out.println(0);
		}

		if (c == "y") {
			var timeToGreen = new int[lights.length()];

			int cpt=0;
			for (int l=0; l<2; i++) {
				for (int j=0; j<n; j++) {
					var color = lights.charAt(n-1-j);

					if (color == 'g') {
						cpt = 0;
						timeToGreen[n-1-j] = cpt;
					}

					if (color == 'y') {
						timeToGreen[n-1-j] = cpt;
					}

					if (color == 'r') {
						timeToGreen[n-1-j] = 2*n;
					}

					cpt += 1;
				}
			}
			System.out.println(Arrays.stream(timeToGreen).min().getAsInt());
		}
	}
    }
}
