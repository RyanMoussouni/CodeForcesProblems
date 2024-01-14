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
	var line = readln();
	algo(line);
    }

    private static boolean algo(String line) {
	    var arr = parseLine(line);
	    var evenIndexes = getEvenIndexes(arr);
	    var oddIndexes = getOddIndexes(arr);
	    var sortedSubArrays = sortSubArrays(arr, evenIndexes, oddIndexes);
	    return isSorted(sortedSubArrays);
    }

    private static List<Integer> parseLine(String line) {
	    var arr = new ArrayList();
	    var strArr = line.split(" "); 

	    for (var chr : strArr) {
		    arr.add(Integer.parseInt(chr));
	    }

	    return arr;
    }

    private static List<Integer> getEvenIndexes(List<Integer> arr) {
	    var evenIndexes = new ArrayList<Integer>();
	    for (var idx : arr) {
		    if (idx % 2 == 0) {
			    evenIndexes.add(idx);
		    }
	    }
	    return evenIndexes;
    }

    private static List<Integer> getOddIndexes(List<Integer> arr) {
	    var oddIndexes = new ArrayList<Integer>();
	    for (var idx : arr) {
		    if (idx % 2 == 1) {
			    oddIndexes.add(idx);
		    }
	    }
	    return oddIndexes;
    }

    private static List<Integer> sortSubArrays(List<Integer> arr, List<Integer> evenIndexes, List<Integer> oddIndexes) {
	    var arr1 = sortNonContiguousSlice(arr, evenIndexes);
	    var arr2 = sortNonContiguousSlice(arr1, oddIndexes);
	    return arr2;
    }

    private static List<Integer> sortNonContiguousSlice(List<Integer> arr, List<Integer> slice) {
	    var auxiliary = new ArrayList<Integer>();
	    for (var idx : slice) {
		    auxiliary.add(arr.get(idx));
	    }
	    Collections.sort(auxiliary);

	    var i=0;
	    for (var idx : slice) {
		   arr.set(idx, auxiliary.get(i)); 
		   i+=1;
	    }
	    return arr;
    }

    public static boolean isSorted(List<Integer> list) {
        List<Integer> sortedList = List.copyOf(list);
        Collections.sort(sortedList);
        return list.equals(sortedList);
    }
}
