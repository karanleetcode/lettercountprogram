
////////////////////////////////////////////////////////////////
public class TreeApp {
    public static void main(String[] args) {
        int cost[]={10,1,1,60,20,4};
        int sum=0;int i=0;
        if(cost[1]<cost[0])
            {
                sum = sum + cost[1];
                i=1;
                do {
                    if(cost[i+1]>cost[i+2])
                    {
                        i=i+2;
                        sum = sum + cost[i];
                    }
                    else{
                        i=i+1;
                        sum = sum + cost[i];
                    }
                    if(i == cost.length-1 || i == cost.length-2) break;
                }while (true);
            }
        else
            {

            }
        System.out.println("the sum is :"+sum);
    } // end main()
}
