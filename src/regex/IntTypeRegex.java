package regex;
public class IntTypeRegex extends SubstituteRegex{
	
	public IntTypeRegex() {
		super();
		this.regularExpression = "int ";
		this.substituteCodes = "Integer |bool |String |double |float |boolean ";
		this.name = "Remainder";
		this.level = 1;
	}
}