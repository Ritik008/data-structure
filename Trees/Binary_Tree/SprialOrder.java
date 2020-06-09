import java.util.Stack;
public class SprialOrder {
    public static void main(String[] args) {
        SprialOrder obj = new SprialOrder();
        TreeNode rootNode = obj.createBinaryTree();  
        obj.spiralOrder(rootNode);
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

    public void spiralOrder(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                TreeNode n = stack1.pop();
                System.out.printf("%d ",n.data);
                if(n.left != null) {
                    stack2.push(n.left);
                }
                if(n.right != null) {
                    stack2.push(n.right);
                }
            }

            while(!stack2.isEmpty()) {
                TreeNode n = stack2.pop();
                System.out.printf("%d ",n.data);
                if(n.right != null) {
                    stack1.push(n.right);
                }
                if(n.left != null) {
                    stack1.push(n.left);
                }
            }
        }
    }
}