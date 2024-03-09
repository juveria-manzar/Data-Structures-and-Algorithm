import java.util.*;

class Main {
	
	public static int solution(int[] arr) {
		int length=0;
		
        //prefixsum vs its first occurenct index 
		HashMap<Integer, Integer> map=new HashMap<>();
		
		map.put(0,-1);
		
		int ps=0;

		for(int i=0;i<arr.length;i++){
		    ps+=arr[i];
		    if(map.containsKey(ps)){
		        int occIdx = map.get(ps);
		        
		        length=Math.max(length,(i-occIdx));
		        
		    }else{
		        map.put(ps,i);
		    }
		}
		return length;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
