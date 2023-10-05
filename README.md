# DDD_2SEMESTRE_CP2

# Data Acess Object

Nesse Checkpoint de Domain Driven Design, foi feito um exemplo simples de DAO utilizando a linguagem de programação Java em conjunto com o banco de dados da Oracle, sendo possivel realizar as funções básicas de um CRUD como pesquisar, deletar, criar e atualizar algum dado no banco. Sendo composto pelos seguintes pacotes: 

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/37bab22c-69d2-4c5f-b2fe-131a5b88330d)

## Interface

Nela se encontram as funções que o DAO irá implementar, mostrando seus nomes, retornos, argumentos e as exceções que se esperam.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/f5d1d5a1-4884-4983-8454-442dc93ffac2)

## Exception

Foi criada uma exceção para o caso do código utilizado para fazer ações como procurar ou até mesmo atualizar, não for encontrado.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/4950fd75-a15a-4d0a-8a97-3a2f7fbbc206)

## Factory

Para que a conexão não seja criada nos próprios métodos do DAO, fazendo-o ter tambem essa responsabilidade, foi criada a classe ConnectionFactory, que será responsável por receber o usuário e senha para se conectar ao banco de dados Oracle e instanciar um objeto do tipo Connection para que seja utilizado pelo DAO.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/90b5892b-58fa-44a7-b9ac-0f59e1feddff)

## Model

No projeto será utilizado o model Aluno que tem os mesmos atributos que a tabela no banco de dados, tendo dois construtores onde o primeiro solicita todas as informações e o segundo não solicita o codigo, pois o método criar ele ativa uma sequence no banco de dados oracle para atribuir um código ao aluno em vez de ser atribuido manualmente na view. O restante que compôem o model são os getters e setters, foi feito um toString para que não mostre um objeto do tipo Aluno como um endereço de memória e uma função básica de retornar as informações para que seja possivel velas formatadas no console.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/401b0097-1b29-42fc-b7f0-941e3b548757)

## View

Foi feita uma view simples para testar o DAO onde ela contem no inicio duas variáveis do tipo string no inicio para que sejam informados os dados de usuario e senha do banco de dados, logo em seguida será instanciada uma Connection com esses dados e instanciado o DAO. A interação será feita com o uso do JOptionPane, que fará uma função semelhante a um menu, recebendo qual opção o usuário deseja utilizar e dependendo do caso ele poderá tambem ser utilizado para coletar as informações em caso de cadastro de um aluno ou atualização dos dados por exemplo.

## DAO

Para a construção do DAO foram utilizadas variáveis do tipo String como private static final, para armazenar a parte SQL que será utilizada nos PreparedStatements e uma variavel do tipo Connection pois o construtor do DAO precisará de uma Connection para ser instanciado.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/98eda43e-3076-4ce9-a74b-ca40255ab9ca)

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/1c1fb644-da8d-4460-a1cc-9219ef8d586b)

O DAO tambem contem um médoto de nome parse que receberá um ResultSet para coletar as informações de um SELECT e instanciar um objeto do tipo Aluno e retorna-lo.

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/1e93933a-1efb-4414-aeb0-54787ed27541)

Os demais métodos são as implementações da interface, sendo um exemplo deles o cadastrar a seguir:

![image](https://github.com/gustavocarvalho1997/DDD_2SEMESTRE_CP2/assets/79180740/65c33c09-3cf4-4173-a342-cbcb249a17d3)

## SQL

No projeto também contem dois scripts sql caso precise criar a tabela e popula-la a fim de testar o projeto. Ambos se encontram no diretório SQL do projeto.
