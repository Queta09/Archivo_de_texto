import java.io.FileWriter;
import java.io.IOException;

public class EscribirTexto {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("archivo.txt")) {
            writer.write("Hola, mundo!\n");
            writer.write("Este es un archivo de texto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

