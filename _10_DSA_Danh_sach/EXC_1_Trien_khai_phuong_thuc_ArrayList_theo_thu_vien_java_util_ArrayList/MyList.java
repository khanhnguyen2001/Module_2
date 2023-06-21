package _10_DSA_Danh_sach.EXC_1_Trien_khai_phuong_thuc_ArrayList_theo_thu_vien_java_util_ArrayList;

import java.util.Arrays;
class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(this.element, index, this.element, index + 1, size - index);
        this.element[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removedElement = (E) this.element[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(element, index + 1, element, index, numMoved);
        }
        element[--size] = null;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<E> cloneList = new MyList<>(size);
        System.arraycopy(element, 0, cloneList.element, 0, size);
        cloneList.size = size;
        return (E) cloneList;
    }

    public boolean contain(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (element[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(element[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E o) {
        ensureCapacity(size + 1);
        element[size++] = o;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int currentCapacity = element.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = currentCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            element = Arrays.copyOf(element, newCapacity);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) element[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }
}

