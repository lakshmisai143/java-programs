 import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Search for an element");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int insertElement = scanner.nextInt();
                    System.out.print("Enter the position to insert (0-" + (size - 1) + "): ");
                    int insertPosition = scanner.nextInt();

                    if (insertPosition >= 0 && insertPosition < size) {
                        for (int i = size - 1; i > insertPosition; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[insertPosition] = insertElement;
                        size++;
                        System.out.println("Element inserted successfully.");
                    } else {
                        System.out.println("Invalid position. Element not inserted.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the element to delete: ");
                    int deleteElement = scanner.nextInt();

                    int deleteIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == deleteElement) {
                            deleteIndex = i;
                            break;
                        }
                    }

                    if (deleteIndex != -1) {
                        for (int i = deleteIndex; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the element to search: ");
                    int searchElement = scanner.nextInt();

                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == searchElement) {
                            System.out.println("Element found at position " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
    }
}
}