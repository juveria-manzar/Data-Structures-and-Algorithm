import java.util.Queue;

public class QueuetoStackPushEff{

    public static class Adapter{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;


        Adapter(){
            mainQ=new ArrayDeque<>();
            helperQ=new ArrayDeque<>();
        }

        int size(){
            return mainQ.size();
        }

        void push(int val){
            mainQ.add(val);
        }

        int top(){
            if(mainQ.size()==0){
                return -1;
            }
            else{
                while(mainQ.size()>1){
                    helperQ.add(mainQ.remove());
                }
                int val=mainQ.remove();
                helperQ.push(val);

                while(helperQ.size()>0){
                    mainQ.push(helperQ.remove());
                }

                return val;
            }
        }

        int pop(){
            if(mainQ.size()==0){
                return -1;
            }
            else{
                while(mainQ.size()>1){
                    helperQ.add(mainQ.remove());
                }
                int val=mainQ.remove();
                
                while(helperQ.size()>0){
                    mainQ.push(helperQ.remove());
                }
                
                return val;
            }
        }
    }
}