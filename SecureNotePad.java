package notepad;

public class SecureNotePad extends SimpleNotePad {
	String password;

	public SecureNotePad() {
		super();
		System.out.println("enter a password for the notepad: ");
		this.password = this.enterText();
	}

	public SecureNotePad(int n) {
		super(n);
		System.out.println("enter a password for the notepad: ");
		this.password = sc.nextLine();
	}

	private boolean checkPass() {
		System.out.println("enter password for the notepad:");
		String pass = sc.nextLine();
		return this.password.equals(pass);
	}

	public void addTitleToPage() {
		if (this.checkPass()) {
			super.addTitleToPage();
		} else {
			System.out.println("Wrong password.");
		}
	}

	public void addText() {
		if (this.checkPass()) {
			super.addText();
		} else {
			System.out.println("Wrong password.");
		}
	}

	public void replaceText() {
		if (this.checkPass()) {
			super.replaceText();
		} else {
			System.out.println("Wrong password.");
		}
	}

	public void deleteTextOnPage() {
		if (this.checkPass()) {
			super.deleteTextOnPage();
		} else {
			System.out.println("Wrong password.");
		}
	}

	public void showAllPages() {
		if (this.checkPass()) {
			super.showAllPages();
		} else {
			System.out.println("Wrong password.");
		}
	}

	void checkPassStrength(){
		
	}
}
