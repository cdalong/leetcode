import java.util.Stack;

public class LCA {


    public int main()
    {

        int[] testValues = {5,6,3,1,2,4};
        BinarySearchTree bst = new BinarySearchTree(testValues);
        TreeNode LCA = null;
        Stack<TreeNode> path1 = new Stack<TreeNode>();
        Stack<TreeNode> path2 = new Stack<TreeNode>();

        path1 = bst.pathToX(bst.root, 2, path1);
        path2 = bst.pathToX(bst.root, 4, path2);
        

        while (!path1.isEmpty() && !path2.isEmpty())
        {
            TreeNode jPop = path1.pop();
            TreeNode Kpop = path2.pop();
            if (jPop.val == Kpop.val)
            {
                LCA = jPop;
            }
            else{

                break;
            }
    
        }

        

        return path1.size() +  path2.size() - 1;

    }

}