public class MetodoEuler {

    public static double evaluarFuncion(double x, double y) {
        // Implementación de la función f(x, y) = x - y
        return x - y;
    }

    public static void main(String[] neu) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1; // Puedes variar este valor a 0.05 o 0.01 en tu reporte
        double xFinal = 0.3;

        // Criterio de paro (numero total de pasos N)
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n\t x_n \t y_n (Euler)");
        System.out.println("----------------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\n", 0, x, y);

        for (int i = 0; i < nPasos; i++) {
            // Cálculo de la pendiente y actualización de x y y usando el método de Euler
            double pendiente = evaluarFuncion(x, y);
            y = y + h * pendiente;
            x = x + h;
            
            System.out.printf("%d\t %.4f\t %.4f\n", (i + 1), x, y);
        }
    }
}