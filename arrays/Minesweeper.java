public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] grid = new int[m][n];
        for (int i = 0; i < k; i++) {
            int m_random = (int) (Math.random() * m);
            int n_random = (int) (Math.random() * n);
            while (grid[m_random][n_random] < -1) {
                m_random = (int) (Math.random() * m);
                n_random = (int) (Math.random() * n);
            }
            grid[m_random][n_random] = -10000;
            if (m_random > 0)
                grid[m_random - 1][n_random] += 1;
            if (m_random < m - 1)
                grid[m_random + 1][n_random] += 1;
            if (n_random > 0)
                grid[m_random][n_random - 1] += 1;
            if (n_random < n - 1)
                grid[m_random][n_random + 1] += 1;
            if (m_random > 0 && n_random > 0)
                grid[m_random - 1][n_random - 1] += 1;
            if (m_random < m - 1 && n_random < n - 1)
                grid[m_random + 1][n_random + 1] += 1;
            if (m_random > 0 && n_random < n - 1)
                grid[m_random - 1][n_random + 1] += 1;
            if (m_random < m - 1 && n_random > 0)
                grid[m_random + 1][n_random - 1] += 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = grid[i][j];
                if (element < -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(element + "  ");
                }
            }
            System.out.println();
        }
    }
}
