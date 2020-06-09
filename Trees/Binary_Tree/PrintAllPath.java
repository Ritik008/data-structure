import java.util.Stack;
public class PrintAllPath {
    public static void main(String[] args) {
        PrintAllPath obj = new PrintAllPath();
        TreeNode rootNode = obj.createBinaryTree();  
        Stack<Integer> stack = new Stack<>();
        obj.printPath(rootNode, stack);
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
    public void printPath(TreeNode root, Stack<Integer> stack) {
        if(root == null) return;
        stack.push(root.data);
        printPath(root.left, stack);
        if(root.left == null && root.right == null) {
            printStack(stack);
            System.out.println();
        }
        printPath(root.right, stack);
        stack.pop();
    }

    public void printStack(Stack<Integer> stack) {
       for(int i = 0; i < stack.size(); i++) {
           System.out.print(stack.get(i)+" ");
       }
    }
}