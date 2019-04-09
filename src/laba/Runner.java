package laba;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        MassivStudent sl = new MassivStudent();
        System.out.println("Заполните данные студентов.");
        System.out.println("Для создания нового студента введите \"Enter\"");
        System.out.println("Для завершения coздания списка введите \"Создать\"");

        while (! scan.nextLine().equals("Создать")) {
            System.out.println("id");
            int id = scan.nextInt();
            while (true) {
                if (id < 0) {
                    System.out.println("Вы ввели id меньше 0! Введите снова!");
                    id = scan.nextInt();
                } else {
                    break;
                }
            }
            System.out.println("ФИО");
            String fio = scan.nextLine();
            while (true) {
                if (fio.length() == 0) {
                    System.out.println("Вы не ввели ФИО! Введите снова!");
                    fio = scan.nextLine();
                } else {
                    break;
                }
            }





            System.out.println("факультет");
            String fak = scan.nextLine();

            while (true) {
                if (fak.length() == 0) {
                    System.out.println("Вы не ввели фамилию! Введите снова!");
                    fak = scan.nextLine();
                } else {

                    break;
                }
            }

            while (true) {
                try {
                    System.out.println("Дата рождения в формате гггг.мм.дд");
                    String birth = scan.nextLine();
                    Date data = sdf.parse(birth);
                    sl.add(new Student(id, fio,data,fak));
                    break;
                } catch (ParseException e) {
                    System.out.println("Неверная дата");
                }
            }


        }

        System.out.println("Введите имя, чтобы найти дату рождения");
        int n = sl.find(scan.nextLine());
        if (n == -1) {
            System.out.println("Неверные данные!");
        } else {
            System.out.println(sl.get(n).getData().toString());
        }


        try {
            System.out.println("Введите дату рождения, чтобы найти имя и фамилию");
            int db = sl.findDate(sdf.parse(scan.nextLine()));
            System.out.println(sl.get(db).getFio() + " ");
        } catch (ParseException e) {
            System.out.println("Неверная дата");
        }

        sl.printList();

        System.out.println("Введите порядковый номер, чтобы удалить из списка");
        String num = scan.nextLine();
        if (num.length() == 0) {
            System.out.println("Неверные данные!");
        } else {
            sl.deleteNumber(Integer.parseInt(num));
        }

        sl.printList();
    }
}