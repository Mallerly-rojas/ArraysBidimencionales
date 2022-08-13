import javax.swing.*;

public class PosicionNombres {
    public static void main(String[] args) {
        String[][] nombres = {
                {"laura", "diego", "paola", "frank"},
                {"leilany", "santiago", "jose", "kate"},
                {"issabela", "caren", "ronal", "mallerly"}};

        int fila = (int) Math.floor(Math.random() * (2 -0 ));
        int columna = (int) Math.floor(Math.random() * (3-0 ));

        JOptionPane.showMessageDialog(null, nombres[fila][columna]);


        }

    }










