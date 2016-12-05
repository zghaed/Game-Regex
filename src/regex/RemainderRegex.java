package regex;
public class RemainderRegex extends SubstituteRegex{
	
	public RemainderRegex() {
		super();
		this.regularExpression = "%";
		this.substituteCodes = "/|\\*";
		this.name = "Remainder";
		this.level = 1;
	}
}