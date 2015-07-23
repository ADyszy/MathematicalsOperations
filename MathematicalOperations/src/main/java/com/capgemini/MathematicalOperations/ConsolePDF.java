package com.capgemini.MathematicalOperations;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.lowagie.text.DocumentException;

public class ConsolePDF {
	public static void readConsole() {
		Scanner input = new Scanner(System.in);
		String pdfName;
		String textName;
		System.out.println("Wprowadz nazwe pliku do konwersji na pdf: ");
		textName = input.nextLine();
		System.out.println("Wprowadz nazwe pliku pdf: ");
		pdfName = input.nextLine();
		input.close();
		try {
			CreatePDF.create(pdfName, textName);
		} catch (FileNotFoundException | DocumentException exc) {
			System.out.println(exc);
		}
	}
}
