package Main;

import java.util.ArrayList;

public class NewestSolution {
	int s;
	
	public NewestSolution(String[] A) {
		s = solution(A);
	}

	private int solution(String[] A) {
		int max = 0;
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for (int i = 0; i < A.length; i++) {
            if (!uniqueChars(A[i])) {
                arr.add(A[i].toLowerCase());
            }
        }
		
		
		
		
		return max;
	}
	
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
