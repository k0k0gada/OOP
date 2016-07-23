package notepad;

public class SecureNotePad extends SimpleNotePad {
	String password;
	static final int MINIMUM_CHARACTERS=5;

	public SecureNotePad() {
		super();
		System.out.println("enter a password for the notepad: ");
		do {
			this.password = this.enterText();
		} while (!checkPassStrength());
	}

	public SecureNotePad(int n) {
		super(n);
		System.out.println("enter a password for the notepad: ");
		do {
			this.password = this.enterText();
		} while (!checkPassStrength());
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

	public void searchWord() {
		if (this.checkPass()) {
			super.searchWord();
		} else {
			System.out.println("Wrong password.");
		}
	}

	public void printAllPagesWithDigits() {
		if (this.checkPass()) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Wrong password.");
		}
	}

	boolean checkPassStrength() {
		// 5 symbols min,1 lower Case,1 upper case,1 number
		if (this.password.length() >= this.MINIMUM_CHARACTERS) {
			if (!this.password.toLowerCase().equals(this.password)) {
				if (!this.password.toUpperCase().equals(this.password)) {
					boolean digits = false;
					for (int i = 0; i < this.password.length(); i++) {
						if (this.password.charAt(i) > ('0' - 1) && this.password.charAt(i) < ('9' + 1))
							return true;
					}
					System.out.println("there should be at least one digit !");
				} else {
					System.out.println("there should be at least one lower case letter!");
					return false;
				}
			} else {
				System.out.println("there should be at least one UPPER case letter!");
				return false;
			}
		} else {
			System.out.println("the password is too short");
			return false;
		}
		return false;
	}
}
