#### 15/10/2023

@01-Introdução ao Firebase Authentication

@@01
Introdução

[00:00] Eu sou o Alex Felipe, instrutor da Alura, e vou apresentar para você o curso de Android com Firebase Authentication. Para esse curso, eu vou assumir que você já tenha feito o curso de Navigation 2 da Alura, para, dessa forma, reutilizarmos o mesmo projeto e aproveitarmos o maior tempo falando a respeito da integração que temos com aplicativos Android e essa ferramenta conhecida como Firebase Authentication.
[00:27] Então, se você não tiver feito esse curso e mesmo assim você quer fazer esse apenas para conhecer como é feita a integração com o Firebase Authentication, fique à vontade também em fazer, porém é muito importante notar que muitas coisas que eu vou utilizar aqui eu não vou explicar, justamente porque já foram explicados nesse curso de Navigation 2.

[00:46] Como, por exemplo, a maneira que funciona o Navigation, Architecture Components, seguindo Live Data, View Model, e assim por diante. Tudo isso já foi explicado nesse curso, então eu vou assumir que você já tem esse conhecimento e prosseguir com o avanço do projeto.

[01:01] Agora que eu passei esse feedback de pré-requisito, o próximo passo é entendermos o que é o Firebase, o que é o Firebase Authentication e o que vamos desenvolver neste aplicativo que vai integrar com essa ferramenta. Primeiro vamos entender o que é o Firebase.

[01:18] O Firebase nada mais é do que um serviço online, da própria Google, que disponibiliza diversos tipos de ferramentas para utilizarmos nos nossos projetos. Se vamos aqui, nessa página oficial, ele indica diversas ferramentas que podemos utilizar: Cloud Firestore, Firebase ML, que seria de machine learning, Cloud Functions, e assim por diante.

[01:40] Muitas ferramentas. O importante aqui é que vamos acessar diretamente uma delas, que é essa tal de Authentication, que ele está falando que permite com que autentiquemos o usuário de uma forma simples e segura. É justamente essa a proposta.

[01:53] Quando entramos nessa página, que direciona para essa outra, que é a introdução do Firebase Authentication, entendemos que esse Firebase Authentication é um serviço do Firebase que implementa toda a lógica complexa de autenticação. Dessa forma, não precisamos ter um back-end para fazer esse tipo de serviço, vamos reutilizar back-end do próprio Firebase para fazer isso para nós.

[02:19] Então o objetivo do Firebase Authentication é integrar aplicações com esses mecanismos, com essas ferramentas que ele tem. Tanto que podemos ver que temos suporte para Android, iOS e assim por diante. Sendo mais específico, vamos ver como fazemos essa integração com o Android. Então o Firebase Authentication é um serviço que permite a autenticação sem a necessidade de fazer o uso de um back-end nosso, essa é a proposta.

[02:47] Dado que é essa a proposta, o que vamos aprender durante o curso? Além de ter essa introdução do que é o Firebase Authentication, vamos ver que para usa isso, vamos precisar criar projetos no Firebase, vamos conhecer o dashboard do Firebase, vamos ver essa parte do Authentication, então vemos aqui os e-mails que foram criados.

[03:07] Porque vamos entender que o Firebase, ele permite criar esse mecanismo de autenticação por vários provedores. Aqui nós vamos usar o e-mail e senha, como estamos vendo aqui, mas vamos ver que também podemos usar outros provedores, por meio do Google, e assim por diante.

[03:21] Também vamos entender como criamos um projeto do Firebase, o dashboard, como registramos um projeto em Android e como criamos as configurações iniciais para fazer a primeira integração. Depois que vermos isso, começaremos a fazer a integração com o nosso aplicativo. O que é a integração com o nosso aplicativo?

[03:41] É pegar a tela de login, a tela de cadastro, e fazer com que elas funcionem diretamente com o Firebase Authentication. Então, por exemplo, eu quero cadastrar um usuário. Eu posso cadastrar esse usuário e autenticar com ele. Eu vou cadastrar, por exemplo, "alex.felipe". Vou colocar "alex.felipe@aluraesporte.com". Eu vou deixar uma senha simples, vou deixar "teste1", apenas para eu lembrar.

[04:05] E ele vai, ele tenta cadastrar e ele indica que o cadastro foi realizado com sucesso. Em seguida, agora que eu tenho um e-mail que eu cadastrei, eu posso chegar aqui, na tela de login, e colocar "alex.felipe@aluraesporte.com", eu posso colocar a senha "teste1" e olha o que acontece, eu clico no botão "Logar", ele vai logar com o meu usuário.

[04:28] Então teremos acesso às mesmas telas de antes, que seria de produtos e pagamentos, só que agora vamos ter acesso a uma nova tela também, que é essa "Minha conta", que mostra a conta que foi logada.

[04:37] Temos o comportamento de logout, que já tínhamos antes também nesse aplicativo, só que estava implementado de uma maneira local, não funcionava diretamente, como se fosse uma autenticação. Só que agora, o logout vai funcionar dessa maneira.

[04:52] Então veja que o objetivo, de fato, além de conhecer como funciona o Firebase Authentication, é focar nessa integração que temos do aplicativo Android com o Firebase Authentication. Eu espero que você esteja animado para começar o curso e eu conto com a sua presença. Então até já.

@@02
Orientações iniciais e organização do curso

Pré-requisito
Neste curso, assumimos que você conheça todo conteúdo apresentado no curso de Navigation 2.

Além do curso, também vamos utilizar o Koin, uma ferramenta de injeção de dependência apresentada nesses Alura+.

Parte 1
Parte 2
Caso você não tenha feito o curso, mas acredita que possa começar a partir daqui, fique à vontade para continuar. Porém, se tiver algum conteúdo neste curso que não foi explicado com tanta atenção, muito provavelmente ele já foi explicado em um curso anterior. De qualquer forma, você pode entrar em contato com a gente por meio do fórum.

Como o curso está organizado
Este curso é classificado como intermediário, e isso significa que alguns exercícios não serão tão passo a passo como em um curso básico. Mas não se preocupe, pois todas as orientações necessárias serão apresentadas.

Sinta-se livre para primeiro assistir a aula, prestar atenção no conteúdo e depois executar o que foi feito em aula apenas no exercício.

Se preferir executar as etapas junto com o instrutor, fique à vontade. Porém, saiba que daremos todo auxílio necessário nos exercícios. Recomendamos fortemente primeiro assistir a aula com atenção para depois praticar :)
[Preparando ambiente] Preparando o ambiente
Caso você já tenha o projeto desenvolvido no curso de Navigation 2, você pode mantê-lo. Se preferir a versão com as configurações atualizadas, você pode baixar por meio deste link.

Para acompanhar todas as mudanças da atualização do projeto, confira este commit.

https://cursos.alura.com.br/course/android-navigation-features

https://cursos.alura.com.br/injecao-de-dependencia-em-projetos-android-com-koin-parte-1-c48

https://cursos.alura.com.br/injecao-de-dependencia-em-projetos-android-com-koin-parte-2-c49

https://github.com/alura-cursos/Firebase-Authentication-Android/archive/projeto-inicial.zip

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/01d01bc1475ad910066455b2f14e44f9bce419eb

@@03
Criando o projeto no Firebase

[00:00] Agora que tivermos uma introdução do Firebase Authentication, podemos seguir para o próximo passo, que é fazer a configuração inicial do Firebase, para conseguirmos integrar esse serviço com o nosso aplicativo. Para isso, precisamos acessar o console do Firebase, é uma das maneiras que temos para fazer essa configuração.
[00:22] Então eu vou clicar nesse link aqui em cima, no canto superior direito da página do Firebase, que é o "ir para o console". Observe que ele já mudou o endereço da parte de cima do navegador, agora é o "console.firebase.google.com". A partir dessa página, vamos ter acesso administrativo de todos os projetos que já criamos no Firebase.

[00:42] Observe que, aqui para mim, ele já mostrou dois projetos que foram criados. Isso porque eu já criei esses projetos para fazer conteúdo para a Alura, e também para fazer alguns testes. Então, talvez, quando você acessar, pode ser que não tenha nenhum projeto, porque é a sua primeira vez, como também ele vai até mesmo pedir para que você autentique, aqui nesse serviço, a partir de uma conta da Google.

Interface do Console do Firebase com "Seus projetos do Firebase" contendo três cards: " + adicionar projeto", "agenda-sync" e "teste". Abaixo há um retângulo com o link "Explorar projeto de demonstração" e outro com "Projetos do Firebase são contâineres para seus apps", o qual possui sete ícones ao lado.

[01:06] Observe que eu tenho essa conta, chamada de "auroid@gmail.com", e você terá que usar uma conta sua para que você acesse esses serviços. Cada conta da Google vai ter acesso aos seus próprios projetos. Então essa é a primeira parte que precisamos entender. O próximo ponto que precisamos saber é o seguinte: o que é esse projeto do Firebase.

[01:29] Como a própria descrição diz aqui, é o seguinte: é um contêiner para conseguirmos vincular os nossos aplicativos com o Firebase. Então, um projeto, nada mais é do que uma maneira na qual conseguiremos falar: Olha, a partir deste projeto, eu quero que você integre com esses aplicativos. Nós vemos que disponíveis nós temos Android, iOS e aplicativos web para fazermos essa integração, como mostrado aqui para nós.

[01:56] Então, se queremos usar o serviço de autenticação, queremos usar qualquer serviço do Firebase, nós precisamos sim ter um projeto, para que esse projeto consiga configurar um aplicativo para nós e conseguirmos usar esse serviço. Então o primeiro passo de todos aqui é realmente ter acesso a um projeto.

[02:14] Como o nosso objetivo é ter acesso a um projeto exclusivo para esse aplicativo, eu vou criar aqui um novo projeto. Mas também eu poderia usar esses existentes para esse mesmo aplicativo, podemos ter um único projeto, que ele meio que administra todos os nossos aplicativos. É claro, os recursos serão mais limitados, porque existem serviços que são pagos, que têm algumas restrições, mas é uma maneira também de fazer essa configuração.

[02:41] Mas, nesse caso específico, ainda mais porque pode ser sua primeira vez, vamos criar um projeto. Então eu vou clicar aqui em "Adicionar projeto", naquele botão - só para pegar o nome, que é o "Adicionar projeto". Observe que ele vem com uma nova página, justamente para conseguirmos fazer o preenchimento das informações.

[02:56] Um ponto importante a se observar é que as páginas do Firebase, elas tendem a mudar a parte de design, a parte de passos. Então, se de repente o passo for um pouco diferente, não precisa ficar assustado, sempre siga as informações que ele vai pedindo, e você as coloca conforme forem necessárias. Não precisa ficar assustado, achando que vai ter alguma coisa diferente.

[03:20] Então vamos começar com essa nossa configuração. O que precisamos fazer, logo de cara? Aqui está falando para darmos um nome para o projeto. O nome, você pode colocar qual você quiser. Considerando que o meu objetivo é falar sobre o Alura Esporte, eu vou chamar de "Alura Esporte", esse vai ser o nome do projeto. Observe que no momento que colocamos o nome do projeto, ele coloca essa caixa embaixo do nome.

[03:46] O que ela representa? Ela representa a identificação do nosso projeto. Como assim, identificação? Se colocarmos, por exemplo, um outro nome que talvez já exista, que é o caso do "teste", ele vai colocar nessa caixa a identificação como "teste-" e vai colocar um código para nós, justamente porque é uma coisa única.

[04:05] Então veja que esse "teste", para que ele seja único, ele precisou colocar esse código a mais. No caso do "Alura Esporte", muito provavelmente não existe esse projeto, ele só coloca como "alura esporte". Então é por isso que temos esse nome aqui em cima, em azul, que ele não é a identificação, é apenas o nome do projeto para nós, e embaixo aparece a identificação.

[04:26] Então você pode colocar o nome que você preferir, não precisa ficar restrito ao "Alura Esporte". Clicando em continuar, o que vai acontecer? Nesse passo 2, ele vai falar que existem alguns serviços, que o Google Analytics, que é um deles, que é um dos principais do Firebase, são interessantes para nós, que é o caso desse "Teste A/B", segmentação de usuário e assim por diante. Não vamos dar muito foco nisso nesse momento.

[04:52] Mas o que é importante entendermos aqui? É que nesse passo, ele está falando o seguinte: olha, você quer ativar o Google Analytics para esse projeto? Podemos optar por sim ou não. Nesse caso, eu vou deixar como ativo, justamente porque é uma coisa que vem gratuita, ela não vai ter alguma restrição para nós, e é só um plus a mais que vamos ter.

[05:15] É algo que, se você tiver interesse em conhecer cada um desses serviços, fique à vontade em vir nesses menus, o símbolo de interrogação, e conhecer cada um desses serviços. Mas entenda que esse passo é só para ativar o Google Analytics, para que ele já venha com essa configuração do Firebase, e que já tenhamos acesso a esses serviços que vem junto com esse Google Analytics.

[05:36] Então, nessa parte, é só ver se você quer esse serviço mesmo, você pode manter ativo ou não, vai da sua preferência. Dado que já vem ativo, é o padrão, então eu vou deixar ativo e vou clicar em “continuar”. Agora, dado que colocamos o Google Analytics para ser ativo, basicamente só precisamos escolher uma conta, para poder verificar o que vamos utilizar do Google Analytics.

[06:00] Porque, de repente, você quer uma conta que você já tem do Google Analytics, e assim por diante. Eu não sou muito especialista no Google Analytics, então eu não vou conseguir te passar uma informação precisa de qual é a boa prática para você fazer aqui. Na maioria dos casos, eu acabo usando essa "Default Account for Firebase", que seria a conta padrão que temos do Firebase.

[06:19] Podemos então agora criar um projeto. Ele já vai fazer o próximo passo, que é justamente fazer a configuração inicial para termos acesso ao que chamamos de dashboard, que seria o nosso painel de controle, para conseguirmos fazer as nossas configurações iniciais. Então só aguarde finalizar essa parte, porque ela pode demorar um pouco, depende às vezes da sua internet, depende às vezes do momento em que você está criando.

[06:49] Porque aqui estamos usando os serviços da Google, então depende de muitas situações para ver o tempo de criação. E, no final das contas, vai aparecer essa mensagem: Seu novo projeto está pronto. Podemos clicar em "Continuar". Fazendo isso, olha só que interessante, ele vai entrar naquilo que eu falei que é o nosso dashboard, nos mostrando muitas opções que podemos fazer com o Firebase.

[07:12] Se voltarmos para o "consele.firebase.google.com", agora sim temos o nosso projeto "Alura Esportes".

[07:21] Então essa parte, basicamente é isso o que temos que fazer, é criar o nosso projeto. Agora que criamos o nosso projeto, já estamos para fazer o próximo passo, que é a configuração inicial do nosso aplicativo, o que iremos fazer logo a seguir.

@@04
Adicionando projeto Android no Firebase

[00:00] Agora que o nosso projeto do Firebase está pronto, podemos seguir com o próximo passo, que é adicionar um aplicativo no projeto, para que dessa forma, a partir desse aplicativo, consigamos utilizar aqui os serviços do Firebase. Para adicionar, como podemos fazer? No dashboard, podemos usar um desses menus, que temos disponíveis no centro da tela.
[00:20] Nesse caso, temos o iOS, Android, web e Unity. O nosso projeto é Android, então já podemos clicar em Android. Agora vejam só o que aparece: vem uma nova página, justamente para receber algumas informações, para então fazer essa adição.

[00:36] Algumas dessas informações são opcionais, então não precisamos ficar atentos, mas algumas delas precisamos sim colocar, porque são importantes e são necessárias, como é o caso do nome do pacote do Android. Qual é o pacote que podemos utilizar? Podemos verificar exatamente o pacote que está no nosso aplicativo, no Android Studio.

[00:55] Se eu vier em Java, no menu lateral esquerdo, vamos ter o "br.com.alura.aluraesporte". Então podemos, de volta ao navegador, colocar o nome do pacote Android como "br.com.alura.aluraesporte". Embaixo temos campos opcionais, como é o caso do apelido do aplicativo.

[01:13] Esse apelido é interessante justamente para que no momento em que adicionarmos, mostre naquela tela inicial qual é o aplicativo que foi configurado, para não precisarmos ver o pacote e assim por diante. Então aqui eu vou deixar como "Alura Esporte". Você também pode colocar o mesmo nome ou então o nome da sua preferência.

[01:32] Essa parte, embaixo, do certificado de assinatura de depuração, ela é necessária em casos em que vamos usar alguns serviços que exigem esse tipo de certificado. Neste momento, não precisamos, então por isso é opcional, nós não precisamos colocar essa informação. Então não precisa se preocupar, no momento em que precisar, nós colocamos. Podemos clicar em "Registrar app".

[01:55] Já fizemos o primeiro passo, que é o registro do aplicativo. Ao fazer esse registro, terão mais alguns passos que precisaremos fazer, e que são importantes para que a integração entre o aplicativo Android e o serviço do Firebase funcionem da maneira esperada. Como faremos isso?

[02:12] Basicamente clicamos neste botão "Fazer o download de google-service.json", que é um arquivo que faz a integração entre o aplicativo Android e o serviço do Firebase. Clicamos neste botão, o que vai acontecer? Ele vai pedir para abrir o arquivo em algum lugar, essa é a configuração que eu fiz do meu Firefox. Onde temos que adicionar?

[02:33] Precisamos adicionar exatamente nesse local do nosso projeto, como mostrado na página, que é o projeto, teremos o módulo "app" e, dentro do módulo "app", colocamos esse arquivo. Eu já estou no módulo "app", porque eu já tinha feito uma simulação antes, para ver como funcionava, e ele já ficou nesse caminho. Então eu vou salvar aqui.

[02:53] Ao salvar no módulo "app", para você ter certeza se foi adicionado, o que você pode fazer? Você pode voltar no Android Studio, e você vai ver que tem essas perspectivas, que estamos ainda no Android, mas temos, por exemplo, essa "Project", no menu lateral esquerdo. Nessa "Project", ele mostra tudo do projeto.

[03:09] Abrindo o "Alura Esporte", vemos que tem aqui o "app" e, dentro do "app", temos o "google-service.json". Então conseguimos colocar o arquivo sem nenhum problema. Esse é o primeiro passo. Em seguida, o que fazemos? Agora que colocamos o "google-service.json", podemos seguir para o próximo passo, que é para adicionar o SDK do Firebase.

[03:33] Como adicionamos esse SDK? Fazendo as configurações do "build.gradel". Então teremos configurações a nível projeto e também configurações a nível módulo, e vamos colocar cada uma delas. A nível projeto, precisamos adicionar esse classpath e precisamos verificar se os repositórios da Google estão disponíveis no projeto.

[03:54] É caso aqui do google(), nesse repository do buildscript, e o google(), no repository do allprojects. Vamos verificar isso. Eu já vou copiar o classpath, porque muito provavelmente esses google() já estarão prontos para nós. Então entrando no Android Studio, dentro do nosso projeto - se você preferir, pode voltar para a perspectiva do Android.

[04:13] Voltando aqui, entrando no "build.gradle" do projeto, vamos perceber que o google() já está nesse repository do buildscript e também está no repository do allprojects. Então o que falta fazermos é só adicionar o classpath nesse dependencies do nosso buildscript. Então conseguimos colocar no projeto, fizemos o primeiro passo. Qual é o outro passo que temos que fazer?

[04:38] Precisamos também entrar no "build.gradle" do módulo "app", e precisamos adicionar o plugin do Google Services, que é esse "com.google.gms.google-services", e precisamos também colocar a dependência do Firebase Analytics, que foi aquele primeiro serviço que já deixamos habilitado, então já podemos colocar aqui também.

[05:02] Observe que nesse classpath, o que colocamos foi justamente esse classpath do Google Services também. Eu não dei tanto esse feedback, mas foi isso que colocamos. Então agora vamos colocar aqui o plugin. Voltando no Android Studio, "build.gradle", do módulo "app", colocando o plugin no topo, deixa eu colocar aqui, com os outros plugins.

[05:22] Também vamos colocar a dependência. Veja que eu estou clicando, no navegador, nesses botões da direita, para copiar, porque eles já fazem a cópia para nós. Geralmente é isso que temos que adicionar. Observe que ele tem esse "com.android.application", geralmente esse plugin já vem quando criamos o projeto, então não precisamos ficar atentos com isso. Mas as dependências, o classpath, nós precisamos colocar.

[05:41] Então eu estou colando aqui, no Android Studio, e olha que interessante: ele já fala que tem até uma versão mais recente, que é a 4.3, no caso 17.4.3. Você pode usar, no Android Studio, por meio do atalho "Alt + Enter", que ele já muda para você, usando a primeira opção. Então conseguimos mudar. Agora o que falta fazer aqui é justamente fazer a sincronização dos arquivos.

[06:05] Observe que quando eu mexi aqui, no Android Studio, ele não me mostrou a parte da sincronização. Você pode usar alguns atalhos para isso, temos o atalho "Ctrl + Shift + A", que permite fazer qualquer ação no Android Studio. Aqui você já pode começar escrevendo "sync", e ele vai ter essa opção de sincronizar o projeto com o "Gradle Files", que seriam os arquivos do gradle.

[06:26] A partir desse momento, que você clica nessa opção, ele vai fazer aquela sincronização que aparece aqui para nós, porque se viermos também no navegador, o botão "Sync Now" é a última opção que temos que fazer, que é o que fizemos agora no Android Studio, manualmente. Então conseguimos fazer a sincronização, fizemos todos esses passos no momento que precisamos adicionar o SDK do Firebase.

[06:46] Então podemos clicar na “Próxima”. E agora, o que acontece? O Firebase, ele tenta verificar se ele conseguiu conectar toda essa configuração com o nosso aplicativo. Veja que aqui ele já mostra essa mensagem de "Parabéns! Você adicionou o Firebase ao seu app", só que nem sempre ele vai aparecer essa mensagem.

[07:05] Essa mensagem pode demorar um pouco. E o que pode acontecer aqui? Quais são os possíveis problemas que você terá que lidar? Primeiro é a questão da demora, que pode demorar muito para fazer isso, e vai ter algumas instruções, falando o seguinte: olha, desinstale o aplicativo, tente executar de novo, para ver se você consegue fazer esse vínculo.

[07:27] Então qual é a mensagem que eu quero passar? Caso esse vínculo não aconteça neste momento, não precisa se preocupar, você pode pular a etapa, que vai aparecer um botão, indicando para você pular a etapa e, no momento em que você fizer esses testes de desinstalar e instalar de novo, executar, em algum momento ele vai conseguir fazer essa sincronização para você.

[07:48] É claro, é muito importante você certificar que todas as informações que você colocou, elas estão corretas, para que a sincronização seja feita, porque se a sincronização não é feita, se esse registro não é sucedido, alguns serviços que utilizarmos do Firebase provavelmente não vai funcionar da maneira esperada.

[08:08] Então talvez, se você tiver algum problema, que não vai aparecer aqui durante o curso, muito provavelmente é porque essa etapa não foi muito bem sucedida. Mas, novamente, você pode tentar mais de uma vez, fazendo exatamente o mesmo procedimento, com as informações corretas, que em algum momento ele vai e registra para você. Então, clicando em "Continuar no console", o que vai acontecer de diferente?

[08:30] Vai acontecer que agora vamos ter essa label, essa etiqueta abaixo no nome do projeto, indicando que temos um aplicativo, que, nesse caso, é o Alura Esporte. Se clicarmos no aplicativo, ele já nos mostra um balão, mostrando qual é o pacote que foi registrado.

[08:46] E se queremos fazer algum tipo de configuração, podemos ir nesse menu de engrenagem, dentro do balão, que ele já mostra toda a configuração que foi feita para esse aplicativo, de tal maneira que conseguimos até mesmo baixar novamente o "google-services.json", conseguimos editar algumas informações e assim por diante.

[09:05] Então esse é o registro do aplicativo, para conseguirmos fazer o uso dos serviços do Firebase. Só para finalizar, um feedback importante, voltando no nosso dashboard, aqui no balão do aplicativo, quando você não conseguir registrar, ele mostra uma notificação para você, indicando que o registro não foi muito bem sucedido.

[09:24] Você pode clicar no balão, vir na notificação para tentar novamente fazer o registro. Agora sim, que temos o nosso aplicativo, o próximo passo é ver como podemos dar os primeiros passos para então usar o Authentication. Até já.

@@05
Criando usuários com o Firebase Authentication

[00:00] Agora que conseguimos adicionar o aplicativo do Android no projeto do Firebase, podemos começar com a configuração do Firebase Authentication. A configuração será feita seguindo os passos da documentação, que pode ser acessada a partir desse link no canto superior direito, o "Acessar a documentação". Eu vou entrar nesse link abrindo uma tab nova, para não sairmos do nosso console.
[00:22] Então eu vou acessar agora a documentação e vamos ver que é a documentação geral do Firebase. O que nós precisamos é justamente da página dedicada ao Authentication. Se descermos um pouco mais a página, vamos ver que temos essas opções, que vamos falar sobre criar um aplicativo, e nelas vamos ter essa autenticação, que seria a tradução do Authentication.

Interface da documentação do Firebase contendo listas de opções e ícones em três colunas: "Criar o aplicativo", "melhorar a qualidade do aplicativo" e "aumente seus negócios".

[00:45] Podemos clicar. Aqui dentro, o que vai acontecer? Essa página, ela vai nos indicar uma introdução sobre o que é o Firebase Authentication, inclusive tem um vídeo introdutório da própria equipe do Firebase, falando a respeito dessa ferramenta, falando de toda a ideia que já vimos na introdução, que será uma ferramenta para fazer a autenticação para nós, que faríamos em um serviço em back-end.

[01:09] Só que será feito a partir do serviço do Firebase, que tem toda a plataforma em Cloud, e assim por diante. Então fique à vontade em olhar essa página da documentação, para ter mais informações sobre a introdução, principalmente sobre os principais recursos, para você entender o que temos disponível.

[01:28] O nosso interesse, nesse caso, além dessa parte que é mais informativa, é justamente ver qual é a próxima etapa para fazer a configuração de um ambiente específico, nesse caso no Android, que é no final nessa parte de "Próximas etapas".

[01:42] Aqui temos o link para o Android, quando clicamos, olha só que vai acontecer: ele acessa esse endereço, que também fica aqui, na parte esquerda, na aba de Android, que são os primeiros passos com o Firebase Authentication no Android. Então é nisso que precisamos chegar para fazer a nossa primeira configuração.

[02:05] O que ele diz, logo de começo? Que o pré-requisito para conseguirmos utilizar o Firebase Authentication é conectar o app ao Firebase, que foi o que já conseguimos fazer aqui, adicionando esse aplicativo. Então essa primeira etapa nós já fizemos. A próxima agora é usar o SDK do Firebase Authentication, para conseguirmos usar as classes que vão nos permitir acessar o Firebase.

[02:34] Agora, o que temos que fazer? Precisamos primeiro colocar essa dependência. Essa dependência, ele será a dependência exclusiva do Authentication, assim como vimos a dependência exclusiva aqui - deixa eu voltar para o Android Studio. A perspectiva, no caso, como vimos, a dependência exclusiva do Analytics.

[02:54] Agora vamos colocar uma específica do Firebase. Veja que ele mostra duas opções na documentação, o "Java Android" ou então o "Kotlin+KTX Android". Caso você não tenha a mínima ideia do que seja o "KTX", aqui na Alura temos um vídeo, de Alura+, falando um pouco mais a respeito do "KTX", que é um recurso a mais que temos quando utilizamos o Kotlin para facilitar a escrita do nosso código.

[03:18] Então vamos considerar sim o uso do "KTX" aqui, dado que estamos com o Kotlin no nosso projeto. Então eu mudei para o "Kotlin+KTX Android", veja que ele só coloca um traço na dependência, olhe só que interessante, ele colocou esse traço aqui para nós.

[03:30] Agora vamos copiar essa dependência e vamos colocar no nosso projeto. No Android Studio, no final do "build.gradle", vamos no final e colamos a dependência. No canto superior direito apareceu a opção "Sync Now", então vamos clicar nela. Ele fará todo o procedimento para baixar a biblioteca e instalar no nosso projeto. Pronto, já temos acesso ao Firebase Authentication.

[03:51] Só que tem um detalhe mais importante. Se seguirmos um pouco mais as informações da documentação, que fala o seguinte: se queremos usar o Firebase, vamos precisar usar um dos provedores. O que seriam esses provedores? São maneiras que temos para fazer a autenticação.

[04:08] Como nós vimos, o Firebase, ele dá suporte a vários tipos de autenticação, como é o caso da autenticação por senha, que envolve o e-mail, autenticação por meio do Google, Facebook e assim por diante. Então precisamos fazer agora essa configuração para falar o que vamos habilitar de método de autenticação no nosso aplicativo, isso antes de prosseguir com os próximos passos.

[04:33] Como podemos fazer isso? Para isso, voltamos para o console. No console, teremos essa opção "Authentication", no menu lateral esquerdo. Nessa opção, ele começa com essa primeira tela, falando que vamos configurar o método de login.

[04:46] Clicamos no botão “Configurar método de login”. Olha o que vai acontecer: ele vem exatamente para essa aba, que é mostrada como "Sign-in method", que seria o método de entrada que temos no nosso aplicativo, de como podemos nos inscrever nele. Temos diversos tipos de métodos. Temos o e-mail e senha, o smartphone, que seria o telefone no caso, Google e assim por diante.

[05:10] Considerando que é a nossa primeira vez, e o mais comum costuma ser essa opção de e-mail e senha, até mesmo porque o nosso aplicativo, ele já dá esse suporte, vamos considerar o uso dessa primeira opção. Para isso, você clica nela, ele abre esse balão.

[05:28] E podemos clicar nessa primeira chave para ativar, ela vai permitir que agora consigamos usar o Firebase Authentication para criar usuários, autenticar usuários, a partir do seu endereço de e-mail e senha. Então é isso o que precisamos fazer para prosseguir com os próximos passos. Os próximos passos, basicamente, é utilizarmos a biblioteca do Firebase Authentication.

[05:54] Vamos precisar dessa instância da documentação, que é esse FirebaseAuth, vamos precisar usar essa mesma instância para fazer mais alguns comportamentos. Agora sim podemos ir até mesmo no código para começarmos a fazer esses primeiros experimentos. O primeiro experimento que eu vou fazer será o experimento para conseguirmos cadastrar usuários.

[06:16] Como podemos ver aqui, nesse "Authentication" do console, além desse "Sign-in method", temos outras opções - aliás, uma coisa que eu não falei, antes de continuar, é que quando clicamos em ativar a opção de login, temos que clicar no botão "Salvar". Eu não falei isso, isso é muito importante para que ele consiga mostrar agora, nessa aba de "Users", que seriam usuários, os usuários existentes no Firebase para nós.

[06:39] No caso, no nosso projeto do Firebase. Então agora não temos nenhum e o que vamos fazer é exatamente um código que consegue cadastrar os usuários para nós. Então vamos fazer isso. Para isso, como podemos fazer? Voltamos para o nosso código, no Android Studio, e podemos mexer no nosso código exatamente na primeira activity que abre quando mexemos no nosso projeto.

[07:00] Nesse nosso caso, temos acesso à MainActivity. Dentro dela, no momento em que fazemos o onCreate, vamos botar esse código para funcionar, para ver se realmente ele está escrevendo esses usuários para nós, se ele consegue criar para nós, se fizermos toda a sincronização com o Firebase.

[07:19] Como nós vimos, vamos ter acesso à uma referência, que ela é chamada de firebaseAuth. Para conseguirmos pegar essa referência, podemos pegar a primeira referência, que é o Firebase.. Dentro desse Firebase., podemos fazer um import e podemos pegar - Na verdade é o FirebaseAuth..

[07:44] FirebaseAuth., vamos pegar esse FirebaseAuth.getInstance(), podemos fazer isso. Essa é uma maneira que podemos fazer para pegar essa instância. Aqui vamos ter acesso ao val firebaseAuth = FirebaseAuth.getInstance(). Então essa é uma maneira que temos para pegar essa primeira instância, para nos comunicarmos com o Firebase.

[08:01] A partir do momento que temos acesso a ela, já conseguimos ter acesso a todos os comportamentos que queremos fazer com o Firebase Authentication. Então aqui podemos fazer o firebaseAuth. e podemos usar alguns métodos para ter essa primeira iteração. Como eu comentei, o nosso primeiro objetivo é criar usuários com e-mail e senha.

[08:24] Então vamos ter essa opção, que é chamada de firebaseAuth.createUserWithEmailAndPassword(). Clicando dentro dos parênteses, o que vai acontecer? Precisamos mandar duas strings. Elas não são tão intuitivas para falar o que cada uma representa, mas se pegarmos a documentação, com "Ctrl + Q", indica que é o e-mail e a senha.

[08:42] Então primeiro precisamos mandar um e-mail, que nós queremos, e depois a senha. Aqui, no e-mail, vou colocar o meu nome e vou simular um padrão de e-mail, que seria ("alex@aluraesporte.com", ), essa é a primeira simulação. Em seguida, o que eu vou fazer? Eu vou colocar uma senha, que eu vou digitar como ("alex@aluiraesporte.com", "teste123").

[09:04] Agora já conseguimos colocar as informações. No momento que fazemos isso, o que vai acontecer? O Firebase, ele tentará mandar esse e-mail para o nosso Firebase Authentication, para o nosso projeto. Vamos ver o que acontece quando executamos aqui o nosso código.

[09:21] Estou executando aqui o nosso código, vamos ver se ele realmente consegue fazer esse cadastro para nós. Isso são os nossos primeiros passos, então não precisa ficar tão atento com o que vai acontecer, depois é só ver realmente se vai funcionar como o esperado. Veja só, o Android Studio, ele conseguiu executar o nosso aplicativo e agora veja que a parte visual da aplicação ainda mostra a mesma coisa.

[09:40] Então o que temos que ver é o que aconteceu no nosso console, no nosso Firebase Authentication. Estou entrando nessa nossa página do Authentication e eu vou clicar em recarregar.

[09:51] Ele já conseguiu colocar aqui o nosso usuário. Perceba que é bastante simples de fazer essa parte da integração, justamente porque conseguimos manipular todas as informações a partir daquela instância do nosso FirebaseAuth. Então agora eu quero adicionar um novo usuário. Eu venho no Android Studio, no firebaseAuth.

[10:13] Ou então nesse mesmo método anterior, dado que eu já tenho um padrão. Eu altero a linha, eu mudo um pouco o e-mail para ("alex-felipe@aluraesporte.com",) e posso mudar a senha. Vou mudar aqui, ("alex-felipe@aluraesporte.com", "teste") e vamos ver o que acontece.

[10:25] Vamos executar e vamos ver o que acontece agora, dado que eu estou colocando um novo usuário. Veja só, eu vou atualizar o console, e observe que ele não mostra nada. Por que isso acontece?

[10:36] Isso acontece porque existem algumas restrições que temos no momento em que utilizamos o Firebase Authentication, que é uma das coisas que vamos explorar durante o curso. Mas é importante mostrar para você, para você entender que às vezes você pode ter alguns problemas e pode achar que foi alguma coisa que você fez, ou então algo que foi problema de configuração, sendo que não é, sendo que às vezes é alguma restrição do Firebase.

[11:01] Então, só para adiantar, dado que não vamos explorar tanto agora, a restrição que aconteceu aqui foi justamente pela senha, porque no Firebase, temos que ter uma senha de pelo menos 6 dígitos. Vamos ver agora que colocando uma senha de 6 dígitos, ele já vai conseguir adicionar o nosso e-mail.

[11:19] Nós vemos aqui, no console, que ele consegue adicionar esse novo e-mail. Então perceba que, por mais que acessamos, por mais que seja fácil, existem situações - exceções, vamos chamar assim, que precisamos ficar atentos no momento em que estamos usando o Firebase Authentication.

[11:35] É claro, dado que é a nossa primeira vez, não vamos ficar tão atentos com essas restrições, mas conforme avançamos aqui no curso, vamos ver cada um desses passos. O importante agora é que conseguimos fazer a integração com o Firebase Authentication e já conseguimos criar os nossos usuários. A seguir vamos explorar mais sobre esses recursos.


@@06
Verificando problemas durante o cadastro

[00:00] Como vimos anteriormente, existem algumas restrições que podem fazer com que o nosso usuário não seja criado a partir do Firebase Authentication. Porém, não existem apenas as restrições que podem evitar a criação de usuário, o problema de não sincronizar o projeto Android com o Firebase também pode evitar a criação de usuário.
[00:22] Dado que isso pode ser um problema, que pode acontecer com você logo no começo, na configuração que estamos fazendo, é muito importante você saber identificar para então tomar uma ação que resolva o problema. Dado que isso é algo comum, vamos ver como conseguimos identificar esses possíveis problemas durante a criação de um usuário no Firebase Authentication.

[00:46] Vamos voltar no nosso código, no Android Studio, e agora sim vamos mexer nele para vermos como podemos fazer isso. Antes de usar esse recurso novo, uma das coisas que eu quero comentar é que dado que estamos usando o Firebase Authentication KTX, temos algumas facilidades que podemos usar durante a criação da própria instância que temos do firebaseAuth.

[01:09] Veja que eu usei esse firebaseAuth.getInstance() porque ele é o jeito mais genérico de criarmos nossa instância, mas temos um jeito mais simples, utilizando o KTX, para fazer a mesma coisa, que seria utilizando a referência firebase, que eu até tentei usar na primeira vez, mas eu preferi usar o firebaseAuth.getInstance por questão de ser genérico e funcionar no Java e no Kotlin.

[01:31] Para pegarmos do KTX, utilizando apenas val firebaseAuth = Firebase.auth, que é aquela instância, com o .auth, que ele já nos devolve esse firebaseAuth. Basicamente essa é a mudança que temos com o KTX. E o que conseguimos fazer agora para pegar o nosso código e verificar qual foi o possível problema?

[01:52] Para isso, precisamos avaliar o que acontece nesse .createUserWithEmailAndPassword. Eu vou usar o "Ctrl + Q" para vermos o que acontece. Agora vamos avaliar o que esse código faz aqui para nós. Veja que ele fala o seguinte: que ele tenta criar o usuário a partir do e-mail e da senha, se for sucesso, ele consegue, se caso não for sucesso, ele apresenta alguma falha.

[02:16] Tem até mesmo exceptions para identificar os problemas. Só que o ponto que eu quero mostrar aqui para você é que quando utilizando esse .createUserWithEmailAndPassword, além de ele já ter esse comportamento que vemos aqui, ele vai nos devolver essa referência chamada de "Task".

[02:33] Vamos pegar essa referência e vamos ver o que ela significa para nós. Então pegando firebaseAuth.createUserWithEmailAndPassword("alex-felipe@aluraesporte.com", "teste1").val, para ele devolver essa variável para nós, eu vou chamar ela de - já que task, na tradução é tarefa, eu vou chamar de val tarefa: Task<AuthResult!> =.

[02:47] Vamos ver o que esta tarefa, ela consegue fazer aqui para nós. Estou colocando a tarefa. "Ctrl+Q", ele não mostra a documentação nem nada, mas eu já vou comentando o que ela nos representa. Deixa eu ver se eu clicar, se ele mostra. Aqui ele não está mostrando, teria que entrar na documentação do Google para vermos.

[03:02] Mas, para resumir o que significa, basicamente a task, ela é uma referência da API do Google para fazer essa comunicação assíncrona, uma comunicação que vai ter sucesso, que vai ter falha, que pode ser cancelada, e assim por diante. Em outras palavras, precisamos utilizar essa referência para conseguirmos ter mais informação em relação ao que aconteceu durante o processo de criação de usuário com e-mail e senha.

[03:32] Ela é uma referência tão comum nas APIs do Google, que vamos ver que, ao criar um usuário e senha, nós conseguimos utilizar uma tarefa, ao fazer a autenticação também conseguiremos usar uma tarefa, e assim por diante. Então já fique bem atento, pois ela vai ser uma referência muito comum no seu dia a dia, quando você trabalha com o Firebase. Uma das coisas que podemos fazer aqui é usar os seus comportamentos.

[03:56] Então veja que, nos seus comportamentos, temos muita coisa disponível. Temos comportamentos para adicionar listener quando é cancelado, quando é sucesso, quando ele é completado de verdade, então não necessariamente foi sucesso ou cancelado, mas ele foi completado. E também quando é uma falha. Então veja que aqui nós podemos colocar diversos listeners para verificar o que aconteceu durante aquela execução.

[04:22] Uma das possibilidades que podemos fazer é justamente colocar tarefa.addOnSuccessListener, que aqui ele vai sempre executar quando tivermos certeza que deu certo. Então, por exemplo, dentro desse código eu posso colocar um Toast.makeText().show() e falar o seguinte - deixa eu primeiro colocar o (this) para falar que é o contexto, e vou indicar que o usuário foi cadastrado com sucesso.

[04:46] Toast.makeText(context: this, text: "Usuário foi cadastrado com sucesso", Toast.LENGHT_SHORT).show(). Então essa é uma mensagem que podemos colocar, porque se ele deu sucesso, significa que ele funcionou. Da mesma maneira, se trabalharmos com tarefa.addOnFailureListener, também vamos ter outro feedback diferente, podemos falar que aconteceu uma falha.

[05:04] Então Toast.makeText(context: this, text: "Aconteceu uma falha ao cadastrar", Toast.LENGHT_SHORT).show(). No momento que colocamos isso, sim, podemos colocar até mesmo qual foi o problema, porque ele sempre vai nos mandar uma exception. Então podemos colocar a exception para ver qual foi o problema: Toast.makeText(context: this, text: "Aconteceu uma falha ao cadastrar" $it, Toast.LENGHT_SHORT).show().

[05:22] Ou então podemos até mesmo fazer em log, porque senão a mensagem ficará muito grande na nossa tela, então podemos colocar antes dessa linha, como se fosse um log de erro: log.e(TAG, msg: "onCreate:"). Ele coloca uma mensagem de erro para nós, podemos indicar que foi no onCreate mesmo, e mandamos a nossa exception, que é o it: log.e(TAG, msg: "onCreate:", it).

[05:40] Então é também uma maneira de fazermos isso. Aqui na tag, eu ou criar uma tag do nosso MainActivity para identificarmos, então vou colocar uma constante private const val TAG =, chamar de private const val TAG: "MainAcrivity", para conseguirmos filtrar e ficar mais fácil.

[05:55] Agora podemos testar para ver o que acontece quando tentamos criar um usuário - olha só, ainda não testamos, que é exatamente o mesmo e-mail que já temos cadastrado. Vamos ver o que vai acontecer aqui. Executando. Olha só o que vai acontecer quando temos essa configuração mínima para verificar o sucesso e verificar a falha. Ele vai executar.

[06:17] E ele vai apresentar que aconteceu uma falha. Como eu comentei com vocês, a falha pode ser muito grande quando mostramos a exception, então não é tão interessante a falha no toast. Mas no log, no log catch, se filtrarmos "MainActivity" - cadê? Ele já mostra que aconteceu a falha.

[06:38] Então no onCreate, o e-mail, que ele já existe, a partir de uma outra conta, então não é possível realmente fazer esse cadastro. Agora, se colocássemos algum outro e-mail? Então eu vou colocar firebaseAuth.createUserWithEmailAndPassword("alex.felipe@aluraesporte.com", "teste1").

[06:53] E a mesma senha, a senha pode ser a mesma entre os usuários. Vamos executar e vamos ver agora, que ao fazer essa execução, ele vai nos apresentar que o usuário foi cadastrado com sucesso. Eu até escrevi errado, cadastrado. Às vezes eu esqueço essas letras. Então vamos executar novamente, agora vai falhar, porque esse e-mail já existe.

[07:15] Mas no momento que dá certo ele apresenta aquela mensagem para nós. Ele mandou aquela mesma mensagem de antes, então eu vou colocar firebaseAuth.createUserWithEmailAndPassword("alex.felipe123@aluraesporte.com", "teste1"), só para ter uma certa diferença. E vamos ver que agora sim ele vai mandar uma mensagem para nós que deu certo.

[07:33] Então é dessa maneira que temos um feedback diferente quando estamos fazendo esse procedimento. Caso você tenha algum outro problema, ele vai aparecer aqui. Nós não simulamos, mas sim, poderíamos colocar o problema que ele apresenta quando a senha é menor do que 6 dígitos.

[07:51] firebaseAuth.createUserWithEmailAndPassword("alex.felipe123@aluraesporte.com", "teste"). Vamos ver se ele apresenta essa senha para nós, mesmo que o e-mail seja igual. Vamos ver o que é prioridade para ele. Ele vai mostrar aqui que aconteceu uma falha, e aqui ele está falando que a senha - a senha, no caso é prioridade.

[08:04] Então se a senha não tem 6 dígitos, ele nem tenta verificar se o e-mail já existe, ele está nos mostrando esse erro novamente. Isso é muito importante, porque nesse primeiro momento, pode ser que você não entre nem mesmo nas restrições, que você seja barrado pelo problema de sincronização com o aplicativo Android e o Firebase.

[08:25] Dessa forma, você conseguirá identificar qual é o problema, para que então você consiga resolver e consegue dar o avanço aqui no curso, sem ter esse problema, que é uma restrição bem grave. Como nós vimos, sem ela nós não conseguimos nem mesmo utilizar os serviços do Firebase. Então agora aprendemos a verificar as restrições no momento em que estamos fazendo a criação de usuários com o Firebase Authentication.

@@07
Sobre o Firebase Authentication

Vimos que o serviço do Firebase Authentication permite implementar uma solução de autenticação em algumas plataformas, como é o caso do Android. Considerando o que vimos, marque as alternativas corretas:

Para utilizar o Firebase no Android, precisamos baixar um projeto criado pela plataforma do Firebase.
 
Alternativa correta
O Firebase Authentication permite realizar a autenticação sem configurar um back-end
 
Alternativa correta! Isso mesmo! A ideia do Firebase Authentication é evitar a complexidade de implementação de um fluxo de autenticação.
Alternativa correta
Podemos configurar o Firebase Authentication em todas as plataformas com o mesmo projeto do Firebase.
 
Alternativa correta! Isso mesmo! Como vimos, o projeto trata-se de um container de aplicativos que permite configurar mais de um aplicativo dentro dele.
Alternativa correta
No Android, o Firebase Authentication autentica apenas via e-mail e senha.

@@08
Faça como eu fiz

Criando o projeto do Firebase
Crie o projeto no console do Firebase por meio do botão Adicionar projeto:

O nome do projeto pode ser qualquer um da sua preferência
Fique à vontade em ativar/desativar o Google Analytics durante o processo.
É válido ressaltar que o visual da documentação ou console do Firebase tendem a mudar com o tempo, portanto, não se assuste caso alguma botão ou menu esteja diferente. Mesmo com as mudanças, os passos costumam ser os mesmos ou similares.
Adicionando o projeto no Firebase
No dashboard do projeto do Firebase, adicione um aplicativo Android seguindo as seguintes instruções:

Preencher os campos de pacote e apelido;
Baixar o arquivo google-services.json e colocá-lo no dentro do módulo app.
Verificar/adicionar os repositórios da Google;
Adicionar o com.google.gms:google-services no classpath do projeto e como plugin;
Adicionar a dependência a dependência com.google.firebase:firebase-analytics:17.4.3;
Após aplicar as modificações faça a sincronização e confira se o aplicativo conecta com o Firebase.

O Firebase é uma ferramenta que muda constantemente, portanto, se no passo-a-passo do Firebase tiver alguma configuração diferente, dê preferência para o Firebase e faça o que ele está solicitando.
Adicionando o Firebase Authentication no projeto
Adicione o Firebase Authentication no projeto. Para isso, insira a seguinte dependência:

implementation 'com.google.firebase:firebase-auth-ktx:19.3.1'COPIAR CÓDIGO
Então crie um usuário no onCreate() da MainActivity a partir do método createUserWithEmailAndPassword. Como auxílio, considere o uso da documentação.

Após executar o código, confira no dashboard do Firebase Authentication se o usuário foi cadastrado.

Lembre-se que o cadastro é único por e-mail, portanto, não é possível cadastrar mais de um usuário com o mesmo e-mail.
Verificando a resposta da Task
Adicione os listeners na Task do Google para verificar quando o cadastro de usuário é sucedido ou quando acontece alguma falha.

Para a identificação, adicione logs e teste a criação de um novo usuário duas vezes. Confira se os listeners são chamados como o esperado.

https://console.firebase.google.com/

https://firebase.google.com/docs/auth/android/start?authuser=0

https://developers.google.com/android/reference/com/google/android/gms/tasks/Task

https://developers.google.com/android/reference/com/google/android/gms/tasks/Task

Conforme mencionado em vídeo, o registro do aplicativo pode demorar, sendo necessária a desinstalação e instalação do App novamente, como também, várias tentativas até tudo ocorrer como o esperado.
Observe que o arquivo google-services.json não foi enviado no commit. Evitamos o envio do mesmo por questão de segurança, pois com acesso ao arquivo é possível usar os serviços do Firebase do projeto criado no curso. Portanto, evite o envio do mesmo (arquivo google-services.json do seu projeto Firebase) em projetos públicos.
Ao executar o código e atualizar o dashboard do Firebase Authentication, confira se os usuários com os e-mails enviados foram cadastrados. Na verificação da resposta da task, deve apresentar o log do listener de sucesso e na segunda deve apresentar o listener de falha indicando que o e-mail já foi registrado.

Dependendo do teste, a falha pode ser apresentada com a mensagem indicando que a senha precisa de 6 dígitos pelo menos
Você pode conferir as mudanças de código a partir destes commits:

Adicionando o Firebase no projeto
Adicionando o Firebase Authentication no projeto
Verificando a resposta da Task

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/92ada27b2c0d90e43a4d3fe78d4534e811aa3313

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/8a86e5958dd308b8cb44793a080735634eeef3e2

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/6ef487d2513fafc00045ebfbd6e2e737ba86f116

@@09
O que aprendemos?

Nesta aula aprendemos:
O que é o Firebase
Criar um projeto no console do Firebase
Registrar um App Android para utilizar os serviços do Firebase
Configurar o Firebase Authentication no projeto Android
Cadastrar usuário com o Firebase Authentication

#### 16/10/2023

@@01
Projeto da aula anterior

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo por meio deste link.

https://github.com/alura-cursos/Firebase-Authentication-Android/archive/aula-1.zip

@@02
Testando comportamentos do Firebase Authentication

[00:00] Agora que aprendemos a cadastrar e verificar as possíveis restrições durante esse processo, o nosso próximo passo é fazer a autenticação do nosso usuário. Como podemos ver no dashboard, temos acesso a alguns usuários para fazer isso. Nós só tínhamos cadastrado alguns e não atualizamos essa tela. Agora atualizando nós vemos que temos 4 usuários disponíveis e podemos tentar autenticar a partir de um deles.
[00:27] Um ponto importante também a se observar é que se de repente você fez um cadastro para fazer um teste e não lembra mais da senha, tem algumas maneiras de modificarmos esses usuários. Vamos ter, por exemplo, nesse botão de três pontos à direita do usuário, podemos redefinir uma senha, podemos excluir uma conta, podemos fazer várias coisas também nessa parte visual do Firebase, meio que será uma tela administradora.

[00:54] Podemos trabalhar bastante aqui com ela. Até mesmo adicionar usuários, eu não fiz aqui a simulação, mas podemos chegar e colocar o "alex-felipe1234@aluraesportes.com", por exemplo. E aqui a senha podemos colocar como "teste123". Podemos fazer isso sem nenhum problema.

[01:17] Uma observação também, que eu quero deixar, é a seguinte: veja que eu estou usando esse "@aluraesporte" como domínio porque é um domínio que atualmente não existe, então não vai mandar e-mail para as pessoas e assim por diante. A minha sugestão também é que você trabalhe com esses domínios que provavelmente não existe um aplicativo registrado, que você consegue fazer o uso ou envio desses e-mails.

[01:45] Então a minha sugestão é essa, dado que você está trabalhando, desenvolvendo e aprendendo. Depois que você estiver mais tranquilo, que você aprendeu sobre o Firebase Authentication, aí sim você pode usar os domínios de sua preferência, mas cabe a você decidir o que é melhor para você.

[02:01] Temos aqui os usuários. Como podemos fazer a autenticação? A autenticação é bastante simples também, assim como foi o cadastro. De volta ao Android Studio, teremos alguns métodos do firebaseAuth para fazer isso para nós. Então, antes mesmo de colocar esse código, eu já vou aproveitar esse momento para extrair esse código, que fizemos na aula passada, para identificar que ele faz parte do cadastro.

[02:21] Com ele selecionado, "Ctrl + Alt + M", na janela para extrair função, "cadastraUsuario". Então aqui já teremos um comportamento que faz isso para nós, que se navegarmos dentro dele, veremos que ele consegue cadastrar um usuário para nós, nós vemos como que faz. Eu vou deixar comentado porque não vamos trabalhar com ele, agora vamos usar o firebaseAuth para autenticar. Como fazemos isso?

[02:46] Para isso nós pegamos o firebaseAuth. e teremos esse método chamado de sign-in, que seria o se inscrever, então .signInWithCredential. Quando colocamos esse método, observe o seguinte - no caso não é nem com credential, nós fazemos o firebaseAuth.signInWithEmailAndPassword. Credential é para mandarmos uma credencial, que existe também aqui dentro do Firebase.

[03:10] Nesse caso, nós não vamos trabalhar com credentials, então vamos usar esse e-mail and password. Então firebaseAuth.signInWithEmailAndPassword(). E já podemos mandar as informações que nós conhecemos, que no caso seria o e-mail e senha. Se pegarmos a documentação novamente, vemos que essa ordem de e-mail e senha é mantida.

[03:27] Então podemos até mesmo pegar essa mesma informação que usamos no final, que seria aqui esse ("alex.felipe123@aluraesporte.com". Então nós pegamos o "alex.felipe123@aluraesporte.com", a senha aqui nós deixamos errada, de propósito, para vermos aquele erro, mas podemos voltar para 6 dígitos, para quando vermos esse método novamente.

[03:47] E aqui, no firebaseAuth.signInWithEmailAndPassword() nós colocamos as informações corretas, então é aquele e-mail, a partir de uma string, é claro. E colocamos a senha, que é a "teste1". Se não der certo, provavelmente é a "teste123". Mas podemos redefinir a senha, usar outros e-mails e assim por diante.

[04:02] Então estamos fazendo aqui esse firebaseAuth.singInWithEmailAndPassword("alex.felipe123@aluraesporte.com", "teste1"). O que nós precisamos fazer para identificar se deu certo ou não? É o mesmo procedimento da task. Aqui nós temos essa val tarefa> Task<AuthResult!> = para o firebaseAuth.createUserWithEmailAndPassword. No sign-in também teremos acesso à uma task. Então vamos ver qual é a task.

[04:23] A task também entrega um * auth result*. Dado que é muito comum esse tipo de recurso, geralmente não vemos essa referência ser retornada para uma variável, nós já fazemos chamadas encadeadas. Então aqui é muito comum colocarmos um ponto depois do firebaseAuth.singInWithEmailAndPassword("alex.felipe123@aluraesporte.com", "teste1") e colocar .addOnSuccessListener{}.

[04:46] Aqui nós já identificamos que deu certo, então colocamos o contexto aqui e coloca Toast.makeText(context: this, text: "Usuário logado com sucesso", Toast.LENGTH_SHORT).show() quando a mensagem der certo. E, da mesma maneira, quando colocamos o .addOnFailureListener{}, nós indicamos que a autenticação falhou, então é uma das maneiras que podemos fazer aqui, similar ao que fizemos no cadastro.

[05:10] Então Toast.makeText(context: this, text: "Autenticação falhou", Toast.LENGTH_SHORT).show(). E podemos fazer o mesmo procedimento de antes, então log.e(TAG, msg: "onCreate: ", ) e colocamos a exception Log.e(TAG, msg: "onCreate: ", it). Pronto, já conseguimos fazer exatamente o mesmo padrão que vimos no cadastro, só que agora é para a autenticação.

[05:31] Então percebe que quando utilizamos essas APIs do Firebase, Google, teremos muitas semelhanças, isso porque essa task, como nós vimos, ela é muito comum no uso desta biblioteca do Google. Agora podemos até mesmo testar. Vamos executar aqui e vamos ver agora o que acontece quando tentamos fazer a autenticação do nosso usuário.

[05:55] Veja que ele conseguiu fazer a autenticação. Mas e se agora eu mandar uma senha errada? Vamos alterar a senha e ver o que vai acontecer. Nós precisamos sempre testar para ver o que acontece durante todos esses procedimentos.

[06:08] Vamos ver a autenticação, ela falou. Se vermos no log catch, novamente, percebemos que ele vai mostrar aqui o erro, indicando que a senha, ela é inválida ou então o usuário, ele não tem uma senha.

[06:22] Então veja que existem ali algumas mensagens que ele pode nos passar, que precisamos também identificar, considerando a documentação, as possibilidades que o Firebase Authentication nos dá. Agora, que identificamos a maneira como autenticamos, precisamos também saber quando um usuário, ele autentica e se ele já está autenticado, se ele já fez essa autenticação uma vez.

[06:47] Para isso podemos sim usar alguns recursos do Firebase, que é a partir da instância do firebaseAuth., teremos um cara aqui chamado de .currentUser. Se observarmos, ele nada mais é do que esse get current user, só que aqui estamos no Kotlin, ele pega uma propertie para nós. Se pegarmos a referência val currentUser: FirebaseUser? = firebaseAuth.currentUser, o que vai acontecer?

[07:11] Ele vai dar essa referência, chamada de FirebaseUser?, e ele vai colocar como nullable. Por que ele coloca como nullable? Deixa eu importar ele aqui. Porque a forma como ele trabalha para identificar se está autenticado ou não, é a partir da instância: se vem como nulo, não está autenticado, se não vem como nulo, significa que esse usuário foi autenticado.

[07:33] Então uma das maneiras para verificarmos se o usuário, ele foi autenticado ou não é a partir dessa verificação, que seria colocando um if() indicando (currentUser), ou então podemos até colocar um nome que faça mais sentido para nós, por exemplo, if(usuarioFirebase). Nós podemos colocar (usuariosFirebase). Se (usuarioFirebase) for diferente de nulo, if(usuarioFirebase != null) {}, o que isso significa para mim?

[07:55] Significa que eu estou logado, então deixa eu colocar aqui Toast.makeText(context: this, text: "Usuário logado", Toast.LENGTH_SHORT).show(). E até mesmo você pode colocar a instância desse usuário para você ver o que tem de informação. Vamos lá: Toast.makeText(context: this, text: "Usuário logado $usuarioFirebase", Toast.LENGTH_SHORT).show().

[08:13] E agora quando for falso, indicamos else {}, que não tem ninguém logado. Até mesmo precisamos mandar uma mensagem, porque a nossa verificação é para verificar se está logado ou não. Você pode também colocar, dado que é só um teste, podemos colocar que não tem usuário logado, Toast.makeText(context: this, text: "Não tem usuário logado", Toast.LENGTH_SHORT).show().

[08:33] Então essa é uma das maneiras. E aqui sim podemos até mesmo ver, colocar um log, ou até mesmo colocar a instância, para vermos que será nulo quando isso acontecer. Então Toast.makeText(context: this, text: "Não tem usuário logado $usuarioFirebase", Toast.LENGTH_SHORT).show(). Nós vamos ver que será nulo quando ele não estiver logado.

[08:48] Podemos executar o nosso código, só para vermos se realmente está funcionando eu vou extrair todo esse código do signInWithEmailAndPassword, que nos representa o quê? Representa a autenticação, ou então o login. Então vou chamar essa função de "autenticaUsuario". Vou deixar ela comentada, porque já autenticamos uma vez.

[09:06] Vamos ver o que acontece agora só com esse código que verifica se está logado. Então eu estou executando o código e vamos ver agora o que vai acontecer quando tentamos verificar se ele está logado.

[09:19] Veja aqui: usuário logado. Ele mostra uma instância da Google, indicando que é a referência que temos acessível. Então aqui não temos nada de log, não temos nenhum erro, isso considerando o nosso código. Então parece que tudo funcionou numa boa. Veja que a partir do momento em que autenticamos com um usuário, ele é mantido.

[09:41] Se você quiser ver mais informações, você também tem acesso a partir de algumas propriedades que temos disponíveis. Por exemplo, temos acesso ao e-mail, se agora executarmos novamente, vamos ver qual foi esse último usuário que foi logado, que é uma das maneiras interessantes de verificarmos.

[09:58] Então foi o "alex.felipe123@aluraesportes.com". Agora eu vou modificar um pouco e usar um outro e-mail, para vermos o que acontece. Qual e-mail que eu vou usar aqui? Eu vou usar esse primeiro, o "alex@aluraesporte.com". Vamos ver se eu acerto a senha de primeira, provavelmente é aquele "teste123".

[10:15] Então eu vou entrar no autenticaUsuario, vou substituir o e-mail e a senha do código por ("alex@aluraesporte.com", "teste123"), e eu vou tentar o 123. Vamos ver se eu acerto aqui, pessoal. Executando aqui, vamos ver se essa parte de login, ela funciona.

[10:30] Então o usuário antes logado era o outro, a autenticação falhou, provavelmente é a outra senha. Eu vou deixar só "teste1" e vamos ver se acontece. Primeiro temos que fazer essa autenticação para depois verificarmos.

[10:42] Ele ainda está logado com aquele outro usuário, então a autenticação ainda falou. Ele está falando que o e-mail, ele foi mal informado - porque tem esse espaço aqui no final, antes de fechar aspas. Por isso é muito importante ter esse log no final. Às vezes eu já tinha acertado a senha, mas o e-mail não estava correto, então o log se faz muito necessário nesse momento.

[11:00] Agora vamos ver o que ele falou: a senha agora está errada. Acho que eu tinha acertado a senha, só que o e-mail eu tinha errado. Na hora que eu colei, ele veio com aquele espaço em branco. Então agora sim o usuário logado com sucesso.

[11:13] Muito provavelmente no momento em que eu verificar o último usuário, sem fazer a autenticação, ele vai mostrar o "alex@aluraesporte.com". Vamos ver se é isso mesmo.

[11:25] Agora sim ele conseguiu nos mostrar. Então perceba que esse usuário, ele sempre vai apresentar o último usuário que foi logado no Firebase Authentication. Só que agora vem aquela questão também: dado que aprendemos a logar, como fazemos para deslogar, para tirar esse usuário que foi logado?

[11:44] Para isso podemos fazer uma chamada muito simples, que é o método do firebaseAuth. chamado de .signOut(), ele vai se retirar. No momento que ele faz o firebaseAuth.signOut(), vamos ver que a primeira, quando executarmos, ele ainda vai mostar logado, porque ele ainda não executou o sign out.

[12:02] Só que agora, quando executarmos mais uma vez, ele vai mostrar que não tem usuário logado, como vemos, uma referência nula. E só vai mostrar realmente que tem um usuário logado quando fizermos a autenticação. Enquanto não fizermos a autenticação, ele não consegue mostrar que tem algum usuário logado. Podemos até mesmo tentar cadastrar um usuário, para ver se no cadastro ele já autentica.

[12:25] Nós vamos ver que será um comportamento que não vai funcionar da maneira que esperamos. Então eu vou deixar o firebaseAuth.createUserWithEmailAndPassword("alex.felipe12345@aluraesporte.com", "teste1"), só para garantir, "teste1". Eu vou tentar cadastrar vamos ver o que vai acontecer. Estou cadastrando aqui, não tenho usuário logado.

[12:41] O usuário foi cadastrado com sucesso. Agora eu vou comentar a parte de cadastro de usuário e vamos ver se ele já autentica para nós, se não precisamos autenticar. Vamos ver agora o que vai acontecer.

[12:52] Ele já coloca aqui mesmo como logado. Então, no cadastro, ele já faz isso para nós. Se ele cadastrou, ele já autentica. Então veja que é um dos recursos também que podemos utilizar. Mas, novamente, isso é um cadastro seguido de uma autenticação. Aqui nós criamos um método, um comportamento focado na autenticação.

[13:11] Então veja que são comportamentos diferentes, por mais que o resultado final seja a autenticação de fato. Mas é isso que é importante considerarmos, isso que é importante entendermos: os comportamentos mínimos para conseguirmos cadastrar, apenas autenticar, verificar se está logado ou se não está logado e agora esse novo comportamento, que é o nosso sign out, para que ele consiga remover esse usuário que foi logado.

[13:39] Remover no sentido de tirar ele de login, deslogar. Então agora aprendemos esses principais comportamentos. Agora que temos esse conhecimento, veremos maneiras de como podemos integrar o Firebase Authentication apenas a partir desses comportamentos com o aplicativo Android, isso seguindo um fluxo do aplicativo.

@@03
Integrando cadastro com o fluxo do App

[00:00] Agora que aprendemos a usar os comportamentos comuns do Firebase Authentication, podemos seguir com o próximo passo, que é fazer a integração desses recursos que nós vimos aqui disponíveis com o fluxo do nosso aplicativo. Então é adicionar o comportamento de logar e o comportamento também de cadastrar um usuário. É isso o que vamos fazer.
[00:22] E vamos fazer exatamente como nós testamos aqui. Primeiro vamos começar com o cadastro do nosso usuário, para depois então fazer o comportamento de autenticação. Para isso, primeiro eu vou extrair esse comportamento que verifica o usuário e também vou extrair o comportamento que desloga. Eu vou pegar todo esse código e vou chamar a função de "verificaUsuario".

[00:44] Então "verificaUsuario". Você pode colocar mais extenso, se você preferir como, por exemplo, "verificaSeOUsuarioEstaLogado", é uma maneira. Eu só vou deixar como "VerificaUsuario". Então eu deixei aqui. Por fim, vou pegar esse comportamento, que ele desloga e vou chamar de "desloga" apenas. Agora sim nós já temos os comportamentos extraídos, bem bonitos.

[01:08] E o que precisamos fazer é realmente mandar esses comportamentos para uma classe, que seja exclusiva deles, porque não vamos fazer isso dentro da nossa MainActivity, correto? Então primeiro precisamos tirar esses comportamentos. Eu estou limpando novamente a nossa MainActivity. Agora precisamos, de alguma maneira, mandar esses comportamentos para alguém que seja responsável por lidar com eles.

[01:34] Como podemos ver aqui, esse aplicativo, ele já segue um padrão, que fizemos durante o curso de Navigation 2, que é o padrão utilizando os Architecture Components, que seriam os componentes de arquitetura da própria Google. Então podemos perceber que aqui, no momento em que acessamos uma tela, temos o acesso ao ViewModel.

[01:54] No ViewModel nós geralmente teremos acesso a um repositório. Nesse caso aqui, considerando todas as técnicas que aprendemos, da ideia de repositório e assim por diante, precisamos pegar todo aquele código que está na MainActivity e mandar para um repositório que seja exclusivo para fazer essa integração com o Firebase, essa comunicação. Então o que vamos fazer agora é criar um repositório para o Firebase Authentication.

[02:24] Então eu vou pegar aqui todo esse código, que fizemos nas aulas passadas, vou fazer um "Ctrl + X" - então eu estou tirando da MainActivity, a MainActivity não tem mais esses comportamentos. E eu vou criar primeiro aqui um repositório. Eu estou criando aqui um "Kotlin File Class", uma classe, e eu vou chamar de "FirebaseAuthRepository". Esse é o padrão que estávamos considerando durante todo o curso e é o que vamos manter aqui.

[02:50] Eu estou usando o Git, então deixa eu desmarcar para não aparecer mais essa janela, porque eu não quero colocar o add nesse momento. Agora sim podemos usar, colocar esses comportamentos aqui que estamos vendo. É claro, precisamos fazer aqui agora alguns imports, alguns ajustes, porque não vamos ter acesso a, por exemplo, referência de contexto no repositório.

[03:11] Então não vamos mais trabalhar com tags, não vamos mais trabalhar com esse Toast.makeText. O que vamos brincar agora é só realmente com essas chamadas que temos das tasks e então vamos ver, mais para frente, com integramos com os recursos que já aprendemos, utilizando os Architecture Components.

[03:32] Então eu estou removendo os toasts, só para deixar limpo e deixar o código compilando. Então tirando o Toast.makeText desse aqui também. Beleza, removemos todas essas referências que têm acesso ao context e agora sim temos um "FirebaseAuthRepository", que ele tem os comportamentos que integram com o Firebase Authentication.

[03:55] Agora o nosso próximo passo é verificar o código que temos aqui, do nosso cadastro, para ver o que podemos fazer para pegar essas informações e, depois de pegar essas informações, tentamos fazer uma chamada aqui para cadastrar. Então é isso o que vamos fazer nesse primeiro momento.

[04:13] Para acessar o cadastro teremos o CadastroUsuarioFragment. É o fragment que disponibiliza aquele layout do aplicativo e nós conseguimos pegar as suas informações. Então, veja só: no onViewCreated, quando clicamos no botão "Cadastrar", basicamente pedimos para o controlador do Navigation voltar uma tela. Nós não fazemos nenhuma lógica aqui, a lógica é muito simples: só volta uma tela.

[04:38] Agora, essa parte de voltar uma tela, nós vamos comentar neste momento, porque nós não vamos voltar ainda na tela enquanto as coisas não estiverem integradas. Agora, o que precisamos fazer é pegar as informações que vem dos campos e-mail e senha. Para isso, podemos usar alguns recursos, que seria a partir do nosso cadastro_usuario_email.

[05:00] Ele é um text input layout, então temos que pegar o .editText, que é o editable, e precisamos garantir que ele não é nulo, pois ele pode ser nulo. Garantindo isso, nós pegamos a informação do text. Depois, pelo text, podemos pegar o .toString para então pegar a informação que está no campo. E val email: String = cadastro_usuario_email_editText?.text.toString() representa um e-mail para nós.

[05:20] Então é basicamente isso que temos que fazer para pegar essa informação de e-mail. A senha é a mesma coisa, mudando apenas os campos, então vou até mesmo reaproveitar o código: val senha: String = cadastro_usuario_senha_editText?.text.toString(). A parte de confirmação da senha, nós não vamos nos preocupar neste momento.

[05:33] Vamos primeiro ver se funciona essa integração e, quando ela funcionar, melhoramos essa parte de experiência do usuário, validações e assim por diante. Então temos aqui o nosso e-mail e senha. Agora, o que precisamos fazer? Precisamos de alguma maneira, acessar esse repositório. Só que como vimos, nessa arquitetura, precisamos primeiro acessar um view model, e não temos aqui um view model para essa classe.

[06:01] Então também precisamos criar esse view model. Como podemos criar o view model? Podemos vir no menu lateral esquerdo, no "ui > viewmodel" e aqui criamos um novo arquivo em Kotlin, que será chamado de "CadastroUsuarioViewModel". Na criação do view model, podemos fazer a partir da classe cadastro - nem sei por que eu não coloquei a opção de criar a classe, mas tudo bem.

[06:25] Então escrevemos o nome da classe e estendemos do view model do life cycle : import androidx.lifecycle.ViewModel. Aqui nós colocamos o construtor da classe mãe, class CadastroUsuarioViewModel : ViewModel {} e temos aqui o nosso view model. Esse nosso view model, ele tem que ter pelo menos um comportamento para receber o e-mail e senha, que será chamado de cadastra.

[06:45] fun cadastra(), vamos colocar o nosso e-mail, então será fun cadastra(email: String, senha: String) {} e também a senha, que será uma string. Aqui dentro temos que ter acesso, de alguma maneira, com o nosso repositório. Nesse projeto eu estou usando o Koin, que é uma ferramenta para fazermos injeção de dependência. Então o que eu posso fazer?

[07:10] Basicamente eu posso falar que, ao criar o view model, eu terei acesso a uma propriedade, que eu vou chamar de (private val), que será uma propriedade. Vou chamar de (private val repository) por enquanto, porque é só um repositório que teremos acesso. E aqui, class CadastroUsuarioViewModel(private val repository: FirebaseAuthRepository) : ViewModel()vou colocar como FirebaseAuthRepository.

[07:33] Dessa maneira temos acesso ao nosso repositório. Aqui dentro podemos falar o seguinte: “olha, repositório, tente cadastrar para mim”. Ele não vai ter nada, porque é tudo privado, e agora temos que fazer essa modificação. O que nós precisamos fazer é o cadastro, então cadastraUsuario, vamos deixar ele como público, e também vou chamar só de cadastra, porque já sabemos que ele cadastra um usuário para nós, então fun cadastra.

[07:55] Voltando no view model, basicamente só coloca um cadastra, mandando agora o e-mail e senha: repository.cadastra(email, senha). Não funciona porque ele não tem uma assinatura que recebe e-mail e senha, então podemos modificar essa linha e falar para ele modificar os parâmetros que tem no nosso repositório. Então eu usei a primeira opção e agora eu vou adicionar mais um parâmetro, que no caso vai ser de senha.

[08:20] Vamos ver como é que ficou. "Ctrl + B", ele adicionou para nós. Então ele colocou o nome firebaseAuth porque ele não sabia exatamente onde ele poderia substituir, tudo bem. O que precisamos fazer é só colocar como e-mail. Veja só o seguinte: no momento em que fizemos esse tipo de alteração, ele já não tem mais acesso à referência do firebaseAuth e precisamos também ter acesso a ela.

[08:45] Nesse caso, essa referência pode ser acessível a partir do construtor. Por quê? Porque aqui estamos utilizando o nosso Koin, que ele faz a injeção de dependência. Então, fazendo dessa maneira, recebendo via construtor, a seguir, o que precisamos fazer é configurar o Koin, para que ele crie tanto o repositório como também o view model, e ele já coloca essas instâncias que nós precisamos, ela já injeta para nós. É isso o que vamos fazer.

[09:12] Agora que sabemos que temos acesso ao firebaseAuth, o que precisamos colocar aqui agora é só o e-mail e senha que recebemos, ao invés desses * hardcoded*. Então vamos lá, colocar no cadastra, firebaseAuth.createWithEmailAndPassword(email, senha). A princípio vamos fazer só dessa maneira, que é a maneira mais simples. Vamos deixar dessa forma.

[09:37] Se você preferir, você pode colocar também um log, porque não vamos ter acesso, por exemplo, a um contexto, então um log pode ser suficiente aqui. Então vou colocar Log.i(TAG, msg: "cadastra: ") para ele falar que deu certo. Vou até criar uma tag - deixa eu criar uma tag para o nosso repositório. Lá em cima, após os imports - deixar privado: private const val TAG = "FirebaseAuthRepository", só para identificar a tag.

[10:11] Agora que temos a tag, no cadastra, podemos falar Log.i(TAG, msg: "cadastra: cadastro sucedido"). Então podemos deixar essa mensagem só para vermos se realmente funcionou. Aqui embaixo podemos colocar uma mensagem diferente: Log.e(TAG, msg: "cadastra: cadastro falhou", it). Podemos colocar isso, indicando a exception que temos acesso.

[10:36] É uma das maneiras que podemos fazer sem nenhum vínculo ao contexto, agora que estamos fazendo a primeira implementação. Pronto, temos aqui as chamadas, correto? O que falta agora é realmente conectar as coisas. Por exemplo, precisamos chegar no nosso CadastroUsuarioFragment e dar acesso ao nosso view model.

[10:56] Por exemplo, eu vou chegar no CadastroUsuarioFragment e falar que ele vai ter acesso ao view model, vou chamar de viewModel, que será private val viewModel: CadastroUsuarioViewModel by viewModel() e dado que estou usando o Koin, vou indicar que ele será chamado a partir do viewModel, que será uma referência do Koin. É essa a referência que ele usa, então vou colocar aqui.

[11:18] viewModel() é a referência do Koin, podemos ver aqui em cima, nos imports. Caso você não tenha visto como funciona o Koin, vai ter um vídeo da Alura+ disponível para você. No caso aqui, ele já está usando para nós. Agora, o que temos que fazer é chamar o cadastro. Então no onViewCreated, viewModel- no caso, cadastra, que é o método. viewModel.cadastra.(email, senha). É basicamente isso que temos que fazer.

[11:41] Só que agora, o que temos que modificar é que, no nosso módulo do Koin, temos que adicionar essas novas dependências. Vamos acessar, a partir do "Ctrl + Shift + N", "app modules". Aqui embaixo podemos adicionar as referências que já temos. No caso seria a referência de view model, que temos aqui. Então viewModel {}.

[12:04] Temos acesso agora, deixa eu colocar aqui, ao viewModel<CadastroUsuarioViewModel> {}, e dentro das chaves simplesmente colocamos a instância, então {CasdatroUsuarioViewModel(get())} e falamos para ele pegar via get a instância do repositório. Agora que precisamos do repositório, precisamos criar ele também. Então para cima, cadê os repositórios? Onde estamos criando? Repository, aqui no aoModule mesmo.

[12:28] Eu vou criar agora o do Firebase, que criamos ali. Então será um single, porque não precisa ser mais do que um single. Nós colocamos como single<FirebaseAuthRepository> (). Aqui dentro nós criamos a instância desse repositório, que será o nosso (FirebaseAuthRepository()). Dentro dele fazemos, novamente, um (get), então colocamos um get entre os parênteses.

[12:53] Eu não coloquei aqui as chaves, deixa eu colocar as chaves aqui, para não errar. E vamos lá: single<FirebaseAuthRepository> {FirebaseAuthRepository(get())}, colocando aqui o get, para ele também resolver a instância do FirebaseAuth. Agora vamos adicionar o módulo do Firebase, para poder colocar também instâncias que sejam relacionadas ao Firebase.

[13:13] Então aqui, no final, vai ser val firebaseModule = module{, e aqui dentro teremos acesso ao nosso firebaseAuth. Nesse caso também vou deixar como single. Se caso for necessário deixar como uma instância cada vez que usarmos, colocamos como factory. Então não tem nenhum problema, podemos começar com o single a princípio.

[13:35] single<FirebaseAuth> e agora temos que colocar a instância, que vai ser a parte de quem? Daquela referência Firebase. Aqui dentro teremos acesso ao auth, é basicamente isso: single<Firebase> {Firebase.auth}. Beleza, temos o nosso módulo. Só para finalizar, temos que colocar esse módulo na application. Então em AppApplication, carregamos também esse módulo.

[13:57] São bastante passos, mas só fazemos uma vez, depois não precisamos fazer mais. Só para recapitular: nós conseguimos colocar aqui os módulos, tanto o do FirebaseAuth como também do repositório e também do nosso view model. No FirebaseAuthRepository temos acesso ao nosso repositório, dedicado ao Firebase Authentication.

[14:15] Agora, no nosso CadastroUsuarioFragment, temos acesso tanto ao e-mail e senha dos campos, como também ao view model, que permite fazer esse cadastro. Então vamos tentar e ver se temos a sorte de funcionar de primeira. Para isso vamos abrir o nosso aplicativo, vamos deixar o log catch aberto também, porque o feedback que vamos ter será via log catch.

[14:38] Agora eu vou tentar cadastrar um usuário. Eu vou até chamar de "teste123@aluraesporte.com", esse vai ser o e-mail. A senha "teste1". Clico no botão "Cadastrar". Vamos ver o que vai acontecer. Ele chamou o cadastra do FirebaseAuthRepository, cadastro sucedido.

[14:59] Para termos certeza, vamos no console, nos nossos usuários e verificamos. Vamos ver aqui, cadê? "teste123@aluraesporte.com", ele conseguiu colocar. Vamos testar mais uma vez, só para ver se ele falha, para ver se essa integração é realmente feita. Olha só, ele falha.

[15:12] Então realmente está funcionando. Só para garantir que realmente está funcionando mesmo, vamos tentar cadastrar um novo e vamos ver o que acontece. Então o cadastro foi bem sucedido. Vamos ver no console. Olha só, ele conseguiu colocar.

[15:25] E se tentarmos colocar mais uma vez, ele vai apresentar aquela mensagem de antes. Olha só, ele apresenta. Então nós conseguimos fazer a primeira etapa da integração. Existem mais coisas que precisamos fazer, mas o primeiro passo, o core, o núcleo da coisa, nós já conseguimos implementar. Até já.

@@04
Finalizando o fluxo do cadastro com o LiveData

[00:00] Agora que a nossa tela de cadastro consegue enviar os usuários para o Firebase, o nosso próximo passo é implementar uma solução na qual segue o fluxo esperado, como, por exemplo ao cadastrar, precisamos voltar para a tela de login para indicar que esse cadastro foi feito com sucesso. Vamos agora ver como podemos implementar isso.
[00:21] Voltando aqui no código, no Android Studio, o que precisamos fazer é conectar cada um dos componentes que nós utilizamos. Tanto o CadastroUsuarioFragment, o CadastroUsuarioViewModel e o FirebaseAuthRepository precisam se comunicar entre eles para fazer esse fluxo. Uma das maneiras que podemos fazer é implementando um live data.

[00:40] Um live data, que terá um valor boolean, que vai indicar: se for verdade, significa que o cadastro foi feito, caso contrário, teve algum problema durante o cadastro. É isso que vamos implementar agora. Para colocar esse live data, o que podemos fazer é que no momento do cadastra, podemos colocar o retorno LiveData<Boolean>.

[01:00] fun cadastra(email: String, senha: String): LiveData<Boolean> {, esse é o começo da nossa implementação, basta apenas importar o LiveData. Agora que estamos nos comprometendo a devolver esse live data, precisamos então retornar um live data que faça isso para nós.

[01:13] Aqui eu já vou indicar que teremos esse return liveData, e agora vamos criar esse live data que fará essa comunicação com os outros componentes. Para criar esse live data, precisamos usar a referência MutableLiveData, porque é ela quem vai permitir modificar o valor assim que tivermos o retorno dessa API do Firebase.

[01:36] Então aqui eu vou indicar que é um MutableLiveData<Boolean>(). Eu vou criar aqui a instância e vou chamar essa instância de val liveData, assim como eu coloquei lá no fundo que eu estou retornando. É isso o que vamos fazer aqui. Agora que temos acesso a um live data, o que precisamos fazer é só indicar que, no momento em que der sucesso, vamos mandar o valor true.

[01:58] E, no momento em que ocorrer a falha, vamos mandar o valor false. Então colocamos o liveData.value = true e mandamos um true. Nós podemos fazer isso. No caso da falha, nós colocamos um liveData.value = false. Dessa forma nós já conseguimos ter uma comunicação mínima para falar: olha, deu certo ou não.

[02:23] Aqui, no CadastroUsuarioViewModel, nós precisamos mandar esse valor também para o CadastroUsuarioFragment. Para isso basta também nos comprometermos em falar que vamos retornar um LiveData<Boolean>. Vou importar o LiveData. E fazendo aqui o retorno propriamente do nosso repositório, porque o cadastro dele já faz esse retorno, então nós meio que podemos delegar essa responsabilidade diretamente para o repositório.

[02:47] E aqui, no CadastroUsuarioFragment, precisamos agora modificar o nosso código para reaproveitar e pegar essa informação do live data. Para isso, podemos fazer viewModel.cadastra(email, senha).observable(), como já fizemos em outros códigos. Aqui, no parênteses do observable, podemos mandar o nosso life cycle (owner: this).

[03:04] Podemos começar com o this da mesma maneira que fizemos anteriormente, só que agora a boa prática é enviar o owner da própria view do fragment. Então temos aqui um outro owner, que se chama da seguinte maneira: (viewLifeCycleOwner), é essa a boa prática para utilizarmos nos fragments quando temos a visualização. Então fica essa sugestão, dica e recomendação para colocar como life cycle owner.

[03:32] Em seguida, o que precisamos colocar aqui é justamente um observable para poder capturar o valor que é retornado. Então a primeira coisa, visto que pode ser um valor nulo, é garantirmos que ele não é nulo, então colocamos it?., colocando o safe call, e agora sim podemos indicar que temos uma informação chamada de cadastrado. Eu vou chamar dessa forma porque é um boolean.

[03:54] Dessa forma, it?,Let {cadastrado:Boolean =>, eu coloco o if(cadastrado) {, indicando se ele foi cadastrado, eu quero fazer alguma ação esperada. Nesse caso, seria voltar para a tela de login, controlador.popBackStack() ^let}. Caso contrário, eu quero fazer alguma outra coisa, mandar alguma mensagem, por exemplo

[04:11] Podemos colocar um toast, só que aqui eu vou colocar um outro componente, que não exploramos tanto assim durante os cursos da Alura, que é o snackbar. Em muitos cursos que eu fiz aqui eu não usei esse recurso, e é um recurso bastante comum, eu vou usar agora para termos uma diferença visual.

[04:27] Então temos um Snackbar., ele será muito similar ao que temos no toast, a diferença está apenas nos argumentos que precisamos mandar. A view que nós mandamos logo no começo, como podemos ver, é onde ele será apresentado, então podemos mandar a própria view do fragment, que temos aqui disponível, ou então a própria property.

[04:47] Em seguida, o que nós temos? Temos um texto, que seria equivalente ao texto que mandamos no toast, então podemos falar que ocorreu uma falha no cadastro. Por fim, temos a duração, que é o duration, que é similar ao que temos no toast, só que aqui vamos usar a classe do snackbar como a classe referência ao invés de ser a toast, para pegar a constante, que nesse caso vai ser um length short.

[05:14] Então temos aqui essa parte da duração. Por fim, só colocamos um show, Snackbar.make(View, text: "Ocorreu uma falha no cadastro", Snackbar.LENGTH_SHORT).show(). Assim vemos que é muito similar ao que temos no toast, só que veremos que terá um visual um pouco diferente. Estou colocando os argumentos para ficarem em múltiplas linhas.

[05:31] Agora podemos testar para ver se realmente funciona conforme o esperado. Então eu vou executar o nosso código e vamos ver agora o que vai acontecer ao cadastrar um novo usuário a partir dessa nossa implementação que terá um fluxo diferente. Na aplicação, clico no botão "Cadastrar usuário", vou colocar um e-mail que não tem.

[05:49] Deixa eu até ver um no console. Eu vou usar esse Alex aqui, vou só colocar mais alguns valores. Então eu vou colocar aqui, deixa eu colocar um paste, e eu vou mudar para "alex123@aluraesporte.com". A senha eu vou deixar "teste1" e vou clicar em "Cadastar". Vamos ver o que vai acontecer.

[06:08] Ele aconteceu aqui e falou que ocorreu uma falha. Precisamos ver agora o que acontece. Veja que ele nos mostrou o snackbar, ocorreu uma falha. Vamos entrar no nosso Android Studio, vamos ver o log catch e vamos ver qual é a falha que está acontecendo.

[06:25] Ele está falando que o email foi mal formatado. Muito provavelmente é por causa daquele espaço no final, que ele coloca ao fazer a cópia. Vamos apagar esse espaço e clicar em "Cadastrar" novamente. Agora que deu certo, vamos até ver aqui o log, olha só, deu certo aqui - cadê? Eu vou buscar aqui "cadastra:", que foi aquele filtro.

[06:45] Cadastro com sucesso, ele conseguiu voltar para a tela de login. Se viermos no console, nos usuários, vai apresentar agora esse novo usuário que nós colocamos.

[06:56] Então essa parte da integração, ela está funcionando, nós vemos que funciona numa boa. Inclusive, uma das coisas que podemos tentar fazer é colocar o snackbar no código quando der certo, além de voltar para a tela inicial. Vou no CadastroUsuarioFragment, chegar aqui e colocar um Snackbar.make(view, "Cadastro realizado com sucesso", Snackbar.LENGTH_SHORT).show().

[07:15] Vamos testar para ver se realmente funciona. Então vamos executar aqui novamente, vamos fazer o mesmo fluxo e vemos ver o que acontece, agora que tentamos fazer o cadastro novamente. Eu vou fazer paste e já vamos olhar - ele copiou o código do snackbar. Deixa eu copiar, vou cortar aqui. Cortei, não preciso apagar caractere por caractere.

[07:43] Eu vou copiar o e-mail do console, para fazer apenas uma mínima modificação. Deixa eu colar na aplicação. Ele coloca o espaço em branco, nós tiramos, e então eu vou colocar mais um número, só para poder variar um pouco e conseguir fazer o teste: "alex1234@aluraesporte.com".

[07:57] Vamos tentar cadastrar, considerando que teve essa modificação. Agora temos essa modificação do cadastro realizado com sucesso, vamos ver o que aparece aqui para nós. Executando a aplicação, o cadastro é realizado com sucesso.

[08:10] Então nós temos essas duas opções do nosso fluxo para poder apresentar para o nosso usuário o que aconteceu durante o processo de cadastro.

@@04
Finalizando o fluxo do cadastro com o LiveData

[00:00] Agora que a nossa tela de cadastro consegue enviar os usuários para o Firebase, o nosso próximo passo é implementar uma solução na qual segue o fluxo esperado, como, por exemplo ao cadastrar, precisamos voltar para a tela de login para indicar que esse cadastro foi feito com sucesso. Vamos agora ver como podemos implementar isso.
[00:21] Voltando aqui no código, no Android Studio, o que precisamos fazer é conectar cada um dos componentes que nós utilizamos. Tanto o CadastroUsuarioFragment, o CadastroUsuarioViewModel e o FirebaseAuthRepository precisam se comunicar entre eles para fazer esse fluxo. Uma das maneiras que podemos fazer é implementando um live data.

[00:40] Um live data, que terá um valor boolean, que vai indicar: se for verdade, significa que o cadastro foi feito, caso contrário, teve algum problema durante o cadastro. É isso que vamos implementar agora. Para colocar esse live data, o que podemos fazer é que no momento do cadastra, podemos colocar o retorno LiveData<Boolean>.

[01:00] fun cadastra(email: String, senha: String): LiveData<Boolean> {, esse é o começo da nossa implementação, basta apenas importar o LiveData. Agora que estamos nos comprometendo a devolver esse live data, precisamos então retornar um live data que faça isso para nós.

[01:13] Aqui eu já vou indicar que teremos esse return liveData, e agora vamos criar esse live data que fará essa comunicação com os outros componentes. Para criar esse live data, precisamos usar a referência MutableLiveData, porque é ela quem vai permitir modificar o valor assim que tivermos o retorno dessa API do Firebase.

[01:36] Então aqui eu vou indicar que é um MutableLiveData<Boolean>(). Eu vou criar aqui a instância e vou chamar essa instância de val liveData, assim como eu coloquei lá no fundo que eu estou retornando. É isso o que vamos fazer aqui. Agora que temos acesso a um live data, o que precisamos fazer é só indicar que, no momento em que der sucesso, vamos mandar o valor true.

[01:58] E, no momento em que ocorrer a falha, vamos mandar o valor false. Então colocamos o liveData.value = true e mandamos um true. Nós podemos fazer isso. No caso da falha, nós colocamos um liveData.value = false. Dessa forma nós já conseguimos ter uma comunicação mínima para falar: olha, deu certo ou não.

[02:23] Aqui, no CadastroUsuarioViewModel, nós precisamos mandar esse valor também para o CadastroUsuarioFragment. Para isso basta também nos comprometermos em falar que vamos retornar um LiveData<Boolean>. Vou importar o LiveData. E fazendo aqui o retorno propriamente do nosso repositório, porque o cadastro dele já faz esse retorno, então nós meio que podemos delegar essa responsabilidade diretamente para o repositório.

[02:47] E aqui, no CadastroUsuarioFragment, precisamos agora modificar o nosso código para reaproveitar e pegar essa informação do live data. Para isso, podemos fazer viewModel.cadastra(email, senha).observable(), como já fizemos em outros códigos. Aqui, no parênteses do observable, podemos mandar o nosso life cycle (owner: this).

[03:04] Podemos começar com o this da mesma maneira que fizemos anteriormente, só que agora a boa prática é enviar o owner da própria view do fragment. Então temos aqui um outro owner, que se chama da seguinte maneira: (viewLifeCycleOwner), é essa a boa prática para utilizarmos nos fragments quando temos a visualização. Então fica essa sugestão, dica e recomendação para colocar como life cycle owner.

[03:32] Em seguida, o que precisamos colocar aqui é justamente um observable para poder capturar o valor que é retornado. Então a primeira coisa, visto que pode ser um valor nulo, é garantirmos que ele não é nulo, então colocamos it?., colocando o safe call, e agora sim podemos indicar que temos uma informação chamada de cadastrado. Eu vou chamar dessa forma porque é um boolean.

[03:54] Dessa forma, it?,Let {cadastrado:Boolean =>, eu coloco o if(cadastrado) {, indicando se ele foi cadastrado, eu quero fazer alguma ação esperada. Nesse caso, seria voltar para a tela de login, controlador.popBackStack() ^let}. Caso contrário, eu quero fazer alguma outra coisa, mandar alguma mensagem, por exemplo

[04:11] Podemos colocar um toast, só que aqui eu vou colocar um outro componente, que não exploramos tanto assim durante os cursos da Alura, que é o snackbar. Em muitos cursos que eu fiz aqui eu não usei esse recurso, e é um recurso bastante comum, eu vou usar agora para termos uma diferença visual.

[04:27] Então temos um Snackbar., ele será muito similar ao que temos no toast, a diferença está apenas nos argumentos que precisamos mandar. A view que nós mandamos logo no começo, como podemos ver, é onde ele será apresentado, então podemos mandar a própria view do fragment, que temos aqui disponível, ou então a própria property.

[04:47] Em seguida, o que nós temos? Temos um texto, que seria equivalente ao texto que mandamos no toast, então podemos falar que ocorreu uma falha no cadastro. Por fim, temos a duração, que é o duration, que é similar ao que temos no toast, só que aqui vamos usar a classe do snackbar como a classe referência ao invés de ser a toast, para pegar a constante, que nesse caso vai ser um length short.

[05:14] Então temos aqui essa parte da duração. Por fim, só colocamos um show, Snackbar.make(View, text: "Ocorreu uma falha no cadastro", Snackbar.LENGTH_SHORT).show(). Assim vemos que é muito similar ao que temos no toast, só que veremos que terá um visual um pouco diferente. Estou colocando os argumentos para ficarem em múltiplas linhas.

[05:31] Agora podemos testar para ver se realmente funciona conforme o esperado. Então eu vou executar o nosso código e vamos ver agora o que vai acontecer ao cadastrar um novo usuário a partir dessa nossa implementação que terá um fluxo diferente. Na aplicação, clico no botão "Cadastrar usuário", vou colocar um e-mail que não tem.

[05:49] Deixa eu até ver um no console. Eu vou usar esse Alex aqui, vou só colocar mais alguns valores. Então eu vou colocar aqui, deixa eu colocar um paste, e eu vou mudar para "alex123@aluraesporte.com". A senha eu vou deixar "teste1" e vou clicar em "Cadastar". Vamos ver o que vai acontecer.

[06:08] Ele aconteceu aqui e falou que ocorreu uma falha. Precisamos ver agora o que acontece. Veja que ele nos mostrou o snackbar, ocorreu uma falha. Vamos entrar no nosso Android Studio, vamos ver o log catch e vamos ver qual é a falha que está acontecendo.

[06:25] Ele está falando que o email foi mal formatado. Muito provavelmente é por causa daquele espaço no final, que ele coloca ao fazer a cópia. Vamos apagar esse espaço e clicar em "Cadastrar" novamente. Agora que deu certo, vamos até ver aqui o log, olha só, deu certo aqui - cadê? Eu vou buscar aqui "cadastra:", que foi aquele filtro.

[06:45] Cadastro com sucesso, ele conseguiu voltar para a tela de login. Se viermos no console, nos usuários, vai apresentar agora esse novo usuário que nós colocamos.

[06:56] Então essa parte da integração, ela está funcionando, nós vemos que funciona numa boa. Inclusive, uma das coisas que podemos tentar fazer é colocar o snackbar no código quando der certo, além de voltar para a tela inicial. Vou no CadastroUsuarioFragment, chegar aqui e colocar um Snackbar.make(view, "Cadastro realizado com sucesso", Snackbar.LENGTH_SHORT).show().

[07:15] Vamos testar para ver se realmente funciona. Então vamos executar aqui novamente, vamos fazer o mesmo fluxo e vemos ver o que acontece, agora que tentamos fazer o cadastro novamente. Eu vou fazer paste e já vamos olhar - ele copiou o código do snackbar. Deixa eu copiar, vou cortar aqui. Cortei, não preciso apagar caractere por caractere.

[07:43] Eu vou copiar o e-mail do console, para fazer apenas uma mínima modificação. Deixa eu colar na aplicação. Ele coloca o espaço em branco, nós tiramos, e então eu vou colocar mais um número, só para poder variar um pouco e conseguir fazer o teste: "alex1234@aluraesporte.com".

[07:57] Vamos tentar cadastrar, considerando que teve essa modificação. Agora temos essa modificação do cadastro realizado com sucesso, vamos ver o que aparece aqui para nós. Executando a aplicação, o cadastro é realizado com sucesso.

[08:10] Então nós temos essas duas opções do nosso fluxo para poder apresentar para o nosso usuário o que aconteceu durante o processo de cadastro.

@@05
Boa prática com SnackBar

[00:00] Durante a implementação da nossa tela de cadastro, utilizamos o snackbar como uma ferramenta de feedback visual indicando a resposta do Firebase. Então, por exemplo, ao enviar um cadastro que obviamente vai falhar, vamos ter uma resposta via snackbar, indicando que ocorreu uma falha.
[00:19] Porém, da maneira como fizemos atualmente, ao deixar o teclado aberto, perceba que essa mensagem não é visível. Isso acontece pelo fato de que o snackbar, ele vai exigir uma configuração a mais para que ele consiga apresentar essa mensagem, independente se o teclado está aberto ou fechado.

[00:37] É exatamente isso que nós vamos ver agora, porque hoje, para o nosso usuário ver essa mensagem, ele precisa estar ciente de que, ao receber uma resposta, ele tem que fechar o teclado, o que não é nada intuitivo. Às vezes ele nem conseguirá ver essa mensagem. Então como podemos fazer isso?

[00:55] Basicamente, essa modificação é feita no cadastro_usuario. A modificação, ela é feita justamente aqui, na raiz do layout. Precisamos utilizar outros componentes, outras views, para que essa informação seja apresentada da maneira esperada.

[01:09] Essas views são as seguintes: nós utilizamos aqui, como raiz, o ScrollView, que é aquela view na qual coloca aquela rolagem para nós quando o conteúdo ultrapassa a tela, no caso a altura. Também temos aqui um cara chamado de <android.coordinatorlayout.widget.CoordinatorLayout. Ele que fica responsável em fazer esse comportamento que eu acabei de mencionar para vocês.

[01:28] Então, basicamente, vamos pegar todo o conteúdo do construente layout, colocar dentro desses dois componentes, dentro dessas duas views, e, a partir delas, vamos conseguir sim entregar o que esperamos do nosso snackbar. É claro, para fazer isso, precisamos fazer algumas modificações, porque quem é a raiz, precisa ter os name spaces, precisa ter o android:layout_height= "match_parent"> e assim por diante.

[01:51] Então vamos colocar todas as informações necessárias. Então o height aqui, o android:layout_width= "match_parent"para o nosso ScrollView, tudo match_parent, porque ele vai pegar toda a nossa tela. E também, aqui no ScrollView, colocamos um cara chamado android:fillViewport="true", para ele preencher toda a tela disponível para nós.

[02:05] Nós colocamos como true e beleza, isso é a configuração que temos que fazer no ScrollView. Aqui no <android.coordinatorlayout.widget.CoordinatorLayout é algo similar, mas teremos algumas diferenças, porque o height, dado que está dentro do ScrollView, ele pega como android:layout_height="wrap_content". No width podemos pegar como match_parent, então android:layout_width="match_parent".

[02:23] Pronto, conseguimos envolver todo o nosso layout dentro de uma estrutura, que será capaz de colocar o comportamento esperado no snackbar. Então, basicamente só executamos o nosso aplicativo. Agora, ao fazer o nosso teste, vamos ver que teremos alguns comportamentos diferentes.

[02:40] Então, ao testar aqui, vamos ver que agora ele vai nos mostrar às vezes a mensagem aqui embaixo, mas se tentarmos mais algumas vezes, vamos ver que ele mostra em cima do teclado. Em outras palavras, nem sempre 100% vai mostrar conforme esperamos, inclusive tem algumas outras técnicas que utilizam o id do coordinator layout para fazer isso.

[03:00] Só que durante os meus testes, que eu fiz aqui, nem sempre resultava também em sempre mostrar de primeira o nosso snackbar. Mas perceba que agora ele já mostra, depois de executar uma vez ou outra. Muito melhor do que simplesmente deixar aqui, atrás do teclado.

[03:14] Então agora sim, nós já temos uma experiência diferente para o nosso usuário. Era isso que eu queria mostrar para você antes mesmo de prosseguirmos com o próximo código, que vai dar continuidade à nossa implementação. Até mais.

@@06
Sobre a implementação do fluxo de cadastro

Durante a aula conhecemos os principais comportamentos do Firebase Authentication e integramos o serviço com a tela de cadastro. Considerando o que foi feito em aula, marque as alternativas corretas:

Ao cadastrar um usuário, o Firebase Authentication automaticamente autentica o usuário.
 
Alternativa correta! Isso mesmo! Na versão utilizada em curso, o Firebase Authentication apresenta esse comportamento.
Alternativa correta
Identificamos se o usuário está logado a partir da resposta de sucesso da Task.
 
Alternativa correta
Utilizamos o LiveData junto com a Task para manter o comportamento do lifecycle-aware.
 
Alternativa correta! Isso mesmo! Mesmo que as chamadas sejam assíncronas, a Task não mantém o comportamento do lifecycle-aware que impede o leak de memória em situações em que a tela não está mais disponível.
Alternativa correta
Podemos utilizar qualquer nome de usuário no cadastro de e-mail e senha.

@@07
Faça como eu fiz

Testando signin e signout
Teste o comportamento de signin e signout do Firebase Authentication.

Para garantir que o signin funcionou, confira se o usuário do Firebase Authentication é diferente de nulo.

Durante o teste de signin utilize as mesmas credenciais (e-mail e senha) usadas para criar um usuário no console.
No teste do signout, confira se o usuário fica como nulo.

Cadastrando usuário pela tela de cadastro
Modifique o código da tela de cadastro para cadastrar um usuário no Firebase Authentication. Para isso, faça o seguinte:

Crie o repositório que receba o FirebaseAuth via construtor. Migre todo o código de teste feito na MainActivity para o repositório;
Crie um ViewModel para o fragment de cadastro que receba o repositório do Firebase Authentication via construtor, então, crie um método de cadastro que receba o e-mail e senha e chame o mesmo método do repositório;
Configure o Koin para injetar o ViewModel e repositório do Firebase Authentication;
Receba as informações dos campos de cadastro e envie para o ViewModel, crie o viewModel injetando via Koin.
Após aplicar as modificações, teste o App e confira se o usuário é cadastrado no console do Firebase Authentication por meio da tela de cadastro.

Refatorando o código com LiveData e SnackBar
Ao cadastrar um usuário volte para a tela de login se der certo ou apresente uma mensagem de erro caso ocorra alguma falha. Para isso, faça os seguintes ajustes:

Modifique o retorno dos métodos de cadastro do repositório e ViewModel para que devolva um LiveData<Boolean>;
No repositório, atribua true para o LiveData caso o cadastro dê sucesso e false na falha;
No Fragment, observe o LiveData e apresente uma mensagem de sucesso se o valor for true e uma de falha se for false;
No sucesso do LiveData, também adicione o código que retorna para a tela de Login.
Teste o fluxo do App para ambos os casos confira se apresenta o resultado esperado.

Lembre-se que o cadastro funciona apenas para e-mails que não foram cadastrados no Firebase Authentication
Adaptando layout para o SnackBar
Modifique o Layout para que o SnackBar seja apresentado na tela mesmo que o teclado esteja aberto. Para isso, adicione as seguintes modificações no layout de cadastro e login:

<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:fillViewport="true">

    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:layout_height="wrap_content"
        android:layout_width="match_parent">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <!-- restante das views -->

        </androidx.constraintlayout.widget.ConstraintLayout>

    </androidx.coordinatorlayout.widget.CoordinatorLayout>
</ScrollView>COPIAR CÓDIGO
Faça o teste e confira se o SnackBar é apresentado mesmo com o teclado aberto.

O comportamento de signin deve funcionar apenas para as credenciais corretas do projeto do Firebase configurado.
Ao testar o cadastro, deve-se registrar um usuário no console do Firebase Authentication.

Ambos os fluxos devem funcionar como esperado, apresentando o SnackBar com a mensagem adequada tanto para o caso de sucesso quanto de falha.

Com o ajuste no layout, o SnackBar deve apresentar na tela mesmo com o teclado aberto.

Você pode conferir as mudanças de código a partir destes commits:

Testando signin e signout
Cadastrando usuário pela tela de cadastro
Refatorando o código com LiveData e SnackBar
Adaptando layout para o SnackBar

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/d182c2773a367f97c37173543586e89deef6de86

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/a7def6637e8e4567a489f32481cd94b9dfc29c59

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/84554f5e9ab648e04ca7dea9ada0ad3d0a55076e

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/f42e8423ca0919f6a625904bfb351ac23467f7ea

@@08
O que aprendemos?

Nesta aula aprendemos:
Autenticar e deslogar o usuário com o Firebase Authentication;
Integrar o comportamento de cadastro com o Architecture Components;
Apresentar mensagens para o usuário com o SnackBar;
Adaptar o layout adequadamente para o SnackBar.

#### 18/10/2023

@03-Lidando com possíveis erros

@@01
Projeto da aula anterior

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo por meio deste link.

https://github.com/alura-cursos/Firebase-Authentication-Android/archive/aula-2.zip

@@02
Mensagens personalizadas com LiveData

[00:00] O nosso fluxo de cadastro está funcionando conforme o esperado, porém, da maneira como implementamos, ainda não temos feedback o suficiente em situações que o nosso cadastro falha. O que eu quero dizer com isso? Independentemente do que ocorreu de falha, só conseguimos mandar uma mensagem para o nosso usuário, indicando que ocorreu uma falha.
[00:20] O ideal, nesse tipo de solução, é que o nosso usuário saiba o que ele errou, como por exemplo, ele saiba que ele tentou mandar um e-mail, só que aquele e-mail, ele já existe, ou então ele tentou criar um usuário, só que a senha, ela não é compatível com o mínimo dos requisitos. Portanto, agora vamos ver uma técnica em que conseguimos mandar uma mensagem mais específica para o nosso usuário.

[00:44] Então vamos começar. Para isso, o que precisamos fazer? Primeiro, temos que usar uma solução na qual temos mais de uma resposta no nosso live data. Nós não podemos trabalhar apenas com boolean, porque o boolean, ele só vai devolver verdadeiro ou falso, ele não é capaz de devolver alguma informação a mais.

[01:03] Portanto, agora vamos ver uma técnica em que conseguimos devolver, além do boolean, também essa informação a mais. Ela terá como padrão, até mesmo um recurso que usei no Alura+, quando eu falei sobre coroutines, que foi esse cara chamado Resource. Ele tem essa capacidade de colocar uma informação dentro dele, e até mesmo outras informações.

[01:25] Nesse caso é só um dado, representando o que queremos mandar, mas também podemos indicar que o resource, ele vai ter, por exemplo, um erro. Esse erro pode ser um nullable, que por padrão ele é nulo, dado que podemos trabalhar com o resource que terá apenas os seus valores e também agora o resource que, além dos seus valores, ele pode também ter um erro.

[01:45] Todas as vezes que usarmos esse resource, podemos verificar: olha, você tem erro? Se você tem erro, você pode indicar para mim o que é esse erro. Então é ali que será a base para conseguirmos trabalhar com essas informações a mais. É isso que vamos ver agora. O que temos que fazer agora, que estamos com esse resource que permite colocar o erro? É justamente adaptar o nosso viewModel.cadastra para trabalhar com esse resources.

[02:09] Primeiro vamos trabalhar onde está a fonte de todos os dados, que é a partir do nosso FirebaseAuthRepository, temos que converter o cadastra para que seja um resource de boolean, fun cadastra(email: String, senha: String): LiveData<Resource<Boolean>>, porque ainda assim vamos trabalhar com boolean para saber se deu certo ou não, só que agora vamos ter uma informação a mais, que é o erro que vai acontecer.

[02:28] Então no val liveData = MutableLiveData<Resource<Boolean>>(), teremos um resource de boolean aqui também no MutableLiveData. Agora, no momento em que tentamos mandar um valor, vamos mandar uma instância de resource, no liveData.value. No caso do resource, podemos colocar apenas o valor no nosso construtor, que ele já entende que é um boolean, não precisa identificar com o generics, isso durante a instância.

[02:51] liveData.value = Resource( dado:true). Agora, quando temos a falha, além de mandar o boolean, podemos mandar também a informação de erro, podemos falar que ocorreu uma falha, então podemos falar: falha no cadastro. liveData.value = Resource (dado:false, erro: "Falha no cadastro"), é uma mensagem personalizada que podemos fazer.

[03:06] Agora que temos essa mensagem personalizada, precisamos adaptar um pouco o nosso código, para ele pegar essa mensagem personalizada. Para isso, primeiro vamos no nosso view model de cadastro, então CadastroUsuarioViewModel, precisamos modificar aqui esse return, então fun cadastra(email: String, senha: String): LiveData<Resource<Boolean>>, importando aqui o resource.

[03:28] Agora aqui, no nosso CadastroUsuarioFragment precisamos trabalhar com resource, porque não é mais um boolean, será um recurso que vamos ter, que ele dará a disponibilidade para pegarmos o dado, então se temos o dado, significa que o cadastro foi feito e, se não temos, o que precisamos fazer é apenas verificar se existe pelo menos um erro personalizado.

[03:49] É da seguinte forma: pegarmos o recurso.erro ? E podemos colocar, por exemplo, aquele nosso Elvis expression, que ele vai devolver o erro se ele existir. Caso contrário, podemos colocar uma mensagem genérica, que seria essa: ocorreu uma falha no cadastro. Podemos colocar essa mensagem genérica.

[04:08] Aqui sim podemos simplesmente colocar val mensagemErro: String = recurso.erro? : "Ocorreu uma falha no cadastro", e o nosso snackbar, ele vai receber esse mensagemErro. Então é basicamente isso que precisamos fazer para ter uma mensagem que vem também do nosso repositório.

[04:22] Vamos agora executar e vamos ver se conseguimos pegar essa mensagem de erro, dado que o nosso repositório, ele está mandando essa mensagem: falha no cadastro. Vamos pegar a aplicação, vamos colocar "teste" e "teste" nos campos.

[04:38] Agora vamos ver que teve essa mensagem de falha no cadastro. Então agora sim temos poderes suficientes para pegar os possíveis erros. Só que agora, o que é importante sabermos é quais são esses possíveis erros. Vamos ver isso a seguir.

@@03
Apresentando mensagens de erros específicos

[00:00] Agora que conseguimos mandar uma mensagem personalizada na tela de cadastro, somos capazes de identificar qual foi o real problema que aconteceu durante o cadastro e mandar uma mensagem mais direcionada para o nosso usuário, porque, atualmente, ao clicar em "Cadastrar", a única mensagem que o nosso usuário tem é que ocorreu uma falha no cadastro.
[00:18] Mas ele não sabe exatamente qual foi o problema que aconteceu para esse cadastro falhar. E é isso o que vamos fazer agora, durante a nossa implementação. Mas como podemos identificar qual é o problema que aconteceu? Para isso, podemos investigar o código que temos no firebaseAuth.createUserWithEmailAndPassword. Essa investigação pode ser feita a partir do atalho "Ctrl + Q", do IntelliJ , que mostra a documentação, como vemos aqui.

[00:44] Na documentação, basicamente teremos o acesso à assinatura, à descrição do método, como também as possibilidades de exceções. Aqui sim já conseguimos identificar com mais precisão o que pode acontecer durante a criação de um cadastro. Então veja que temos a exception "FirebaseAuthWeakPasswordException", que representa aquela situação em que a nossa senha, ela é fraca.

[01:09] Ou seja, ela tem menos do que 6 dígitos - isso considerando a nossa regra de trabalho atual. Também temos essas outras exceptions, que seria o "FirebaseAuthInvalidCredentialsException", que é quando o e-mail, ele está mal informado, então o e-mail é inválido. E, por fim, temos esse "FirebaseAuthUserCollisionException", que é quando tentamos cadastrar, só que aquele e-mail já existe.

[01:33] Então veja que precisamos identificar essas situações. Quando identificamos uma delas, precisamos colocar uma mensagem mais direcionada para o nosso usuário. Como fazemos isso? Basicamente, o que precisamos fazer é que, no momento em que acontece uma falha, temos que pegar essa exceção e verificar se ela faz parte de uma dessas instâncias.

[01:53] Por exemplo, vou pegar o exception, tarefa.addOnFailureListener {exception: Exception ->. Vou também colocar exception nessa parte do nosso log catch, Log.e(TAG, msg: "cadastra: cadastro falhou", exception). Logo em seguida, eu vou verificar, a partir de alguma estrutura condicional, que temos no Kotlin.

[02:08] Uma das possibilidades é até mesmo usar o when expression, recebendo a exception: when(exception){}. Dentro dele, nós verificamos: olha, isso aqui é um is FirebaseAuthWeakPasswordException ->? Se for, o que eu quero fazer? Eu quero que tenha uma mensagem exclusiva para ele, que é, por exemplo, -> "Senha precisa de pelo menos 6 dígitos".

[02:32] Novamente, lembrando que hoje, no momento em que eu estou gravando o curso, essa é a regra que é utilizada no Firebase, pode ser que no momento em que você fizer o curso, a regra seja diferente. Fique à vontade em mandar uma mensagem que seja mais precisa, pode até ser senha fraca, é uma mensagem também possível. Fique à vontade para usar o seu critério, só entenda bem a proposta que vamos fazer aqui.

[02:55] Agora que computamos essa primeira regra, como podemos pegar essa mensagem? Basicamente, o when expression, ele devolve essas computações, então ele devolve esses valores que colocamos em cada uma das opções. Nós podemos determinar que o valor que será retornado, ele será uma string sempre: val mensagemErro: String = whe(exception){.

[03:12] Então todas as opções no when sempre serão uma string. Quando restringimos dessa forma, basicamente precisamos colocar também a situação que não atende às opções que esperamos, que é o caso do else, que é uma situação que nenhum dos erros que tentamos identificar, eles aconteceram. Se isso aconteceu de verdade, é um erro desconhecido.

[03:34] Então também precisamos ter esse tipo de ação para que o nosso usuário, ele saiba até mesmo nos comunicar, ele fala: olha, eu estou tentando fazer o cadastro e está acontecendo um erro desconhecido. Nós também não vamos saber, mas conseguimos pelo menos imaginar: olha, não foi nenhuma das regras do Firebase, talvez é alguma outra coisa que não sabemos o que é e podemos investigar com mais precisão.

[03:55] Agora que temos a mensagem, mandamos a mensagem ao invés daquela que está em hardcoded, liveData.value = Resource(dado: false, mensagemErro). Podemos testar, fazer a simulação de uma senha, que ela é fraca, e vamos ver o que acontece. Vamos agora executar o nosso aplicativo, muito provavelmente ele já executou rapidamente, vamos ver se funciona. Vou colocar "teste" e "teste", e vamos ver o que acontece ao fazer essa execução.

[04:20] Olha só, ele colocou o erro desconhecido. Por que isso aconteceu? Porque ele não conseguiu atingir primeiro a nossa exception. Se investigarmos no log catch, vamos ver que aquela outra exception, de credencial, ela acabou sendo prioritária nesse caso. Então veja que ela será necessária para conseguirmos também testar a situação em que a nossa senha é fraca.

[04:44] Então vamos colocar também essa exception. De volta ao código, abaixo do nosso is FirebaseAuthWeakPasswordException, vamos colocar is FirebaseAuthInvalidCredentialsException ->. Agora eu vou fazer o import e, basicamente, eu vou colocar aqui que -> "E-mail inválido". Basicamente é essa a informação que precisamos ter. Vamos executar, para vermos isso acontecendo. Vamos fazer o mesmo teste de antes. Na aplicação, eu vou colocar "teste" e "teste". Olha só.

[05:17] “E-mail inválido”. Vamos agora colocar o um outro e-mail, só para ver o que acontece com a senha fraca. Então o teste com "teste@aluraesporte.com".

[05:27] “Senha precisa ter pelo menos 6 dígitos”. Então colocamos mais um dígito na senha. Vamos tentar cadastrar. Agora ele conseguiu fazer o cadastro com sucesso. Então, com aquele e-mail que colocamos no teste, ele conseguiu fazer. Vamos então colocar o mesmo e-mail, eu acho que era esse aqui, vamos ver se eu acerto. Eu dei um "Tab", para ver se não pegou nada. Agora sim, eu vou tentar cadastrar esse mesmo e-mail.

[05:50] “Erro desconhecido”. Por quê? Porque nós não conseguimos identificar esse problema que pode acontecer, que é a partir daquela outra exception que nós vimos: is FirebaseAuthUserCollisionException ->, é essa a exception. Se você tiver dúvida, sempre volte no método, veja a documentação, verifique qual é a exception, e você pode colocar sem nenhuma dúvida.

[06:13] Não precisa ficar lembrando, decorando, sempre consulte, aproveite esse momento para isso. Só precisamos colocar que o e-mail já existe, -> "E-mail já cadastrado". É uma das mensagens que podemos mandar.

[06:29] Agora sim estamos atendendo às possibilidades de problemas que podem acontecer, que são conhecidos a partir dessa API do Firebase. Na aplicação, podemos colocar "teste@aluraesporte.com". Eu vou até mesmo verificar se a senha, ela vem primeiro, antes de verificar se existe o cadastro, é uma coisa até interessante de vermos.

[06:48] “A senha precisa ter os 6 dígitos”. Então veja que até mesmo tem uma certa prioridade entre eles, é uma coisa também que você pode explorar.

[06:56] “E o e-mail já cadastrado”. Perceba que agora sim estamos atendendo todas as situações. Agora eu vou colocar o outro e-mail, "teste4321@aluraesporte.com", para garantir que não é repetido.

[07:07] “O cadastro realizado com sucesso”. Então perceba que agora sim, com essa estratégia que fizemos, nós conseguimos mandar uma mensagem, um feedback muito mais preciso para o nosso usuário.

[07:17] Ele vai ter capacidade o suficiente de conseguir se direcionar e falar: poxa, eu errei isso daqui; não, eu errei a minha senha; na verdade, esse e-mail já existe, deixa eu tentar o outro. É muito mais interessante para o nosso usuário esse tipo de feedback. Até mais.

@@04
Validando cada campo do cadastro

[00:00] Conseguimos configurar o nosso aplicativo para devolver uma mensagem adequada considerando as mensagens esperadas, que podem acontecer durante um problema com o firebaseAuth.CreateUserWithEmailAndPassword, que seria a mensagem de senha fraca, de e-mail inválido e de cadastro que já existe.
[00:18] Porém vamos perceber que isso ainda não é o suficiente para atender as necessidades gerais quando trabalhamos com essas chamadas. Por exemplo, se chegarmos na nossa tela de cadastro da nossa aplicação, não preenchermos nada e clicarmos em "Cadastar", olha o que vai acontecer.

[00:34] O nosso aplicativo terá um crash, uma situação horrível para o nosso usuário, uma experiência que ninguém quer ter e que muitas pessoas até mesmo desinstalam o aplicativo por conta disso. Por que esse crash acontece? Porque a exception que aconteceu aqui, ela não faz parte de uma exception que é envolvida dentro da regra de negócio que vem dentro do OnFailure.

[00:55] Ela é uma regra de negócio que ela irá vai estourar essa exception e vai pedir para que alguém trate essa exception, porque ela não esperava isso. Como podemos ver, é um illegal argument exception.

[01:06] Está falando que a string que foi dada para o createUserWithEmailAndPassword não pode ser nem vazia e nem nula. Então veja que fazer apenas esse tratamento dentro OnFailure, que fizemos na aula passada, não é o suficiente para atender tudo o que nós esperamos, precisamos fazer passos a mais.

[01:26] Uma situação fácil de resolver isso aqui seria a seguinte: basicamente, nós pegamos esse código que estamos trabalhando com a nossa val tarefa, com a task do Google, e envolvemos de um try catch, que pode sim identificar se foi o illegal argument exception. Porque, novamente, o que estourou aqui foi uma exception diretamente do createUserWithEmailAndPassword, nem chegou a executar o addOnFailureListener.

[01:52] Então, basicamente, podemos simplesmente selecionar e envolver no try catch. Tem alguns atalhos do IntelliJ que faz isso, que é o "Ctrl + Alt + T", ele mostra essa opção, que é o surround with. Aqui podemos envolver dentro dessa opção, que é o "try / catch". Ele já coloca todo o código no try catch.

[02:08] Para sermos mais precisos, podemos colocar aquela catch (e: IllegalArgumentException){}. Dentro desse catch, podemos fazer exatamente a mesma coisa que fazemos com o nosso liveData.value, mandando a mensagem mais especifica, liveData.value = Resource(dado: false, erro: "E-mail ou senha não pode ser vazio").

[02:28] Nós podemos colocar aqui essa mensagem. Agora sim podemos testar, executar, e vamos ver que agora nós evitamos esse problema, justamente porque estamos tratando essa exceção.

[02:41] Então veja que essa é uma das maneiras de resolvermos esse problema. Só que perceba que isso vai um pouco além do que só mandar essa mensagem. Em situações como essa, o mais interessante é até mesmo façamos uma validação por campo. Só para finalizar essa etapa e deixar o cadastro redondo, o que vamos fazer aqui, além de deixar esse try catch, que é mais seguro, também faremos uma validação campo a campo.

[03:05] Para que, no momento em que ele mande o cadastro sem nada, até mesmo essa parte de confirmação de senha, apresente uma mensagem de erro falando: olha, o e-mail é necessário, a senha é necessária e confirmar a senha tem que ser exatamente a mesma senha do que colocamos no campo senha.

[03:24] Então é isso que vamos fazer, antes mesmo de mandar para o catch. Dessa maneira, poderíamos evitar esse try catch, mas, novamente, o try catch é interessante justamente para evitar o crash. Se você tem essa possibilidade de crash, você precisa tratar ou aqui ou em outro lugar.

[03:39] Vamos deixar aqui, no firebaseAuthRepository, porque não estamos tratando em nenhum outro lugar. Só que, novamente, o nosso foco agora é trabalhar nessa parte mais visual. Como vamos fazer isso? Como vamos fazer essas validações? Basicamente fazemos a validação no momento em que pegamos os campos, no momento em que clicamos no botão "Cadastar".

[03:57] Basicamente, podemos pegar a informação, no caso do e-mail, podemos verificar se ele está em branco, que é esse if(email.isBlank()). No caso seria se ele está vazio, mesmo que ele tenha um espaço, mesmo que ele tenha um espaço em branco, ele também pode ser considerado vazio, por isso o ,isBlank, não só o is empty.

[04:17] Aqui dentro, podemos simplesmente colocar o e-mail, ele é necessário. Aqui nós pegamos o cadastro_usuario_email. e falamos a partir do .error =, que é um campo que temos do text input layout, cadastro_usuario_email.error = "E-mail é necessário", ou não pode ser vazio, a mensagem que você preferir. Essa é uma possibilidade.

[04:39] Em seguida, podemos fazer a mesma coisa para quem? Para a nossa senha, então if(senha.), podemos simplesmente colocar que se ela for branca, .isBlank(){}, vamos simplesmente deixar como cadastro_usuario_senha.error = e vamos colocar = "Senha é necessária". É isso que precisamos colocar aqui como mensagem inicial.

[05:05] Nós vamos testar aqui, ainda não vai estar 100%, mas já conseguimos ver cada um dos campos, para ver se pelo menos os campos funcionam. Na aplicação, se tentarmos fazer o cadastro sem preencher o e-mail e senha, ele já mostra o erro para cada um dos campos.

[05:14] Mesmo que ainda ele mande para o nosso cadastro. Então nós conseguimos fazer em ambos os campos, só que agora precisamos fazer também no campo de confirmação de senha. Basicamente, temos que replicar o que fizemos anteriormente no onViewCreated, abaixo do val senha.

[05:28] Eu vou chamar de val confirmaSenha: String = cadastro_usuario_confirma_senha.editText?.text.toString(), e vou colocar o campo cadastro_usuario_confirma_senha. Só precisamos fazer mais uma validação, colocando um if(senha), indicando se a senha, ela for diferente do confirma senha, if(senha != confirmaSenha){}, queremos mandar uma mensagem de erro no cadastro_usuario_confirma_senha.

[05:52] Será cadastro_usuario_confirma>senha.error = "Senhas diferentes". Essa é a mensagem que precisamos fazer. Veja que a validação, nós estamos fazendo. Podemos até mesmo testar, para ver o que acontece. Na nossa aplicação, primeiro a senha será igual, então ele não mostra a mensagem. Agora aqui as senhas serão diferentes. Então ele mostra a mensagem.

[06:10] Já conseguimos colocar cada uma das validações em cada um dos campos. O que precisamos fazer agora é só evitar essa chamada do cadastro enquanto os campos não forem válidos. Uma das maneiras que podes fazer é a seguinte: podemos criar uma variável chamada de válido, val valido = true, e ela vai começar como true, porque se ela for verdade, queremos executar esse código do cadastro.

[06:32] Então, após as verificações dos campos, vamos colocar if(valido){, executa todo esse código nosso do viewModel.cadastra. Mas o valido precisa ser válido, true. E quando o valido não é válido? É quando ele atinge qualquer um desses if de validação dos campos, seja a senha ou e-mail em branco ou quando temos uma senha e a confirmação de senha diferentes.

[06:54] Então, dentro de if(email.isBlank()), nós colocamos valido = false. Fazemos isso para cada um dos campos. Entenda que essa é uma das possibilidades de implementação, mas podem existir outras. Fique à vontade para usar a implementação que você preferir. Executando novamente, vamos ver o que acontece. Vamos fazer as simulações. Cadastrar com os campos em branco.

[07:12] Cadastrando, beleza, deu as mensagens. Vou colocar uma senha diferente, ele está colocando todos os campos. Ele não executou o nosso view model. É isso o que precisamos fazer. Agora, colocando os campos, vamos ver o que acontece.

[07:26] Olha só, ele ainda mostra as mensagens, mesmo que isso não necessariamente seja verdade. Então veja que mesmo mostrando só a mensagem, ainda não é o suficiente. O que precisamos fazer? Todas as vezes que tentarmos pegar a informação e fazer a validação, temos que limpar esses erros anteriormente.

[07:44] Então, antes de chegar nessa parte de coleta da informação, no val email, pegamos o nosso cadastro_usuario_email, cadastro_usuario_senha e o cadastro_usuario_confrma_senha e limpamos o erro, a partir do .error, deixamos como nulo: cadastro_usuario_email.error = null.

[07:59] Basicamente é isso, é algo bem simples, nós vamos lá e limpamos os erros. Para cada um dos campos, fazemos essa chamada. Então aqui estamos limpando os erros. Agora sim, se fizermos a simulação e tentarmos novamente mandar as informações, teremos os erros ainda. Então veremos que os erros aconteceram. Aqui acontecem.

[08:19] Mas percebe que ele teve uma atualização? Ele está sempre atualizando, para ver se realmente ainda está errado. Então agora eu coloco o e-mail. Olha só, ele já deixa o e-mail pelo menos, entre aspas, válido.

[08:31] O válido, para nós, nesse caso, é só que ele não esteja em branco. Vamos ver a senha. Vou tentar um em branco, vamos ver o que acontece.

[08:37] Em branco, ela já apresenta alguma falha, porque o em branco não é algo válido para nós, é o isBlank que eu mostrei para vocês. Agora, se eu coloco um T, ele já fala: beleza, está certo. Como também coloquei um T aqui na confirmação. Eu vou colocar um E.

[08:50] Ele já mostra que é diferente. Então agora sim a validação, ela já está acontecendo, já está válido. Olhe o que vai acontecer.

[08:57] “E-mail inválido”. Ele já está entrando agora também na nossa regra de negócio, do cadastro. Basicamente, nós não mexemos tanto no que existe dentro do cadastro, a não ser aquele try catch para evitar aquela exceção de illegal argument exception. Só que agora, só vamos mandar realmente para o cadastro quando não for verdade, quando não tivermos aquele problema de illegal argument exception.

[09:20] Estamos mandando, somos bons vizinhos de mandar a informação que realmente o nosso cadastro, ele espera. Era isso mesmo o que eu queria mostrar para vocês, uma maneira na qual conseguimos, além de fazer as validações dentro do nosso cadastro, fazer também as validações na parte da tela. Então agora sim, na parte da tela da aplicação, nós já conseguimos fazer uma validação melhor. Eu posso até colocar aqui um e-mail para testar.

[09:48] Olha só, ele já entra em todas as nossas regras. Agora com uma senha correta, mas essa senha não é a mesma da confirmação, então ele não vai passar. Vou até tentar colocar a mesma aqui, eu acho eu vou errar. Acertei. Olha só, cadastrou.

[10:00] Ele conseguiu fazer isso. Muito provavelmente, aquele e-mail que eu usei mandou para alguém, então, enfim, não vou usar isso da próxima vez, era só para um teste. Novamente, com eu comentei, tente usar e-mails fictícios, para não ter esses problemas de mandar spam para alguém e assim por diante.

[10:16] Era isso o que eu queria mostrar para vocês, essa validação de campo a campo, para que além de entregarmos a validação que é feita no repository, também tenhamos essa validação da parte visual. Até mais.

@@05
Sobre os cuidados ao cadastrar um usuário

Durante a aula aprendemos a lidar com as possíveis exceções e erros comuns no fluxo de cadastro de usuário. Considerando o que foi visto, marque as alternativas corretas:

Utilizar o LiveData<Boolean> é o suficiente para implementar o fluxo de cadastro que identifica o sucesso e possíveis falhas.
 
Alternativa correta
O listener de falha da Task de criação de usuário fornece uma Exception que identifica todos os possíveis problemas ao criar usuários.
 
Alternativa correta
Utilizamos o Resource para permitir uma resposta personalizada nos possíveis problemas de cadastro de usuário.
 
Alternativa correta! Isso mesmo! Ao usar o Resource, além de enviar valores como Boolean, podemos também enviar informações a mais, como por exemplo, uma mensagem de erro.
Alternativa correta
Ao tentarmos criar um usuário, precisamos lidar com 3 tipos de Exceptions comuns.

@@06
Faça como eu fiz

Mensagens personalizadas com o Resource
Modifique a classe Resource para receber uma property erro do tipo String? com o valor padrão null.

Então, ao invés do Boolean, utilize o Resource<Boolean> como valor do LiveData. No momento que tiver sucesso, devolva apenas o true, na falha, devolva false e um erro personalizado.

Modifique os demais locais do código para que lidem com LiveData<Resource<Boolean>.

No Fragment de cadastro, adapte a observação do LiveData para apresentar a mensagem de sucesso se o dado do Resource for true e a mensagem personalizada caso for false.

Teste o App e confira se apresenta o comportamento esperado.

Identificando exceptions de cadastro
Identifique as possíveis Exceptions lançadas ao criar um usuário com e-mail e senha.

Para cada Exception, devolva uma mensagem de erro específica para identificar o problema ocorrido, considerando que as exception são:

FirebaseAuthWeakPasswordException
FirebaseAuthInvalidCredentialsException
FirebaseAuthUserCollisionException
Também adicione uma mensagem padrão ao identificar uma exception diferente dessas.

Após implementar o código, teste o App e simule os problemas, então, confira se apresenta as mensagens esperadas.

Evitando problema de campos vazios
Evite o crash do App ao enviar os campos vazios para o Firebase Authentication. Para isso, faça o seguinte:

Envolva o método de cadastro com o try catch capturando a IllegalArgumentException;
Ao capturar a exception, atribua um Resource com dado false para o LiveData e indique a mensagem de falha pelos campos vazios.
Em seguida, teste o App e confira se ao tentar cadastrar com os campos vazios apresenta a mensagem indicando o problema sem quebrar o App.

Após o teste, também adicione validações para cada campo. Para isso, faça o seguinte no listener do botão cadastrar:

Limpe o erro de todos os campos;
Verifique se o valor de cada campo é vazio, se sim, apresente a mensagem de erro indicando a obrigatoriedade do campo e atribua false ao marcador de validação (variável valido);
Chame o cadastro do ViewModel apenas se o marcador for true.
Após implementar, teste o App e confira se apresenta os comportamentos esperados ao tentar cadastrar usuários sem informação de e-mail ou senha.

Em caso de sucesso deve funcionar como antes, no caso de falha, deve apresentar a mensagem vinda do repositório.
As exceptions são lançadas nas seguintes simulações:

FirebaseAuthWeakPasswordException -> Quando a senha é fraca, atualmente com menos de 6 dígitos.
FirebaseAuthInvalidCredentialsException -> Quando o e-mail é inválido
FirebaseAuthUserCollisionException -> Quando o e-mail já é cadastrado
Ao tentar cadastrar sem informação de e-mail ou senha, cada campo deve apresentar a mensagem de erro em cada campo e impedir o envio para o ViewModel.

Ao preencher as informações nos campos, o erro do campo deve desaparecer e enviar as informações para o ViewModel.

Você pode conferir as mudanças de código a partir destes commits:

Mensagens personalizadas com o Resource
Identificando exceptions de cadastro
Evitando problema de campos vazios

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/c34ec9609c2c5666ffff6afdf0828c0016d7e13d

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/bde1672b59480e22b63f8d915a05e262b9a43b9e

https://github.com/alura-cursos/Firebase-Authentication-Android/commit/9cb997a6effa0787c66d1b1eca40e441b76d3643

@@07
O que aprendemos?

Nesta aula aprendemos:
Identificar possíveis problemas ao usar um método do Firebase Authentication
Como devolver identificação de sucesso
Apresentar mensagens de erro específicas para cada problema
Implementar validações para cada campo antes de enviar as informações para o Firebase Authentication
