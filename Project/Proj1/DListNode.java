public class DListNode {

  /* *
   *  item references the item stored in the current node.
   *  prev references the previous node in the DList.
   *  next references the next node in the DList.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */

  public int value;
  public int num;
  public DListNode prev;
  public DListNode next;

  /* *
   *  DListNode1() constructor.
   */
  DListNode() {
	value = 0;
	num = 0;
    prev = null;
    next = null;
  }
  DListNode(int i, int j) {
    value = i;
    num = j;
    prev = null;
    next = null;
  }
}