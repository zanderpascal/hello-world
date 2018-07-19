package InheritanceHierarchy;

public class Story {

	public static void main(String[] args) {
		Object o = new Detective();
		
		PrivateDetective pd = (PrivateDetective) o;
		Profession p = (Profession) o;
		
	}

}
