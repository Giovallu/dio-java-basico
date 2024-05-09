# Aula 1

•  Nome da classe - primeira letra das palavras sempre maiúsculas (padrão)
       
• SE a classe é executável (se ela faz a inicialização do projeto), ela precisa do método principal - vai ser usado o método main ()


    padrão do método principal
        ∟ public
        ∟ static
        ∟ void - não vai retornar nada, apenas executar
        ∟ main() - nome do método + (parâmetros)
            ∟ String - tipo
            ∟ [] - expressão para determinar array
            ∟ arg - nome do parâmetro (arg - abreviação de argumentos/parâmetros)
|
# Aula 2

- Arquivo .java :

    ∟ deve começar com letra maiúscula;
        
    ∟ se for composta, cada palavra deve começar com letra maiúscula;
        
    ∟ Ex.: "Calculadora.java", "CalculadoraCientifica.java"

--

- Nome da classe no arquivo:

    ∟ nome da classe == nome do arquivo.java

--
    
- Nome de variável:
   
    ∟ começar com letra minúscula;

    ∟ se for composta, próximas palavras devem começar com letra maiúscula;

    ∟ nome do padrão: "camelCase";

    ∟ Ex.: ano, anoFabricacao;
    
    ∟ Apenas letras, _ , $, números(0 a 9);

    ∟ não iniciar nunca com números;

    ∟ sem espaço;

    ∟ e ser único;

    ∟ diferente de palavras reservadas da linguagem;

---------------------------------------------------------------

*exceção: quando uma variável tem um valor constante, seu nome será definido inteiramente com letra maiúscula, separando palavras com underline( _ ). Ex.: PI, BR, ESTADO_BRASILEIRO, ANO_2000*

|
# Aula 3

- Estrutura de Atribuição de Variáveis

        Estrutura NomeBemDefinido = Atribuição (opcional em alguns casos)

*Exemplos:  int idade = 23;
            double altura = 1.62
            Dog spike; (variável sem valor)*

--------------------------------------------
- Estrutura de Métodos

        TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

*Exemplos : int soma (int numero1, int numero2)
            String formatarCep(long cep)*

|

# Aula 4

- Identação: estrutura do código organizada de forma hierárquica e facilitando entendimento visualmente.

|

# Aula 5 

## Organização de arquivos

- Pacotes (abreviações)

    ∟ comercial - com. 
    
    ∟ organizacional - org.

    ∟ opensource - org./opensource.

    *Ex.: com.hypertech.notification;
          edu.lucas.segundasemana*