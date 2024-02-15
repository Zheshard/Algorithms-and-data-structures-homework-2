import java.util.Comparator;

/*
 * Связный список
 */
public class LinkedList<T> {

    /*
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    /*
     * Узел
     */
    class Node {

        /*
         * Ссылка на следующий элемент
         */
        public Node next;

        /*
         * Значение
         */
        public T value;
    }

    /*
     * Добавлене нового элемента в начало связного списка
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /*
     * Удалить первый элемент связного списка
     */
    public void removeFirst() {

        if (head != null) {
            head = head.next;
        }
    }

    /*
     * Поиск в связном списке
     */
    public T contains(T value) {
        Node node = head;
        if (head != null) {
            if (node.value.equals(value)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /*
     * Сортировка выбором
     */
    public void sort(Comparator<T> comparator) {
        Node node = head;
        while (node != null) {
            Node minValuNode = node;
            Node node2 = node.next;
            while (node2 != null) {
                if (comparator.compare(minValuNode.value, node2.value) > 0) {
                    minValuNode = node2;
                }
                node2 = node2.next;
            }
            if (minValuNode != node) {
                T buf = node.value;
                node.value = minValuNode.value;
                minValuNode.value = buf;
            }
            node = node.next;
        }
    }

    /*
     * Добавление значения в конец связного списка
     */
    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /*
     * Удаление элемента из конца связного списка
     */
    public void removeLast() {
        if (head == null) {
            return;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    /*
     * Разворот связного списка
     */
    public void revert() {
        if (head == null) {
            return;
        }
        Node prev = null;
        Node node = head;
        while (node != null) {
            Node next = node.next;
            node.next = prev;
            prev = node;
            node = next;

        }
        head = prev;
    }

    /*
     * Вывод списка на экран
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }

}
