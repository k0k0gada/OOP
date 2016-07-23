package notepad;

public class Page {
	private String title;
	private String text = "";
	private int pageNumber;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	Page() {
	}

	Page(String title) {
		this.title = title;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	Page(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void addText(String text) {
		this.text = this.text + text;
	}

	public void delText() {
		this.text = "";
	}

	public String showPage() {

		return ("Page " + this.getPageNumber() + ":\n" + this.title + "\n" + this.text);
	}

	boolean searchWord(String word) {
		return this.text.toLowerCase().contains(word.toLowerCase());
	}

	boolean searchDigits() {
		for (int i = 0; i < this.text.length(); i++) {
			if (this.text.charAt(i) > ('0' - 1) && this.text.charAt(i) < ('9' + 1))
				return true;
		}
		return false;
	}
}
