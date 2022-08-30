class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(initialEnergy<energy[i]+1){
                int temp = energy[i]+1-initialEnergy;
                ans+=temp;
                initialEnergy+=temp;
            }
            if(initialExperience<(experience[i]+1)){
                int required = experience[i] + 1 - initialExperience;
                ans+=required;
                initialExperience+=required;
            }
            initialExperience += experience[i];
            initialEnergy -= energy[i];
        }
        return ans;
    }
}