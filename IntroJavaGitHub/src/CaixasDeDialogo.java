/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliana
 */
import javax.swing.JOptionPane;

public class CaixasDeDialogo {

	public static void main(String[] args) {
		Object[] options = { "Eu vou!", "Não vou" };
		JOptionPane.showOptionDialog(null, "Vamos festejar!!", "Warning",
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options[0]);
	}
}
