package regex;

public class ReturnRegex extends SubstituteRegex{

	public ReturnRegex() {
		super();
		this.regularExpression = "return\\s*\\S*; ";
		this.substituteCodes = " return; ";
		this.name = "Return";
		this.level = 1;
	}
}
