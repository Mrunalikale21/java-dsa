public class subtreeoftree {
  
  static class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
       this.val = val;
       this.left = null;
       this.right = null;
    }
  }




  public boolean isIdentical(Node root, Node subRoot){
if(root == null && subRoot == null){
  return true;
}
if(root == null || subRoot == null){
  return false;
}
if(root.val == subRoot.val){
return isIdentical(root.left, subRoot) && isIdentical(root.right, subRoot);
}

return false;
  }

  public boolean isSubtree(Node root, Node subRoot){
    if(subRoot == null){
      return true;
    }

    if(root == null){
      return false;
    }

    if(root.val == subRoot.val){
      if(isIdentical(root, subRoot)){
        return true;
      }
    }

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }
  
}
