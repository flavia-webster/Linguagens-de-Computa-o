# Linguagens-de-Computacao
Trabalho 1 - Andrea Konzen
Arthur Zanella, Arthur Viegas e Flávia 
Descrição a seguir:
Esta atividade prática consiste em projetar e construir um analisador léxico simples
para os tipos de tokens de uma gramática de aritmética básica.
Como exemplo, a linguagem de aritmética tem os seguintes tokens e códigos:
Considerações sobre a linguagem da gramática:
• Variáveis não podem começar com dígitos e podem ter dígitos e caracteres
depois do segundo símbolo.
• As expressões possuem apenas números inteiros.
• Não haverá números negativos neste nível de análise.
• Considere que os lexemas relativos aos números terão tamanho menor 100
dígitos. A mesma restrição de tamanho se aplica aos nomes de variáveis.
A análise léxica consiste em estabelecer triplas do tipo (lexema, token, token_id) a
partir de uma string de entrada. Por exemplo, supondo que a entrada seja:
a := (aux - 1) * 100 / 20
O analisador léxico deve produzir as seguintes triplas:
('a', IDENT, 1)
(':=', ASSIGN_OP, 12)
Linguagens de Programação
Profa. Dra. Andréa Aparecida Konzen
ATIVIDADE PRÁTICA (2.0 pts (E))
Token Lexema Id
VAR Nomes de variáveis 1
NUM Números inteiros 2
LPAR '(' 3
RPAR ')' 4
ADDOP '+' 5
SUBOP '-' 6
MULOP '*' 7
DIVOP '/' 8
LTOP '>' 9
STOP '<' 10
EQOP '==' 11
ASSIGNOP ':=' 12
('(', LPAREN, 3)
('aux', IDENT, 1)
('-', SUB_OP, 6)
('1', INT_LIT, 2)
(')', RPAREN, 4)
('*', MUL_OP, 7)
('100', INT_LIT, 2)
('/', DIV_OP, 13)
('20', INT_LIT, 2)
Estratégia para a análise léxica:
• A análise léxica extrai um caractere de cada vez da entrada.
• Se este caractere fizer parte de um lexema do tipo variável ou um número, é
necessário guardar esta informação ao ler o próximo símbolo.
• Esta informação determina se a leitura do próximo símbolo a ser lido deve ser
um dígito ou um caractere ou apenas um dígito.
• Um novo lexema é iniciado quando o símbolo lido pertence a
um token diferente do atual ou então através da leitura de um caracter de
espaço em branco, quebra de linha '\n', tabulação '\t', retorno de cursor '\r'.
Estes símbolos atuam como delimitadores e indicam que o lexema atual
encerrou. O caractere de final de arquivo EOF também encerra um lexema,
assim como termina a execução do programa.
