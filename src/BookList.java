interface BookList {
    void add(Book book);

    void add(Book book, int index);

    BookLinkedList.Node getNode(int index);

    boolean remove(Book book);

    boolean removeAt(int index);

    int size();

    void clear();
}
