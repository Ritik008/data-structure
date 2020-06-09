public class CountLeafNode {
    public static void main(String[] args) {
        CountLeafNode obj = new CountLeafNode();
        TreeNode rootNode = obj.createBinaryTree();  
       System.out.println(obj.countLeafNode(rootNode));
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

    public int countLeafNode(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }
}