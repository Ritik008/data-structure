
public class LCR {
    public static void main(String[] args) {
        LCR obj = new LCR();
        TreeNode rootNode = obj.createBinaryTree(); 
        TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);  
        System.out.println(obj.findLCR(rootNode, node10, node30).data);
    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }

    public TreeNode findLCR(TreeNode root, TreeNode a, TreeNode b) {
        if(root == null) return null;
        if(a.data == root.data || b.data == root.data) return root;

        TreeNode left = findLCR(root.left, a, b);
        TreeNode right = findLCR(root.right, a, b);

        if(left != null && right != null) return root;
        if(left == null) return right;
        else return left;
    }
}