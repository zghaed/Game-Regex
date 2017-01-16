package regex;
public class MainStringRegex extends SubstituteRegex{
	
	public MainStringRegex() {
		super();
		this.regularExpression = " String\\[\\] ";
		this.substituteCodes = " string[] | String | string ";
		this.name = "Main String[]";
		this.level = 1;
	}
}