# iPhone
 Projeto em UML para Dio

 +----------------+
|    iPhone      |
+----------------+
| - modelo       |
| - numeroSerie  |
+----------------+
| + tocar()      |
| + pausar()     |
| + selecionarMusica() |
| + ligar()      |
| + atender()    |
| + iniciarCorreioVoz() |
| + exibirPagina() |
| + adicionarNovaAba() |
| + atualizarPagina() |
+----------------+
       ^
       |
+---------------------+
| ReprodutorMusical   |
+---------------------+
| + tocar()           |
| + pausar()          |
| + selecionarMusica()|
+---------------------+
       ^
       |
+---------------------+
| AparelhoTelefonico  |
+---------------------+
| + ligar()           |
| + atender()         |
| + iniciarCorreioVoz()|
+---------------------+
       ^
       |
+---------------------+
| NavegadorInternet   |
+---------------------+
| + exibirPagina()    |
| + adicionarNovaAba()|
| + atualizarPagina() |
+---------------------+

