class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /**
   * Inserts a given integer value into the tree
   * @param root Root node of the tree
   * @param value Integer value to insert
   * @return Root after insertion
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }
   
   
   
   /*
   * Traverses the tree using pre order
   * @param root Root node of the tree
   */
   public void preOrderTraversal(Node root){
      // base case
      if (root == null){
         return;
      }
      System.out.print(root.value + ",");
      // recursive steps
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
   }

   
   
   /*
   * Traverses the tree using in order
   * @param root Root node of the tree
   */
   public void inOrderTraversal(Node root){
      // base case
      if (root == null){
         return;
      }
      // recursive steps
      inOrderTraversal(root.left);
      System.out.print(root.value + ",");
      inOrderTraversal(root.right);
   }
   
   
   
   /*
   * Traverse the tree using post order
   * @param root Root node of the tree
   */
   public void postOrderTraversal(Node root){
      // base case
      if (root == null){
         return;
      }
      // recursive steps
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.value + ",");
   }
   
   
   
   /*
   * Finds the node in the tree with a given value
   * @param root Root node of the tree
   * @param key Integer key to find
   * @return Whether or not key was found
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }
   
   
   
   /*
   * Gets the node with the smallest value
   * @param root Root node of the tree
   * @return Smallest integer value in tree
   */
   public int getMin(Node root){
      //implement me
   }
  
  
  
   /*
   * Gets the node with the largest value
   * @param root Root node of the tree
   * @return Largest integer value in the tree
   */
   public int getMax(Node root){
	  //implement me
   }
   
   
   
   /*
   * Deletes the node with the given key value
   * @param root Root node of the tree
   * @param Integer key value to delete
   * @return The root after deletion
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}