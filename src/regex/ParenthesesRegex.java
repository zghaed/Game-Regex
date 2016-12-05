package regex;

public class ParenthesesRegex extends RemoveRegex{

	public ParenthesesRegex() {
		super();
		this.regularExpression = "\\(\\)";
		this.name = "Function call parentheses";
		this.level = 1;
	}
}
