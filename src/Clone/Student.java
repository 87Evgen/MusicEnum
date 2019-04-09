package Clone;

public class Student implements Cloneable { /* включение интерфейса */
    private int id = 71;
    private String name;
    private int age;
    /* конструкторы, методы */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public Object clone() throws CloneNotSupportedException { // переопределение
        return super.clone(); // вызов базового метода
    }
}