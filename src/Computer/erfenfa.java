package Computer;

public class erfenfa {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 7, 8, 9};
        int low = 0;
        int high = a.length - 1;
        int find = 8;
        boolean foundflag = false;
        while (low < high) {
            int mid = (low + high) / 2;
            System.out.println("low:" + low + ",mid:" + mid + ",high:" + high);
            if (find > a[mid]) {
                low = mid + 1;
            } else if (find < a[mid]) {
                high = mid - 1;
            } else {
                System.out.println("found:" + mid);
                foundflag = true;
                break;
            }
            if (!foundflag) {
                System.out.println("no found!");
            }
        }
    }
}
