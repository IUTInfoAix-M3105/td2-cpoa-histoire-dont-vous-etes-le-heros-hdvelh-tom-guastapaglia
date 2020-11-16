/**
 * File: NodeMultiple.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class NodeMultiple {
	public static final int ERROR_STATUS_INDEX_OUT_OF_RANGE = -1;
	public static final String ERROR_MSG_INDEX_OUT_OF_RANGE = "Index out of range";
	public static int NODE_MAX_ARITY = 10;
	private NodeMultiple[] daughters;
	private Object data;

	/* Overridden methods */
	@Override
	public String toString() {
		/* TO BE COMPLETED */
//		StringBuilder sb = new StringBuilder();
//		sb.append(data.toString());
//		sb.append("\ndaughters: ");
//		for (int i = 0; i < daughters.length; i++) {
//			daughters[i].getData().toString();
//		}
//		return sb.toString();
		return data.toString();
	}

	/* Getters/Setters */

	/**
	 * Gets the {@code i}th daughter node.
	 * <p>
	 * Aborts if the given index {@code i} is out of range.
	 *
	 * @param i the index of the daughter node.
	 * @return the {@code i}th daughter node, or {@code null} if it does not exist.
	 */
	public NodeMultiple getDaughter(int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * Sets the {@code i}th daughter node to the input parameter {@code daughter}.
	 * Should be used cautiously, since {@code i} may not be the first index
	 * available (i.e. there may be lower indexes which do not refer to any
	 * daughter).
	 * <p>
	 * If a daughter node is already referred to at this index then it is erased
	 * with {@code daughter}.
	 * <p>
	 * Aborts if the index {@code i} is out of range.
	 *
	 * @param daughter the node to be linked as a daughter of {@code this} node.
	 * @param i        the daughter node's index
	 */
	public void setDaughter(NodeMultiple daughter, int i) {
		/* TO BE COMPLETED */
		if (i < 0 || i > NODE_MAX_ARITY) {
			ErrorNaiveHandler.abort(ERROR_STATUS_INDEX_OUT_OF_RANGE);
		}
		daughter[i] = daughter;
	}

	/**
	 * @return all the daughters
	 */
	public NodeMultiple[] getDaughters(int i) {
		/* TO BE COMPLETED */
		if (i < 0 || i >= NODE_MAX_ARITY) {
			ErrorNaiveHandler.abort(ERROR_MSG_INDEX_OUT_OF_RANGE);
		}
		return daughters[i];
	}

	/**
	 * @param daughters the daughters to set
	 */
	public void setDaughters(NodeMultiple[] daughters) {
		/* TO BE COMPLETED */
		this.daughters = daughters;
	}

	/**
	 * Adds the given {@code daughter} node at the first available index.
	 * <p>
	 * If the max number of daughters ({@link #NODE_MAX_ARITY}) is already reached
	 * nothing happens (no abort).
	 *
	 * @param daughter
	 */
	public void addDaughter(NodeMultiple daughter) {
		/* TO BE COMPLETED */
		if (daughter == null) {
			return;
		}
		int i = 0;
		/* on parcoure le tableau tant que l'index courant est occupé.
		à la recherche du premier index vide
		 */
		while (i < daughters.length && daughters[i] != null) {
			i++;
		}
		if (i < daughters.length) {
			daughters[i] = daughter;
		}
	}

	/**
	 * @return the content data
	 */
	public Object getData() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param data
	 */
	public void setData(Object data) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return {@code true} if and only if this node has at least one non-null
	 * daughter node.
	 */
	public boolean hasDaughters() {
		/* TO BE COMPLETED */
		int i;
		boolean has=true;
		while (i<daughters.length && daughters[i]==null){i++;}
		return i<daughters.length?true:false;
	}

	/* Constructors */

	/**
	 * Default constructor.
	 */
	public NodeMultiple() {
		/* TO BE COMPLETED */
//		super()
//		data = null
		daughters = new NodeMultiple[NODE_MAX_ARITY];
	}

	/**
	 * Constructor. Sets the content data to {@code data} and creates an empty set
	 * of daughters.
	 *
	 * @param data
	 */
	public NodeMultiple(Object data) {
		/* TO BE COMPLETED */
		this(); // appel à l'autre constructeur "constructeur poupée russe"
		this.data = data;
	}
}

// eof