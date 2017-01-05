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
	 * ���������
	 */

	 
	    // private int floor; // �ڵ����ڲ�������Ϊ��0�㣬�Դ����ơ�����
	    // private int position; // ����ȫ������������ڵ��ڲ��е�λ�ã�0,1...
	 
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
	     * ����ĳ���ؼ��֣������򷵻�true
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
	     * ����һ��ֵ
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
	     * ����ת�����ַ�������L��ʾ���ӣ�R��ʾ�Һ���
	     * 
	     * @see java.lang.Object#toString()
	     */
	    public void print() {
	        List<BinarySortTree> tree = locateNodes();
	        int size = tree.size(); //
	        int deepth = 0;
	        // ��ȡ�������
	        while ((size >>= 1) > 0) {
	            deepth++;
	        }
	        deepth++;
	        Iterator<BinarySortTree> iterator = tree.iterator();
	        int maxPosition = 1;
	        for (int floor = 1; floor <= deepth; floor++) { // ��������1��ʼ
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
	     * ���������ÿսڵ㲹�����ȫ������������ˮƽ������ʽ����
	     */
	    private List<BinarySortTree> locateNodes() {
	        Queue<BinarySortTree> queue = new LinkedList<BinarySortTree>();
	        List<BinarySortTree> tree = new LinkedList<BinarySortTree>(); // �����������ȫ���������������������
	        queue.add(this);
	        BinarySortTree empty = null;
	        int nodeCount = 1; // �����зǿսڵ���
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
