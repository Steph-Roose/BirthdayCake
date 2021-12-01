package novi.backend;

public class Tree {
    private String leaves;
    private String bark;

    //build leaves and return
    public String getLeaves() {
        int i, j, c=2;

        for (i = 1; i <= c; i++) {
            for (j = i; j <= c; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("   ");
            }
            for (j = i; j <= c; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("   ");
            }
            for (j = i; j <= c; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("   ");
            }
            System.out.println();
        }

        //leaves bottom
        for (i = 1; i <= c; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (j = i; j <= c-1; j++) {
                System.out.print("*  ");
            }
            for (j = i; j <= c; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i-1; j++) {
                System.out.print("   ");
            }
            System.out.println();
        }
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    //build bark and return
    public String getBark() {
        int i, j, d=3;

        for (i = 1; i <= d; i++) {
            for (j = 1; j <= d; j++) {
                System.out.print("    ! ! !   ");
            }
            System.out.println();
        }
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

}
