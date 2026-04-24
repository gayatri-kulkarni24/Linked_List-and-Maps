public void removeNthNodeFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){//size=5 n=5
            head=head.next; //first node remove
        }
        //n=2 from end remove 2nd node
        int i=1;
        int idxToFind=size-n; //5-2=3
        Node prev=head;
        while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
