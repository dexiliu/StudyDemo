package demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
 

public class BinarySortTree {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySortTree tree = new BinarySortTree(50);
        Random rand = new Random();
        for(int i=0;i<20;i++) {
            tree.insert(rand.nextInt(100));
        }
        tree.print();
	}


	/*
	 * 二叉查找树
	 */

	 
	    // private int floor; // 节点所在层数，根为第0层，以此类推。。。
	    // private int position; // 以完全二叉树来计算节点在层中的位置，0,1...
	 
	    private BinarySortTree parent;
	    private BinarySortTree leftChild;
	    private BinarySortTree rightChild;
	    private int value;
	 
	    public BinarySortTree() {
	        super();
	    }
	 
	    public BinarySortTree(int value) {
	        super();
	        this.value = value;
	    }
	 
	    /*
	     * 查找某个关键字，存在则返回true
	     */
	    public boolean find(int target) {
	        if (target == value) {
	            return true;
	        } else if (target < value && leftChild != null) {
	            return leftChild.find(target);
	        } else if (rightChild != null) {
	            return rightChild.find(target);
	        }
	        return false;
	    }
	 
	    /*
	     * 插入一个值
	     */
	    public void insert(int target) {
	        if (target <= value) {
	            if (leftChild != null) {
	                leftChild.insert(target);
	            } else {
	                leftChild = new BinarySortTree(target);
	                leftChild.parent = this;
	            }
	        } else {
	            if (rightChild != null) {
	                rightChild.insert(target);
	            } else {
	                rightChild = new BinarySortTree(target);
	                rightChild.parent = this;
	            }
	        }
	    }
	 
	    /*
	     * 将树转换成字符串，用L表示左孩子，R表示右孩子
	     * 
	     * @see java.lang.Object#toString()
	     */
	    public void print() {
	        List<BinarySortTree> tree = locateNodes();
	        int size = tree.size(); //
	        int deepth = 0;
	        // 获取树的深度
	        while ((size >>= 1) > 0) {
	            deepth++;
	        }
	        deepth++;
	        Iterator<BinarySortTree> iterator = tree.iterator();
	        int maxPosition = 1;
	        for (int floor = 1; floor <= deepth; floor++) { // 层数，从1开始
	            maxPosition = 1 << (floor - 1);
	                printBlank((1 << (deepth - floor)) - 1);
	            for (int position = 0; position < maxPosition; position++) {
	                if (iterator.hasNext()) {
	                    BinarySortTree node = iterator.next();
	                    if (node != null) {
	                        System.out.print(node);
	                    } else {
	                        System.out.print(" ");
	                    }
	                    printBlank((1 << (deepth - floor + 1)) - 1);
	                }
	            }
	            System.out.println();
	        }
	    }
	 
	    /*
	     * 将二叉树用空节点补充成完全二叉树，并以水平遍历形式返回
	     */
	    private List<BinarySortTree> locateNodes() {
	        Queue<BinarySortTree> queue = new LinkedList<BinarySortTree>();
	        List<BinarySortTree> tree = new LinkedList<BinarySortTree>(); // 把树补充成完全二叉树，放在这个链表中
	        queue.add(this);
	        BinarySortTree empty = null;
	        int nodeCount = 1; // 队列中非空节点数
	        while (queue.size() > 0 && nodeCount > 0) {
	            BinarySortTree node = queue.remove();
	            if (node != null) {
	                nodeCount--;
	                tree.add(node);
	                BinarySortTree left = node.leftChild;
	                BinarySortTree right = node.rightChild;
	                if (left == null) {
	                    queue.add(empty);
	                } else {
	                    queue.add(left);
	                    if (left != null) {
	                        nodeCount++;
	                    }
	                }
	                if (right == null) {
	                    queue.add(empty);
	                } else {
	                    queue.add(right);
	                    if (right != null) {
	                        nodeCount++;
	                    }
	                }
	            } else {
	                tree.add(empty);
	                queue.add(empty);
	                queue.add(empty);
	            }
	        }
	        return tree;
	    }
	 
	    @Override
	    public String toString() {
	        return "" + value;
	    }
	 
	    private void printBlank(int length) {
	        while (length-- > 0) {
	            System.out.print(" ");
	        }
	    }
	 
	    public BinarySortTree getParent() {
	        return parent;
	    }
	 
	    public void setParent(BinarySortTree parent) {
	        this.parent = parent;
	    }
	 
	    public BinarySortTree getLeftChild() {
	        return leftChild;
	    }
	 
	    public void setLeftChild(BinarySortTree leftChild) {
	        this.leftChild = leftChild;
	    }
	 
	    public BinarySortTree getRightChild() {
	        return rightChild;
	    }
	 
	    public void setRightChild(BinarySortTree rightChild) {
	        this.rightChild = rightChild;
	    }
	 
	    public int getValue() {
	        return value;
	    }
	 
	    public void setValue(int value) {
	        this.value = value;
	    }
}
