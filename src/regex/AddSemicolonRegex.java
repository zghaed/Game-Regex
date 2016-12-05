package regex;

public class AddSemicolonRegex extends SubstituteRegex{

	public AddSemicolonRegex() {
		super();
		this.regularExpression = "\\)\\n";
		this.substituteCodes = "\\);\\n";
		this.name = "Add Semicolon";
		this.level = 1;
	}
}
