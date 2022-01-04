
public class QuickSort {

    public static void shuffle(int arr[], int e) {

        for (int j = e; j > 0; j--) {
            // random index
            int i = ((int) Math.random()) % (j + 1);
            // swapping
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
    }

    // int partition(int* a,int s,int e){
    // int i = s-1;
    // int j = s;
    // int p = a[e]; //default pivot

    // for(;j<e;j++){
    // if(a[j]<p){
    // ++i;
    // swap(a[i],a[j]);
    // }
    // }
    // swap(a[i+1],a[e]);
    // return i+1;
    // }

    // void quicksort(int* a,int s, int e){
    // if(s>=e) return;
    // int pivot_idx = partition(a,s,e);
    // quicksort(a,s,pivot_idx-1);
    // quicksort(a,pivot_idx+1,e);

    // }

    public static void main(String args[]) {
        int a[] = {0,1,1,2,4,5,6,8,10,11,15};
        shuffle(a, a.length - 1);
        // quicksort(a,0,n);

        // display
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
