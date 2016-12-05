package regex;
public class DivideRegex extends SubstituteRegex{
	
	public DivideRegex() {
		super();
		this.regularExpression = "/";
		this.substituteCodes = "%|*";
		this.name = "Divide";
		this.level = 1;
	}
}