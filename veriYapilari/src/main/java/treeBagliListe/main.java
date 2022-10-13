package treeBagliListe;

public class main {
    public static void main(String[] args) {
        BTree bTree=new BTree();
        bTree.root=bTree.insert(bTree.root,10);
        bTree.root=bTree.insert(bTree.root,15);
        bTree.root=bTree.insert(bTree.root,8);
        bTree.root=bTree.insert(bTree.root,20);
        bTree.root=bTree.insert(bTree.root,4);
        bTree.root=bTree.insert(bTree.root,12);

        System.out.println("kok : "+bTree.root.data);
        System.out.println("kokun saginda : "+bTree.root.right.data);
        System.out.println("kokun solunda : "+bTree.root.left.data);
        System.out.println("kokun sagindaki kokun solunda : "+bTree.root.right.left.data);
    }
}
