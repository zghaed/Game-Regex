package regex;
public class MinusRegex extends SubstituteRegex{
	
	public MinusRegex() {
		super(); 
		this.regularExpression = " - ";
		this.substituteCodes = " + | * | / | ++ | -- ";
		this.name = "Minus";
		this.level = 1;
	}
}