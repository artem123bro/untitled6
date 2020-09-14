public class TestAuthor {
    public static void main(String[] args){
        Author a1=new Author("joanne1965@mail.ru","Joanne Rowling",'w');
        Author a2=new Author("tolkien1892@mail.com","John Tolkien", 'm');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}

