package br.com.novaroma.workoutguider.utils;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Celular {
	public static String formatarCelular(String telefone) throws ParseException {
		MaskFormatter mf = new MaskFormatter("## # ####-####");
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(telefone);
	}
}