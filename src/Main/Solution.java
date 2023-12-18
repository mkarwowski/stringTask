package Main;

import java.util.ArrayList;

class Solution {
	public int s;
	
	public Solution(String[] A) {
		
		s = solution(A);
	}
	
	
    public int solution(String[] A) {
    	
        int max = 0;

        //check if all strings have unique characters
        //if string does not contain only unique characters - "remove" this string from array
        for (int i = 0; i < A.length; i++) {
            if (!uniqueChars(A[i])) {
                A[i] = "";
            }
            
            A[i] = A[i].toLowerCase();
        }

        for (int i = 0; i < A.length; i++) {

            //variable to check if program concatenationed at least two strings
            boolean concatenationed = false;

            StringBuilder sb = new StringBuilder();
            sb.append(A[i]);

            for (int j = 0; j < A.length; j++) {

                //variable to check if program should join strings
                boolean join = true;
                for (int k = 0; k < sb.length(); k++) {
                    for (int l = 0; l < A[j].length(); l++) {
                        if (sb.charAt(k) == A[j].charAt(l)) {
                            join = false;
                            break;
                        }
                    }

                }
                if (join) {
                    sb.append(A[j]);
                    concatenationed = true;
                }
            }

            if (sb.length() > max && concatenationed) {
                max = sb.length();
            }
            System.out.println(sb.toString());
        }
        
        return max;
    }


    //check if string str has unique characters
    private boolean uniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private String concat(ArrayList<String> arr) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < arr.size(); i++) {
    		sb.append(arr.get(i));
    		
    	}
    	
    	return sb.toString();
    	
    }
}
