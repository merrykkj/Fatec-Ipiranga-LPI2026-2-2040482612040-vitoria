/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Disciplina : Linguagem de Programacao I                                         *
* Prof . Verissimo                                                                *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Objetivo do Programa : Simular a sequencia do Xeque Pastor usando matriz 8x8.    *
* Data - 31/08/2026                                                               *
* Autor : Vitória Pereira de Lucena                                               *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/

public class Main
{
    private static final int TAMANHO_TABULEIRO  = 8;
	public static void main(String[] args) {
    String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

    // preenche e exibe o tabuleiro inicial
    iniciarTabuleiro(tabuleiro);
    System.out.println("--- TABULEIRO INICIAL ---");
    exibirTabuleiro(tabuleiro);

    // primeira jogada
    System.out.println("=======================================");
    System.out.println("             Jogada #1             ");
    System.out.println("=======================================\n");

    moverPeca(tabuleiro, 6, 4, 4, 4);
    System.out.println("---------Brancas jogam e4---------");
    exibirTabuleiro(tabuleiro);

    moverPeca(tabuleiro, 1, 4, 3, 4);
    System.out.println("---------Pretas jogam e5---------");
    exibirTabuleiro(tabuleiro);

    // segunda jogada
    System.out.println("=======================================");
    System.out.println("             Jogada #2             ");
    System.out.println("=======================================\n");

    moverPeca(tabuleiro, 7, 5, 4, 2);
    System.out.println("--------- Brancas jogam Bc4 ---------");
    exibirTabuleiro(tabuleiro);

    moverPeca(tabuleiro, 0, 1, 2, 2);
    System.out.println("--------- Pretas jogam Cc6 ---------");
    exibirTabuleiro(tabuleiro);

    // terceira jogada
    System.out.println("=======================================");
    System.out.println("             Jogada #3             ");
    System.out.println("=======================================\n");

    moverPeca(tabuleiro, 7, 3, 3, 7);
    System.out.println("--------- Brancas jogam Dh5 ---------");
    exibirTabuleiro(tabuleiro);

    moverPeca(tabuleiro, 0, 6, 2, 5);
    System.out.println("--------- Pretas jogam Cf6 ---------");
    exibirTabuleiro(tabuleiro);

    // ultima jogada
    System.out.println("=======================================");
    System.out.println("      Jogada #4 (Xeque MATE)       ");
    System.out.println("=======================================\n");

    moverPeca(tabuleiro, 3, 7, 1, 5); 
    System.out.println("---Brancas capturam Peao em f7 (Dxf7#)---");
    exibirTabuleiro(tabuleiro);
}
 
	private static void iniciarTabuleiro(String[][] tabuleiro) {
		//deixando as posições vazias
		for(int i=0; i<TAMANHO_TABULEIRO ; i++) {
			for(int y=0; y<TAMANHO_TABULEIRO ; y++) {
				tabuleiro[i][y] = "   ";
			}

		}

		//peças principais pretas
		tabuleiro[0][0] = "tP1"; // torre
		tabuleiro[0][1] = "cP2"; // cavalo
		tabuleiro[0][2] = "bP3"; // bispo
		tabuleiro[0][3] = "dP4"; // dama
		tabuleiro[0][4] = "rP5"; // rei
		tabuleiro[0][5] = "bP6"; // bispo
		tabuleiro[0][6] = "cP7"; // cavalo
		tabuleiro[0][7] = "tP8"; // torre

		//preenchendo os peões pretos em cada posição
		for(int i=0; i<TAMANHO_TABULEIRO ; i++) {
			tabuleiro[1][i] = "PP" + (i + 1);
		}

		//peças principais brancas
		tabuleiro[7][0] = "TB1"; // torre
		tabuleiro[7][1] = "CB2"; // cavalo
		tabuleiro[7][2] = "BB3"; // bispo
		tabuleiro[7][3] = "DB4"; // dama
		tabuleiro[7][4] = "RB5"; // rei
		tabuleiro[7][5] = "BB6"; // bispo
		tabuleiro[7][6] = "CB7"; // cavalo
		tabuleiro[7][7] = "TB8"; // torre

		//preenchendo os peões brancos em cada posição
		for (int i=0; i<TAMANHO_TABULEIRO; i++) {
			tabuleiro[6][i] = "PB" + (i + 1);
		}
	}
	private static void exibirTabuleiro(String[][] tabuleiro) {
		System.out.println("---------------------------------------");
		
		//cabeçalho das colunas
		System.out.println("   a   b   c   d   e   f   g   h");


		for (int i=0; i<TAMANHO_TABULEIRO ; i++) {
		    //número das linhas
		    System.out.print((TAMANHO_TABULEIRO  - i) + " ");
			for(int y=0; y<TAMANHO_TABULEIRO ; y++ ) {
				System.out.print(tabuleiro[i][y] + " ");
			}
			// quebra de linha
			System.out.println();
		}
		System.out.println("---------------------------------------");

	}

    // move a peça para a nova posição e marca a posição de origem com "..."
	private static void moverPeca(String[][] tabuleiro, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
		tabuleiro[linhaOrigem][colunaOrigem] = "...";
	}
}