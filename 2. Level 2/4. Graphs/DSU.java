class DSU {

    static int[] par;

    public static void main(String[] args) {

        int[][] relations = { { 1, 2 }, { 4, 5 }, { 2, 6 }, { 3, 7 }, { 9, 10 }, { 6, 8 }, { 3, 5 }, { 10, 11 },
                { 8, 5 } };

        int n = 11;

        par = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            par[i] = i;
        }

        for (int i = 0; i < relations.length; i++) {
            int x = relations[i][0];
            int y = relations[i][1];

            union(x, y);
        }

        int gc = 0;
        for (int i = 1; i <= n; i++) {
            if (par[i] == i) {
                gc++;
            }
        }

        System.out.println(gc);
    }

    public static void union(int x, int y) {
        int lx = find(x);
        int ly = find(y);

        par[lx] = ly;
    }

    public static int find(int ele) {
        if (par[ele] == ele) {
            return ele;
        } else {

            return find(par[ele]);
        }
    }
}