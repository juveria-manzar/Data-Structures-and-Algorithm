import java.util.Stack;

public class StacktoQueueAddEff {
    public static class Adapter{
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        Adapter(){
            mainS=new Stack<>();
            helperS=new Stack<>();
        }

        void add(int val){
            mainS.push(val);
        }

        int remove(){
            if(mainS.size()==0){
                return -1;
            }
            else{
                while(mainS.size()>1){
                    helperS.push(mainS.pop());
                }

                int val=mainS.pop();

                while(helperS.size()>0){
                    mainS.push(helperS.pop());
                }

                return val;
            }
        }

        int peek(){
            if(mainS.size()==0){
                return -1;
            }
            else{
                while(mainS.size()>1){
                    helperS.push(mainS.pop());
                }

                int val=mainS.pop();

                helperS.push(val);

                while(helperS.size()>0){
                    mainS.push(helperS.pop());
                }

                return val;
            }
        }

        int size(){
            return mainS.size();
        }
    }
}
