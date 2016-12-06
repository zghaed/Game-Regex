package regex;
public class BoolTypeRegex extends SubstituteRegex{
	
	public BoolTypeRegex() {
		super();
		this.regularExpression = "boolean ";
		this.substituteCodes = "Integer |bool |String |double |float |int ";
		this.name = "Remainder";
		this.level = 1;
		
	}
}