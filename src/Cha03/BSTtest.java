package Cha03;

import edu.princeton.cs.algs4.StdOut;

public class BSTtest {
    public static void main(String[] args){
        BST bst = new BST();
        bst.put("L",2);
        bst.put("B",3);
        bst.put("Q",4);
        bst.put("W",5);
        bst.put("A",6);
        bst.put("R",7);
        bst.put("T",8);
        bst.put("D",0);
        bst.put("G",9);
        bst.put("Z",11);

        //System.out.println(bst.get("A"));
        //System.out.println(bst.min());
        //System.out.println(bst.max());
        StdOut.println(bst.floor("P"));
        StdOut.println(bst.ceiling("P"));
    }
}
