// $ANTLR 3.5.2 C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g 2024-03-11 14:07:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DotUmlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int ID=4;
	public static final int INT=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DotUmlLexer() {} 
	public DotUmlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DotUmlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:7:6: ( '\"' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:7:8: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:8:6: ( '(' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:8:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:9:6: ( ')' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:9:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:10:7: ( '*' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:10:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:11:7: ( ',' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:12:7: ( '-' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:13:7: ( '..' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:13:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:14:7: ( ':' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:14:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:15:7: ( ';' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:16:7: ( '<' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:16:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:17:7: ( '=' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:17:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:18:7: ( '>' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:18:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:19:7: ( 'ClassDiagram' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:19:9: 'ClassDiagram'
			{
			match("ClassDiagram"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:20:7: ( '[' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:20:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:21:7: ( ']' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:21:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:22:7: ( 'a' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:22:9: 'a'
			{
			match('a'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:23:7: ( 'abstract' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:23:9: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:24:7: ( 'align' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:24:9: 'align'
			{
			match("align"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:25:7: ( 'c' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:25:9: 'c'
			{
			match('c'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:26:7: ( 'class' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:26:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:27:7: ( 'enumeration' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:27:9: 'enumeration'
			{
			match("enumeration"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:28:7: ( 'g' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:28:9: 'g'
			{
			match('g'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:29:7: ( 'interface' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:29:9: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:7: ( 'label' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:9: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:31:7: ( 'private' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:31:9: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:32:7: ( 'protected' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:32:9: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:7: ( 'public' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:34:7: ( 'r' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:34:9: 'r'
			{
			match('r'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:7: ( 'with' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:9: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:7: ( 'x' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:9: 'x'
			{
			match('x'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:37:7: ( '{' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:37:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:38:7: ( '}' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:38:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:61:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:61:9: ( '0' .. '9' )+
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:61:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:62:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:62:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:62:28: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:63:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:63:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:63:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | INT | ID | WS )
		int alt4=35;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:97: T__22
				{
				mT__22(); 

				}
				break;
			case 17 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:103: T__23
				{
				mT__23(); 

				}
				break;
			case 18 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:109: T__24
				{
				mT__24(); 

				}
				break;
			case 19 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:115: T__25
				{
				mT__25(); 

				}
				break;
			case 20 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:121: T__26
				{
				mT__26(); 

				}
				break;
			case 21 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:127: T__27
				{
				mT__27(); 

				}
				break;
			case 22 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:133: T__28
				{
				mT__28(); 

				}
				break;
			case 23 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:139: T__29
				{
				mT__29(); 

				}
				break;
			case 24 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:145: T__30
				{
				mT__30(); 

				}
				break;
			case 25 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:151: T__31
				{
				mT__31(); 

				}
				break;
			case 26 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:157: T__32
				{
				mT__32(); 

				}
				break;
			case 27 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:163: T__33
				{
				mT__33(); 

				}
				break;
			case 28 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:169: T__34
				{
				mT__34(); 

				}
				break;
			case 29 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:175: T__35
				{
				mT__35(); 

				}
				break;
			case 30 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:181: T__36
				{
				mT__36(); 

				}
				break;
			case 31 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:187: T__37
				{
				mT__37(); 

				}
				break;
			case 32 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:193: T__38
				{
				mT__38(); 

				}
				break;
			case 33 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:199: INT
				{
				mINT(); 

				}
				break;
			case 34 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:203: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:1:206: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\15\uffff\1\35\2\uffff\1\42\1\44\1\35\1\46\3\35\1\53\1\35\1\55\5\uffff"+
		"\3\35\1\uffff\1\35\1\uffff\1\35\1\uffff\4\35\1\uffff\1\35\1\uffff\25\35"+
		"\1\116\2\35\1\121\1\122\2\35\1\125\3\35\1\uffff\2\35\2\uffff\2\35\1\uffff"+
		"\2\35\1\137\4\35\1\144\1\35\1\uffff\1\35\1\147\2\35\1\uffff\2\35\1\uffff"+
		"\1\35\1\155\1\156\2\35\2\uffff\1\35\1\162\1\163\2\uffff";
	static final String DFA4_eofS =
		"\164\uffff";
	static final String DFA4_minS =
		"\1\11\14\uffff\1\154\2\uffff\2\101\1\156\1\101\1\156\1\141\1\162\1\101"+
		"\1\151\1\101\5\uffff\1\141\1\163\1\151\1\uffff\1\141\1\uffff\1\165\1\uffff"+
		"\1\164\1\142\1\151\1\142\1\uffff\1\164\1\uffff\1\163\1\164\1\147\1\163"+
		"\1\155\2\145\1\166\1\164\1\154\1\150\1\163\1\162\1\156\1\163\1\145\1\162"+
		"\1\154\1\141\1\145\1\151\1\101\1\104\1\141\2\101\1\162\1\146\1\101\1\164"+
		"\2\143\1\uffff\1\151\1\143\2\uffff\2\141\1\uffff\1\145\1\164\1\101\1\141"+
		"\2\164\1\143\1\101\1\145\1\uffff\1\147\1\101\1\151\1\145\1\uffff\1\144"+
		"\1\162\1\uffff\1\157\2\101\1\141\1\156\2\uffff\1\155\2\101\2\uffff";
	static final String DFA4_maxS =
		"\1\175\14\uffff\1\154\2\uffff\2\172\1\156\1\172\1\156\1\141\1\165\1\172"+
		"\1\151\1\172\5\uffff\1\141\1\163\1\151\1\uffff\1\141\1\uffff\1\165\1\uffff"+
		"\1\164\1\142\1\157\1\142\1\uffff\1\164\1\uffff\1\163\1\164\1\147\1\163"+
		"\1\155\2\145\1\166\1\164\1\154\1\150\1\163\1\162\1\156\1\163\1\145\1\162"+
		"\1\154\1\141\1\145\1\151\1\172\1\104\1\141\2\172\1\162\1\146\1\172\1\164"+
		"\2\143\1\uffff\1\151\1\143\2\uffff\2\141\1\uffff\1\145\1\164\1\172\1\141"+
		"\2\164\1\143\1\172\1\145\1\uffff\1\147\1\172\1\151\1\145\1\uffff\1\144"+
		"\1\162\1\uffff\1\157\2\172\1\141\1\156\2\uffff\1\155\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff"+
		"\1\16\1\17\12\uffff\1\37\1\40\1\41\1\42\1\43\3\uffff\1\20\1\uffff\1\23"+
		"\1\uffff\1\26\4\uffff\1\34\1\uffff\1\36\40\uffff\1\35\2\uffff\1\22\1\24"+
		"\2\uffff\1\30\11\uffff\1\33\4\uffff\1\31\2\uffff\1\21\5\uffff\1\27\1\32"+
		"\3\uffff\1\25\1\15";
	static final String DFA4_specialS =
		"\164\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\1\5\uffff\1\2\1\3\1\4\1\uffff"+
			"\1\5\1\6\1\7\1\uffff\12\34\1\10\1\11\1\12\1\13\1\14\2\uffff\2\35\1\15"+
			"\27\35\1\16\1\uffff\1\17\3\uffff\1\20\1\35\1\21\1\35\1\22\1\35\1\23\1"+
			"\35\1\24\2\35\1\25\3\35\1\26\1\35\1\27\4\35\1\30\1\31\2\35\1\32\1\uffff"+
			"\1\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"\32\35\6\uffff\1\35\1\40\11\35\1\41\16\35",
			"\32\35\6\uffff\13\35\1\43\16\35",
			"\1\45",
			"\32\35\6\uffff\32\35",
			"\1\47",
			"\1\50",
			"\1\51\2\uffff\1\52",
			"\32\35\6\uffff\32\35",
			"\1\54",
			"\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"\1\56",
			"\1\57",
			"\1\60",
			"",
			"\1\61",
			"",
			"\1\62",
			"",
			"\1\63",
			"\1\64",
			"\1\65\5\uffff\1\66",
			"\1\67",
			"",
			"\1\70",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\32\35\6\uffff\32\35",
			"\1\117",
			"\1\120",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\1\123",
			"\1\124",
			"\32\35\6\uffff\32\35",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"\1\132",
			"",
			"",
			"\1\133",
			"\1\134",
			"",
			"\1\135",
			"\1\136",
			"\32\35\6\uffff\32\35",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\32\35\6\uffff\32\35",
			"\1\145",
			"",
			"\1\146",
			"\32\35\6\uffff\32\35",
			"\1\150",
			"\1\151",
			"",
			"\1\152",
			"\1\153",
			"",
			"\1\154",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\1\157",
			"\1\160",
			"",
			"",
			"\1\161",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | INT | ID | WS );";
		}
	}

}
