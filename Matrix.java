package solver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Matrix {
    File file = new File("../Linear Equations Solver/Linear Equations Solver/task/src/solver/in.txt");

    //reads the content of a file and converts it into a matrix.
    public int[][] convertFileToMatrix() throws IOException {
        int[][] matrix;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int size = Integer.parseInt(br.readLine());
            matrix = new int[size][];
            for (int z = 0; z < size; z++) {
                String[] line = br.readLine().split("\\s");
                int[] arr = new int[line.length];
                for (int i = 0; i < line.length; i++) {
                    arr[i] = Integer.parseInt(line[i]);
                }
                matrix[z] = arr;
            }
        }
        return matrix;
    }
}
