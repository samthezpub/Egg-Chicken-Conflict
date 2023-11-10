public class Main {
    public static void main(String[] args) {
        final boolean I_DONT_LIKE_CONFLICTS = false; // Если вы не хотите споров, просто измените значение на true
        
        
        
        EggThreadTask eggThreadTask = new EggThreadTask();
        ChickenThreadTask chickenThreadTask = new ChickenThreadTask();

        Thread chickenThread = new Thread(chickenThreadTask);
        Thread eggThread = new Thread(eggThreadTask);

        chickenThread.setDaemon(true);
        chickenThread.start();


        eggThread.setDaemon(true);
        eggThread.start();


        String winner = "Ничья, дружба";
        if (!I_DONT_LIKE_CONFLICTS){
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
        }
        System.out.println("Победитель - " + winner);
    }
}