# TesteCaixaBranca - Análise de código 

# Descrição
Projeto criado para analise do código e apontamento dos erros existentes 

# Utilidade 
O testes do tipo caixa branca servem para verificar o funcionamento do código interno e da estrutura. Com esse tipo de teste e análise é possível identificar erros 
no código e consertá-los mais facilmente e com maior rapidez

# Erros encontrados
- Não é possivel declarar um método dentro de outro Java, assim como foi feito o método "conectarBD()" dentro do método main
- O código abre a conexão com o banco de dados e não fecha. Na linha 23, com a conexão ainda aberta, é utilizado novamente o método "conectarBD()"
- Uso incorreto do "conn" no método "verificarUsuario"
- Má utilização do "catch", sem fazer o tratamento correto da Exception e sem ao menos utilizar o "e.printStackTrace()"
- Péssima organização e práticas de código, como por exemplo utilizando 3 vezes a variável "sql" para construir o select
- Variáveis sem nomenclatura adequada, trazendo uma legibilidade ruim e consequentemente prejudicando a manutenibilidade do código
- Não houve uma tratação correta para evitar "NullPointerException", ela ocorrerá devido a má implementação da variável "conn", que pode permanecer nula e consequentemente gerar a Exception
- Não há documentação do código e nem acesso a classe de conexão ao banco de dados, prejudicando novamente a manutenibilidade e entendimento do código

# Requisitos
Projeto feito em Java utilizando JDK versão 20 e IDE Eclipse, não é possivel rodá-lo devido aos erros de código

# Contato
E-mail: cauasilva8@gmail.com

# Colaboradores
Professor Daniel Domingos Akira de Sa Pimentel Ohata e Centro universitário Facens
