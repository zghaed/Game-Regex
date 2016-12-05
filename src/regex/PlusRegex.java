package regex;
public class PlusRegex extends SubstituteRegex{
	
	public PlusRegex() {
		super(); 
		this.regularExpression = "\\+";
		this.substituteCodes = "-|\\*|/|\\+\\+|--";
		this.name = "Plus";
		this.level = 1;
	}
}