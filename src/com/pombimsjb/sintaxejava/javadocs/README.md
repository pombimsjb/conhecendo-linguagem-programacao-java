# Esta aula foi focada em como trabalhar com comentários, sejam eles em linha única, multi-linhas ou Documentação.

pode-se utilizar a linha de código abaixo para gerar a documentação ou através do próprio intelliJ

## Linha de comando
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

## Atalho IntelliJ

Tools> Generate JavaDoc> em "*Command line arguments:*" coloque **-encoding UTF-8 -docencoding ISO-8859-1**

**Assim a acentuação será preservada.**