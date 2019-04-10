package anonymous;
public class Runner {
    public static void main(String[ ] args) {
        String ob = "qweRtRRR";
        WrapperString wrFirst = new WrapperString(ob); // анонимный класс #1
        WrapperString wrLast = new WrapperString(ob) {
            // замена последнего символа
            @Override
            public String replace(char oldChar, char newChar) {
                char[] array = new char[getStr().length()];
                getStr().getChars(0, getStr().length(), array, 0);
                for (int i = array.length - 1; i > 0; i--) {
                    if (array[i] == oldChar) {
                        array[i] = newChar;
                        break;
                    }
                }
                return new String(array);
            }
        }; // конец объявления анонимного класса
        WrapperString wr2 = new WrapperString(ob) { // анонимный класс #2
            private int position = 2; // собственное поле
            // замена символа по позиции
            public String replace(char oldChar, char newChar) {
                int counter = 0;
                char[] array = new char[getStr().length()];
                getStr().getChars(0, getStr().length(), array, 0);
                if (verify(oldChar, array)) {
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == oldChar) {
                            counter++;
                            if (counter == position) {
                                array[i] = newChar;
                                break;
                            }
                        }
                    }
                }
                return new String(array);
            }
            // собственный метод
            public boolean verify(char oldChar, char[] array){
                int counter = 0;
                for (char c : array) {
                    if (c == oldChar) {
                        counter++;
                    }
                }
                return counter >= position;
            }
        }; // конец объявления анонимного класса
        System.out.println(wrLast.replace('R', 'Y'));
        System.out.println(wr2.replace('R', 'Y'));
        System.out.println(wrFirst.replace('R', 'Y'));
    }
}
