public class QuickSort {

public void quickSort(double[] A, int start, int end) {
        if (start < end) {
            int q = partition(A, start, end);
            quickSort(A, start,  q- 1);
            quickSort(A, q + 1, end);
        }
    }

    public int partition(double[] A, int start, int end) {
        double x = A[end]; 
        int i = start - 1;  
        for (int j = start; j < end; j++) {
            if (A[j] <= x) {
                i++;
                double tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        double tmp = A[i + 1];
        A[i + 1] = A[end];
        A[end] = tmp;

        return i + 1;
    }



}

