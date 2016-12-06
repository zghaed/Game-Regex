package regex;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstituteRegex extends Regex{
	
	protected String substituteCodes;

	public String getSubstituteCodes() {
		return substituteCodes;
	}

	public void setSubstituteCodes(String substituteCodes) {
		this.substituteCodes = substituteCodes;
	}

	@Override
	public Change change(Change c) {
		String mutatedCode = "";
		System.out.println("Substitution ");
		String[] parts = this.getSubstituteCodes().split("\\|");
		int rnd = new Random().nextInt(parts.length);
	
		Pattern p = Pattern.compile(this.getRegularExpression());
		System.out.println(this.getRegularExpression());
    	Matcher m = p.matcher(c.getBefore());
    	String grp ="";
//    	Pattern p = Pattern.compile(this.getRegularExpression());
//    	Matcher m = p.matcher(c.getBefore());
//    	mutatedCode = m.replaceFirst("  ");
		while (m.find()) {
			grp=m.group();
		    System.out.println("Found the text \""  +grp
		            + "\" starting at " + m.start()
		            + " index and ending at index " + m.end());
	    }
		System.out.println(parts[rnd]);
		mutatedCode = m.replaceFirst(parts[rnd]);
//		System.out.println(mutatedCode);
		c.setAfter( parts[rnd] + ","  + mutatedCode);
		return c;
	}
	
}
