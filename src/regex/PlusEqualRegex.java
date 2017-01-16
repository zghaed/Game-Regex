package regex;

public class PlusEqualRegex extends SubstituteRegex{
	
	public PlusEqualRegex() {
		super(); 
		this.regularExpression = " \\+= ";
		this.substituteCodes = " + | - | * | / | ++ | -- | =+ | -= | =- ";
		this.name = "Plus";
		this.level = 1;
	}
}