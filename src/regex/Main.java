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

	public static void main(String [] args) {
		String adr = "/Users/zahra/Documents/workspace/Game-Regex/src/test/input/6.java";
    	String program = readTest(adr);
    	ArrayList<Regex> arrayrx = new ArrayList<Regex>();
    	ArrayList<Regex> arrayrx2 = new ArrayList<Regex>();
    	ArrayList<Regex> arrayrx3 = new ArrayList<Regex>();
    	
    	// Create objects of all regular expressions and add them to the arraylist
    	
    	//BEGINNERS
    	
    	//General
    	CloseBracketRegex closebracketrx = new CloseBracketRegex();
    	arrayrx.add(closebracketrx); 	
    	//Semicolon
//    	SemicolonRegex semicolonrx = new SemicolonRegex();
//    	arrayrx.add(semicolonrx);
    	AddSemicolonRegex addsemirx = new AddSemicolonRegex();
    	arrayrx.add(addsemirx);
    	ClassDeclRegex classrx = new ClassDeclRegex();
    	arrayrx.add(classrx);
    	
    	//Main
    	MainStringRegex mainstrrx = new MainStringRegex();
    	arrayrx.add(mainstrrx);
    	MainArgsRegex mainargsrx = new MainArgsRegex();
    	arrayrx.add(mainargsrx);
    	
    	//Types
    	BoolTypeRegex booltyperx = new BoolTypeRegex();
    	arrayrx.add(booltyperx);
    	IntTypeRegex inttyperx = new IntTypeRegex();
    	arrayrx.add(inttyperx);
    	StringTypeRegex stringtyperx = new StringTypeRegex();
    	arrayrx.add(stringtyperx);
    	
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
    	PlusEqualRegex plusequalrx = new PlusEqualRegex();
    	arrayrx.add(plusequalrx);
    	RemainderRegex remainderrx = new RemainderRegex();
    	arrayrx.add(remainderrx);
    	
    	//INTERMEDIATE
    	
    	//Function
//    	ParenthesesRegex parenthesisrx = new ParenthesesRegex();
//    	arrayrx.add(parenthesisrx);
    	VoidRegex voidrx = new VoidRegex();
    	arrayrx2.add(voidrx);
    	ReturnRegex returnrx = new ReturnRegex();
    	arrayrx2.add(returnrx);
//    	MainDeclRegex mainrx = new MainDeclRegex();
//    	arrayrx2.add(mainrx);
    	
    	//Break
    	BreakRegex breakrx = new BreakRegex();
    	arrayrx2.add(breakrx);
    	
    	//ADVANCED
    	
    	//Class
    	ExtendRegex extendrx = new ExtendRegex();
    	arrayrx3.add(extendrx);
    	InterfaceDeclRegex interfacerx = new InterfaceDeclRegex();
    	arrayrx3.add(interfacerx);
    	ThisRegex thisrx = new ThisRegex();
    	arrayrx3.add(thisrx);
    	PublicRegex publicrx = new PublicRegex();
    	arrayrx3.add(publicrx);
    	
    	//Array
    	ZeroArrayRegex zerorx = new ZeroArrayRegex();
    	arrayrx3.add(zerorx);
    	SizeRegex sizerx = new SizeRegex();
    	arrayrx3.add(sizerx);
    	LengthRegex lengthrx = new LengthRegex();
    	arrayrx3.add(lengthrx);
    	
    	Change c = new Change();
    	c.setBefore(program);
    	
    	String fileName = "/Users/zahra/Documents/workspace/Game-Regex/src/test/output/";
    	String fileName2 = "";
    	for (int i=0; i<arrayrx.size(); i++){
    		if (isContain(program,arrayrx.get(i))){
    			System.out.println("********************* "+ arrayrx.get(i).getName());
    			System.out.println(c.getBefore());
    			arrayrx.get(i).change(c);
    			fileName2 = fileName + "/6/" + Integer.toString(i) + ".java";
    			String newProgram = c.getAfter();
    			writeTest(c.getAfter(),(fileName2));
    			c.setBefore(newProgram);
    			//c.setBefore(program);
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
//    		br.readLine();
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
