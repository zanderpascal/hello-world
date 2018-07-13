package HashMapExcercise2;

import java.util.ArrayList;
import java.util.HashMap;

class Bookshelf {
	
	ArrayList<Clue> usedClues = new ArrayList<Clue>();
	ArrayList<Clue> unusedClues = new ArrayList<Clue>();
	HashMap<String,ArrayList<Clue>> clueHashMap = new HashMap<String,ArrayList<Clue>>();

	void buildHashMap() {
		clueHashMap.put("used", usedClues);
		clueHashMap.put("unused", unusedClues);
	}
	
	
	// please just leave this code as it is,
	// it helps you to get an output if you run your code.
	// Also, it might server as a reference for using a foreach loop. ;-)
	void printHashMap(){
	    for (String key : clueHashMap.keySet()){
	        System.out.println("The clue list \""  + key + "\" contains the clues:");
	        for(Clue clue : clueHashMap.get(key)){
	            System.out.println("\t" + clue);
	        }
	    }
	}


	public void saveClues(ArrayList<Clue> clues) {
		// TODO Auto-generated method stub
		for(int i = 0; i < clues.size(); i++) {
			if(clues.get(i).getUsed() == true){
				usedClues.add(clues.get(i));
			}else{
				unusedClues.add(clues.get(i));
			}
		}
		
	}

}
