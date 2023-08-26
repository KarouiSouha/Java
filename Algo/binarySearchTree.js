class TreeNode {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null;
    }
    
    insert(value) {
        this.root = this._insertRec(this.root, value);
    }
    
    _insertRec(root, value) {
        if (root === null) {
            return new TreeNode(value);
        }
        
        if (value < root.value) {
            root.left = this._insertRec(root.left, value);
        } else {
            root.right = this._insertRec(root.right, value);
        }
        
        return root;
    }
    
    inorderTraversal(root) {
        if (root !== null) {
            this.inorderTraversal(root.left);
            console.log(root.value);
            this.inorderTraversal(root.right);
        }
    }
}

const bst = new BinarySearchTree();

const valuesToInsert = [5, 2, 8, 1, 3, 7, 9];
valuesToInsert.forEach(value => bst.insert(value));

console.log("Inorder traversal:");
bst.inorderTraversal(bst.root);



