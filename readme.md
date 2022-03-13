# pdm1-imc

_Fagno_
| 09 de Mar.

**Cara ou Coroa é um jogo simples, que consiste em se atirar uma moeda ao ar para então verificar qual de seus lados ficou voltado para cima após sua queda. É comumente utilizado para se escolher entre duas alternativas ou para resolver uma disputa entre duas partes. Crie um aplicativo para representar o jogo de Cara ou Coroa.**

Instruções para gerar valor Randômico:

//declarar uma instância da classe Random

Random randomico = new Random();

//criar uma variável inteira para receber o valor aleatório entre 0 e 1, utilizando o método nextInt().

int valorAleatorio = randomico.nextInt(2);

NOTA: Outra maneira de alterar o valor do ImageView, exemplo abaixo:

imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.@id_IMAGE));

Por fim, crie uma tela splash para seu aplicativo, instruções a seguir:
1) Crie uma activity e utilize o código disponível no arquivo/classe anexo;
2) Adicione a imagem/logo para sua tela splash no layout de activity criada ;
3) Alterar a activity a ser iniciada no arquivo AndroidManifest.xml.