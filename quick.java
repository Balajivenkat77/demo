import java.util.Arrays;
public class Quick
{
 static int partition (int a[], int start, int end)
 {
 int pivot = a[end];
 int i = (start - 1);

 for (int j = start; j <= end - 1; j++)
 {
 if (a[j] < pivot)
 {
 i++;
 int t = a[i];
 a[i] = a[j];
 a[j] = t;
 }
 }
 int t = a[i+1];
 a[i+1] = a[end];
 a[end] = t;
 return (i + 1);
 }

 static void quicksort(int a[], int start, int end)
 {
 if (start < end)
 {
 int p = partition(a, start, end);
 quicksort(a, start, p - 1);
 quicksort(a, p + 1, end);
 }
 }

 public static void main(String[] args) {
 int a[] = { 13, 18, 2, 19, 27, 25 };
 int n = a.length;
 System.out.println("\nBefore sorting array elements are - " +
Arrays.toString(a));

 quicksort(a, 0, n - 1);
 System.out.println("\nAfter sorting array elements are - " +
Arrays.toString(a));

 }
}
