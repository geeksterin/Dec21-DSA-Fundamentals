public class BinarySearchTree{
    TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    BinarySearchTree(){
         root = null;
    }
    void insert(int key){
        root = _insert(root,key);
    }
    static TreeNode _insert(TreeNode root,int key){
        if(root == null){
            root = new TreeNode(key);
            // System.out.println("Inserted Succesffuly");
            return root;
        }
        if(key<=root.val)
            root.left = _insert(root.left,key);
        else root.right = _insert(root.right,key);
        return root;
    }

    void inorder(){
        _inorder(root);
    }
    static void _inorder(TreeNode root){
        if(root==null) return;
        _inorder(root.left);
        System.out.print(root.val+ ",");
        _inorder(root.right);
    }

    TreeNode _LCA(int p, int q){
        return LCA(root,p,q);
    }
    static TreeNode LCA(TreeNode root, int p, int q) {
        if(root==null) return root;
        if(root.val<p && root.val<q)
            return LCA(root->right,p,q);
        if(root.val>p && root.val>q)
            return LCA(root->left,p,q);
        return root;
    }

    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
      
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        
        System.out.println("LCA : "+tree._LCA(20,40));

        tree.inorder();

    }


}