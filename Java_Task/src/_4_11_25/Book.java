package _4_11_25;

public class Book {
	
String bookTitle;
String author;
int isbn;
public void addBookDetails(String title,String name,int id) {
	bookTitle=title;
	author=name;
	isbn=id;
}
public String displayDetails() {
	return "book title:"+bookTitle+","+"author name:"+author+","+"id: "+isbn;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book();
		obj.addBookDetails("atomic habits","james clear", 2);
		String res=obj.displayDetails();
		System.out.println(res);

	}

}
