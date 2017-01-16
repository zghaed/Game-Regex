package regex;

public class CloseBracketRegex extends SubstituteRegex{

	public CloseBracketRegex() {
		super();
		this.regularExpression = "} ";
		this.substituteCodes = " }} ";
		this.name = "Close Bracket";
		this.level = 1;
	}
}
