package facadepattern;

public interface ICoolStack <E> {
    public E push(E value);

    public boolean empty();

    public E pop();

}
