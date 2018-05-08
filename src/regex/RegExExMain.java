package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExMain {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(.?)abc(.*)"); // TEMPLATE
		Matcher m = pattern.matcher("abcSSA"); // REZULTAT COMPARARII STRINGULUI CURENT (ABC)cu template-ul
		System.out.println(m.matches());
		
		Pattern roTel = Pattern.compile("\\+40 \\d{3} \\d{4}");
		m = roTel.matcher("+40 012 2545");
		System.out.println(m.matches());
		

		Pattern doiSiTrei = Pattern.compile("[^23]+"); // 2,3,2,3,3,2,2,2
		m = doiSiTrei.matcher("ala bala bal sdfsdf o9998hsd");
		System.out.println(m.matches());
		
		Pattern upc = Pattern.compile("[A-Z].*[0-9]"); // 2,3,2,3,3,2,2,2
		m = upc.matcher("ABCSD2342UUWEE1");
		System.out.println(m.matches());
		
		System.out.println("Ala bala pufi".matches("^.*pufi$"));

	}

}
