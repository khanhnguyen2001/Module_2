package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class EXC_1_Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);

        do {
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void printRectangle() {
        int width = 7;
        int height = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle() {
        int size = 5;

        System.out.println("Bottom-left square triangle:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Top-left square triangle:");
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Bottom-right square triangle:");
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Top-right square triangle:");
        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle() {
        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }



//        while (choice != 0) {
//            System.out.println("Menu");
//            System.out.println("1. Print the rectangle");
//            System.out.println("2. Print the square triangle");
//            System.out.println("3. Print isosceles triangle");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Print the rectangle");
//                    System.out.println("* * * * * * *");
//                    System.out.println("* * * * * * *");
//                    System.out.println("* * * * * * *");
//
//                    break;
//                case 2:
//                    System.out.println("Print the square triangle\n");
//                    System.out.println("Right triangle with top left right angle: \n");
//                    System.out.println("* * * * *");
//                    System.out.println("* * * *");
//                    System.out.println("* * *");
//                    System.out.println("* *");
//                    System.out.println("*\n");
//
//                    System.out.println("Right triangle with right top right corner: \n");
//                    System.out.println("* * * * *");
//                    System.out.println("  * * * *");
//                    System.out.println("    * * *");
//                    System.out.println("      * *");
//                    System.out.println("        *\n");
//
//
//                    System.out.println("Right triangle with bottom left right corner: \n");
//                    System.out.println("*");
//                    System.out.println("* *");
//                    System.out.println("* * *");
//                    System.out.println("* * * *");
//                    System.out.println("* * * * *\n");
//
//                    System.out.println("Right triangle with bottom right right corner: \n");
//                    System.out.println("        *");
//                    System.out.println("      * *");
//                    System.out.println("    * * *");
//                    System.out.println("  * * * *");
//                    System.out.println("* * * * *\n");
//                    break;
//                case 3:
//                    System.out.println("Print isosceles triangle");
//                    System.out.println("    *    ");
//                    System.out.println("   * *   ");
//                    System.out.println("  * * *  ");
//                    System.out.println(" * * * * ");
//                    System.out.println("* * * * *");
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("No choice!");
//            }
//        }
    }
}
