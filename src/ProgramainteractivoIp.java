import javax.swing.*;

public class ProgramainteractivoIp {
    public static void main(String[] args) {




        String[] opciones = {"info de 1 ip", "comparar 2 ip"};
        int seleccionDeOperacion = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion", "Titulo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);



        if (seleccionDeOperacion == 0){

            //Sacar informacion de una IP

            String[] tipoDeEntrada = {"Ip entera", "4 octetos por separado"};
            int entradeDeIpSeleccionada = JOptionPane.showOptionDialog(null,
                    "¿Como desea introducir la IP?", "Titulo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoDeEntrada, tipoDeEntrada[0]);

            if (entradeDeIpSeleccionada == 0){

                String unaipString = JOptionPane.showInputDialog("introduzca la ip (ej:192,168,1,1)");
                DireccionIP dirIP =new DireccionIP (unaipString);

                JOptionPane.showMessageDialog( null,dirIP.infoIP());
            }
            else if (entradeDeIpSeleccionada == 1){

                int unaipint [] = new int [4];
                unaipint [0]= Integer.parseInt(JOptionPane.showInputDialog("introduzca el primer octeto ej(192)"));
                unaipint [1]= Integer.parseInt(JOptionPane.showInputDialog("introduzca el segundo octeto ej(168)"));
                unaipint [2]= Integer.parseInt(JOptionPane.showInputDialog("introduzca el tercer octeto ej(1)"));
                unaipint [3]= Integer.parseInt(JOptionPane.showInputDialog("introduzca el cuarto octeto ej(10)"));

                DireccionIP dirIP =new DireccionIP (unaipint);

                JOptionPane.showMessageDialog( null,dirIP.infoIP());

            }
        }
        else if (seleccionDeOperacion == 1){

        //comparar 2 IP


            String ipStringUno = JOptionPane.showInputDialog("introduzca la primera ip (ej:192,168,1,1)");

            DireccionIP compIP =new DireccionIP (ipStringUno);

            String ipStringDos = JOptionPane.showInputDialog("introduzca la segunda IP (ej:192,168,1,2)");

            compIP.compararIp(ipStringUno,ipStringDos);

            if (compIP.compararIp(ipStringUno,ipStringDos) == true){
                JOptionPane.showMessageDialog(null, "son de la misma red");
            }
            else {
                JOptionPane.showMessageDialog(null, "no son de la misma red");
            }
        }

    }
}
