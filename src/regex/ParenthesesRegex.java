package regex;

public class ParenthesesRegex extends SubstituteRegex{

	public ParenthesesRegex() {
		super();
		this.regularExpression = "\\w+\\(\\);";
		this.substituteCodes = " ; ";
		this.name = "Function call parentheses";
		this.level = 1;
	}
}
