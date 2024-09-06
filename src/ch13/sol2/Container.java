package ch13.sol2;

public class Container<T, U> {
    private T key;
    private U value;

    public void set(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }
}

