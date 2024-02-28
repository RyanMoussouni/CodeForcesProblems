
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

	var nLines = readln();

	for (int i = 0; i < nLines; i++) {
		readln();
		var nArr = nextInt();

		readln();
		var arr = new ArrayList<String>();

		for (int j = 0; j < nArr; j++) {
			var elt = nextInt();
			arr.add(elt);
		}

		var left_cdt = arr.get(0);
		var left_cpt = 0;
				
		while (arr.get(left_cpt) == left_cdt) {
			left_cpt += 1;
		}


		var right_cdt = arr.get(n-1);
		var right_cpt = 0;
		while (arr.get(right_cpt) == n-1-right_cpt) {
			right_cpt +=1;
		}

		int x;
		if (left_cdt != right_cdt) {
			x = left_cpt < right_cpt ? right_cdt : left_cdt;
		} else {
			x = left_cpt;
		}

		int i_star;

		if (arr.get(0) != x) {
			i_star = 0
		} else {
				
		}



	}
    }
}
