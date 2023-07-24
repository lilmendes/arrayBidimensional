package pacote;

public class Atv37 {

	public static void main(String[] args) {
	//elabore uma solu��o para preencher um array bidimensional de tamanho 3 x 5 
	//com uma sequ�ncia crescente de 15 valores inteiros, pares iniciados por 8. 
	//O array deve ser retornado em um m�todo espec�fico que receber� a quantidade de linhas e colunas no seu par�metro.

		int[][] seq =  obterseqpar(3, 5);                         
              Impressao.imprimir(seq);



		// TODO Auto-generated method stub

	}

	public static int[][] obterseqpar(int linha, int coluna) {
		int[][]seq = new int[linha][coluna];	                   
			for (int i = 0, num=8; i < seq.length; i++) {
			for (int j = 0; j < seq[i].length; j++, num++) {
				if(num%2==0) {
				seq[i][j]=num;
				}	
				else {
				num++;
				seq[i][j]=num;
				}
				}
		
}

		return seq;
	}	
	}
