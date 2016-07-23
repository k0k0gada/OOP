package notepad;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SecureNotePad np;
		Page z = new Page();
		System.out.println("how many pages should the notepad have ?");
		np = new SecureNotePad(sc.nextInt());
		for (;;) {
			System.out.println("what do you want to do ?");
			System.out.println(
					"1=add text, 2=add title,3=delete text on page;4=replace text on page ;5=show all content;0=exit");
			switch (sc.nextInt()) {
			case 1:
				np.addText();
				break;
			case 2:
				np.addTitleToPage();
				break;
			case 3:
				np.deleteTextOnPage();
				break;
			case 4:
				np.replaceText();
				break;
			case 5:
				np.showAllPages();
				break;
			case 0:
				return;
			default:
				System.out.println("wrong enter");
				break;
			}
		}
	}
}
