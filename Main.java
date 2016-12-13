import org.antlr.v4.runtime.*;
import java.util.HashMap;
public class Main {
	public static void main(String[] args) throws Exception{
		CharStream input = new ANTLRFileStream("in.x");
		xLexer lexer = new xLexer(input);
		CommonTokenStream ts=new CommonTokenStream(lexer);
		xParser parser=new xParser(ts);
		xParser.ProgramContext program_ctx;
		program_ctx = parser.program();
	}
}
