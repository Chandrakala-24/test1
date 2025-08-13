package assignment;
	import java.io.*;
	import java.util.*;

	class UserMainCode2 {
	    public String identifyPossiblewords(String input1, String input2) {
	        String[] words = input2.split(":");
	        String inputLower = input1.toLowerCase();
	        List<String> matches = new ArrayList<String>();

	        for (String word : words) {
	            if (word.length() != inputLower.length()) {
	                continue;
	            }
	            boolean match = true;
	            for (int i = 0; i < word.length(); i++) {
	                char patternChar = inputLower.charAt(i);
	                char wordChar = Character.toLowerCase(word.charAt(i));
	                if (patternChar != '_' && patternChar != wordChar) {
	                    match = false;
	                    break;
	                }
	            }
	            if (match) {
	                matches.add(word.toUpperCase());
	            }
	        }

	        if (matches.isEmpty()) {
	            return "ERROR-009";
	        }

	        return String.join(":", matches);
	    }
	
}
