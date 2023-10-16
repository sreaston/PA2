public class BinarySearchApplications {

    public static int predecessor(int array[], int arrayLen, int key) { //complete this method
        int left = 0;
        int right = arrayLen - 1;
        int predIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                predIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return predIndex;
    }

    public static int findPeak(int twoToneArray[], int arrayLen) { //complete this method
        int left = 0;
        int right = arrayLen - 1;

        while (left <= right) {
            if (left == right) {
                return left;
            }
            int mid = left + (right - left) / 2;
            if (twoToneArray[mid] < twoToneArray[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
