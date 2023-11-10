// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EggThreadTask eggThreadTask = new EggThreadTask();
        ChickenThreadTask chickenThreadTask = new ChickenThreadTask();

        Thread chickenThread = new Thread(chickenThreadTask);
        Thread eggThread = new Thread(eggThreadTask);

        chickenThread.start();
        eggThread.start();

        String winner = "";
        while (true){
            if (!chickenThread.isAlive()){
                winner = "Яйцо";
                break;
            }
            if (!eggThread.isAlive()){
                winner = "Курица";
                break;
            }
        }
        System.out.println("Победитель - " + winner);
    }
}