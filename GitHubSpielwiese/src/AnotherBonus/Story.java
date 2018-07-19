package AnotherBonus;

public class Story {

	/*
	 * In this exercise we will repeat typecasting and working with HashMaps. 
	 * So far we have always tried to cast numbers from type int to type double. 
	 * Here we practice casting doubles to ints. 
	 * We would like to output the corresponding text representations for a numerical average grade (as used in german schools).
	 * In the gradeTexts attribute, the grades are created in a hash map. 
	 * The grades form the keys and the corresponding text representations are the values. 
	 * For grade 1, for example, the text “excellent” is saved and for a 5 is “insufficient” stored. 
	 * In the class TeacherRobot write the method nameGrade(). This should accept an argument of type double. 
	 * This argument represents the average grade we want to translate. 
	 * Since we can not directly access the HashMap saved in the attribute gradeTexts with a variable of the type double, we must first bring the average grade to the accepted data type int. 
	 * Use explicit casting for that. Then we can use the get () method on the gradeTexts attribute to translate the note.
	 * 
	 * 
	 * Note: We simply round the grades to the floor here. So a 3.9 is rounded to 3.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherRobot teacher = new TeacherRobot();
		System.out.println("1.2 is " + teacher.nameGrade(1.2));
		System.out.println("2.0 is " + teacher.nameGrade(2.0));
		System.out.println("3.3 is " + teacher.nameGrade(3.3));
		System.out.println("4.7 is " + teacher.nameGrade(4.7));
	}

}
