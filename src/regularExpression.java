import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
		public static void main(String args[]) {
			String str = "";
			String pattern = "(.*)";

			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(str);
			System.out.println(m.matches());
		}

	}

