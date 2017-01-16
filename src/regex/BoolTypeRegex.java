package regex;
public class BoolTypeRegex extends SubstituteRegex{
	
	public BoolTypeRegex() {
		super();
		this.regularExpression = "boolean";
		this.substituteCodes = " Boolean | bool | Bool ";
		this.name = "Remainder";
		this.level = 1;
		
	}
}