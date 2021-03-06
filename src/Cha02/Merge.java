package Cha02;

/**
 * 自顶向下的归并排序
 */
public class Merge {
    private static Comparable[] aux;
    private static boolean bigger(Comparable v,Comparable w){
        return v.compareTo(w) > 0;
    }
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo,int hi){
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        int i = lo,j = mid + 1;
        for (int k = lo;k <= hi;k++){
            aux[k] = a[k];
        }

        for (int k = lo;k <= hi;k++)
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (bigger(aux[j],aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
    }
    public static void main(String[] args) {
        String[] a = {"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};

        for (int i = 0; i < 16; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        sort(a);
        for (int i = 0; i < 16; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
