package regex;
public class PublicRegex extends SubstituteRegex{
	
	public PublicRegex() {
		super();
		this.regularExpression = "public ";
		this.substituteCodes = "private |default ";
		this.name = "public";
		this.level = 1;
	}
}