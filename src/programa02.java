import java.util.Scanner;

public class programa02 {
    public static void main(String[] args) {
        // Declaración de variables
        String empleado;
        double ht, th, sb, d, sn;

        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado = lectura.nextLine(); // Usar nextLine() para capturar nombres completos

        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();

        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();

        // Proceso de datos
        sb = ht * th; // Inicializando correctamente sb
        d = sb * 0.13;
        sn = sb - d;

        // Salida de datos
        System.out.println("Sueldo bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo Neto: " + sn);

        // Cerrar Scanner
        lectura.close();
    }
}

//´probando la actualizacion al final del codigo
