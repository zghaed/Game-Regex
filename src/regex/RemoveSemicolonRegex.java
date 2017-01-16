package regex;

public class RemoveSemicolonRegex extends SubstituteRegex{

	public RemoveSemicolonRegex() {
		super();
		this.regularExpression = "\\); ";
		this.substituteCodes = " ) ";
		this.name = "Add Semicolon";
		this.level = 1;
	}
}
