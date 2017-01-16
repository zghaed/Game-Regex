package regex;
public class IntTypeRegex extends SubstituteRegex{
	
	public IntTypeRegex() {
		super();
		this.regularExpression = " int ";
		this.substituteCodes = " Integer | Int | integer";
		this.name = "Remainder";
		this.level = 1;
	}
}