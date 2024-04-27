import javax.swing.JOptionPane;




public class Main {
    int num1;
      static  int num2;
        int resultadoEnt;
        double num4;
        double num5;
        double resultDoub;
      static  String temporal;
        static int opcion;

    public static void main(String[] args) {
        

       menu ( );

       
       


       
    

    



    }

    public static void menu (){

        temporal = JOptionPane.showInputDialog(null,"Bienvenido a calculadora, por favor seleccione una operacion a realizar \n 1:Suma  \n2:Resta  \n3:Multiplicación \n4:Division");
    
        opcion = Integer.parseInt(temporal);
        while (true){

          

            switch(opcion){
     
             case 1:
             JOptionPane.showMessageDialog(null,"caso 1" );
             break;
     
             case 2:
             JOptionPane.showMessageDialog(null,"caso 2" );
             break;
     
             case 3:
             JOptionPane.showMessageDialog(null,"caso 3" );
             break;
     
             case 4:
             JOptionPane.showMessageDialog(null,"caso 4" );
             break;
     
             case 5:
             JOptionPane.showMessageDialog(null,"Programa finalizado" );
             System. exit(0);
             break;
     
             default:
             JOptionPane.showMessageDialog(null,"Por favor digite una opción valida" );
             break;
     
     
            }
         }

    }
}