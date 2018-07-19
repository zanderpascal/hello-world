package FinalAssignment;

import java.awt.Robot;
import java.util.ArrayList;

public class Detective {

		private ArrayList<Robot> robots = new ArrayList<>();
		
		public void buildRobot(int i) {
			String[] colors = {"red", "green", "blue"};
			robots.add(new Robot(colors[i]));
		}
		
		@Override 
		public String toString() {
			String output = "Hello, Iäm Duke.\n";
			output += "My robots are:\n";
			for (Robot r : robots) {
				output += r.color + "\n";
			}
			return output;
		}
}
