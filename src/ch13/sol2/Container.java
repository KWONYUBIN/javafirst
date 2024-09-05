package ch13.sol2;

public class Container<S, I> {
    private S Key;
    private I Value;

    public S getKey() {
        return this.Key;
    }

    public void setKey(S key) {
        this.Key = key;
    }

    public I getValue() {
        return this.Value;
    }

    public void setValue(I value) {
        this.Value = value;
    }
}
