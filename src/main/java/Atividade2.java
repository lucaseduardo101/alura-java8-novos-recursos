public class Atividade2 {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("Executando um Runnable")).start();

//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//
//        }).start();
//    }
    }
}
