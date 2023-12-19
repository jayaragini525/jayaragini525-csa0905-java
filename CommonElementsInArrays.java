import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }

    private static int[] findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElementsList = new ArrayList<>();

        // Convert the arrays to sets for faster lookup
        List<Integer> array1List = new ArrayList<>();
        for (int num : array1) {
            array1List.add(num);
        }

        // Iterate through the second array and add common elements to the list
        for (int num : array2) {
            if (array1List.contains(num)) {
                commonElementsList.add(num);
            }
        }

        // Convert the list to an array
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElementsArray[i] = commonElementsList.get(i);
        }

        return commonElementsArray;
    }
}
