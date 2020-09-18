package story.novel;

import author.Author;

public class NovelAction {

    public void create_novel()
    {
        Author author1=new Author("thuy");
        Author author2=new Author("thuy");
        Author author3=new Author("thuy");
        Author author4=new Author("thuy");
        Author author5=new Author("thuy");
        Novel novel1=new Novel(1,"short content","Toan",19.800, author1,100);
        Novel novel2=new Novel(2,"short content","Van",19.800, author2,100);
        Novel novel3=new Novel(3,"short content","English",19.800, author3,100);
        Novel novel4=new Novel(4,"short content","Thu Cong",19.800, author4,100);
        Novel novel5=new Novel(5,"short content","Tu Nhien",19.800, author5,100);
    }

    public static void main(String[] args) {
        Author author1=new Author("thuy");
        Novel novel1=new Novel(1,"short content","Toan",19.800, author1,100);
        novel1.printNovel();
    }
}
