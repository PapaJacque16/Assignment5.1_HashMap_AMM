import java.util.HashMap;

/**
 * Created a Dictionary Class
 *  
 * @author Aaron McCarley
 * CS215
 * Assignment 5.1
 * Version 1.0
 *
 * @param <K>
 * @param <V>
 */
public class Dictionary<K, V> {

    private static final int ARRAY_SIZE = 600;

    @SuppressWarnings("unchecked")
	private Node<K, V>[] node = new Node[ARRAY_SIZE];
    
    	public void put(K key, V value) throws Exception {

    		long hashCode = this.HashCode(key);
    		int index = this.getIndex(hashCode);

    		if (index > ARRAY_SIZE) { 
    			throw new Exception("Invalid");
    		}
    
    		// Checking if there is already a Node at the given index.
    		if (this.node[index] != null) {

    		// We're getting the node at the given index, so that we can traverse to the end
    		// and add the new node.
    		Node<K, V> exitingNode = this.node[index];

        while (exitingNode.getNext() != null) {
            exitingNode = exitingNode.getNext();
        }

		// We're creating the new node.
        Node<K, V> newNode = new Node<>();
        newNode.setKey(key);
        newNode.setValue(value);
        newNode.setHashCode(hashCode);

        exitingNode.setNext(newNode);

    } else {
		// If there's no node at the given index, we'll just create a new node and add to the array
		// at the given index.
        Node<K, V> newNode = new Node<>();
        newNode.setKey(key);
        newNode.setValue(value);
        newNode.setHashCode(hashCode);

        this.node[index] = newNode;
    }
}

private long HashCode(K key) {
			return 0;
		}

@SuppressWarnings("unused")
private int loadDictionary(K key) {

    String keyString = key.toString();
    return keyString.hashCode();
    
}

private int getIndex(long hashCode) {

    return Math.toIntExact(hashCode % ARRAY_SIZE);
}

//Nesting Classes
@SuppressWarnings("hiding")
class Node<K, V> {

    private K key;
    private V value;
    private Node<K, V> next;
    private long hashCode;

  
  //Getters and Setters
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

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public long getHashCode() {
        return hashCode;
    }

    public void setHashCode(long hashCode) {
        this.hashCode = hashCode;
    }
  }//end Node Class

	public void printDictionary() {

		System.out.println();
		System.out.println("Printing map:");

		int index = 0;

		while (index < ARRAY_SIZE) {

        Node<K, V> node = this.node[index];

        if (node != null) {

            int list = 0;

            while (node != null) {

                if (list > 0) {
                    System.out.print(" | ");
                }

                System.out.print(node.getKey().toString() + "\n");
                System.out.print(node.getValue().toString());

                node = node.getNext();
                list++;

            }
            System.out.println();
        }
        index++;
	
		}   
	}
}//end Dictionary Class

