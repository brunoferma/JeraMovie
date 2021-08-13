Desafio Técnico Mobile 2021 - Jera

Objetivo Geral:
Desenvolver uma aplicação Mobile para o armazenamento de uma lista de filmes que o usuário gostaria de assistir. Essa lista deverá ser pega pela API do TheMovieDB (https://www.themoviedb.org/documentation/api). 
Uma conta pode ser vinculada a mais de um perfil, sendo obrigatório ter ao menos um perfil vinculado. A lista de filmes deverá estar associada ao perfil, não a conta, por exemplo: o perfil Filho deverá ter uma lista de filmes a assistir, já o perfil Mãe pode ter outros filmes a assistir (como funciona no Netflix). 

Aplicação a ser desenvolvida:

Funcionalidade
Observações

Aplicação


Criar conta
Como um usuário gostaria de criar uma conta na plataforma, sendo essa conta privada, onde outras contas não possam ver as minhas listas.
-- A conta deverá ter um perfil principal contendo: email, senha, nome e data de nascimento
-- A aplicação não deve ter mais de uma conta  associada ao mesmo email
Login da conta
Como usuário gostaria de logar na plataforma e continuar a visualizar as minhas listas.
-- Login será feito por: email e senha
-- Todas as áreas privadas só podem ser acessadas caso o usuário esteja autenticado (O acesso direto por URL não deve ser permitido, caso o usuário não esteja logado.)
Login com rede social
Como um usuário, eu gostaria de me cadastrar na plataforma com minha conta do facebook, para não ter que colocar todos os meus dados que já estão na outra plataforma.
-- Caso o usuário se cadastre com o facebook
-- O facebook_id deve ser único para cada usuário
-- As permissões fornecidas devem ser as necessário para a criação da conta.
Criar Perfil
Como um usuário gostaria de criar diferentes perfis de usuários, para que eu possa associar os filmes a cada perfil, deixando a minha lista de filmes organizada.
-- O perfil deverá ter somente um nome
-- O usuário pode ter no máximo 4 perfis
Listar perfis
Como usuário gostaria de ver todos os perfis associados a minha conta para selecionar o perfil desejado e ter o conteúdo filtrado.
-- Lista de todos os perfis associados ao usuário
-- Os conteúdos internos da aplicação serão definidos a partir de um perfil selecionado
Lista de filmes sugeridos
Como usuário gostaria de ter uma lista de filmes personalizada para o meu perfil, para que eu gaste menos tempo selecionando o que eu gostaria de assistir.
-- A lista personalizada depende dos filmes que o usuário adiciona na lista de filmes e filmes já assistidos
-- O predominante da lista é as categorias dos filmes que estão na lista ou já foram assistidos (Não precisa ter inteligência, é uma busca por filmes das categorias que o perfil, mais assiste.)
Busca de filmes
Como usuário gostaria de ter a opção de buscar um filme a partir de um texto qualquer, para que eu possa localizar filmes que não estão listados em meus filmes sugeridos
-- Busca de filmes por termo
Marcar filme como para assistir
Como usuário gostaria de marcar um filme para assistir, para que eu não esqueça dos filmes que eu me interessei.
-- Filmes marcado como watchlist deve ser salvo no perfil do usuário
-- Os filmes no watchlist devem ser levados em consideração na sugestão de filmes
Visualizar lista para assistir
Como usuário gostaria de visualizar a lista para assistir que criei de uma forma rápida e sucinta.
-- Lista de filmes que foram marcados em determinado perfil
Marcar como assistido
Como usuário gostaria de marcar um filme da minha lista de a assistir como já assistido, para que eu consiga me organizar conforme for assistindo os filmes desejados.
-- Somente filmes que estão na lista de watchlist podem ser marcados como vistos
Compartilhar filme assistido
Como um usuário gostaria de compartilhar em minhas redes sociais (facebook), para que meus amigos possam ver que filmes que eu assisti e para que possamos combinar de assistir algum filme juntos.
-- A aplicação deverá fazer um post no perfil do usuário informando qual filme o usuário assistiu
Agendar filme para assistir
Como usuário gostaria de agendar um filme da minha lista de assistir para um dia e hora, para que eu possa lembrar que tenho um bom filme para assistir. 
-- Esse aviso deverá ser feito por email e por notificação remota web (você está livre para escolher qual ferramenta ou serviço vai utilizar).


