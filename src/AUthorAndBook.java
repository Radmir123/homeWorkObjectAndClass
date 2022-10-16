public class AUthorAndBook {
    private String bookName;
    private String authorName;

    public AUthorAndBook(String bookName, String authorName){
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public String getAuthorName(){
        return this.authorName;
    }
}
