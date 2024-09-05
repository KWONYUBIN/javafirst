package ch13.lecture.p01generic;

public class C07Interface {
}

class MyClass72 implements MyInterface7<String> {
    @Override
    public String getItem() {
        return "";
    }

    @Override
    public void setItem(String item) {

    }
}


class MyClass7<T> implements MyInterface7<T> {
    @Override
    public T getItem() {
        return null;
    }

    @Override
    public void setItem(T item) {

    }
}

interface MyInterface7<T> {
    T getItem();

    void setItem(T item);
}
