package Iterator;

public interface IteratorUser {
    User next();
    void reset();
    boolean hasMore();
}
