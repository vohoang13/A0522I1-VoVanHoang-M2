package ss3_array_method.Thuc_hanh;

public class TimMinVoiPhuongThuc {
    public static void main(String[] args) {
        int[] arr = {10,2,8,11,1,2,8,9};
        int min = minValue(arr);
        System.out.printf("Giá trị nhỏ nhất: " + min);
    }
    public static int minValue(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
