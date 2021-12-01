package novi.backend;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        //leaves top
        Tree leaves = new Tree();
        leaves.setLeaves("");
        System.out.print(leaves.getLeaves());

        //bark
        Tree bark = new Tree();
        bark.setBark("");
        System.out.print(bark.getBark());

        //base
        Base base1 = new Base();
        base1.setBase1("");
        System.out.print(base1.getBase1());

        Base base2 = new Base();
        base2.setBase2("");
        System.out.print(base2.getBase2());

        System.out.print(base1.getBase1());

        Base base3 = new Base();
        base3.setBase3("");
        System.out.println(base3.getBase3());


    }
}
