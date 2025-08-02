public class StarPatterns {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=5; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<6; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            } 
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=5; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i=5; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=5; i++) {
            for (int j=5; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++) {
            // int j=0; 
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<5; j++) {
                System.out.print("*");
            }
            for (int j=i; j<4; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        System.out.println();

        for (int i=0; i<10; i++) {
            int j=0;
            for (j=i; j<4&&i<5; j++ ) System.out.print(" ");
            for (j=0; j<i+1&&i<5; j++ ) System.out.print("*");
            for (j=0; j<i&&i<5; j++) System.out.print("*");
            for (j=0; j<i%5&&i>4; j++) System.out.print(" ");
            for (j=i%5; j<5&&i>4; j++) System.out.print("*");
            for (j=i%5; j<4&&i>4; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<=10; i++) {
            for (int j=i; j<5&&i<5; j++ ) System.out.print(" ");
            for (int j=0; j<i+1&&i<5; j++ ) System.out.print("*");
            for (int j=0; j<i&&i<5; j++) System.out.print("*");
            for (int j=0; j<2*i+1&&i==5; j++) System.out.print("*");
            for (int j=0; j<(i-1)%5+1&&i>5; j++) System.out.print(" ");
            for (int j=(i-1)%5; j<5&&i>5; j++) System.out.print("*");
            for (int j=(i-1)%5; j<4&&i>5; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<9; i++ ) {
            for (int j=0; j<i+1&&i<5; j++) System.out.print("*");
            for (int j=(i%5)+1; j<5&&i>4; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++) {
            for (int j=0, b=1; j<i+1; j++, b^=1) System.out.print(b+" ");
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=4; i++) {
            for (int j=1; j<=i; j++) System.out.print(j);
            for (int j=i; j<4; j++) System.out.print("  ");
            for (int j=i; j>=1; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }
}