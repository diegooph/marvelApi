# Marvel Api


Para começar deve-se ter o maven instalado na sua máquina, após configurado, basta entrar na pasta do projeto:


e executar:

`mvn install`


Para configurar o banco de dados basta alterar o arquivo `marvelApi\src\main\resources\application.properties` e modificar as configurações do banco de dados desejado.
 
Crie um nova database : `CREATE DATABASE  IF NOT EXISTS marvelapi`


Como a aplicação usa Hibernate e ela cria automaticamente as tabelas do banco de dados, pode-se, por exemplo, utilizar Mysql para executar a aplicação, basta apenas que modifique o arquivo mencionado acima.

Para Popular o banco de dados usando o Mysql basta executar os sql contidos na pasta `marvelApi\src\main\resources\Dump`

#EndPoints:

>/v1/public/characters
/v1/public/characters/{characterId}
/v1/public/characters/{characterId}/comics
/v1/public/characters/{characterId}/events
/v1/public/characters/{characterId}/series
/v1/public/characters/{characterId}/stories
> 
> characterId = Id dos personagens na Api da marvel ... Renomeado como customId 

Esse próximo endpoint extra foi criado apenas para facilitar os inserts, caso for testar sem internet, aconselho realizar os inserts localizados na pasta Dump. 
>/v1/public/characters/{characterId}/save
