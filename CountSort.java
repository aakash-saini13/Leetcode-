class countSort {
    public static void main(String[] args) {
        int []arr = {2,1,2,4,5,1};
        System.out.println("the default array is ");
        printArr(arr);
        countSort(arr);
        printArr(arr);
    }
    public static void countSort(int []arr){
        int countArr []= new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++; 
        }
        int tempArr[] = new int[countArr.length];
        tempArr[0] = countArr[0];


        for(int i=1;i<countArr.length;i++){
            tempArr[i] = countArr[i]+tempArr[i-1];
        }
        int output[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[tempArr[arr[i]]-1] = arr[i];
             tempArr[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }
    public static void printArr(int []arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
