package polymorf;

public class QuestFactory { // шаблон Factory Method (упрощенный)
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 1:
                return new SingleChoiceQuest();
            default :
                throw new IllegalArgumentException("illegal mode");
// assert false; // плохо
// return null; // еще хуже
        }
    }
}