package regex;

public class ReturnRegex extends SubstituteRegex{

	public ReturnRegex() {
		super();
		this.regularExpression = "return\\s*(\\S*\\s*)*;";
		this.substituteCodes = "  ";
		this.name = "Return";
		this.level = 1;
	}
}
