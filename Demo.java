package notepad;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectronciSecureNotePad enp;
		System.out.println("how many pages should the notepad have ?");
		enp = new ElectronciSecureNotePad(sc.nextInt());
		for (;;) {
			System.out.println("what do you want to do ?");
			System.out
					.println("1=add text, 2=add title,3=delete text on page;4=replace text on page ;5=show all content;"
							+ "6=search for a word;\n7=print pages with digits;8=turn ON;9=turn OFF ;0=exit");
			switch (sc.nextInt()) {
			case 1:
				enp.addText();
				break;
			case 2:
				enp.addTitleToPage();
				break;
			case 3:
				enp.deleteTextOnPage();
				break;
			case 4:
				enp.replaceText();
				break;
			case 5:
				enp.showAllPages();
				break;
			case 6:
				enp.searchWord();
				break;
			case 7:
				enp.printAllPagesWithDigits();
				break;
			case 8:
				enp.start();
				break;
			case 9:
				enp.stop();
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
