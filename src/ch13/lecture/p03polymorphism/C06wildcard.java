package ch13.lecture.p03polymorphism;

public class C06wildcard {
    public static void main(String[] args) {
        var b1 = new Box6<String>();
        var b2 = new Box6<Long>();
        var b3 = new Box6<Object>();
        printItem(b1);
        printItem(b2);
        printItem(b3);

    }

    static void printItem(Box6<?> param) {  // ? 자리에 뭐든지 올 수 있음
        Object item = param.getItem();
        System.out.println("item = " + item);
    }
}

class Box6<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

