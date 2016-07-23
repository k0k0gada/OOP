package notepad;

public class ElectronciSecureNotePad extends SecureNotePad implements IElectronicDevice, INotePad {
	private boolean isStarted;

	public ElectronciSecureNotePad() {
		super();
		this.isStarted = false;
	}
	public ElectronciSecureNotePad(int n) {
		super(n);
		this.isStarted = false;
	}

	public boolean checkStatus() {
		return this.isStarted;
	}

	public boolean isStarted() {
		return this.isStarted;
	}

	public void start() {
		if (!this.isStarted) {
			this.isStarted = true;
			System.out.println("the device has been turned on");
		} else {
			System.out.println("It's already ON!");
		}
	}

	public void stop() {
		if (this.isStarted) {
			this.isStarted = false;
			System.out.println("the device has been turned off");
		} else {
			System.out.println("It's already OFF!");
		}
	}

	public void addTitleToPage() {
		if (this.isStarted()) {
			super.addTitleToPage();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void addText() {
		if (this.isStarted()) {
			super.addText();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void replaceText() {
		if (this.isStarted()) {
			super.replaceText();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void deleteTextOnPage() {
		if (this.isStarted()) {
			super.deleteTextOnPage();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void showAllPages() {
		if (this.isStarted()) {
			super.showAllPages();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void searchWord() {
		if (this.isStarted()) {
			super.searchWord();
		} else {
			System.out.println("the thing is OFF");
		}
	}

	public void printAllPagesWithDigits() {
		if (this.isStarted()) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("the thing is OFF");
		}
	}

}
