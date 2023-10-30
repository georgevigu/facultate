package com.company;

import javax.swing.JOptionPane;

public class RandomGuess{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Ganditi-va la un numar intre 1 si 10.");
		JOptionPane.showMessageDialog(null, "Numarul este " + (1 + (int)(Math.random() * 10)));
	}
}