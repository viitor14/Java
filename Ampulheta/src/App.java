
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da ampulheta(informa numero par):");
        int nAmpulheta = scanner.nextInt();
        scanner.close();
        
        int nAmpulheta = 10;
            
         limparConsole();
         ampulheta(nAmpulheta);
          tempo();
       
        

           int carro1 =(nAmpulheta/2)-3;
           int addEspaco1=(carro1+1);
           int i= 0;
              while(i<=(nAmpulheta/2)-3){
                 i++;
                 limparConsole();
                 linhas2(carro1, addEspaco1, nAmpulheta);
                 tempo();
                 carro1--;
                
             }
        }

       
    


    public static void linhas2( int carro1, int addEspaco, int nAmpulheta){
        ArrayList<String>linhas = new ArrayList<>();
        ArrayList<String>linhasNovas = new ArrayList<>();
        ArrayList<String>linhasNovas1 = new ArrayList<>();

        int tamanho = nAmpulheta;
        int tamanhoArrayOriginal=tamanho;
        int nada=2;
        int carro=carro1;
        int espacoVazio=addEspaco;
        double pararImprimirVazio = tamanho;
        boolean impar = false;

        if(pararImprimirVazio %2==1){
           pararImprimirVazio = (pararImprimirVazio/2);
       
           pararImprimirVazio -= 0.5;
           impar = true;
        }
        if(!impar){
          
            pararImprimirVazio = (pararImprimirVazio/2);
            pararImprimirVazio -=1;

        }

        for(int ii=0;ii<carro;ii++){
            if(carro==0){break;}
            //System.out.println(carro+" "+ ii);
            if(carro>ii){
                espacoVazio--;
            }
        }
     

        for(int e =0; e<tamanhoArrayOriginal;e++){
            linhasNovas.add(e,"*");   
        }

        for(int i =0; i<tamanho;i++){
            linhas.add("*");
        }
    
        int altera = 1;
        
        for(int i=0; i<tamanho; i++){
            
            if(i==0){
                
                linhas.set(0,"*");
                linhas.set(linhas.size()-1,"*");
               //System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                continue;
                
            }
            if(i==altera){
             
                linhas.set(i-1," ");
                linhas.set(linhas.size()-i,"");
                //System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
               
                
            }
            if(i==(pararImprimirVazio)){
                break;
            }
            altera++;
        }
        
        
        int indice=0;
        tamanho =(tamanho /2) - 2 ;
        
        for(int i = 0; i<=tamanho;i++){
            
            indice++;

            linhas.set((tamanho+1)-indice,"*");
            linhas.set((tamanho+2)+indice,"*");
                
                   
            linhas.set((tamanho+2)-indice," ");
            linhas.set((tamanho+1)+indice," ");

            if(i==tamanho){
                for(int a =0; a<tamanhoArrayOriginal;a++){
                    linhas.set(a,"*");
                }
            
                //System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
             break;
            }  
                
            //System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
        }  
        
        //System.out.println("\n-------------------\n");


        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

        tamanho = tamanhoArrayOriginal;

        for(int i =0; i<tamanho;i++){
            linhas.set(i,"*");
        }
    
        altera = 1;
        
        for(int i=0; i<tamanho; i++){
            
            if(i==0){
                
                linhas.set(0,"*");
                linhas.set(linhas.size()-1,"*");
                System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                continue;
                
            }
            if(i==altera){
                
                linhas.set(i-1," ");
                linhas.set(linhas.size()-i,"");
                linhasNovas.set(i-1," ");
                linhasNovas.set(linhasNovas.size()-i,"");
                if(i==1){
                    for(int r=(i+1);r<=pararImprimirVazio;r++){
                       
                        linhasNovas.set(r," ");
                        linhasNovas.set(linhasNovas.size()-(r+1)," ");
                    }
                   // System.out.println("r");
                    System.out.println(linhasNovas.toString().replaceAll("[\\[\\]\\,]", ""));
                    altera++;
                    
                    continue;
                }
                //System.out.println(espacoVazio);
                if(nada>espacoVazio){
                 
                    if(nada>(tamanho/2)-2){
                        
                        
                        System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                        break;
                    }
                    System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                    altera++;
                    nada++;
                    
                    continue;
                }
                
                if(i==nada){
                    // System.out.println(nada);
                    linhasNovas.set(nada,"*");
                    linhasNovas.set(linhasNovas.size()-(nada+1),"*");
                    
                    System.out.println(linhasNovas.toString().replaceAll("[\\[\\]\\,]", ""));
                    
                    linhasNovas.set(nada," ");
                    linhasNovas.set(linhasNovas.size()-(nada+1)," ");
                    
                    nada++;
                    altera++;
                    
                    continue;
                }
              
            }
            if(i==pararImprimirVazio){
                break;
            }
            altera++;
          
        }
        indice=0;
       
        for(int e =0; e<tamanhoArrayOriginal;e++){
            linhasNovas1.add(e,"*");   
        }
        
        
        
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        tamanho =(tamanhoArrayOriginal /2) - 2 ;
      
         //for(int ampulheta=0;ampulheta<3;ampulheta++){
           
            for(int e =0; e<tamanhoArrayOriginal;e++){
                linhasNovas1.set(e,"*");   
            }
        
            indice=0;
            int aa=2; //4
            int alteraCondicao=aa;
            int alteraIndice=((nAmpulheta-2)/2)-2;
            int perdeEspaco=0;
           // System.out.println(tamanho);
            for( perdeEspaco = 0; perdeEspaco<=tamanho;perdeEspaco++){
                
                indice++; 
                
                System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                
                linhas.set((tamanho+1)-indice,"*");
                linhas.set((tamanho+2)+indice,"*");
                
                linhas.set((tamanho+2)-indice," ");
                linhas.set((tamanho+1)+indice," ");
                
                if(perdeEspaco==carro){break;}
            }
            
            for(int i=1; i<(tamanho+2);i++){
                
                
                if(i==1){
                    while(alteraIndice>=0){
                        linhasNovas1.set(alteraIndice," ");
                        linhasNovas1.set(linhasNovas1.size()-(alteraIndice+1)," ");
                        alteraIndice--;
                        
                    }
                        
                    if(carro==0){
                        System.out.println(linhasNovas1.toString().replaceAll("[\\[\\]\\,]", ""));
                    }

                    alteraIndice=((nAmpulheta-2)/2)-2;
                    //System.out.println(alteraIndice);
                    if(carro==perdeEspaco){                
                        continue;
                    }
                    
                    //System.out.println("sair");
                    System.out.println(linhasNovas1.toString().replaceAll("[\\[\\]\\,]", ""));
                }
                
                if(i==alteraCondicao){
                    linhasNovas1.set(alteraIndice,"*");
                    linhasNovas1.set(linhasNovas1.size()-(alteraIndice+1),"*");
                    alteraCondicao++;
                    alteraIndice--;
                    
                    if(aa<carro){
                        if(i==aa){
                            aa++;
                            continue;
                        }
                    }
                    if(i==carro){continue;}
                    
                    //System.out.println(i);    
                    System.out.println(linhasNovas1.toString().replaceAll("[\\[\\]\\,]", ""));  
                }
                 
                //tempo();
                //System.out.println(carro);
            }
        //}
    }

    public static void ampulheta(int numeroAmpulheta){
        ArrayList<String>linhas = new ArrayList<>();
        ArrayList<String>linhasNovas = new ArrayList<>();
        
        int tamanho = numeroAmpulheta;
        int tamanhoArrayOriginal=tamanho;
        double pararImprimirVazio = tamanho;
        boolean impar = false;

        if(pararImprimirVazio %2==1){
           pararImprimirVazio = (pararImprimirVazio/2);
       
           pararImprimirVazio -= 0.5;
           impar = true;
        }
        if(!impar){
          
            pararImprimirVazio = (pararImprimirVazio/2);
            pararImprimirVazio -=1;

        }

        for(int e =0; e<tamanhoArrayOriginal;e++){
            linhasNovas.add(e,"*");   
        }

        for(int i =0; i<tamanho;i++){
            linhas.add("*");
        }
    
        int altera = 1;
   
        for(int i=0; i<tamanho; i++){
            if(i==0){
                
                //linhas.set(0,"*");
                //linhas.set(linhas.size()-1,"*");
                System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
                
                continue;
                
            }
            if(i==altera){
                linhas.set(i-1," ");
                linhas.set(linhas.size()-i,"");
                System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
            }
            if(i==(pararImprimirVazio)){
                break;
            }
            altera++;
        }
       
        //altera=tamanhoArrayOriginal+1; //21
        int indice=0;
        tamanho =(tamanho /2) - 2 ;
        
            System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
            for(int i = 0; i<=tamanho;i++){
            
            indice++;
            
            linhas.set((tamanho+1)-indice,"*");
            linhas.set((tamanho+2)+indice,"*");
                
            
            linhas.set((tamanho+2)-indice," ");
            linhas.set((tamanho+1)+indice," ");
            if(i==tamanho){
                for(int a =0; a<tamanhoArrayOriginal;a++){
                    linhas.set(a,"*");
                }
            
                System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
             break;
            }  
            System.out.println(linhas.toString().replaceAll("[\\[\\]\\,]", ""));
         } 
    }

    public static void limparConsole() {
        
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void tempo(){
        CountDownLatch latch = new CountDownLatch(1);

        MeuTimer meuTimer = new MeuTimer(latch);
        meuTimer.iniciarTemporizador();

        try {
            // Aguarda até que o temporizador termine
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Aqui seu programa principal continua após o temporizador terminar
        //vSystem.out.println("Temporizador encerrado.");
    }
}
