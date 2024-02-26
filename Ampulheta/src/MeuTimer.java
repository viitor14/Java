import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class MeuTimer {
    private Timer timer;
    private CountDownLatch latch;

    public MeuTimer(CountDownLatch latch) {
        this.latch = latch;
        timer = new Timer();
    }

    public void iniciarTemporizador() {
        TimerTask tarefa = new TimerTask() {
            int segundos = 0;

            @Override
            public void run() {
                segundos++;
                //System.out.println( segundos + " segundos");

                // Condição para parar o temporizador após 10 segundos
                if (segundos == 2) {
                    pararTemporizador();
                    //System.out.println("Acabou tempo\n");
                    latch.countDown(); // Sinaliza que o temporizador terminou
                }
            }
        };

        // Agendando a tarefa para ser executada a cada segundo (1000 milissegundos)
        timer.scheduleAtFixedRate(tarefa, 0, 1000);
    }

    public void pararTemporizador() {
        timer.cancel();
    }
}