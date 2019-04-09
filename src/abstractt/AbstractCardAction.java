package abstractt;

public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction() { // конструктор
    }
    // more methods
    public boolean checkLimit() { // собственный метод
        return true; // stub
    }
    public abstract void doPayment(double amountPayment);
}