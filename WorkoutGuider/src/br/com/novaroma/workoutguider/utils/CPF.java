package br.com.novaroma.workoutguider.utils;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class CPF {
	public static String formatarCPF(String cpf) throws ParseException {
		MaskFormatter mf = new MaskFormatter("###.###.###-##");
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(cpf);
	}
}