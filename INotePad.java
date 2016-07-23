package notepad;

public interface INotePad {
	void addText();// text to be added to page n;

	void replaceText();// text replaces current text on page n

	void deleteTextOnPage();// removes text from page N;

	void showAllPages();// showInfo

	boolean searchWord();//searches for e spec. word
	
	void printAllPagesWithDigits();//if the page contains digits
	
	
}
