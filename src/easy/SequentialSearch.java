package easy;

/***
 The sequential search algorithm is a method for finding a target value within a list or a vector. It consists of comparing the target value with each element of the list or vector, following the order in which they are stored, until it is found or until the end is reached. If the target value is found, its position is returned or it is indicated as found. If the end is reached without finding it, a special value is returned or it is indicated as not found.

 The sequential search algorithm is used when the list or vector is not sorted or cannot be sorted beforehand. It is a very simple algorithm, but also very inefficient, since in the worst case, the entire list or vector must be traversed to determine whether the target value is present or not.
***/

public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    void main() {
        int [] arr = {3, 1, 4, 2};
        int searchElement = 4;

        int result = sequentialSearch(arr, searchElement);
        IO.println("El elemento " + searchElement + " se encuentra en el indice " + result);
    }
}
