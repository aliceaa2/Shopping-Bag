/**
 * Implements the node of a singly linked list of strings.
 *
 * @author add here name, Panther ID, and class section of all authors
 * Alice Apostolakos, 6346259, COP3530 U01 1241
 */
public class Node
{

    private String info;
    private Node next;

    /**
     * Parameterized constructor.
     */
    public Node(String info, Node next)
    {
        this.info = info;
        this.next = next;
    }

    /**
     * Accessor method for info field.
     */
    public String getInfo()
    {
        return info;
    }

    /**
     * Accessor method for next field.
     */
    public Node getNext()
    {
        return next;
    }

    /**
     * Mutator method for info field.
     */
    public void setInfo(String info)
    {
        this.info = info;
    }

    /**
     * Mutator method for next field.
     */
    public void setNext(Node next)
    {
        this.next = next;
    }
}
