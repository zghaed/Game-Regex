package regex;
public class ImplementRegex extends SubstituteRegex{
	
	public ImplementRegex() {
		super();
		this.regularExpression = " implements ";
		this.substituteCodes = " inherits | subclass | derives | extends ";
		this.name = "Implements";
		this.level = 1;
	}
}