class Node {
	constructor(data) {
		this.data = data;
		this.next = null;
	}
}

class SLL {
	constructor() {
		this.head = null;
	}
	// return true or false if this.head is null
	isEmpty() {
		return this.head == null;
	}
	// when a pointer is to the LEFT of an equal sign, we are CHANGING it
	// when a pointer is to the RIGHT of an equal sign, we are READING it

	// create a new node with given data, add it to the head. return void
	addDataToFront(data) {
		var newNode = new Node(data); // create a new node with the data
		newNode.next = this.head; // set the new node's next to the head
		this.head = newNode; // move the head to the new node
		return this; // return back the instance so we can chain methods
	}

	// ---------------------------------
	// console log (print) the value of every node in the current list
	// traversal

	// mycoolList.read()
	read() {
        var runner=this.head;
        while (runner) {
            console.log(runner.data);
            runner=runner.next;
        }
    }

	// find: return true / false if current list contains a data equal to value
	contains(value) {
        var runner=this.head;
        while (runner) {
           if(runner.data===value){
               return true
           }
           else{
               runner=runner.next;
           }
        }
    }

	// Remove from front: remove and return the first node in the SLL
	removeFromFront() {
        aux=this.head;
        this.head=this.head.next;
        aux.next=null;
    }

    //delete
	delete(data){
		if (this.isEmpty()){
         return;
		}
		else if(this.head.data==data){
			this.removeFromFront();
		}
		else{
			var runner=this.head;
        while (runner.next) {
           if(runner.data===data){
			aux=this.runner;
			this.runner=this.runner.next;
			aux.next=null;
               return ;
           }
         
               runner=runner.next;
          
        }
		}
	}
}

// ⚠ 1. don't forget to instantiate the Singly Linked List
var myCoolList = new SLL();
myCoolList.addDataToFront(33);
myCoolList.addDataToFront(11);
myCoolList.addDataToFront(100);
// console.log(myCoolList);
myCoolList.delete(11);
myCoolList.read();