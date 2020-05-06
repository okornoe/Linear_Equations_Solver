package solver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Matrix {
    File file = new File("../Linear Equations Solver/Linear Equations Solver/task/src/solver/in.txt");

    //reads the content of a file and converts it into a matrix.
    public String[][] convertFileToMatrix() throws IOException {
        int size;
        String[][] matrix;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            size = Integer.parseInt(br.readLine());
            matrix = new String[size][];
            for (int z = 0; z < size; z++) {
                String[] line = br.readLine().split("\\s");
                matrix[z] = line;
            }
        }
        return matrix;

    }
}
