package collectionsdemolibraryms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 9, 2025
 * Time :2:17:12 PM
 * Project :CoreJava
 */
//Library → manages collections (ArrayList, LinkedList, HashSet, TreeSet).

public class Library {

	private ArrayList<Book> allBooks = new ArrayList<>();       // All books
	private LinkedList<Book> issuedBooks = new LinkedList<>();  // Recently issued books
	private HashSet<Member> members = new HashSet<>();          // Unique members
	private TreeSet<String> sortedBooks = new TreeSet<>();      // Sorted book titles

	// Add a new book to library
	public void addBook(Book book) {
		allBooks.add(book);
		sortedBooks.add(book.getTitle());
	}

	// Issue a book
	public void issueBook(Book book) {
		if (sortedBooks.contains(book.getTitle())) {
			issuedBooks.add(book);
			System.out.println("✅ Book issued: " + book);
		} else {
			System.out.println("❌ Book not available: " + book.getTitle());
		}
	}

	// Add a new member
	public void addMember(Member member) {
		if (members.add(member)) {
			System.out.println("👤 New member added: " + member);
		} else {
			System.out.println("⚠️ Member already exists: " + member);
		}
	}

	// Display all books
	public void showAllBooks() {
		System.out.println("📚 All Books (ArrayList): " + allBooks);
	}

	// Display issued books
	public void showIssuedBooks() {
		System.out.println("📖 Recently Issued Books (LinkedList): " + issuedBooks);
	}

	// Display members
	public void showMembers() {
		System.out.println("👥 Members (HashSet): " + members);
	}

	// Display sorted books
	public void showSortedBooks() {
		System.out.println("📑 Sorted Books (TreeSet): " + sortedBooks);
	}

}

