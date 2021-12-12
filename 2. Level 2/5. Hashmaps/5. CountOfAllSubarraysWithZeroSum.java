import java.util.*;

class Main {

	public static int solution(int[] arr) {

		//prefixSum vs its frequency
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		
		int ans=0;
		int ps=0;
		for(int val:arr){
		    ps+=val;
		    if(map.containsKey(ps)==false){
		        map.put(ps,1);
		    }else{
		        int freq=map.get(ps);
    		    ans+=freq;
    		    map.put(ps,freq+1);
		    }
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));

	}

}
