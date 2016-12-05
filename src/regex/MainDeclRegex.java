package regex;
public class MainDeclRegex extends SubstituteRegex{
	
	public MainDeclRegex() {
		super();
		this.regularExpression = "public\\s*static\\s*void\\s*main\\s*\\(\\s*String\\[\\]\\s*args\\s*\\)";
		this.substituteCodes = "public static void main(String args[])|"
				+ "public static void main(String args)|"
				+ "public static main(String[] args))|"
				+ "public static int main(String[] args)|"
				+ "private static void main(String[] args)|"
				+ "public static void main(string[] args)|"
				+ "public Static void main(String[] args)|"
				+ "public static void main(String[] Args)";
		this.name = "Equal Equal";
		this.level = 1;
	}
}