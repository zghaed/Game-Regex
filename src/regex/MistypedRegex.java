package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MistypedRegex extends Regex {
	
	private String substituteWord;
	
	public String getSubstituteWord() {
		return substituteWord;
	}

	public void setSubstituteWord(String substituteWord) {
		this.substituteWord = substituteWord;
	}

	@Override
	public Change change(Change c) {
		String mutatedCode = "";
		System.out.println("Mistyped ");
		Pattern p = Pattern.compile(this.getRegularExpression());
    	Matcher m = p.matcher(c.getBefore());
    	c.setIndex(m.start());
    	mutatedCode = m.replaceAll(this.getSubstituteWord());
    	c.setAfter(mutatedCode);
//		String grp = m.group();
//		String trim = grp.trim();
//		String[] words;
//		if (trim.isEmpty())
//	        words = null;
//		else
//			words= trim.split("\\s+");
//		int rnd = new Random().nextInt(words.length);
//		StringBuilder sb = new StringBuilder(words[rnd]);
//	    if (Character.isLowerCase(sb.charAt(rnd))) {
//	        sb.setCharAt(0, Character.toUpperCase(sb.charAt(rnd)));
//	    } else {
//	    	sb.setCharAt(0, Character.toLowerCase(sb.charAt(rnd)));
//	    }
//	    grp.replaceAll(words[rnd], sb.toString());
//	    c.setAfter(mutatedCode);
		return c;
	}

}
