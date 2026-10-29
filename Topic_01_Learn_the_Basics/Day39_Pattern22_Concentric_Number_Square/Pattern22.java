package Topic_01_Learn_the_Basics.Day39_Pattern22_Concentric_Number_Square;

public class Pattern22 {
    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                int min = top;
                if (left < min)
                    min = left;

                if (right < min)
                    min = right;

                if (bottom < min)
                    min = bottom;

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}
