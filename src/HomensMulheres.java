import javax.swing.JOptionPane;

public class HomensMulheres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Calcula o total de homens e mulheres da turma
		 * 
		 * @param args
		 */
		int mulheres, homens;
		double pMulheres, pHomens;

		// recebe quantidade de homens e mulheres
		mulheres = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de mulheres:"));

		homens = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de homens:"));

		pMulheres = ((mulheres * 100) / (mulheres + homens));
		pHomens = (homens * 100 / (mulheres + homens));

		JOptionPane.showMessageDialog(null, "A porcentagem de mulheres é de "
				+ pMulheres + " % e a porcentagem de homens é de " + pHomens
				+ " %.");

	}

}