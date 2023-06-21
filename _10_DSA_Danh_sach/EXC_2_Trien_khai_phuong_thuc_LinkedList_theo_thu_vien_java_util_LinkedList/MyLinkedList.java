package _10_DSA_Danh_sach.EXC_2_Trien_khai_phuong_thuc_LinkedList_theo_thu_vien_java_util_LinkedList;

class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(element);
        } else if (index == numNodes) {
            addLast(element);
        } else {
            Node newNode = new Node(element);
            Node prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = getNode(numNodes - 1);
            lastNode.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == numNodes - 1) {
            return removeLast();
        } else {
            Node prevNode = getNode(index - 1);
            Node removedNode = prevNode.next;
            prevNode.next = removedNode.next;
            numNodes--;
            return removedNode.data;
        }
    }

    private E removeLast() {
        return null;
    }

    private E removeFirst() {
        return null;
    }

    public boolean remove(Object element) {
        Node prevNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(element)) {
                if (prevNode == null) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                numNodes--;
                return true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node currentNode = head;
        while (currentNode != null) {
            cloneList.addLast(currentNode.data);
            currentNode = currentNode.next;
        }
        return cloneList;
    }

    public boolean contains(E element) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(element)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node node = getNode(index);
        return node.data;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}

