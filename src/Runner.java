public class Runner
{
    public static int[] array = new int[100];

    public static void main(String[] args)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        double startTime = System.currentTimeMillis();
        QuickSort.quickSort(array, 0, array.length - 1);
        double endTime = System.currentTimeMillis();
        System.out.println("Quick Sort took " + (endTime - startTime) + " milliseconds.");

        for (int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
