package polymorf;

public abstract class AbstractQuest {
    private long id;
    private String questContent;
    // конструкторы и методы
    public abstract boolean check(Answer ans);
}
