package regex;

public class EqualEqualRegex extends SubstituteRegex{

	public EqualEqualRegex() {
		super();
		this.regularExpression = "== ";
		this.substituteCodes = "= |:= |=== |.equal( ";
		this.name = "Equal Equal";
		this.level = 1;
	}
}
