package regex;

public class BreakRegex extends SubstituteRegex{

	public BreakRegex() {
		super();
		this.regularExpression = "break; ";
		this.substituteCodes = "break: ";
		this.name = "Switch case break";
		this.level = 1;
	}
}

