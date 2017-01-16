package regex;
public class MainArgsRegex extends SubstituteRegex{
	
	public MainArgsRegex() {
		super();
		this.regularExpression = " args ";
		this.substituteCodes = " args[] | Args | Args[] ";
		this.name = "Main args";
		this.level = 1;
	}
}