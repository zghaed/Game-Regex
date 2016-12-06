package regex;
public class SizeRegex extends SubstituteRegex{
	
	public SizeRegex() {
		super();
		this.regularExpression = "size\\(\\) ";
		this.substituteCodes = "size |length |length() ";
		this.name = "Size";
		this.level = 1;
	}
}