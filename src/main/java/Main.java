
package ex1;
public class Main {
	
	public static Node<Integer> merger(Node<Integer> L1, Node<Integer> L2) {

		Node<Integer>L5 = new Node<Integer>(-1);
		Node<Integer>head = L5;
		
		Node<Integer> P1 = L1;

		Node<Integer> P2 = L2;
		
		while (P1!=null || P2!=null ) {
			    if (P2==null) {
		    	   L5.setNext(P1);
				   P1= P1.getNext();
		        }
			    if (P1==null) {
			    	L5.setNext(P2);
					P2= P2.getNext();
			    }
			    else if(P2.getValue()>P1.getValue()){
					L5.setNext(P1);
					P1= P1.getNext();
				}
				else {
					L5.setNext(P2);
					P2= P2.getNext();
			}
			L5= L5.getNext();
		}
		return head.getNext();
	}

    public static void main(String[] args) {

		Node<Integer> a1 = new Node<>(1);
		Node<Integer> a2 = new Node<>(2);
		Node<Integer> a3 = new Node<>(3);
		Node<Integer> a4 = new Node<>(4);
		
		Node<Integer> a31 = new Node<>(3);
		Node<Integer> a41 = new Node<>(4);
		Node<Integer> a5 = new Node<>(5);
		Node<Integer> a6 = new Node<>(6);

		a1.setNext(a2);
		a2.setNext(a3);
		a3.setNext(a4);
		
		a31.setNext(a41);
		a41.setNext(a5);
		a5.setNext(a6);

		System.out.println(a1);
		System.out.println("******");
		System.out.println(a31);
		System.out.println("******");
		System.out.println("******");
		System.out.println(merger(a1,a31));
		

	}

}
	
	



