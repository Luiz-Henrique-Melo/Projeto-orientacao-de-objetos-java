import com.formasgeometricas.Circulo;
import com.formasgeometricas.FormaGeometrica;
import com.formasgeometricas.Quadrado;
import com.formasgeometricas.Retangulo;
import com.formasgeometricas.Triangulo;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo(3),
            new Retangulo(4, 2),
            new Quadrado(5),
            new Triangulo(6, 4, 5, 5, 6)
        };

        for (FormaGeometrica forma : formas) {
            System.out.printf(
                "%s - area: %.2f, perimetro: %.2f%n",
                forma.getClass().getSimpleName(),
                forma.calcularArea(),
                forma.calcularPerimetro()
            );
        }
    }
}
