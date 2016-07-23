package notepad;

import java.util.Scanner;

public class SimpleNotePad implements INotePad {
	Scanner sc = new Scanner(System.in);
	private Page[] pages;

	public SimpleNotePad() {
		this.pages = new Page[1];
		pages[0] = new Page();
	}

	public SimpleNotePad(int n) {
		if (n < 0) {
			System.err.println("can not create a notepeda with less then 0 pages.A default notepad is created");
			this.pages = new Page[1];
			pages[0] = new Page();
			return;
		}
		this.pages = new Page[n];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page(i + 1);
		}
		System.out.println("enter the notepad's content");
		for (int i = 0; i < pages.length; i++) {
			System.out.println("enter the title for page " + this.pages[i].getPageNumber());
			this.pages[i].setTitle(sc.nextLine());
			System.out.println("enter the text on page " + this.pages[i].getPageNumber());
			this.pages[i].addText(sc.nextLine());

		}
	}

	public void addTitleToPage() {
		String text = this.enterText();
		int n = this.whatPage();
		switch (this.checkForPageExistance(n)) {
		case 0:
			this.pages[n - 1].setTitle(text);
			System.out.println("the new page:");
			System.out.println(this.pages[n - 1].showPage());
			break;
		case 1:
			System.out.println("adding title to new page");
			Page[] temp = new Page[n + 1];
			for (int i = 0; i < pages.length; i++) {
				temp[i] = pages[i];
			}
			temp[n] = new Page();
			temp[n].addText(text);
			this.pages = temp;
			break;
		case -1:
			System.out.println("no such page : " + n);
			break;
		case -2:
			System.out.println("pages can not be negative");
		}
	}

	public void addText() {
		String text = this.enterText();
		int n = this.whatPage();
		switch (this.checkForPageExistance(n)) {
		case 0:
			this.pages[n - 1].addText(text);
			System.out.println("the new page:");
			System.out.println(this.pages[n - 1].showPage());
			break;
		case 1:
			System.out.println("adding text to new page");
			Page[] temp = new Page[n + 1];
			for (int i = 0; i < pages.length; i++) {
				temp[i] = pages[i];
			}
			temp[n] = new Page();
			temp[n].addText(text);
			this.pages = temp;
			break;
		case -1:
			System.out.println("no such page : " + n);
			break;
		case -2:
			System.out.println("pages can not be negative");
		}
	}

	public void replaceText() {
		String text = this.enterText();
		int n = this.whatPage();
		if (this.checkForPageExistance(n) == 0) {
			this.pages[n - 1].delText();
			this.pages[n - 1].addText(text);
			System.out.println("text replaced succesfully");
		} else {
			System.out.println("couldn't find page");
		}
	}

	public void deleteTextOnPage() {
		int n = this.whatPage();
		if (this.checkForPageExistance(n) == 0) {
			this.pages[n - 1].delText();
			System.out.println("text on page deleted succesfully");
		} else {
			System.out.println("no such page!nothing happened");
		}
	}

	public void showAllPages() {
		if (this.pages.length > 0) {
			for (int i = 0; i < this.pages.length; i++) {
				System.out.println(this.pages[i].showPage());
				System.out.println();
			}
		} else {
			System.out.println("NotePad is empty !");
		}
	}

	private int checkForPageExistance(int n) {
		if (n <= 0) {
			return -2;
		} else if (n <= this.pages.length) {// there is such page OK
			return 0;
		} else if (n == this.pages.length + 1) {
			return 1;// new page
		} else {
			return -1;// no such page
		}
	}

	String enterText() {
		System.out.println("text: ");
		return sc.next();
	}

	int whatPage() {
		System.out.println("page:");
		return sc.nextInt();
	}

	public boolean searchWord() {
		String word = this.enterText();
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	public void printAllPagesWithDigits() {
		boolean foundDigits = false;
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].searchDigits()) {
				this.pages[i].showPage();
				foundDigits = true;
			}
		}
		if (!foundDigits) {
			System.out.println("no pages with numbers were found");
		}
	}
}
