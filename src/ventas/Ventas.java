/*
 * 1.	Elabore un algoritmo que lea los siguientes datos para N vendedores: 
No. De vendedor, Venta, Zona de venta. Imprima la comisión para cada vendedor
de acuerdo con la siguiente tabla:

Zona de Venta	Comisión
Norte           20 %
Sur             18 %
Oriente         17 %
Poniente	21 %
Centro          15 %


 */
package ventas;

import java.util.Scanner;

/**
 *
 * karol martinez cuellar
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        int  N;
        
        System.out.println("DIGITE NUMERO DE VENDEDORES");
        N=leer.nextInt();
        
        int[][] info =new int [N][4];// definir matriz n es el tamaño y 4 variables que se piden
        
        for (int c=0;c<N;c++){
        
            System.out.println("DIGITE SU NUMERO DE VERNDEDOR "+(c+1));
            info[c][0] = leer.nextInt();//quedara guardado el numero dle vendedor 
            System.out.println("DIGITE LAS VENTAS");
            info[c][1]= leer.nextInt();//queda guardado las ventas
            
            System.out.println("ZONA DE VENTA");
            System.out.println(" DIGITE 1 SI LA ZONA DE VENTA ES NORTE");
            System.out.println(" DIGITE 2 SI LA ZONA DE VENTA ES SUR");
            System.out.println(" DIGITE 3 SI LA ZONA DE VENTA ES ORIENTE");
            System.out.println(" DIGITE 4 SI LA ZONA DE VENTA ES PONIENTE");
            System.out.println(" DIGITE 5 SI LA ZONA DE VENTA ES CENTRO");
            info[c][2]=leer.nextInt(); // queda guardado numero para entraer a la zona de venta
            
            switch (info[c][2]){
                case 1: info[c][3]= (((info[c][2])*20)/100)+(info[c][2]);  //en info 3 queda guardada la suma de la comicion con la venta 
                break; 
                case 2: info[c][3]= (((info[c][2])*18)/100)+(info[c][2]);
                break; 
                case 3: info[c][3]= (((info[c][2])*17)/100)+(info[c][2]);
                break; 
                case 4: info[c][3]= (((info[c][2])*21)/100)+(info[c][2]);
                break; 
                case 5: info[c][3]= (((info[c][2])*15)/100)+(info[c][2]);
                break; 
                default: System.out.println("INGRESO UN NUMERO INCORRECTO");
            }
            
        }
        System.out.println("---------------------------");
            System.out.println("REPORTE ");
        for(int j=0;j<N;j++){
           System.out.println("|---------------------------|");
           System.out.println(" N. VENDEDOR :"+info[j][0]);
           System.out.println(" VENTAS  :"+info[j][1]);
           System.out.println(" COMISION :"+info[j][3]);
           if(info[j][2]==1){
               System.out.println("ZONA DE VENTA NORTE");}else{
                if(info[j][2]==2){System.out.println("ZONA DE VENTA SUR");}else{
                    if(info[j][2]==3){System.out.println("ZONA DE VENTA ORIENTE");}else{
                        if(info[j][2]==4){System.out.println("ZONA DE VENTA PONIENTE");}else{
                            if(info[j][2]==5){System.out.println("ZONA DE VENTA CENTRO");}}}}}
        
        }
        
        System.out.println("|---------------------------|");
        
        
    }
    
}
