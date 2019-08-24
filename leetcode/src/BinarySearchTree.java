import java.util.Stack;

public class BinarySearchTree{

TreeNode root;
    public BinarySearchTree(int[] values)
    {
        this.root = new TreeNode(values[0]);

        for (int value : values) {

            insertIntoTree(value, root);
            
        } 


    }

    public void insertIntoTree(int value, TreeNode root)
    {
        if (value == root.val){
            return;
        }

        // need to move right
        if (value > root.val)
        {

            if(root.right == null)
            {
                root.right = new TreeNode(value);
            }

            else{

                insertIntoTree(value, root.right);
            }


        }

        if (value < root.val)
        {
            if (root.left == null)
            {

                root.left = new TreeNode(value);

            }
            else{
                insertIntoTree(value, root.left);
            }
        }


    }

    public Stack<TreeNode> pathToX(TreeNode root, int value, Stack<TreeNode> pathStack)
    {
        //the idea is to find a path to both. then compare the two generated stacks
        //if the element is not found then return null?
        pathStack.add(root);

        if(root.val == value)
        {
            return pathStack;
        }

        if (value > root.val)
        {
            if (root.right == null)
            {
                return null;
            }
            //need to move right
            pathToX(root.right, value, pathStack);
        }

        if (value < root.val)
        {
            if(root.left == null){
                return null;
            }
            pathToX(root.left, value, pathStack);
        }

        return pathStack;

    }

}