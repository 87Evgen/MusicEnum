package abstractt;

public class Runner {
    public static void main(String[ ] args) {
        AbstractCardAction action; // можно объявить ссылку
// action = new AbstractCardAction(); нельзя создать объект!
        action = new CreditCardAction();
        action.doPayment (100);
        action.checkLimit();
    }
}