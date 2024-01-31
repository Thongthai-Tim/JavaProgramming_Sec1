
import javax.swing.*;
public class FictionBookDemo1 {

	public static void main(String[] args) {
		String bookName = JOptionPane.showInputDialog("Input Bookname:");
		int pubYear = Integer.parseInt(JOptionPane.showInputDialog("Input PublicYear:"));
		FictionBook book = new FictionBook(bookName,pubYear);
		String authorName = JOptionPane.showInputDialog("Input Author-Name:");
		String authorEmail = JOptionPane.showInputDialog("Input Author-Email:");
		book.setAuthorName(authorName);
		book.setEmail(authorEmail);
		while(book.checkFormatName()) {
			authorName = JOptionPane.showInputDialog("Input Author-Name:");
			book.setAuthorName(authorName);
		}
		while(book.checkEmail()) {
			authorEmail = JOptionPane.showInputDialog("Input Author-Email:");
			book.setEmail(authorEmail);
		}
		JOptionPane.showMessageDialog(null, book);

	}

}