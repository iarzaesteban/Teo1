import java_cup.runtime.Symbol;

%%

/*cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char

%init{
	try{
		String dir = System.getProperty("user.dir");
		String path = dir + "/ts.txt";
		f = new File(path);
		bw = new BufferedWriter(new FileWriter(f,true));
		simbolsList = new ArrayList<>();
	}catch (IOException e){
		e.printStackTrace();
	}
%init}


%{
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
	

	private boolean validate_string(String textString) throws Exception {
		if (textString.length() > MAX_STRING) {
			throw new Exception("La longitud del lexema "+textString+" excede la esperada");
		}
		return true;
	}
%}

AND = "&"
OR = "||"
NOT = "!!"
OPMOD = "%"
MAYOR_A = ">"
MAYOR_I = ">="
MENOR_A = "<"
MENOR_I = "<="
Distinto = "<>"
IGUAL_A = "=="
OPSUMA = "+"
OPRESTA = "-"
OPMULTI = "*"
OPDIV = "/"
PAR_A = "("
PAR_C = ")"
LLAVE_A = "{"
LLAVE_C = "}"
CORCH_A = "["
CORCH_C = "]"
COMA = ","
PUNTOC = ";"
ASIGN = "="

LETRA = [a-zA-Z]
DGT = [0-9]
ESPACIO = [\t | \f | " " | \r|\n]
VALSTRING = "\"" [^\"\n\r]* "\""
NUMENT = {DGT}+ | (- {DGT}+)
NUMREAL = ({DGT}"."{DGT}+) | ({DGT}+"."{DGT}*) | ({DGT}*"."{DGT}+) | (- {DGT}"."{DGT}+) | (- {DGT}+"."{DGT}*) | (- {DGT}*"."{DGT}+)
VARIABLE = "_"{LETRA} ({LETRA} | {DGT})* 
ESPECIAL = "!"|"#"|"$"|"%"|"&"|"'"|"("|")"|"*"|"+"|","|"-"|"."|"/"|":"|";"|"{"|"="|"}"|"?"|"@"|"["|"]"|"^"|"_"|"`"|"{"|"|"|"}"|"~"|"\""
COMENT_A = "/$"~"$/"

WHILE = while | WHILE
FOR = for | FOR
IF = if | IF | If
ELSE = else | ELSE
ELSEIF = elseif | ELSEIF
SWITCH = switch | SWITCH
CASE = case | CASE
BREAK = break | BREAK
DEFAULT = default | DEFAULT
DECVAR = decvar | DECVAR
ENDECVAR = enddecvar | ENDECVAR
PROGRAM = PROGRAM | PROGRAM
END = end | END
PUT = put | PUT
STRING = string | STRING
FLOAT = float | FLOAT
INT = int | INT
CANT = cant | CANT

%%

<YYINITIAL> {
    {COMENT_A}   {System.out.println("Token COMENT_A encontrado, LEXEMA "+ yytext());}
    {VARIABLE}   {
        System.out.println("Token VARIABLE encontrado, LEXEMA "+ yytext());
        writeSymbolInTable(yytext() + ",VARIABLE,,_,_");
    }
    {NUMENT} {
        System.out.println("Token NUMENT encontrado, LEXEMA "+ yytext());
        writeSymbolInTable("_"+yytext()+", NUMENT , _ , "+yytext()+" , _ ");
    }
    {NUMREAL}  {
        System.out.println("Token NUMREAL encontrado, LEXEMA "+ yytext());
        writeSymbolInTable("_"+yytext()+", NUMREAL , _ , "+yytext()+" , _ ");
    }   
    {LETRA}   {System.out.println("Token LETRA encontrado, LEXEMA "+ yytext());}
    {ESPACIO}   {System.out.println("Token ESPACIO encontrado, LEXEMA "+ yytext());}
    {IF} {System.out.println("Token _SI encontrado, LEXEMA "+ yytext());}
    {ELSE} {System.out.println("Token _SINO encontrado, LEXEMA "+ yytext());}
    {ELSEIF} {System.out.println("Token _SINOSI encontrado, LEXEMA "+ yytext());}
    {SWITCH} {System.out.println("Token _SUICH encontrado, LEXEMA "+ yytext());}
    {CASE} {System.out.println("Token _CASA encontrado, LEXEMA "+ yytext());}
    {BREAK} {System.out.println("Token _ROMPER encontrado, LEXEMA "+ yytext());}
    {DEFAULT} {System.out.println("Token _DEBASE encontrado, LEXEMA "+ yytext());}
    {WHILE} {System.out.println("Token _MIENTRAS encontrado, LEXEMA "+ yytext());}
    {FOR} {System.out.println("Token PARA encontrado, LEXEMA "+ yytext());}
    {DECVAR} {System.out.println("Token DECVAR encontrado, LEXEMA "+ yytext());}
    {ENDECVAR} {System.out.println("Token FINVAR encontrado, LEXEMA "+ yytext());}
    {PROGRAM} {System.out.println("Token PROGRAM encontrado, LEXEMA "+ yytext());}
    {END} {System.out.println("Token END_PROGRAM encontrado, LEXEMA "+ yytext());}
    {PUT} {System.out.println("Token PUT encontrado, LEXEMA "+ yytext());}
    {VALSTRING} {
        System.out.println("Token VALSTRING encontrado, LEXEMA "+ yytext());
        validate_string(yytext());
        writeSymbolInTable("_"+yytext()+ ", VALSTRING , _ ,"+yytext()+","+ yytext().length());
    }
    {STRING} {System.out.println("Token STRING encontrado, LEXEMA "+ yytext());}
    {FLOAT} {System.out.println("Token FL encontrado, LEXEMA "+ yytext());}
    {INT} {System.out.println("Token ENT encontrado, LEXEMA "+ yytext());}
    {CANT} {System.out.println("Token CANT encontrado, LEXEMA "+ yytext());}

    {OPSUMA} {System.out.println("Token OPSUMA encontrado, LEXEMA "+ yytext());}
    {OPRESTA} {System.out.println("Token OPRESTA encontrado, LEXEMA "+ yytext());}
    {OPMULTI} {System.out.println("Token OPMULTI encontrado, LEXEMA "+ yytext());}
    {OPDIV} {System.out.println("Token OPDIV encontrado, LEXEMA "+ yytext());}
    {COMA} {System.out.println("Token COMA encontrado, LEXEMA "+ yytext());}
    {PUNTOC} {System.out.println("Token PUNTOC encontrado, LEXEMA "+ yytext());}
    {OPMOD} {System.out.println("Token OPMOD encontrado, LEXEMA "+ yytext());}
    {PAR_A} {System.out.println("Token PAR_A encontrado, LEXEMA "+ yytext());}
    {PAR_C} {System.out.println("Token PAR_C encontrado, LEXEMA "+ yytext());}
    {LLAVE_A} {System.out.println("Token LLAVE_A encontrado, LEXEMA "+ yytext());}
    {LLAVE_C} {System.out.println("Token LLAVE_C encontrado, LEXEMA "+ yytext());}
    {CORCH_A} {System.out.println("Token CORCH_A encontrado, LEXEMA "+ yytext());}
    {CORCH_C} {System.out.println("Token CORCH_C encontrado, LEXEMA "+ yytext());}
    {MENOR_A} {System.out.println("Token MENOR_A encontrado, LEXEMA "+ yytext());}
    {MAYOR_A} {System.out.println("Token MAYOR_A encontrado, LEXEMA "+ yytext());}
    {IGUAL_A} {System.out.println("Token IGUAL_A encontrado, LEXEMA "+ yytext());}
    {MENOR_I} {System.out.println("Token MENOR_I encontrado, LEXEMA "+ yytext());}
    {MAYOR_I} {System.out.println("Token MAYOR_I encontrado, LEXEMA "+ yytext());}
    {AND} {System.out.println("Token AND encontrado, LEXEMA "+ yytext());}
    {OR} {System.out.println("Token OR encontrado, LEXEMA "+ yytext());}
    {NOT} {System.out.println("Token NOT encontrado, LEXEMA "+ yytext());}
    {ASIGN} {System.out.println("Token ASIGN encontrado, LEXEMA "+ yytext());}
}

[^]  {throw new Error("Caracter no permitido "+yytext()+" en la linea "+ yyline);}
