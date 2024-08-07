import java.util.NoSuchElementException;

// TP NDOU 37853058
class MyArrayList {
    private Person[] data;
    private int size;

    public MyArrayList() {
        data = new Person[10];
        size = 0;
    }

    public void add(Person element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    private void resize() {
        Person[] newData = new Person[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public Person get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public MyArrayList getFiltered(Person value) {
        MyArrayList filteredList = new MyArrayList();
        for (int i = 0; i < size; i++) {
            if (data[i].compareTo(value) > 0) {
                filteredList.add(data[i]);
            }
        }
        return filteredList;
    }

    public Person getMax() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }
        Person max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i].compareTo(max) > 0) {
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}