public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker();
        workers[1] = new Worker("Sumin Igor Ono", "Programmer", "sumin@igor.ono", "+7 911 10 10 991", 150000.13, 38);
        workers[2] = new Worker("Ogoni Anya Shot", "Manager", "Ogoni@anya.shot", "+7 343 34 62 142", 120000, 21);
        workers[3] = new Worker("Onegina Maria Adolif", "Cleaning woman", "onegina@maria.adolif", "+7 999 23 90 235", 66000.50 , 44);
        workers[4] = new Worker("Irun Irina Irgina", "Monster", "irun@irina.irgina", "+7 888 88 88 888", 200000, 45);


        for (Worker value : workers) {
            if (value.getAge() > 40) {
                value.printWorker();
                System.out.println();
            }
        }
    }
}
