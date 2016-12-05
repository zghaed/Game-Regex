package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRegex extends Regex{

	@Override
	public Change change(Change c) {
		String mutatedCode = "";
		System.out.println("remove " + this.getName());
		Pattern p = Pattern.compile(this.getRegularExpression());
    	Matcher m = p.matcher(c.getBefore());
    	mutatedCode = m.replaceFirst("  ");
    	c.setAfter(mutatedCode);
    //	c.setIndex(m.start());
    	return c;
	}

}
