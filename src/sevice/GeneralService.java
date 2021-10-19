package sevice;

public interface GeneralService<T>{
    int findIndexById(int id);

    void add(T t);

    void update(int id, T t);

    void delete(int id);

    void print();

    void sort();
}

