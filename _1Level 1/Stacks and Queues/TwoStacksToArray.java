public class TwoStacksToArray{

    public static class TwoStacks{
        int[] data;
        int tos1;
        int tos2;

        TwoStacks(int cap){
            data=new int[cap];
            tos1=-1;
            tos2=cap;
        }

        int size1(){
            return tos1+1;
        }

        int size2(){
            return data.length-tos2;
        }

        void push1(int val){
            if(tos1+1==tos2){
                System.out.println("stack overflow");
            }
            tos1++;
            data[tos1]=val;
        }

        void push2(int val){
            if(tos1+1==tos2){
                System.out.println("stack overflow");
            }
            tos2--;
            data[tos2]=val;
        }

        int pop1(){
            if(tos1==-1){
                System.out.println("stack undeflow");
                return -1;
            }
            int val=data[tos1];
            data[tos1]=0;
            tos1--;
            return val;
        }

        int pop2(){
            if(tos2==data.length){
                System.out.println("stack undeflow");
                return -1;
            }
            int val=data[tos2];
            data[tos2]=0;
            tos2++;
            return val;
        }

        int top1(){
            if(tos1==-1){
                System.out.println("stack undeflow");
                return -1;
            }
            return data[tos1];
        }

        int top2(){
            if(tos2==data.length){
                System.out.println("stack undeflow");
                return -1;
            }
            return data[tos2];
        }
    }

    public static void main(String[] args) {
        
    }
}