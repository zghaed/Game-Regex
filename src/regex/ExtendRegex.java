package regex;
public class ExtendRegex extends SubstituteRegex{
	
	public ExtendRegex() {
		super();
		this.regularExpression = "extends ";
		this.substituteCodes = "inherits |subclass |derives |implements ";
		this.name = "Extends";
		this.level = 1;
	}
}