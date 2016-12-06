package regex;
public class VoidRegex extends SubstituteRegex{
	
	public VoidRegex() {
		super();
		this.regularExpression = "void ";
		this.substituteCodes = "int |boolean |String |float |double ";
		this.name = "This";
		this.level = 1;		
	}
}