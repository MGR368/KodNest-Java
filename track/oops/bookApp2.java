package track.oops;

class book2 {
    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class bookApp2 {
    public static void main(String[] args) {
        book2 b = new book2();
        b.setData(100);
        System.out.println(b.getData());
    }

}
