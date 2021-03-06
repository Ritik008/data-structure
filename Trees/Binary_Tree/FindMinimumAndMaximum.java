public class FindMinimumAndMaximum {
    public static void main(String[] args) {
        TreeNode rootNode = createBinarySearchTree();       
        System.out.println(findMaximum(rootNode).data);
        System.out.println(findMinimum(rootNode).data); 
    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int data) {
            this.data = data;
        }
    }


    public static TreeNode createBinarySearchTree() {
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
		TreeNode node5=new TreeNode(5);
		TreeNode node55=new TreeNode(55);
 
		insert(null,rootNode);
		insert(rootNode,node20);
		insert(rootNode,node10);
		insert(rootNode,node30);
		insert(rootNode,node60);
		insert(rootNode,node50);
		insert(rootNode,node70);
		insert(rootNode,node5);
		insert(rootNode,node55);
		return rootNode;
    }

    public static TreeNode insert(TreeNode root, TreeNode nodeToBeInserted) {
        if(root == null) { 
            root = nodeToBeInserted;
            return root;
        }
        if(root.data > nodeToBeInserted.data) {
            if(root.left == null) {
                root.left = nodeToBeInserted;
            }else {
                insert(root.left, nodeToBeInserted);
            }
        }else {
            if(root.right == null) {
                root.right = nodeToBeInserted;
            }else {
                insert(root.right, nodeToBeInserted);
            }
        }
        return root;
    }

    public static TreeNode findMinimum(TreeNode root) {
       if(root.left == null) return root;
       else return findMinimum(root.left);
    }

    public static TreeNode findMaximum(TreeNode root) {
       if(root.right == null) return root;
       else return findMaximum(root.right);
    }
}