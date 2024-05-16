# Aula 1

## Escopo

∟ melhor estrutura do código

### Tipos de Escopo
- de Classe
- de Método
- de Fluxo

# Aula 2

Escopo é o ambiente onde uma variável pode ser acessada.

- dependendo do local onde a variável foi declarada,ela tem uma visibilidade;

### Exemplo baseado no projeto "Smart TV":

- boolean ligada = false;
- int canal = 1;
- int volume = 25;

*Foram declaradas dentro da classe apenas, por isso ela é visível a todos os métodos da classe, ou seja, pode ser usada em qualque método ali.*

- int novoCanal;

*Já a variável acima é criada como parâmetro dentro de um método, então será uma variável visível apenas localmente, mas isso vale para variável criada dentro do método também.*
