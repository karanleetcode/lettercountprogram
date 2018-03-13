
////////////////////////////////////////////////////////////////
public class TreeApp {
    public static void main(String[] args) {
        String s1[] = {"5","-2","4","C","D","9","+","+"};
        TreeApp treeApp = new TreeApp();
        int k=0,sum=0;
        int arr[] = new int[30];
        for(int i = 0;i< s1.length;i++)
        {
            if(treeApp.isNumeric(s1[i]))
            {
                arr[k] = Integer.parseInt(s1[i]);
                sum = sum + arr[k];
                k++;
            }
            else
            {
                switch(s1[i])
                {
                    case "C":
                        sum = sum - arr[k-1];
                        k--;
                        break;
                    case "D":
                        sum = sum + (arr[k-1]*2);
                        arr[k] = arr[k-1]*2;
                        k++;
                        break;
                    case "+":
                        arr[k] = arr[k-1] + arr[k-2];
                        sum = sum + arr[k];
                        k++;
                        break;
                }
            }
        }
        System.out.println("The sum is :"+sum);


    } // end main()
    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
