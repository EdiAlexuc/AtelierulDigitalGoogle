package Collections.CodeChallenge1;

public class Leaders {

    void printLeaders(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            if (j == size) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Leaders lead = new Leaders();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int size = arr.length;
        lead.printLeaders(arr, size);
    }
}
