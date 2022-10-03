public class MoveAllXToEnd {
    public static void main(String[] args) {
        int[] arr = {2,1,2,2,2,3,4,2};
//        int[] ans = moveX(arr,2);
        int[] ans2 = moveAllX(arr,2);
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i]+" ");
        }

    }
    private static int[] moveAllX(int[] a, int el){
        int i = 0, j = a.length-1;
        while (i<j){
            while (i<j && a[j]==el) j--;
            if(a[i]==el){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }else{
                i++;
            }
        }
        return a;
    }

    private static int[] moveX(int[] a, int el){
        int i = 0, j = a.length-1;
        while(i < j){
            if(a[i]==el){
                if(a[j]!=el){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                }
                j--;
            }else if(a[j]!=el){
                if(a[i]==el){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j--;
                }
                i++;
            }else{
                j--;
            }
        }
        return a;
    }
}