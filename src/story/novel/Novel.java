package story.novel;
import author.Author;
public class Novel {
    int id;
    String shortContent;
    String name;
    double price;
    Author author;
    int pageNumber;

    public Novel(int id, String shortContent, String name, double price, Author author, int pageNumber) {
        this.id = id;
        this.shortContent = shortContent;
        this.name = name;
        this.price = price;
        this.author = author;
        this.pageNumber = pageNumber;
    }
    public void printNovel()
    {

        System.out.println("id: "+id);
        System.out.println("shortContent: "+shortContent);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        author.printAuthor();
        System.out.println("pageNumber: "+pageNumber);



    }
}
