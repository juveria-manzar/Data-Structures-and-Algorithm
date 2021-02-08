public class FractionalKnapsack {
    private static double getMaxValue(int[] wt, int[] val, int capacity){
        ItemValue[] ival=new ItemValue[wt.length];

        for(int i=0;i<wt.length;i++){
            ival[i]
        }
        return 0.0;
    }
    public static void main(String[] args)
    {
        int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
 
        double maxValue = getMaxValue(wt, val, capacity);
 
        // Function call
        System.out.println("Maximum value we can obtain = "+ maxValue);
    }
}
