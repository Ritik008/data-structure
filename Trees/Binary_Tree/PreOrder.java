import java.util.Stack;
public class PreOrder {
    public static void main(String[] args) {
        PreOrder obj = new PreOrder();
        TreeNode rootNode = obj.createBinaryTree();   
        System.out.println("Recursive traversal: ");
        obj.preOrderRecursive(rootNode);
        System.out.println("\nIterative traversal: ");
        obj.preOrderIterative(rootNode);
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

    public void preOrderRecursive(TreeNode root) {
        if(root == null) return;
        System.out.printf("%d ",root.data);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.printf("%d ", node.data);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
    }
}