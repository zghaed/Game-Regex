package regex;
public class StringTypeRegex extends SubstituteRegex{
	
	public StringTypeRegex() {
		super();
		this.regularExpression = " String ";
		this.substituteCodes = " string ";
		this.name = "Remainder";
		this.level = 1;
	}
}