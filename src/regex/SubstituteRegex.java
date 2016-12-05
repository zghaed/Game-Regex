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
	//	System.out.println(rnd);
	//	System.out.println("length "+ parts.length + " 0 " + parts[0] + " 1 " + parts[1]);
//		Pattern p = Pattern.compile(regexes.get(randomInt).getRegularExpression());
//    	Matcher m = p.matcher(program);
//		String grp = m.group();
//		ArrayList<String> arr1 = new ArrayList<String>();
//		arr1.add("void");
//		arr1.add("int");
//		arr1.add("boolean");
//		arr1.add("String");
//		int rnd = new Random().nextInt(arr1.size());
//	
//		Pattern p2 = Pattern.compile("int|String|boolean");
//		Matcher m2 = p2.matcher(grp);
//		m2.replaceAll(arr1.get(rnd));
		Pattern p = Pattern.compile(this.getRegularExpression());
		System.out.println(this.getRegularExpression());
    	Matcher m = p.matcher(c.getBefore());
    	String grp ="";
    	 while (m.find()) {
    		 grp=m.group();
             System.out.println("Found the text \""  +grp
                     + "\" starting at " + m.start()
                     + " index and ending at index " + m.end());
         }
//		Pattern p2 = Pattern.compile(this.getSubstituteCodes());
//		Matcher m2 = p2.matcher(grp);
//		String code = m2.group();
		
		mutatedCode = (c.getBefore()).replace(grp,parts[rnd]);
//		System.out.println("--------------");
//		System.out.println(grp);
//		System.out.println("--------------");
		c.setAfter( grp + ","  + mutatedCode);
	//	c.setIndex(m.start());
		return c;
	}
	
}
