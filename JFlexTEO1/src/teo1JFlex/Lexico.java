package teo1JFlex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.Symbol;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexico.flex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

	  /** This character denotes the end of file */
	  public static final int YYEOF = -1;

	  /** initial size of the lookahead buffer */
	  private static final int ZZ_BUFFERSIZE = 16384;

	  /** lexical states */
	  public static final int YYINITIAL = 0;

	  /**
	   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
	   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
	   *                  at the beginning of a line
	   * l is of the form l = 2*k, k a non negative integer
	   */
	  private static final int ZZ_LEXSTATE[] = { 
	     0, 0
	  };

	  /** 
	   * Translates characters to character classes
	   */
	  private static final String ZZ_CMAP_PACKED = 
	    "\11\0\1\26\1\30\1\0\1\26\1\30\22\0\1\26\1\3\1\27"+
	    "\1\0\1\33\1\4\1\1\1\0\1\14\1\15\1\12\1\10\1\22"+
	    "\1\11\1\31\1\13\12\25\1\0\1\23\1\7\1\6\1\5\1\0"+
	    "\1\0\1\63\1\66\1\61\1\72\1\45\1\51\1\101\1\42\1\43"+
	    "\1\24\1\67\1\44\1\102\1\77\1\52\1\100\1\24\1\53\1\55"+
	    "\1\60\1\73\1\75\1\41\3\24\1\20\1\0\1\21\1\0\1\32"+
	    "\1\0\1\62\1\64\1\57\1\70\1\40\1\46\1\104\1\35\1\36"+
	    "\1\24\1\65\1\37\1\24\1\76\1\47\1\103\1\24\1\50\1\54"+
	    "\1\56\1\71\1\74\1\34\3\24\1\16\1\2\1\17\1\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

	  /** 
	   * Translates characters to character classes
	   */
	  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	  /** 
	   * Translates DFA states to action switch labels.
	   */
	  private static final int [] ZZ_ACTION = zzUnpackAction();

	  private static final String ZZ_ACTION_PACKED_0 =
	    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
	    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
	    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\3"+
	    "\3\1\22\24\1\26\1\27\1\30\1\31\1\32\2\0"+
	    "\1\33\1\0\1\34\1\35\1\0\1\36\32\0\1\37"+
	    "\1\0\1\40\2\0\1\40\1\0\1\41\20\0\1\42"+
	    "\1\43\1\0\1\44\2\0\1\44\7\0\1\45\1\46"+
	    "\7\0\1\47\4\0\1\50\4\0\1\51\5\0\1\52"+
	    "\2\0\1\53\1\54\1\0\1\55\4\0\1\56\1\57"+
	    "\1\0\1\60";

	  private static int [] zzUnpackAction() {
	    int [] result = new int[162];
	    int offset = 0;
	    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
	    return result;
	  }

	  private static int zzUnpackAction(String packed, int offset, int [] result) {
	    int i = 0;       /* index in packed string  */
	    int j = offset;  /* index in unpacked array */
	    int l = packed.length();
	    while (i < l) {
	      int count = packed.charAt(i++);
	      int value = packed.charAt(i++);
	      do result[j++] = value; while (--count > 0);
	    }
	    return j;
	  }


	  /** 
	   * Translates a state to a row index in the transition table
	   */
	  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

	  private static final String ZZ_ROWMAP_PACKED_0 =
	    "\0\0\0\105\0\105\0\212\0\317\0\105\0\u0114\0\u0159"+
	    "\0\u019e\0\105\0\u01e3\0\105\0\u0228\0\105\0\105\0\105"+
	    "\0\105\0\105\0\105\0\105\0\105\0\105\0\u026d\0\105"+
	    "\0\u02b2\0\u02f7\0\u033c\0\u0381\0\u03c6\0\u040b\0\u0450\0\u0495"+
	    "\0\u04da\0\u051f\0\u0564\0\u05a9\0\u05ee\0\u0633\0\u0678\0\u06bd"+
	    "\0\u0702\0\u0747\0\u078c\0\u07d1\0\u0816\0\105\0\105\0\105"+
	    "\0\105\0\105\0\u02f7\0\u085b\0\u02f7\0\u02b2\0\105\0\u08a0"+
	    "\0\u08e5\0\105\0\u092a\0\u096f\0\u09b4\0\u09f9\0\u0a3e\0\u0a83"+
	    "\0\u0ac8\0\u0b0d\0\u0b52\0\u0b97\0\u0bdc\0\u0c21\0\u0c66\0\u0cab"+
	    "\0\u0cf0\0\u0d35\0\u0d7a\0\u0dbf\0\u0e04\0\u0e49\0\u0e8e\0\u0ed3"+
	    "\0\u0f18\0\u0f5d\0\u0fa2\0\u0fe7\0\105\0\u102c\0\u1071\0\u10b6"+
	    "\0\u10fb\0\u1140\0\u1185\0\105\0\u11ca\0\u120f\0\u1254\0\u1299"+
	    "\0\u12de\0\u1323\0\u1368\0\u13ad\0\u13f2\0\u1437\0\u147c\0\u14c1"+
	    "\0\u1506\0\u154b\0\u1590\0\u15d5\0\105\0\105\0\u161a\0\u165f"+
	    "\0\u16a4\0\u16e9\0\u172e\0\u1773\0\u17b8\0\u17fd\0\u1842\0\u1887"+
	    "\0\u18cc\0\u1911\0\105\0\105\0\u1956\0\u199b\0\u19e0\0\u1a25"+
	    "\0\u1a6a\0\u1aaf\0\u1af4\0\105\0\u1b39\0\u1b7e\0\u1bc3\0\u1c08"+
	    "\0\105\0\u1c4d\0\u1c92\0\u1cd7\0\u1d1c\0\105\0\u1d61\0\u1da6"+
	    "\0\u1deb\0\u1e30\0\u1e75\0\105\0\u1eba\0\u1eff\0\105\0\105"+
	    "\0\u1f44\0\105\0\u1f89\0\u1fce\0\u2013\0\u2058\0\105\0\105"+
	    "\0\u209d\0\105";

	  private static int [] zzUnpackRowMap() {
	    int [] result = new int[162];
	    int offset = 0;
	    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
	    return result;
	  }

	  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
	    int i = 0;  /* index in packed string  */
	    int j = offset;  /* index in unpacked array */
	    int l = packed.length();
	    while (i < l) {
	      int high = packed.charAt(i++) << 16;
	      result[j++] = high | packed.charAt(i++);
	    }
	    return j;
	  }

	  /** 
	   * The transition table of the DFA
	   */
	  private static final int [] ZZ_TRANS = zzUnpackTrans();

	  private static final String ZZ_TRANS_PACKED_0 =
	    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
	    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
	    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
	    "\1\30\1\32\1\33\1\2\1\34\1\26\1\35\1\26"+
	    "\1\36\1\37\1\26\1\40\1\26\1\41\1\42\2\26"+
	    "\1\43\2\26\1\44\1\45\1\26\1\46\1\26\1\47"+
	    "\2\26\1\50\1\26\1\51\1\26\1\52\1\26\1\53"+
	    "\5\26\1\54\2\26\1\55\1\26\107\0\1\56\105\0"+
	    "\1\57\107\0\1\60\104\0\1\61\104\0\1\62\123\0"+
	    "\1\27\3\0\1\63\106\0\1\64\76\0\1\27\3\0"+
	    "\1\65\53\0\27\66\1\67\1\0\54\66\25\0\1\65"+
	    "\103\0\1\70\7\0\51\70\35\0\1\71\115\0\1\72"+
	    "\27\0\1\73\45\0\1\74\36\0\1\75\50\0\1\76"+
	    "\110\0\1\72\2\0\1\72\25\0\1\77\51\0\1\100"+
	    "\32\0\1\101\44\0\1\102\7\0\1\103\101\0\1\104"+
	    "\5\0\1\105\66\0\1\106\21\0\1\107\67\0\1\110"+
	    "\16\0\1\111\106\0\1\112\105\0\1\113\71\0\1\114"+
	    "\107\0\1\115\71\0\1\116\111\0\1\117\112\0\1\120"+
	    "\17\0\1\121\102\0\1\122\13\0\33\64\1\123\51\64"+
	    "\24\0\2\70\6\0\51\70\36\0\1\124\124\0\1\125"+
	    "\102\0\1\126\120\0\1\127\57\0\1\130\121\0\1\125"+
	    "\101\0\1\131\121\0\1\132\61\0\1\133\105\0\1\134"+
	    "\106\0\1\135\105\0\1\134\67\0\1\136\116\0\1\137"+
	    "\77\0\1\140\114\0\1\141\105\0\1\142\21\0\1\143"+
	    "\63\0\1\144\21\0\1\145\45\0\1\146\111\0\1\147"+
	    "\105\0\1\150\10\0\1\151\76\0\1\152\7\0\1\153"+
	    "\75\0\1\154\112\0\1\155\102\0\1\155\26\0\13\64"+
	    "\1\156\17\64\1\123\51\64\37\0\1\157\105\0\1\160"+
	    "\134\0\1\161\60\0\1\162\105\0\1\163\104\0\1\164"+
	    "\121\0\1\165\105\0\1\166\77\0\1\167\64\0\1\170"+
	    "\126\0\1\171\67\0\1\172\101\0\1\173\122\0\1\174"+
	    "\73\0\1\173\117\0\1\174\106\0\1\175\105\0\1\176"+
	    "\103\0\1\177\116\0\1\200\73\0\1\201\116\0\1\202"+
	    "\110\0\1\203\43\0\1\204\102\0\1\205\106\0\1\206"+
	    "\111\0\1\204\102\0\1\207\122\0\1\210\101\0\1\211"+
	    "\106\0\1\211\103\0\1\212\123\0\1\213\67\0\1\214"+
	    "\122\0\1\215\72\0\1\216\106\0\1\216\106\0\1\217"+
	    "\75\0\1\220\115\0\1\221\74\0\1\222\74\0\1\223"+
	    "\77\0\1\224\115\0\1\225\76\0\1\224\130\0\1\226"+
	    "\44\0\1\227\153\0\1\230\42\0\1\227\143\0\1\230"+
	    "\42\0\1\231\115\0\1\232\100\0\1\233\113\0\1\232"+
	    "\114\0\1\234\115\0\1\235\73\0\1\236\77\0\1\237"+
	    "\106\0\1\237\126\0\1\240\64\0\1\241\75\0\1\242"+
	    "\101\0\1\242\34\0";

	  private static int [] zzUnpackTrans() {
	    int [] result = new int[8418];
	    int offset = 0;
	    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
	    return result;
	  }

	  private static int zzUnpackTrans(String packed, int offset, int [] result) {
	    int i = 0;       /* index in packed string  */
	    int j = offset;  /* index in unpacked array */
	    int l = packed.length();
	    while (i < l) {
	      int count = packed.charAt(i++);
	      int value = packed.charAt(i++);
	      value--;
	      do result[j++] = value; while (--count > 0);
	    }
	    return j;
	  }


	  /* error codes */
	  private static final int ZZ_UNKNOWN_ERROR = 0;
	  private static final int ZZ_NO_MATCH = 1;
	  private static final int ZZ_PUSHBACK_2BIG = 2;

	  /* error messages for the codes above */
	  private static final String ZZ_ERROR_MSG[] = {
	    "Unknown internal scanner error",
	    "Error: could not match input",
	    "Error: pushback value was too large"
	  };

	  /**
	   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	   */
	  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

	  private static final String ZZ_ATTRIBUTE_PACKED_0 =
	    "\1\0\2\11\2\1\1\11\3\1\1\11\1\1\1\11"+
	    "\1\1\11\11\1\1\1\11\25\1\5\11\2\0\1\1"+
	    "\1\0\1\11\1\1\1\0\1\11\32\0\1\11\1\0"+
	    "\1\1\2\0\1\1\1\0\1\11\20\0\2\11\1\0"+
	    "\1\1\2\0\1\1\7\0\2\11\7\0\1\11\4\0"+
	    "\1\11\4\0\1\11\5\0\1\11\2\0\2\11\1\0"+
	    "\1\11\4\0\2\11\1\0\1\11";

	  private static int [] zzUnpackAttribute() {
	    int [] result = new int[162];
	    int offset = 0;
	    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
	    return result;
	  }

	  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
	    int i = 0;       /* index in packed string  */
	    int j = offset;  /* index in unpacked array */
	    int l = packed.length();
	    while (i < l) {
	      int count = packed.charAt(i++);
	      int value = packed.charAt(i++);
	      do result[j++] = value; while (--count > 0);
	    }
	    return j;
	  }

	  /** the input device */
	  private java.io.Reader zzReader;

	  /** the current state of the DFA */
	  private int zzState;

	  /** the current lexical state */
	  private int zzLexicalState = YYINITIAL;

	  /** this buffer contains the current text to be matched and is
	      the source of the yytext() string */
	  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	  /** the textposition at the last accepting state */
	  private int zzMarkedPos;

	  /** the current text position in the buffer */
	  private int zzCurrentPos;

	  /** startRead marks the beginning of the yytext() string in the buffer */
	  private int zzStartRead;

	  /** endRead marks the last character in the buffer, that has been read
	      from input */
	  private int zzEndRead;

	  /** number of newlines encountered up to the start of the matched text */
	  private int yyline;

	  /** the number of characters up to the start of the matched text */
	  private int yychar;

	  /**
	   * the number of characters from the last newline up to the start of the 
	   * matched text
	   */
	  private int yycolumn;

	  /** 
	   * zzAtBOL == true iff the scanner is currently at the beginning of a line
	   */
	  private boolean zzAtBOL = true;

	  /** zzAtEOF == true iff the scanner is at the EOF */
	  private boolean zzAtEOF;

	  /** denotes if the user-EOF-code has already been executed */
	  private boolean zzEOFDone;
	  
	  /** 
	   * The number of occupied positions in zzBuffer beyond zzEndRead.
	   * When a lead/high surrogate has been read from the input stream
	   * into the final zzBuffer position, this will have a value of 1;
	   * otherwise, it will have a value of 0.
	   */
	  private int zzFinalHighSurrogate = 0;

	  /* user code: */
		BufferedWriter bw;
		File f;
		ArrayList<String> simbolsList;
		
		public void writeSymbolInTable(String s) throws IOException{
	        System.out.println(" S es: "+ s);
			if(!simbolsList.contains(s.split(",")[0])){
				bw.write(s);
				bw.newLine();
				bw.flush();
				simbolsList.add(s.split(",")[0]);
			}
		}
		
		public String s = "";
		final int MAX_STRING = 30;
		

		private boolean validate_string(String x) throws Exception {
			if (x.length() > MAX_STRING) {
				throw new Exception("La longitud del lexema "+x+" excede la esperada");
			}
			return true;
		}


	  /**
	   * Creates a new scanner
	   *
	   * @param   in  the java.io.Reader to read input from.
	   */
	  public Lexico(java.io.Reader in) {
	  	try{
			String dir = System.getProperty("user.dir");
			String path = dir + "/ts.txt";
			f = new File(path);
			bw = new BufferedWriter(new FileWriter(f,true));
			simbolsList = new ArrayList<>();
		}catch (IOException e){
			e.printStackTrace();
		}
	    this.zzReader = in;
	  }


	  /** 
	   * Unpacks the compressed character translation table.
	   *
	   * @param packed   the packed character translation table
	   * @return         the unpacked character translation table
	   */
	  private static char [] zzUnpackCMap(String packed) {
	    char [] map = new char[0x110000];
	    int i = 0;  /* index in packed string  */
	    int j = 0;  /* index in unpacked array */
	    while (i < 212) {
	      int  count = packed.charAt(i++);
	      char value = packed.charAt(i++);
	      do map[j++] = value; while (--count > 0);
	    }
	    return map;
	  }


	  /**
	   * Refills the input buffer.
	   *
	   * @return      <code>false</code>, iff there was new input.
	   * 
	   * @exception   java.io.IOException  if any I/O-Error occurs
	   */
	  private boolean zzRefill() throws java.io.IOException {

	    /* first: make room (if you can) */
	    if (zzStartRead > 0) {
	      zzEndRead += zzFinalHighSurrogate;
	      zzFinalHighSurrogate = 0;
	      System.arraycopy(zzBuffer, zzStartRead,
	                       zzBuffer, 0,
	                       zzEndRead-zzStartRead);

	      /* translate stored positions */
	      zzEndRead-= zzStartRead;
	      zzCurrentPos-= zzStartRead;
	      zzMarkedPos-= zzStartRead;
	      zzStartRead = 0;
	    }

	    /* is the buffer big enough? */
	    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
	      /* if not: blow it up */
	      char newBuffer[] = new char[zzBuffer.length*2];
	      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
	      zzBuffer = newBuffer;
	      zzEndRead += zzFinalHighSurrogate;
	      zzFinalHighSurrogate = 0;
	    }

	    /* fill the buffer with new input */
	    int requested = zzBuffer.length - zzEndRead;
	    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

	    /* not supposed to occur according to specification of java.io.Reader */
	    if (numRead == 0) {
	      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
	    }
	    if (numRead > 0) {
	      zzEndRead += numRead;
	      /* If numRead == requested, we might have requested to few chars to
	         encode a full Unicode character. We assume that a Reader would
	         otherwise never return half characters. */
	      if (numRead == requested) {
	        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
	          --zzEndRead;
	          zzFinalHighSurrogate = 1;
	        }
	      }
	      /* potentially more input available */
	      return false;
	    }

	    /* numRead < 0 ==> end of stream */
	    return true;
	  }

	    
	  /**
	   * Closes the input stream.
	   */
	  public final void yyclose() throws java.io.IOException {
	    zzAtEOF = true;            /* indicate end of file */
	    zzEndRead = zzStartRead;  /* invalidate buffer    */

	    if (zzReader != null)
	      zzReader.close();
	  }


	  /**
	   * Resets the scanner to read from a new input stream.
	   * Does not close the old reader.
	   *
	   * All internal variables are reset, the old input stream 
	   * <b>cannot</b> be reused (internal buffer is discarded and lost).
	   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
	   *
	   * Internal scan buffer is resized down to its initial length, if it has grown.
	   *
	   * @param reader   the new input stream 
	   */
	  public final void yyreset(java.io.Reader reader) {
	    zzReader = reader;
	    zzAtBOL  = true;
	    zzAtEOF  = false;
	    zzEOFDone = false;
	    zzEndRead = zzStartRead = 0;
	    zzCurrentPos = zzMarkedPos = 0;
	    zzFinalHighSurrogate = 0;
	    yyline = yychar = yycolumn = 0;
	    zzLexicalState = YYINITIAL;
	    if (zzBuffer.length > ZZ_BUFFERSIZE)
	      zzBuffer = new char[ZZ_BUFFERSIZE];
	  }


	  /**
	   * Returns the current lexical state.
	   */
	  public final int yystate() {
	    return zzLexicalState;
	  }


	  /**
	   * Enters a new lexical state
	   *
	   * @param newState the new lexical state
	   */
	  public final void yybegin(int newState) {
	    zzLexicalState = newState;
	  }


	  /**
	   * Returns the text matched by the current regular expression.
	   */
	  public final String yytext() {
	    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
	  }


	  /**
	   * Returns the character at position <tt>pos</tt> from the 
	   * matched text. 
	   * 
	   * It is equivalent to yytext().charAt(pos), but faster
	   *
	   * @param pos the position of the character to fetch. 
	   *            A value from 0 to yylength()-1.
	   *
	   * @return the character at position pos
	   */
	  public final char yycharat(int pos) {
	    return zzBuffer[zzStartRead+pos];
	  }


	  /**
	   * Returns the length of the matched text region.
	   */
	  public final int yylength() {
	    return zzMarkedPos-zzStartRead;
	  }


	  /**
	   * Reports an error that occured while scanning.
	   *
	   * In a wellformed scanner (no or only correct usage of 
	   * yypushback(int) and a match-all fallback rule) this method 
	   * will only be called with things that "Can't Possibly Happen".
	   * If this method is called, something is seriously wrong
	   * (e.g. a JFlex bug producing a faulty scanner etc.).
	   *
	   * Usual syntax/scanner level error handling should be done
	   * in error fallback rules.
	   *
	   * @param   errorCode  the code of the errormessage to display
	   */
	  private void zzScanError(int errorCode) {
	    String message;
	    try {
	      message = ZZ_ERROR_MSG[errorCode];
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
	      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
	    }

	    throw new Error(message);
	  } 


	  /**
	   * Pushes the specified amount of characters back into the input stream.
	   *
	   * They will be read again by then next call of the scanning method
	   *
	   * @param number  the number of characters to be read again.
	   *                This number must not be greater than yylength()!
	   */
	  public void yypushback(int number)  {
	    if ( number > yylength() )
	      zzScanError(ZZ_PUSHBACK_2BIG);

	    zzMarkedPos -= number;
	  }


	  /**
	   * Contains user EOF-code, which will be executed exactly once,
	   * when the end of file is reached
	   */
	  private void zzDoEOF() throws java.io.IOException {
	    if (!zzEOFDone) {
	      zzEOFDone = true;
	      yyclose();
	    }
	  }


	  /**
	   * Resumes scanning until the next regular expression is matched,
	   * the end of input is encountered or an I/O-Error occurs.
	   *
	   * @return      the next token
	 * @throws Exception 
	   */
	  public java_cup.runtime.Symbol next_token() throws Exception {
	    int zzInput;
	    int zzAction;

	    // cached fields:
	    int zzCurrentPosL;
	    int zzMarkedPosL;
	    int zzEndReadL = zzEndRead;
	    char [] zzBufferL = zzBuffer;
	    char [] zzCMapL = ZZ_CMAP;

	    int [] zzTransL = ZZ_TRANS;
	    int [] zzRowMapL = ZZ_ROWMAP;
	    int [] zzAttrL = ZZ_ATTRIBUTE;

	    while (true) {
	      zzMarkedPosL = zzMarkedPos;

	      yychar+= zzMarkedPosL-zzStartRead;

	      boolean zzR = false;
	      int zzCh;
	      int zzCharCount;
	      for (zzCurrentPosL = zzStartRead  ;
	           zzCurrentPosL < zzMarkedPosL ;
	           zzCurrentPosL += zzCharCount ) {
	        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
	        zzCharCount = Character.charCount(zzCh);
	        switch (zzCh) {
	        case '\u000B':  // fall through
	        case '\u000C':  // fall through
	        case '\u0085':  // fall through
	        case '\u2028':  // fall through
	        case '\u2029':
	          yyline++;
	          yycolumn = 0;
	          zzR = false;
	          break;
	        case '\r':
	          yyline++;
	          yycolumn = 0;
	          zzR = true;
	          break;
	        case '\n':
	          if (zzR)
	            zzR = false;
	          else {
	            yyline++;
	            yycolumn = 0;
	          }
	          break;
	        default:
	          zzR = false;
	          yycolumn += zzCharCount;
	        }
	      }

	      if (zzR) {
	        // peek one character ahead if it is \n (if we have counted one line too much)
	        boolean zzPeek;
	        if (zzMarkedPosL < zzEndReadL)
	          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
	        else if (zzAtEOF)
	          zzPeek = false;
	        else {
	          boolean eof = zzRefill();
	          zzEndReadL = zzEndRead;
	          zzMarkedPosL = zzMarkedPos;
	          zzBufferL = zzBuffer;
	          if (eof) 
	            zzPeek = false;
	          else 
	            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
	        }
	        if (zzPeek) yyline--;
	      }
	      zzAction = -1;

	      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
	  
	      zzState = ZZ_LEXSTATE[zzLexicalState];

	      // set up zzAction for empty match case:
	      int zzAttributes = zzAttrL[zzState];
	      if ( (zzAttributes & 1) == 1 ) {
	        zzAction = zzState;
	      }


	      zzForAction: {
	        while (true) {
	    
	          if (zzCurrentPosL < zzEndReadL) {
	            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
	            zzCurrentPosL += Character.charCount(zzInput);
	          }
	          else if (zzAtEOF) {
	            zzInput = YYEOF;
	            break zzForAction;
	          }
	          else {
	            // store back cached positions
	            zzCurrentPos  = zzCurrentPosL;
	            zzMarkedPos   = zzMarkedPosL;
	            boolean eof = zzRefill();
	            // get translated positions and possibly new buffer
	            zzCurrentPosL  = zzCurrentPos;
	            zzMarkedPosL   = zzMarkedPos;
	            zzBufferL      = zzBuffer;
	            zzEndReadL     = zzEndRead;
	            if (eof) {
	              zzInput = YYEOF;
	              break zzForAction;
	            }
	            else {
	              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
	              zzCurrentPosL += Character.charCount(zzInput);
	            }
	          }
	          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
	          if (zzNext == -1) break zzForAction;
	          zzState = zzNext;

	          zzAttributes = zzAttrL[zzState];
	          if ( (zzAttributes & 1) == 1 ) {
	            zzAction = zzState;
	            zzMarkedPosL = zzCurrentPosL;
	            if ( (zzAttributes & 8) == 8 ) break zzForAction;
	          }

	        }
	      }

	      // store back cached position
	      zzMarkedPos = zzMarkedPosL;

	      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
	        zzAtEOF = true;
	            zzDoEOF();
	          { return new java_cup.runtime.Symbol(sym.EOF); }
	      }
	      else {
	        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
	          case 1: 
	            { throw new Error("Caracter no permitido "+yytext()+" en la linea "+ yyline);
	            } 
	            // fall through
	          case 49: break;
	          case 2: 
	            { System.out.println("Token AND encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 50: break;
	          case 3: 
	            { System.out.println("Token ESPACIO encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 51: break;
	          case 4: 
	            { System.out.println("Token OPMOD encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 52: break;
	          case 5: 
	            { System.out.println("Token MAYOR_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 53: break;
	          case 6: 
	            { System.out.println("Token ASIGN encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 54: break;
	          case 7: 
	            { System.out.println("Token MENOR_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 55: break;
	          case 8: 
	            { System.out.println("Token OPSUMA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 56: break;
	          case 9: 
	            { System.out.println("Token OPRESTA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 57: break;
	          case 10: 
	            { System.out.println("Token OPMULTI encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 58: break;
	          case 11: 
	            { System.out.println("Token OPDIV encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 59: break;
	          case 12: 
	            { System.out.println("Token PAR_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 60: break;
	          case 13: 
	            { System.out.println("Token PAR_C encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 61: break;
	          case 14: 
	            { System.out.println("Token LLAVE_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 62: break;
	          case 15: 
	            { System.out.println("Token LLAVE_C encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 63: break;
	          case 16: 
	            { System.out.println("Token CORCH_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 64: break;
	          case 17: 
	            { System.out.println("Token CORCH_C encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 65: break;
	          case 18: 
	            { System.out.println("Token COMA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 66: break;
	          case 19: 
	            { System.out.println("Token PUNTOC encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 67: break;
	          case 20: 
	            { System.out.println("Token LETRA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 68: break;
	          case 21: 
	            { System.out.println("Token NUMENT encontrado, LEXEMA "+ yytext());
	        writeSymbolInTable("_"+yytext()+", NUMENT , _ , "+yytext()+" , _ ");
	            } 
	            // fall through
	          case 69: break;
	          case 22: 
	            { System.out.println("Token OR encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 70: break;
	          case 23: 
	            { System.out.println("Token NOT encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 71: break;
	          case 24: 
	            { System.out.println("Token MAYOR_I encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 72: break;
	          case 25: 
	            { System.out.println("Token IGUAL_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 73: break;
	          case 26: 
	            { System.out.println("Token MENOR_I encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 74: break;
	          case 27: 
	            { System.out.println("Token NUMREAL encontrado, LEXEMA "+ yytext());
	        writeSymbolInTable("_"+yytext()+", NUMREAL , _ , "+yytext()+" , _ ");
	            } 
	            // fall through
	          case 75: break;
	          case 28: 
	            { System.out.println("Token VALSTRING encontrado, LEXEMA "+ yytext());
	        validate_string(yytext());
	        writeSymbolInTable("_"+yytext()+ ", VALSTRING , _ ,"+yytext()+","+ yytext().length());
	            } 
	            // fall through
	          case 76: break;
	          case 29: 
	            { System.out.println("Token VARIABLE encontrado, LEXEMA "+ yytext());
	        writeSymbolInTable(yytext() + ",VARIABLE,,_,_");
	            } 
	            // fall through
	          case 77: break;
	          case 30: 
	            { System.out.println("Token _SI encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 78: break;
	          case 31: 
	            { System.out.println("Token ENT encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 79: break;
	          case 32: 
	            { System.out.println("Token END_PROGRAM encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 80: break;
	          case 33: 
	            { System.out.println("Token PARA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 81: break;
	          case 34: 
	            { System.out.println("Token PUT encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 82: break;
	          case 35: 
	            { System.out.println("Token COMENT_A encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 83: break;
	          case 36: 
	            { System.out.println("Token _SINO encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 84: break;
	          case 37: 
	            { System.out.println("Token _CASA encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 85: break;
	          case 38: 
	            { System.out.println("Token CANT encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 86: break;
	          case 39: 
	            { System.out.println("Token _MIENTRAS encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 87: break;
	          case 40: 
	            { System.out.println("Token FL encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 88: break;
	          case 41: 
	            { System.out.println("Token _ROMPER encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 89: break;
	          case 42: 
	            { System.out.println("Token _SINOSI encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 90: break;
	          case 43: 
	            { System.out.println("Token _SUICH encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 91: break;
	          case 44: 
	            { System.out.println("Token STRING encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 92: break;
	          case 45: 
	            { System.out.println("Token DECVAR encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 93: break;
	          case 46: 
	            { System.out.println("Token _DEBASE encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 94: break;
	          case 47: 
	            { System.out.println("Token PROGRAM encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 95: break;
	          case 48: 
	            { System.out.println("Token FINVAR encontrado, LEXEMA "+ yytext());
	            } 
	            // fall through
	          case 96: break;
	          default:
	            zzScanError(ZZ_NO_MATCH);
	        }
	      }
	    }
	  }


	}