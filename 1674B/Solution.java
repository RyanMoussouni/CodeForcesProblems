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

	var dict = buildDictionary();

	readln();
	var nLines = nextInt();

	for (int i = 0; i<nLines; i++) {
		var word = readWord();
		var idx = getIdxFromDict(dict, word);
		System.out.println(idx);
	}
    }

    private static List<String> buildDictionary() {
	    var dict = new ArrayList<String>();

	    for (int i=0; i<26; i++) {
		    for (int j=0; j<26; j++) {
			    if (i != j) {
				    var sb = new StringBuilder();
				    var word1 = new String(new byte[]{(byte) (97+i)});
				    var word2 = new String(new byte[]{(byte) (97+j)});

				    sb.append(word1);
				    sb.append(word2);

				    var word = sb.toString();
				    dict.add(word);
			    }
		    }
	    }

	    return dict;
    }

    private static String readWord() throws IOException {
	    return readln();
    }

    private static Integer getIdxFromDict(List<String> dict, String word) {
	    return dict.indexOf(word) + 1;
    }
}
