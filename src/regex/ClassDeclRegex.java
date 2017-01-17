package regex;
public class ClassDeclRegex extends SubstituteRegex{
	
	public ClassDeclRegex() {
		super();
		this.regularExpression = " class ";
		this.substituteCodes = " Class | Object | object | interface | Interface ";
		this.name = "Remainder";
		this.level = 1;
	}
}