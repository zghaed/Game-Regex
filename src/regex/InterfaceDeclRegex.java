package regex;
public class InterfaceDeclRegex extends SubstituteRegex{
	
	public InterfaceDeclRegex() {
		super();
		this.regularExpression = "interface ";
		this.substituteCodes = " Class | Object | object | class | Interface ";
		this.name = "Remainder";
		this.level = 1;
	}
}