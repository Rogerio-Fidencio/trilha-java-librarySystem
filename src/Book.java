
public class Book {
	private String title;
	private String author;
	private String publicationYear;
	private String category;
	private int shelfPosition;
	private boolean isRented;
	
	
	public Book(String title, String author, String publicationYear, String category, int shelfPosition) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.category = category;
		this.shelfPosition = shelfPosition;
		this.isRented = true;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getShelfPosition() {
		return shelfPosition;
	}
	public void setShelfPosition(int shelfPosition) {
		this.shelfPosition = shelfPosition;
	}
	public boolean getIsRented() {
		return isRented;
	}
	
	
	void rent() {
		isRented = false;
	}
	
	void giveBack() {
		isRented = true;
	}
	
	
	String bookDatails() {
		return "Título: " + title + "\n" +
			   "Autor: " + author + "\n" +
			   "Ano de publicação: " + publicationYear + "\n" +
			   "Categoria: " + category + "\n" +
			   "Posição na prateleira: " + shelfPosition + "\n" +
			   (isRented ? "Disponível" : "indisponível");
				
	}

	
	
}
