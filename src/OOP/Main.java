package OOP;

import java.text.MessageFormat;

public class Main {
    static final int AGE_LIMIT = 40;
    static final int WORKER_ARRAY_SIZE = 5;

    public static void main(String[] args) {


        System.out.println("Работнички: ");

        Worker[] workers = new Worker[WORKER_ARRAY_SIZE];
        workers[0] = new Worker("Буратино Дуболомов", "Монтажник линии связи", "hd@oboz.com",
                "+7(999)356-00-00", 50000, 24);
        workers[1] = new Worker("Незнайка Попович", "Руководитель абонентского отдела",
                "jonsi@oboz.com", "8(800)156-00-45", 90000, 39);
        workers[2] = new Worker("Кощей Бесмертный", "Ген директор",
                "zlato@oboz.com", "+7(917)516-00-04", 400000, 60);
        workers[3] = new Worker("Баба Яга", "Секретарь",
                "lukomorie@oboz.com", "+7(777)777-77-77", 60000, 45);
        workers[4] = new Worker("Иван Царевич", "Директор IT проекта",
                "tridevyatoe@oboz.com", "+7(912)558-00-13", 120000, 35);
        System.out.println();






        for (Worker worker : workers) {

            if (worker.getAge() > AGE_LIMIT) {

                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + worker.workerInfo());
            }
//            else if (worker.getAge() == AGE_LIMIT){
//                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + worker.workerInfo());
//            } else {
//                System.out.println("Сотрудник младше " + AGE_LIMIT + " лет: " + worker.workerInfo());
//            }
        }

    }
}
