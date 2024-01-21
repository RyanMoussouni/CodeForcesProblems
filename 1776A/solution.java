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

	var nLines = readLines();

	for (int i =0; i<nLines; i++) {
		var array = readArray();

		var diffs = computeDifference(array);

		if (hasBeenWalked(diffs)) {
			System.out.println("YES"); 
		} else {
			System.out.println("NO");
		}
	}
    }
    
    private static int readLines() throws IOException {
	    readln();
	    return nextInt();
    }

    private static List<Integer> readArray() throws IOException {
	    readln();
	    var nElts = nextInt();

	    readln();
	    var arr = new ArrayList<Integer>();

	    for (int i=0; i<nElts; i++) {
		    arr.add(nextInt());
	    }

	    return arr;
    }

    private static List<Integer> computeDifference(List<Integer> arr) {
	    var newArr = new ArrayList<Integer>();
	    var size = arr.size();
	    for (int i=0; i<size; i++) {
		    if (i+1<size){
			    newArr.add(arr.get(i+1) - arr.get(i));
		    } else {
			    newArr.add(1440 - arr.get(i));
		    }
	    }
	    return newArr;
    }

    private static boolean hasBeenWalked(List<Integer> arr) {
	    var cpt = 0;
	    for (var elapsedTime : arr) {
		    if (elapsedTime >= 240 ) {
			    return true;
		    } else if (elapsedTime >= 120) {
			    cpt += 1;
		    }
	    }
	    return cpt>=2;
    }
}
