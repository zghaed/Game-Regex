package regex;
public class ZeroArrayRegex extends SubstituteRegex{
	
	public ZeroArrayRegex() {
		super(); 
		this.regularExpression = "\\[0\\] ";
		this.substituteCodes = "[1] ";
		this.name = "Zero Based Array";
		this.level = 1;
	}
}