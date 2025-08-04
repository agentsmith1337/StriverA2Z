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

        for (int i=1, k=1;i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(k+++" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++) {
            for (int j=0, c=65; j<=i; j++) {
                System.out.print((char)c++);
            }
            System.out.println();
        }
        System.out.println(); 

        for (int i=0; i<5; i++) {
            for (int j=5, c=65; j>i; j--) {
                System.out.print((char)c++);
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0, c=65; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)c);
            }
            c++;
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<4; i++) {
            int c=65;
            for (int j=i+1; j<4; j++) System.out.print(" ");
            for (int j=0; j<=i ;j++) {
                System.out.print((char)c++);
            }
            c--;
            c--;
            for (int j=0; j<i; j++) {
                System.out.print((char)c--);
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<=4; i++) {
            for (int j=0,c=69-i; j<=i; j++) {
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<10; i++) {
            for (int j=i; j<5&&i<5; j++) {
                System.out.print("*");
            }
            for (int j=0; j<i&&i<5; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<5&&i<5; j++) {
                System.out.print("*");
            }

            for (int j=0; j<(i+1)%5&&i>=5||i==9&&j<5; j++) {
                System.out.print("*");
            }
            for (int j=(i%5); j<4&&i>=5; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<(i+1)%5&&i>=5||i==9&&j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<9; i++) {
            for (int j=0; j<=i&&i<5; j++) System.out.print("*");
            for (int j=i; j<4&&i<5; j++) System.out.print("  ");
            for (int j=0; j<=i&&i<5; j++) System.out.print("*");

            for (int j=(i+1)%5; j<5&&i>=5; j++) System.out.print("*");
            for (int j=0; j<=i%5&&i>=5; j++) System.out.print("  ");
            for (int j=(i+1)%5; j<5&&i>=5; j++) System.out.print("*");
            System.out.println();        
        }
        System.out.println();

        for (int i=0; i<7; i++) {
            for (int j=0; (i==0||i==6)&&j<4; j++) System.out.print("*");
            if (i==1||i==3||i==5) System.out.println();
            for (int j=0; (i==2||i==4)&&j<4; j++) {
                if (j==0||j==3) System.out.print("*");
                else System.out.print(" ");
            }
        }
        System.out.println();  
        System.out.println();
        //22nd pattern as a combination of 6 triangles 
        for (int i=0, ut=4, lt=2; i<7; i++) {
            //upper left triangle
            for (int j=0,a=4; j<i&&i<4; j++) {
                System.out.print(a--+" ");
            }
            //upper triangle  
            for (int j=i; j<7-i&&i<4; j++) {
                System.out.print(ut+" ");
            }
            if (i<4) ut--;
            //upper right triangle 
            for (int j=0, a=4+1-i; j<i&&i<4; j++) {
                System.out.print(a+++" ");
            }

            //lower left triangle
            for (int j=1 ,a=4; j>=(i%4)&&i>=4&&i<6; j--) {
                System.out.print(a--+" ");
            }
            //lower triangle
            for (int j=0; j<3+2*(i%4)&&i>=4; j++) {
                System.out.print(lt+" ");
            }
            if (i>=4) lt++;
            //lower right triangle
            for (int j=1, a=3+(i%4); j>=(i%4)&&i>=4&&i<6; j--) {
                System.out.print(a+++" ");
            }

            System.out.println();
        }
        System.out.println();
        
        //22nd pattern as a multiplexed array/ programmed array 
        for (int i=0; i<7; i++)  {
            for (int j=0; j<7; j++) {
                if ((i==0||i==6)&&j!=0&&j!=6) {
                System.out.print("4 ");
                }
                {
                    if (j==0||j==6) System.out.print("4 ");
                    if ((i==1||i==5)&&j>1&&j<5) System.out.print("3 ");
                    if ((i==2||i==4)&&j>2&&j<4) System.out.print("2 ");
                    if (i>0&&i<6&&(j==1||j==5)) System.out.print("3 ");
                    if (i>1&&i<5&&(j==2||j==4)) System.out.print("2 ");
                    if (i==3&&j==3)System.out.print("1 ");

                }
               
            }
            System.out.println();
        }
    }
}