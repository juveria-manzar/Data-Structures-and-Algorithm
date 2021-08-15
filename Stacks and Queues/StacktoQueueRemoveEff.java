public class StacktoQueueRemoveEff {
    public static class Adapter{
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        Adapter(){
            mainS=new Stack<>();
            helperS=new Stack<>();
        }
 
        int size(){
            return mainS.size();
        }

        void add(int val){
            if(mainS.size()==0){
                mainS.push(val);
            }
            else{
                while(mainS.size()>0){
                    helperS.push(mainS.pop());
                }

                mainS.push(val);
                while(helperS.size()>0){
                    mainS.push(helperS.pop());
                }
            }
        }

        int peek(){
            return mainS.top();
        }

        int remove(){
            int val=mainS.pop();
            return val;
        }

    }


}
