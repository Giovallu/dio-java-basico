public class Operadores {
    public static void main(String[] args) {

        /* (Aula 7)
        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }
        
        System.out.println("fim"); */

        /* (Aula 6)
        String nomeUm = "GIOVANNA";
        String nomeDois = new String("GIOVANNA");

        System.out.println(nomeUm.equals(nomeDois));// para comparar conteúdo de objeto, se não, como são objetos diferentes, dará 'false'

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao); */


        /* (Aula 5)
        int a, b;

        a = 6;
        b = 6;

        String resultado = "";

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso"; 

        System.out.println(resultado);
        

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";
        // funciona com tipo int também

        System.out.println(resultado); */

        /* (Aula 4)
        int numero = 5;

        //x repeticao
        numero ++;
        //numero = numero + 1

        System.out.println(numero); // se vc quiser o incremento no momento que imprimir, deve usar "++"/"--" como pré-fixo

        boolean variavel = true;
        System.out.println(!variavel); // inverte valor lógico */
        
        /* (Aula 3)
         int numero = 5;

        numero = - numero; // numero*-1

        System.out.println(- numero);

        
        System.out.println(numero); */

        /* (Aula 2)
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao); */
        
    }
}
