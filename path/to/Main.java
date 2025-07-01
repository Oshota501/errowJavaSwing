package errow;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] txt = new String[] {
				"<html>An error caused by your stupidity.<br><br>You'll probably just skip over this error and die <br>without knowing what happened.</html>" ,
				"<html><body>Error due to needing to go to the toilet.<br><br><a style='font-size: 8px;'>You held your urges for too long.  Hence the error.<br>Solution : Let's try not to hold back.<br>Be careful of urinary stones</br></a></body></html>",
				"<html><body><p>Errors caused by a lazy lifestyle.<br><br>Please observe the following:<br></p><ul>Sleeping for less than 10 minutes<br>Dietary restriction: 20kcal</ul></body></html>",
				"<html><body style=\"font-size: 8px;\">The error occurred due to the influence of Shinjiro Koizumi in my brain.<br>There are so many issues in politics, and sometimes it's boring. When you're tackling a massive issue like climate change, it has to be fun, it has to be cool. It has to be sexy. Explaining what that means is not sexy.</body></html>",
				"<html><body><p style=\"font-size: 15 px;\">System Errow.</p><p style=\"font-size:10px;\">Shinjiro Koizumi could not be found.</p></body></html>"
		};
		String[] title = new String[] {
				"Stupidity errow" ,
				"Toilet errow" ,
				"Laziness　errow",
				"Koizumi errow",
				"Koizumi Errow"
		};
		Errow[] e1 = new Errow[txt.length] ;
		for(int i = 0 ; i < txt.length ; i ++) {
			e1[i] = new Errow(txt[i],title[i]);
		}
	}

}
