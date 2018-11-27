public class QuickSort
{
    public static void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = right;
        int i = left - 1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int a = i;
                i = j;
                j = a;
            }
        }
        arr[i + 1] = arr[right];
        return i + 1;
    }
}
