
public class HumanManager {
	public static Human getHuman(String name, String sage) {
		int iAge = Integer.parseInt(sage);
		return new Human(name, iAge);
	}

}
