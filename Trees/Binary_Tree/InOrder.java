import java.util.Stack;
public class InOrder {
    public static void main(String[] args) {
        InOrder obj = new InOrder();
        TreeNode rootNode = obj.createBinaryTree();  
        System.out.println("Recursive Traversal: "); 
        obj.inOrderRecursive(rootNode);
        System.out.println("\nIterative Traversal:");
        obj.inOrderIterative(rootNode);
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

    public void inOrderRecursive(TreeNode root) {
        if(root == null) return;
        inOrderRecursive(root.left);
        System.out.printf("%d ",root.data);
        inOrderRecursive(root.right);
    }

    public void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode currentNode = root;
        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }else {
                TreeNode n = stack.pop();
                System.out.printf("%d ",n.data);
                currentNode = n.right;
            }
        }
    }
}