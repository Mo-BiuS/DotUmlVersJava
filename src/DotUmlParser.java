// $ANTLR 3.5.2 C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g 2024-03-05 16:44:20

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DotUmlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'\"'", "'('", 
		"')'", "'*'", "','", "'-'", "'..'", "':'", "';'", "'<'", "'='", "'>'", 
		"'ClassDiagram'", "'['", "']'", "'a'", "'abstract'", "'align'", "'c'", 
		"'class'", "'enumeration'", "'g'", "'interface'", "'label'", "'private'", 
		"'protected'", "'public'", "'r'", "'with'", "'x'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DotUmlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DotUmlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DotUmlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g"; }


	// variables globales et methodes utiles a placer ici



	// $ANTLR start "unite"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:24:1: unite : 'ClassDiagram' header '{' ( object | associations )* '}' EOF ;
	public final void unite() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:24:6: ( 'ClassDiagram' header '{' ( object | associations )* '}' EOF )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:24:8: 'ClassDiagram' header '{' ( object | associations )* '}' EOF
			{
			match(input,19,FOLLOW_19_in_unite49); 
			PtGen.pt(0);
			pushFollow(FOLLOW_header_in_unite57);
			header();
			state._fsp--;

			match(input,37,FOLLOW_37_in_unite63); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:26:9: ( object | associations )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 23 && LA1_0 <= 24)||(LA1_0 >= 26 && LA1_0 <= 27)||LA1_0==29) ) {
					alt1=1;
				}
				else if ( (LA1_0==ID) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:26:10: object
					{
					pushFollow(FOLLOW_object_in_unite66);
					object();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:26:19: associations
					{
					pushFollow(FOLLOW_associations_in_unite70);
					associations();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,38,FOLLOW_38_in_unite74); 
			match(input,EOF,FOLLOW_EOF_in_unite80); 
			PtGen.pt(1000);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unite"



	// $ANTLR start "header"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:1: header : '[' ( ident | '=' | ( 'label' '=' '\"' ident ( ident )* '\"' ) )* ']' ;
	public final void header() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:7: ( '[' ( ident | '=' | ( 'label' '=' '\"' ident ( ident )* '\"' ) )* ']' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:9: '[' ( ident | '=' | ( 'label' '=' '\"' ident ( ident )* '\"' ) )* ']'
			{
			match(input,20,FOLLOW_20_in_header94); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:13: ( ident | '=' | ( 'label' '=' '\"' ident ( ident )* '\"' ) )*
			loop3:
			while (true) {
				int alt3=4;
				switch ( input.LA(1) ) {
				case ID:
					{
					alt3=1;
					}
					break;
				case 17:
					{
					alt3=2;
					}
					break;
				case 30:
					{
					alt3=3;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:14: ident
					{
					pushFollow(FOLLOW_ident_in_header97);
					ident();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:20: '='
					{
					match(input,17,FOLLOW_17_in_header99); 
					}
					break;
				case 3 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:24: ( 'label' '=' '\"' ident ( ident )* '\"' )
					{
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:24: ( 'label' '=' '\"' ident ( ident )* '\"' )
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:25: 'label' '=' '\"' ident ( ident )* '\"'
					{
					match(input,30,FOLLOW_30_in_header102); 
					match(input,17,FOLLOW_17_in_header104); 
					match(input,7,FOLLOW_7_in_header106); 
					pushFollow(FOLLOW_ident_in_header108);
					ident();
					state._fsp--;

					PtGen.pt(1);
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:62: ( ident )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:30:63: ident
							{
							pushFollow(FOLLOW_ident_in_header113);
							ident();
							state._fsp--;

							PtGen.pt(2);
							}
							break;

						default :
							break loop2;
						}
					}

					match(input,7,FOLLOW_7_in_header120); 
					}

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,21,FOLLOW_21_in_header125); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "header"



	// $ANTLR start "object"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:1: object : ( interfaceStruct | classStruct | enumStruct | alignStruct ) ;
	public final void object() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:7: ( ( interfaceStruct | classStruct | enumStruct | alignStruct ) )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:9: ( interfaceStruct | classStruct | enumStruct | alignStruct )
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:9: ( interfaceStruct | classStruct | enumStruct | alignStruct )
			int alt4=4;
			switch ( input.LA(1) ) {
			case 29:
				{
				alt4=1;
				}
				break;
			case 23:
			case 26:
				{
				alt4=2;
				}
				break;
			case 27:
				{
				alt4=3;
				}
				break;
			case 24:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:10: interfaceStruct
					{
					pushFollow(FOLLOW_interfaceStruct_in_object134);
					interfaceStruct();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:26: classStruct
					{
					pushFollow(FOLLOW_classStruct_in_object136);
					classStruct();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:38: enumStruct
					{
					pushFollow(FOLLOW_enumStruct_in_object138);
					enumStruct();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:33:49: alignStruct
					{
					pushFollow(FOLLOW_alignStruct_in_object140);
					alignStruct();
					state._fsp--;

					}
					break;

			}

			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "object"



	// $ANTLR start "interfaceStruct"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:1: interfaceStruct : 'interface' ident '{' ( varfunc )* '}' ;
	public final void interfaceStruct() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:16: ( 'interface' ident '{' ( varfunc )* '}' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:18: 'interface' ident '{' ( varfunc )* '}'
			{
			match(input,29,FOLLOW_29_in_interfaceStruct149); 
			pushFollow(FOLLOW_ident_in_interfaceStruct151);
			ident();
			state._fsp--;

			PtGen.pt(10);
			match(input,37,FOLLOW_37_in_interfaceStruct155); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:56: ( varfunc )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 31 && LA5_0 <= 33)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:35:57: varfunc
					{
					pushFollow(FOLLOW_varfunc_in_interfaceStruct158);
					varfunc();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,38,FOLLOW_38_in_interfaceStruct162); 
			PtGen.pt(14);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interfaceStruct"



	// $ANTLR start "classStruct"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:1: classStruct : ( ( 'abstract' 'class' ident ) | 'class' ident ) '{' ( varfunc )* '}' ;
	public final void classStruct() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:12: ( ( ( 'abstract' 'class' ident ) | 'class' ident ) '{' ( varfunc )* '}' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:18: ( ( 'abstract' 'class' ident ) | 'class' ident ) '{' ( varfunc )* '}'
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:18: ( ( 'abstract' 'class' ident ) | 'class' ident )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==23) ) {
				alt6=1;
			}
			else if ( (LA6_0==26) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:19: ( 'abstract' 'class' ident )
					{
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:19: ( 'abstract' 'class' ident )
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:36:20: 'abstract' 'class' ident
					{
					match(input,23,FOLLOW_23_in_classStruct177); 
					match(input,26,FOLLOW_26_in_classStruct179); 
					pushFollow(FOLLOW_ident_in_classStruct181);
					ident();
					state._fsp--;

					PtGen.pt(11);
					}

					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:37:20: 'class' ident
					{
					match(input,26,FOLLOW_26_in_classStruct205); 
					pushFollow(FOLLOW_ident_in_classStruct207);
					ident();
					state._fsp--;

					PtGen.pt(12);
					}
					break;

			}

			match(input,37,FOLLOW_37_in_classStruct229); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:38:22: ( varfunc )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 31 && LA7_0 <= 33)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:38:23: varfunc
					{
					pushFollow(FOLLOW_varfunc_in_classStruct232);
					varfunc();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,38,FOLLOW_38_in_classStruct236); 
			PtGen.pt(14);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classStruct"



	// $ANTLR start "enumStruct"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:39:1: enumStruct : 'enumeration' ident '{' ( ident )* '}' ;
	public final void enumStruct() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:39:11: ( 'enumeration' ident '{' ( ident )* '}' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:39:18: 'enumeration' ident '{' ( ident )* '}'
			{
			match(input,27,FOLLOW_27_in_enumStruct250); 
			pushFollow(FOLLOW_ident_in_enumStruct252);
			ident();
			state._fsp--;

			PtGen.pt(13);
			match(input,37,FOLLOW_37_in_enumStruct256); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:39:58: ( ident )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:39:59: ident
					{
					pushFollow(FOLLOW_ident_in_enumStruct259);
					ident();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,38,FOLLOW_38_in_enumStruct263); 
			PtGen.pt(14);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "enumStruct"



	// $ANTLR start "alignStruct"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:40:1: alignStruct : 'align' '{' ( ident )* '}' ;
	public final void alignStruct() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:40:12: ( 'align' '{' ( ident )* '}' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:40:18: 'align' '{' ( ident )* '}'
			{
			match(input,24,FOLLOW_24_in_alignStruct276); 
			match(input,37,FOLLOW_37_in_alignStruct278); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:40:30: ( ident )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ID) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:40:31: ident
					{
					pushFollow(FOLLOW_ident_in_alignStruct281);
					ident();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			match(input,38,FOLLOW_38_in_alignStruct285); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alignStruct"



	// $ANTLR start "varfunc"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:1: varfunc : visibility ident ( function )? ( ':' ident )? ;
	public final void varfunc() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:8: ( visibility ident ( function )? ( ':' ident )? )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:10: visibility ident ( function )? ( ':' ident )?
			{
			pushFollow(FOLLOW_visibility_in_varfunc293);
			visibility();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_varfunc295);
			ident();
			state._fsp--;

			PtGen.pt(24);
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:43: ( function )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==8) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:45: function
					{
					pushFollow(FOLLOW_function_in_varfunc301);
					function();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:57: ( ':' ident )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==14) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:42:58: ':' ident
					{
					match(input,14,FOLLOW_14_in_varfunc307); 
					pushFollow(FOLLOW_ident_in_varfunc309);
					ident();
					state._fsp--;

					PtGen.pt(23);
					}
					break;

			}

			PtGen.pt(30);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varfunc"



	// $ANTLR start "function"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:1: function : '(' ( ident ':' ident ( ',' ident ':' ident )* )? ')' ;
	public final void function() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:9: ( '(' ( ident ':' ident ( ',' ident ':' ident )* )? ')' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:11: '(' ( ident ':' ident ( ',' ident ':' ident )* )? ')'
			{
			match(input,8,FOLLOW_8_in_function321); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:15: ( ident ':' ident ( ',' ident ':' ident )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:17: ident ':' ident ( ',' ident ':' ident )*
					{
					pushFollow(FOLLOW_ident_in_function325);
					ident();
					state._fsp--;

					PtGen.pt(25);
					match(input,14,FOLLOW_14_in_function328); 
					pushFollow(FOLLOW_ident_in_function330);
					ident();
					state._fsp--;

					PtGen.pt(26);
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:64: ( ',' ident ':' ident )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==11) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:43:65: ',' ident ':' ident
							{
							match(input,11,FOLLOW_11_in_function335); 
							pushFollow(FOLLOW_ident_in_function337);
							ident();
							state._fsp--;

							PtGen.pt(25);
							match(input,14,FOLLOW_14_in_function340); 
							pushFollow(FOLLOW_ident_in_function342);
							ident();
							state._fsp--;

							PtGen.pt(27);
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,9,FOLLOW_9_in_function351); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "visibility"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:1: visibility : ( 'private' | 'public' | 'protected' ) ;
	public final void visibility() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:11: ( ( 'private' | 'public' | 'protected' ) )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:13: ( 'private' | 'public' | 'protected' )
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:13: ( 'private' | 'public' | 'protected' )
			int alt14=3;
			switch ( input.LA(1) ) {
			case 31:
				{
				alt14=1;
				}
				break;
			case 33:
				{
				alt14=2;
				}
				break;
			case 32:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:14: 'private'
					{
					match(input,31,FOLLOW_31_in_visibility359); 
					PtGen.pt(20);
					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:42: 'public'
					{
					match(input,33,FOLLOW_33_in_visibility365); 
					PtGen.pt(21);
					}
					break;
				case 3 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:45:69: 'protected'
					{
					match(input,32,FOLLOW_32_in_visibility371); 
					PtGen.pt(22);
					}
					break;

			}

			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "visibility"



	// $ANTLR start "associations"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:1: associations : ident ( card1 )? relation ( card2 )? ident ( 'with' ident )? ( ':' ident )? ( ';' )? ;
	public final void associations() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:13: ( ident ( card1 )? relation ( card2 )? ident ( 'with' ident )? ( ':' ident )? ( ';' )? )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:15: ident ( card1 )? relation ( card2 )? ident ( 'with' ident )? ( ':' ident )? ( ';' )?
			{
			pushFollow(FOLLOW_ident_in_associations383);
			ident();
			state._fsp--;

			PtGen.pt(44);
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:37: ( card1 )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==7) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:38: card1
					{
					pushFollow(FOLLOW_card1_in_associations388);
					card1();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_relation_in_associations392);
			relation();
			state._fsp--;

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:55: ( card2 )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==7) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:56: card2
					{
					pushFollow(FOLLOW_card2_in_associations395);
					card2();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_ident_in_associations399);
			ident();
			state._fsp--;

			PtGen.pt(45);
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:86: ( 'with' ident )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==35) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:87: 'with' ident
					{
					match(input,35,FOLLOW_35_in_associations404); 
					pushFollow(FOLLOW_ident_in_associations406);
					ident();
					state._fsp--;

					PtGen.pt(54);
					}
					break;

			}

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:118: ( ':' ident )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==14) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:119: ':' ident
					{
					match(input,14,FOLLOW_14_in_associations413); 
					pushFollow(FOLLOW_ident_in_associations415);
					ident();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:131: ( ';' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==15) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:48:132: ';'
					{
					match(input,15,FOLLOW_15_in_associations420); 
					}
					break;

			}

			PtGen.pt(60);
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "associations"



	// $ANTLR start "card1"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:1: card1 : '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"' ;
	public final void card1() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:6: ( '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:8: '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"'
			{
			match(input,7,FOLLOW_7_in_card1432); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:12: ( '*' | nbentier ( '..' ( '*' | nbentier ) )? )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==10) ) {
				alt22=1;
			}
			else if ( (LA22_0==INT) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:13: '*'
					{
					match(input,10,FOLLOW_10_in_card1435); 
					PtGen.pt(50);
					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:36: nbentier ( '..' ( '*' | nbentier ) )?
					{
					pushFollow(FOLLOW_nbentier_in_card1442);
					nbentier();
					state._fsp--;

					PtGen.pt(51);
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:61: ( '..' ( '*' | nbentier ) )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==13) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:62: '..' ( '*' | nbentier )
							{
							match(input,13,FOLLOW_13_in_card1447); 
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:67: ( '*' | nbentier )
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==10) ) {
								alt20=1;
							}
							else if ( (LA20_0==INT) ) {
								alt20=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 20, 0, input);
								throw nvae;
							}

							switch (alt20) {
								case 1 :
									// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:68: '*'
									{
									match(input,10,FOLLOW_10_in_card1450); 
									PtGen.pt(50);
									}
									break;
								case 2 :
									// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:50:90: nbentier
									{
									pushFollow(FOLLOW_nbentier_in_card1456);
									nbentier();
									state._fsp--;

									PtGen.pt(51);
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			match(input,7,FOLLOW_7_in_card1466); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "card1"



	// $ANTLR start "card2"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:1: card2 : '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"' ;
	public final void card2() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:6: ( '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"' )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:8: '\"' ( '*' | nbentier ( '..' ( '*' | nbentier ) )? ) '\"'
			{
			match(input,7,FOLLOW_7_in_card2473); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:12: ( '*' | nbentier ( '..' ( '*' | nbentier ) )? )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==10) ) {
				alt25=1;
			}
			else if ( (LA25_0==INT) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:13: '*'
					{
					match(input,10,FOLLOW_10_in_card2476); 
					PtGen.pt(52);
					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:36: nbentier ( '..' ( '*' | nbentier ) )?
					{
					pushFollow(FOLLOW_nbentier_in_card2483);
					nbentier();
					state._fsp--;

					PtGen.pt(53);
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:61: ( '..' ( '*' | nbentier ) )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==13) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:62: '..' ( '*' | nbentier )
							{
							match(input,13,FOLLOW_13_in_card2488); 
							// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:67: ( '*' | nbentier )
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==10) ) {
								alt23=1;
							}
							else if ( (LA23_0==INT) ) {
								alt23=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}

							switch (alt23) {
								case 1 :
									// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:68: '*'
									{
									match(input,10,FOLLOW_10_in_card2491); 
									PtGen.pt(52);
									}
									break;
								case 2 :
									// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:51:90: nbentier
									{
									pushFollow(FOLLOW_nbentier_in_card2497);
									nbentier();
									state._fsp--;

									PtGen.pt(53);
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			match(input,7,FOLLOW_7_in_card2507); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "card2"



	// $ANTLR start "relation"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:1: relation : ( '<' )? ( 'x' )? '-' ( 'r' | 'c' | 'g' | 'a' )? '-' ( 'x' )? ( '>' )? ;
	public final void relation() throws RecognitionException {
		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:9: ( ( '<' )? ( 'x' )? '-' ( 'r' | 'c' | 'g' | 'a' )? '-' ( 'x' )? ( '>' )? )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:12: ( '<' )? ( 'x' )? '-' ( 'r' | 'c' | 'g' | 'a' )? '-' ( 'x' )? ( '>' )?
			{
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:12: ( '<' )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==16) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:13: '<'
					{
					match(input,16,FOLLOW_16_in_relation516); 
					}
					break;

			}

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:19: ( 'x' )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==36) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:20: 'x'
					{
					match(input,36,FOLLOW_36_in_relation521); 
					PtGen.pt(46);
					}
					break;

			}

			match(input,12,FOLLOW_12_in_relation528); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:47: ( 'r' | 'c' | 'g' | 'a' )?
			int alt28=5;
			switch ( input.LA(1) ) {
				case 34:
					{
					alt28=1;
					}
					break;
				case 25:
					{
					alt28=2;
					}
					break;
				case 28:
					{
					alt28=3;
					}
					break;
				case 22:
					{
					alt28=4;
					}
					break;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:48: 'r'
					{
					match(input,34,FOLLOW_34_in_relation531); 
					PtGen.pt(40);
					}
					break;
				case 2 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:69: 'c'
					{
					match(input,25,FOLLOW_25_in_relation536); 
					PtGen.pt(41);
					}
					break;
				case 3 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:90: 'g'
					{
					match(input,28,FOLLOW_28_in_relation541); 
					PtGen.pt(42);
					}
					break;
				case 4 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:111: 'a'
					{
					match(input,22,FOLLOW_22_in_relation546); 
					PtGen.pt(43);
					}
					break;

			}

			match(input,12,FOLLOW_12_in_relation551); 
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:136: ( 'x' )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==36) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:137: 'x'
					{
					match(input,36,FOLLOW_36_in_relation554); 
					PtGen.pt(47);
					}
					break;

			}

			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:159: ( '>' )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==18) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:52:160: '>'
					{
					match(input,18,FOLLOW_18_in_relation561); 
					}
					break;

			}

			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "nbentier"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:56:1: nbentier : INT ;
	public final void nbentier() throws RecognitionException {
		Token INT1=null;

		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:56:11: ( INT )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:56:15: INT
			{
			INT1=(Token)match(input,INT,FOLLOW_INT_in_nbentier577); 
			 PtGen.valEnt = Integer.parseInt((INT1!=null?INT1.getText():null));
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nbentier"



	// $ANTLR start "ident"
	// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:57:1: ident : ID ;
	public final void ident() throws RecognitionException {
		Token ID2=null;

		try {
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:57:7: ( ID )
			// C:\\Users\\lodla\\Documents\\Cours\\L3\\Semestre6\\BMO\\DotUmlVersJava\\src\\DotUml.g:57:9: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_ident586); 
			 PtGen.ident = (ID2!=null?ID2.getText():null); 
			}

		}

		catch (RecognitionException e) {reportError (e) ; throw e ; }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ident"

	// Delegated rules



	public static final BitSet FOLLOW_19_in_unite49 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_header_in_unite57 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_unite63 = new BitSet(new long[]{0x000000402D800010L});
	public static final BitSet FOLLOW_object_in_unite66 = new BitSet(new long[]{0x000000402D800010L});
	public static final BitSet FOLLOW_associations_in_unite70 = new BitSet(new long[]{0x000000402D800010L});
	public static final BitSet FOLLOW_38_in_unite74 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_unite80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_header94 = new BitSet(new long[]{0x0000000040220010L});
	public static final BitSet FOLLOW_ident_in_header97 = new BitSet(new long[]{0x0000000040220010L});
	public static final BitSet FOLLOW_17_in_header99 = new BitSet(new long[]{0x0000000040220010L});
	public static final BitSet FOLLOW_30_in_header102 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_header104 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_header106 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_header108 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_ident_in_header113 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_7_in_header120 = new BitSet(new long[]{0x0000000040220010L});
	public static final BitSet FOLLOW_21_in_header125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceStruct_in_object134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStruct_in_object136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumStruct_in_object138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alignStruct_in_object140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_interfaceStruct149 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_interfaceStruct151 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_interfaceStruct155 = new BitSet(new long[]{0x0000004380000000L});
	public static final BitSet FOLLOW_varfunc_in_interfaceStruct158 = new BitSet(new long[]{0x0000004380000000L});
	public static final BitSet FOLLOW_38_in_interfaceStruct162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_classStruct177 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_classStruct179 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_classStruct181 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_26_in_classStruct205 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_classStruct207 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_classStruct229 = new BitSet(new long[]{0x0000004380000000L});
	public static final BitSet FOLLOW_varfunc_in_classStruct232 = new BitSet(new long[]{0x0000004380000000L});
	public static final BitSet FOLLOW_38_in_classStruct236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_enumStruct250 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_enumStruct252 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_enumStruct256 = new BitSet(new long[]{0x0000004000000010L});
	public static final BitSet FOLLOW_ident_in_enumStruct259 = new BitSet(new long[]{0x0000004000000010L});
	public static final BitSet FOLLOW_38_in_enumStruct263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_alignStruct276 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_alignStruct278 = new BitSet(new long[]{0x0000004000000010L});
	public static final BitSet FOLLOW_ident_in_alignStruct281 = new BitSet(new long[]{0x0000004000000010L});
	public static final BitSet FOLLOW_38_in_alignStruct285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibility_in_varfunc293 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_varfunc295 = new BitSet(new long[]{0x0000000000004102L});
	public static final BitSet FOLLOW_function_in_varfunc301 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_varfunc307 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_varfunc309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_function321 = new BitSet(new long[]{0x0000000000000210L});
	public static final BitSet FOLLOW_ident_in_function325 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_function328 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_function330 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_11_in_function335 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_function337 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_function340 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_function342 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_9_in_function351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_visibility359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_visibility365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_visibility371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_associations383 = new BitSet(new long[]{0x0000001000011080L});
	public static final BitSet FOLLOW_card1_in_associations388 = new BitSet(new long[]{0x0000001000011000L});
	public static final BitSet FOLLOW_relation_in_associations392 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_card2_in_associations395 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_associations399 = new BitSet(new long[]{0x000000080000C002L});
	public static final BitSet FOLLOW_35_in_associations404 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_associations406 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_14_in_associations413 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ident_in_associations415 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_associations420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_card1432 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_card1435 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_nbentier_in_card1442 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_13_in_card1447 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_card1450 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_nbentier_in_card1456 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_card1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_card2473 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_card2476 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_nbentier_in_card2483 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_13_in_card2488 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_card2491 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_nbentier_in_card2497 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_card2507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_relation516 = new BitSet(new long[]{0x0000001000001000L});
	public static final BitSet FOLLOW_36_in_relation521 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_relation528 = new BitSet(new long[]{0x0000000412401000L});
	public static final BitSet FOLLOW_34_in_relation531 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_25_in_relation536 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_28_in_relation541 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_22_in_relation546 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_relation551 = new BitSet(new long[]{0x0000001000040002L});
	public static final BitSet FOLLOW_36_in_relation554 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_relation561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_nbentier577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident586 = new BitSet(new long[]{0x0000000000000002L});
}
