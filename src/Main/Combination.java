package Main;

import java.util.ArrayList;

///https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/


class Combination {
	 static int max;
    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Starting and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(String arr[], String data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)      
            {
            	System.out.print(data[j]);
            }
            String str = concat(data);
            if (uniqueChars(str)) {
            	if (str.length() > max) {
                	max = str.length();
                }
            }
            
            System.out.println("");
            
            return;
        }
 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(String arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        String data[]=new String[r];
 
        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
    
    public static int solution(String[] A) {
    	max = 0;
    	int r = 2;
    	ArrayList<String> ar = new ArrayList<String>();
		
		for (int i = 0; i < A.length; i++) {
            if (uniqueChars(A[i])) {
                ar.add(A[i].toLowerCase());
            }
        }
    	
		String[] arr = ar.toArray(new String[0]);
		
		
		
		int n = arr.length;
		while (r <= arr.length) {
			printCombination(arr, n, r);
			r++;
		}
    	
    	return max;
    }
    
    private static boolean uniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static String concat(String[] arr) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < arr.length; i++) {
    		sb.append(arr[i]);
    		
    	}
    	
    	return sb.toString();
    	
    }
 
    /*Driver function to check for above function*/
    public static void main (String[] args) {
    	
    	
        String arr[] = {"abc","aaa","heeejoo", "abcd", "ef", "caba", "efg"};
        //after deleting strings that does not have unique chars
        //arr[] = {"abc", abcd", "ef", "efg"};
        
        solution(arr);
        System.out.println(max);

    }
}