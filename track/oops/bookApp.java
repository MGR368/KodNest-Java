package track.oops;

class Book {
    private int pageNum;

    public void setData(int X) {
        pageNum = X;
    }

    public void getData() {
        System.out.println(pageNum);
    }
}

public class bookApp {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-100);
        b.getData();

    }
}
