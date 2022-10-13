package treePreInPost;

public class main {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,15);
        tree.root=tree.insert(tree.root,5);
        tree.root=tree.insert(tree.root,12);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,9);
        tree.root=tree.insert(tree.root,25);
        System.out.println("kok : "+tree.root.data);
        System.out.println("kokun solunda : "+tree.root.left.data);


        System.out.print("preOrder: ");
        tree.preOrder(tree.root);
        System.out.print("inOrder: ");
        tree.inOrder(tree.root);
        System.out.print("postOrder: ");
        tree.postOrder(tree.root);

        System.out.println("\nagacin yuksekligi: "+ tree.height(tree.root));

        System.out.println("eleman sayisi: "+tree.size(tree.root));

        tree.root=tree.delete(tree.root,5);
        tree.root=tree.delete(tree.root,25);
        tree.root=tree.delete(tree.root,10);

        System.out.print("inOrder: ");
        tree.inOrder(tree.root);




    }
}
