package Main;

import java.util.ArrayList;

public class NewSolution {
public int s;
	
	public NewSolution(String[] A) {
		
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
        
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        
        for (int i = 0; i < A.length; i++) {
        	if (A[i].length() > 0) {
        		arr.add(A[i]);
        		
        	}
        }
        
    	int l = 2;
    	int a = 0, b = 1;
    	
    	if (arr.size() < 2) {
    		return max;
    	}
    	
    	for (int i = l - 1; i < arr.size(); i++) {
    		for (int j = i + 1; j < arr.size(); j++) {
    			
    		}
    	}
    	

    	while (l > 1) {
    		arr2.clear();
    		
    		for (int i = 0; i < arr.size(); i++) {
    			arr2.add(arr.get(i));
            }
    		
    		for (int i = 0; i < (arr.size() - l); i++) {
    			
    		}
    		
    		for (int i = 0; i < (arr.size() - l + 1); i++) {
    			String str = concat(arr2);
    			System.out.println(str);
    			if (uniqueChars(str)) {
    				if (str.length() > max) {
    					max = str.length();
    				}
    			}
    		}
    		l--;
    	}
        

        
        
        return max;
    }
    
    private String concat(ArrayList<String> arr) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < arr.size(); i++) {
    		sb.append(arr.get(i));
    		
    	}
    	
    	return sb.toString();
    	
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
}
