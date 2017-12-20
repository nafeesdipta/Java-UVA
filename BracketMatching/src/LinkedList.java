/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nafees
 */
public class LinkedList {
    public Node head;
  public Node tail;
  int size=0;
  public void push(Object s)
  {
    Node k=new Node(s,null,null);
    if(size==0)
    {
      head=k;
      tail=head;
      size++;
    }
    else
    {
      k.prev=tail;
      tail.next=k;
      tail=tail.next;
      size++;
    }
  }
  public void pop()
  {
tail.next=null;
tail.element=null;
    tail=tail.prev;
    size--;
  }
  public Object peek()
  {
    if(size==0)
    {
      return null;
    }
    else
    {
      return tail.element;
    }
  }
}
