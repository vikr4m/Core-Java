public class trial2 {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    
    public static void qsort(int arr[], int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);

            qsort(arr, low, pivot-1);
            qsort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 7, 1, 4, 9, 8, 2, 0};
        int n = arr.length;
        qsort(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
