package regex;
public class LengthRegex extends SubstituteRegex{
	
	public LengthRegex() {
		super();
		this.regularExpression = "length\\(\\) ";
		this.substituteCodes = "size |length |length |size() ";
		this.name = "Size";
		this.level = 1;
	}
}