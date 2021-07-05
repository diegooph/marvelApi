# Marvel Api


Para começar deve-se ter o maven instalado na sua máquina, após configurado, basta entrar na pasta do projeto:


e executar:

`mvn install`


Para configurar o banco de dados basta alterar o arquivo `marvelApi\src\main\resources\application.properties` e modificar as configurações do banco de dados desejado.

Como a aplicação usa Hibernate e ela cria automaticamente as tabelas do banco de dados, pode-se, por exemplo, utilizar Mysql para executar a aplicação, basta apenas que modifique o arquivo mencionado acima.

Para Popular o banco de dados usando o Mysql basta executar os sql contidos na pasta `marvelApi\src\main\resources\Dump`