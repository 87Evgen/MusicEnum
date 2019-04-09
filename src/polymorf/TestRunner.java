package polymorf;

public class TestRunner {
    public static void main(String[ ] args) {
        TestAction bt = new TestAction();
        AbstractQuest[ ] test = bt.generateTest(6, 2); // 60 вопросов 2-х видов
// здесь должен быть код процесса прохождения теста …
        bt.checkTest(test); // проверка теста
    }
}