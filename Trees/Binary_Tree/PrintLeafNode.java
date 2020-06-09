import java.util.Stack;
public class PrintLeafNode {
    public static void main(String[] args) {
        PrintLeafNode obj = new PrintLeafNode();
        TreeNode rootNode = obj.createBinaryTree();  
        obj.printLeafNodeRecursive(rootNode);
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

    public void printLeafNodeRecursive(TreeNode root) {
        if(root == null) return;
        if(root.right == null && root.left == null) System.out.printf("%d ",root.data);
        printLeafNodeRecursive(root.left);
        printLeafNodeRecursive(root.right);
    }
}