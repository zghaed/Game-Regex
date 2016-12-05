package regex;
public class LessThanRegex extends SubstituteRegex{
	
	public LessThanRegex() {
		super(); 
		this.regularExpression = "<";
		this.substituteCodes = "<=|>|>=";
		this.name = "Plus";
		this.level = 1;
	}
}