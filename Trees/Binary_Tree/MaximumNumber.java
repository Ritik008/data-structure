import java.util.Queue;
import java.util.LinkedList;
public class MaximumNumber {
    public static void main(String[] args) {
        MaximumNumber obj = new MaximumNumber();
        TreeNode rootNode = obj.createBinaryTree();   
        System.out.println(obj.findMaximum(rootNode));
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

    public int findMaximum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()){ 
            TreeNode n = queue.poll();
            if(n.data > max) {
                max = n.data;
            }
            if(n.left != null) {
                queue.add(n.left);
            }
            if(n.right != null) {
                queue.add(n.right);
            }
        }
        return max;
    }
    
}