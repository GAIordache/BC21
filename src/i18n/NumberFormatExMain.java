package i18n;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExMain {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.GERMAN);
		NumberFormat nf = NumberFormat.getInstance();
		double number = 1243234234.667;
		String s = nf.format(number);
		System.out.println("German:" + s);
		System.out.println("Russian:" + NumberFormat.getInstance(new Locale("ru")).format(number));
		System.out.println("EnglishUK:" + NumberFormat.getInstance(Locale.UK).format(number));
		System.out.println("EnglishUS:" + NumberFormat.getInstance(Locale.US).format(number));

		System.out.println("Romania:" + NumberFormat.getInstance(new Locale("ro")).format(number));
		double nbr = NumberFormat.getInstance(Locale.US).parse("1,243,234,234.667").doubleValue();
		System.out.println("nbr:" + nbr);
		for(Locale locale : DecimalFormat.getAvailableLocales()) {
			System.out.println(locale.toString());
			System.out.println(DecimalFormat.getCurrencyInstance(locale).getCurrency().getCurrencyCode());
		}
	}

}
