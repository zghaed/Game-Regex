package regex;

public class AddSemicolonRegex extends SubstituteRegex{

	public AddSemicolonRegex() {
		super();
		this.regularExpression = "\\) ";
		this.substituteCodes = " ); ";
		this.name = "Add Semicolon";
		this.level = 1;
	}
}
