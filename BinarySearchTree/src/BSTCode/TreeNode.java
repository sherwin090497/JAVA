package BSTCode;
public class TreeNode<K extends Comparable<K>,V>{
	private K key;
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	private V value;
	private TreeNode<K,V> leftChild;
	private TreeNode<K,V> rightChild;

	public TreeNode(K key, V value) {
		this.key = key;
		this.value=value;
		this.leftChild = null;
		this.rightChild =null;
	}
		
	public TreeNode<K,V> getLeftChild() {
		return this.leftChild;
	}

	public void setLeftChild(TreeNode<K,V> left) {
		this.leftChild = left;
	}

	public TreeNode<K,V> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<K,V> right) {
		this.rightChild = right;
	}

	public void traverseInOrder() {
		if (this.leftChild != null)
			this.leftChild.traverseInOrder();
		System.out.print(this + " ");
		if (this.rightChild != null)
			this.rightChild.traverseInOrder();
	}
	
	public void insert(K Key, V Value)
	{
		if (key.compareTo(Key) < 0) { // insert in right subtree
			if (this.rightChild == null)
			{
				this.rightChild = new TreeNode<K,V>(Key,Value);
				System.out.print("Inserted as Right Child: \t");
			}
			else
				this.rightChild.insert(Key,Value);
		} else { // insert in left subtree
			if (this.leftChild == null)
			{
				this.leftChild = new TreeNode<K,V>(Key,Value);
				System.out.print("Inserted as Left Child: \t");
			}
			else
				this.leftChild.insert(Key,Value);
		}
	}
	@Override
	public String toString() {
		String returnString = "\nKey: "+this.key+"  \t Value: "+this.value;
		return String.valueOf(returnString);
	}
}
