import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int newFigure;
        System.out.println("Введите ячейку: ");
        newFigure = scanner.nextInt();

        int cell = newFigure - 1;
        int Cell = newFigure + 1;
        int newCell = newFigure - 8;
        int newCellFigure = newFigure + 8;


        if (newFigure % 8 != 0 && newFigure > 8 && newFigure != 9 && newFigure != 17 && newFigure != 25 && newFigure != 33 && newFigure != 41 && newFigure != 49 && newFigure < 57) {
            System.out.println("Соседними ячейками будут являться: " + " " + cell + " " + Cell + " " + newCell + " " + newCellFigure);
        } else if (newFigure % 8 == 0 && newFigure != 8 && newFigure != 64) {
            System.out.println("Соседними ячейками будут являться: " + " " + cell + " " + newCell + " " + newCellFigure);
        } else if (newFigure == 8) {
            System.out.println("Соседними ячейками будут являться: " + " " + newCellFigure + " " + cell);
        } else if (newFigure == 64) {
            System.out.println("Соседними ячейками будут являться: " + " " + newCell + " " + cell);
        } else if (newFigure == 1) {
            System.out.println("Соседними ячейками будут являться: " + " " + newCellFigure + " " + Cell);
        } else if (newFigure == 57) {
            System.out.println("Соседними ячейками будут являться: " + " " + newFigure + " " + Cell);
        } else if (newFigure == 9 || newFigure == 17 || newFigure == 25 || newFigure == 33 || newFigure == 41 || newFigure == 49) {
            System.out.println("Соседними ячейками будут являться: " + " " + newCell + " " + Cell + " " + newCellFigure);
        } else if (newFigure >= 2 && newFigure < 58) {
            System.out.println("Соседними ячейками будут являться: " + " " + cell + " " + Cell + " " + newCellFigure);
        } else if (newFigure >= 58 && newFigure <= 63) {
            System.out.println("Соседними ячейками будут являться: " + " " + cell + " " + Cell + " " + newCell);
        }
    }
}

