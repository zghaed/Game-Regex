package regex;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String adr = "/Users/zahra/Documents/workspace/Regex/tests/test7.txt";
    	String program = readTest(adr);
    	ArrayList<Regex> arrayrx = new ArrayList<Regex>();
    	
    	// Create objects of all regular expressions and add them to the arraylist
    	
    	//Operators
    	EqualEqualRegex equalrx = new EqualEqualRegex();
    	arrayrx.add(equalrx);
    	DivideRegex dividetrx = new DivideRegex();
    	arrayrx.add(dividetrx);
    	LessThanRegex lessrx = new LessThanRegex();
    	arrayrx.add(lessrx);
    	MinusRegex minusrx = new MinusRegex();
    	arrayrx.add(minusrx);
    	PlusRegex plusrx = new PlusRegex();
    	arrayrx.add(plusrx);
    	RemainderRegex remainderrx = new RemainderRegex();
    	arrayrx.add(remainderrx);
    	
    	//Semicolon
    	SemicolonRegex semicolonrx = new SemicolonRegex();
    	arrayrx.add(semicolonrx);
    	AddSemicolonRegex addsemirx = new AddSemicolonRegex();
    	arrayrx.add(addsemirx);
    	
    	//Types
    	BoolTypeRegex booltyperx = new BoolTypeRegex();
    	arrayrx.add(booltyperx);
    	IntTypeRegex inttyperx = new IntTypeRegex();
    	arrayrx.add(inttyperx);
    	StringTypeRegex stringtyperx = new StringTypeRegex();
    	arrayrx.add(stringtyperx);
    	
    	//Function
    	ParenthesesRegex parenthesisrx = new ParenthesesRegex();
    	arrayrx.add(parenthesisrx);
    	VoidRegex voidrx = new VoidRegex();
    	arrayrx.add(voidrx);
    	ReturnRegex returnrx = new ReturnRegex();
    	arrayrx.add(returnrx);
    	MainDeclRegex mainrx = new MainDeclRegex();
    	arrayrx.add(mainrx);
    	
    	//Break
    	BreakRegex breakrx = new BreakRegex();
    	arrayrx.add(breakrx);
    	
    	//Class
    	ExtendRegex extendrx = new ExtendRegex();
    	arrayrx.add(extendrx);
    	ThisRegex thisrx = new ThisRegex();
    	arrayrx.add(thisrx);
    	CloseBracketRegex closebracketrx = new CloseBracketRegex();
    	arrayrx.add(closebracketrx); 	
    	PublicRegex publicrx = new PublicRegex();
    	arrayrx.add(publicrx);
    	
    	//Array
    	ZeroArrayRegex zerorx = new ZeroArrayRegex();
    	arrayrx.add(zerorx);
    	SizeRegex sizerx = new SizeRegex();
    	arrayrx.add(sizerx);
    	
    	Change c = new Change();
    	c.setBefore(program);
    	
    	String fileName = "/Users/zahra/Documents/workspace/Regex/out/";
    	String fileName2 = "";
    	for (int i=0; i<arrayrx.size(); i++){
    		if (isContain(program,arrayrx.get(i))){
    			System.out.println("********************* "+ arrayrx.get(i).getName());
    			arrayrx.get(i).change(c);
    			fileName2 = fileName + Integer.toString(i) + ".txt";
    			String newProgram = c.getAfter();
    			writeTest(c.getAfter(),(fileName2));
    			//c.setBefore(newProgram);
    			c.setBefore(program);
    		}
    	}
   
	}
	

	private static boolean isContain(String program, Regex regex) {
		Pattern p = Pattern.compile(regex.getRegularExpression());
    	Matcher m = p.matcher(program);
    	if (m.find( )) {
    		//System.out.println("####################### "+ m.group());
    		return true;
	    }
    	return false;
	}


	private static String readTest(String adr) {
		String program = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(adr)))
		{
    		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				program += sCurrentLine;
				program += "\n";
			}

		} catch (IOException e) {
			e.printStackTrace();
		}  
		return program;
	}
	
	private static void writeTest(String mutatedProgram, String name) {
		try {

			File file = new File(name);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(mutatedProgram);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
