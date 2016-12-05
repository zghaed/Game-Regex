package regex;
public class StringTypeRegex extends SubstituteRegex{
	
	public StringTypeRegex() {
		super();
		this.regularExpression = "String";
		this.substituteCodes = "Integer|bool|int|double|float";
		this.name = "Remainder";
		this.level = 1;
	}
}