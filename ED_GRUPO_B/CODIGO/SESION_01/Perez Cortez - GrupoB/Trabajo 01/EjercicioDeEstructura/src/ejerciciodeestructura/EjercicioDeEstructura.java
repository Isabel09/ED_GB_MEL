
package ejerciciodeestructura;
import javax.swing.JOptionPane;
public class EjercicioDeEstructura {

      public static void main(String[] args) {
      
        int Numero = 0;
        boolean salir = false;
        boolean reintento = true;
        do {
            String numero_estudiante = JOptionPane.showInputDialog("INGRESE EL NUMERO DE ESTUDIANTES:");
            if (numero_estudiante != null) {
                if (esEntero(numero_estudiante)) {
                    Numero = Integer.parseInt(numero_estudiante);
                    if (Numero > 0) {
                        reintento = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO MAYOR A 0: ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ENTERO: ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "SALIR");
                salir = true;
            }
        } while (reintento && !salir);

        if (!salir) {
            String[] nombres_estudiantes = new String[Numero];
            int[] edad_estudiantes = new int[Numero];
            int edadMayor = 0;
            int edadMenor = 99999;
            int nMultiplos = 0;
            int[] multiplos7 = new int[Numero];
            reintento = true;
            salir = false;
            int suma_edades = 0;
            int j = 0;
            do {
                do {
                    String nombre_estudiante = JOptionPane.showInputDialog("INGRESE EL NUMERO DEL ESTUDIANTE: " + (j + 1));
                    if (nombre_estudiante != null) {
                        if (!esEntero(nombre_estudiante)) {
                            if (!nombre_estudiante.equals("")) {
                                nombres_estudiantes[j] = nombre_estudiante;
                                reintento = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "NOMBRE VACIO");
                                reintento = true;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE: ");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "SALIENDO..");
                        salir = true;
                    }
                } while (reintento && !salir);

                if (!salir) {
                    reintento = true;
                    salir = false;
                    do {
                        String edad_estudiante = JOptionPane.showInputDialog("INGRESE LA EDAD DEL ESTUDIANTE" + (j + 1));
                        if (edad_estudiante != null) {
                            if (esEntero(edad_estudiante)) {
                                if (Integer.parseInt(edad_estudiante) > 0) {
                                    edad_estudiantes[j] = Integer.parseInt(edad_estudiante);
                                    suma_edades += edad_estudiantes[j];
                                    if (edad_estudiantes[j] > edadMayor) {
                                        edadMayor = edad_estudiantes[j];
                                    }
                                    if (edad_estudiantes[j] < edadMenor) {
                                        edadMenor = edad_estudiantes[j];
                                    }
                                    if (EsMultiplodeSiete(edad_estudiantes[j])) {
                                        multiplos7[nMultiplos] = edad_estudiantes[j];
                                    }
                                    j++;
                                    reintento = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO MAYOR QUE 0:");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ENTERO: ");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "SALIENDO");
                            salir = true;
                        }
                    } while (reintento && !salir);
                }
            } while (j < Numero && !salir);

            if (!salir) {
                String mensaje = "";
                double promedio = (double) suma_edades / Numero;
                // Impresion de Nombres
                for (int i = 0; i < nombres_estudiantes.length; i++) {
                    mensaje += (i + 1) + " " + nombres_estudiantes[i] + " - " + edad_estudiantes[i] + " años\n";
                }
                //  Impresion de edades mayor y menor
                mensaje += " La Edad Mayor es :  " + edadMayor + "\n";
                mensaje += " La Edad Menor es :  " + edadMenor + "\n";
                mensaje += " El Promedio es :  " + promedio + "\n";
                mensaje += " La Suma es :  " + suma_edades + "\n";
              

                // Multiplos de 7
                for (int i = 0; i < multiplos7.length; i++) {
                    if (multiplos7[i] > 0) {
                        mensaje += (i + 1) + ". " + multiplos7[i] + "\n";
                    }
                }

                JOptionPane.showMessageDialog(null, mensaje);
            }

        }

    }

    public static boolean EsMultiplodeSiete(int pnNumero) {
        boolean bresultado = false;
        if (pnNumero == 0) {
            bresultado = false;
        }
        bresultado = pnNumero % 7 == 0;
        return bresultado;
    }

    public static boolean esEntero(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    
  
    

