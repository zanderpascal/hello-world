package AnotherBonus;

import java.util.HashMap;

public class TeacherRobot {

	private HashMap<Integer, String> gradeTexts;
	
	public TeacherRobot(){
		gradeTexts = new HashMap<Integer, String>();
		gradeTexts.put(1, "excellent");
		gradeTexts.put(2, "good");
		gradeTexts.put(3, "satisfactory");
		gradeTexts.put(4, "sufficient");
		gradeTexts.put(5, "insufficient");
	}

	public String nameGrade(double d) {
		// TODO Auto-generated method stub
		int store = (int) d; 
		switch(store) {
		case 1: return gradeTexts.get(1);
		case 2: return gradeTexts.get(2);
		case 3: return gradeTexts.get(3);
		case 4: return gradeTexts.get(4);
		case 5: return gradeTexts.get(5);
		case 6: return gradeTexts.get(6);
		default: return null;
		}
	}
}
