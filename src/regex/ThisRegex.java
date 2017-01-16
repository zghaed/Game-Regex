package regex;
public class ThisRegex extends SubstituteRegex{
	
	public ThisRegex() {
		super();
		this.regularExpression = "this ";
		this.substituteCodes = " self | object | receiver | caller | This ";
		this.name = "This";
		this.level = 1;
	}
}