
public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("User1", 34));
        linkedList.addFirst(new Employee("User2", 45));
        linkedList.addFirst(new Employee("User1", 44));
        linkedList.addFirst(new Employee("User4", 22));
        linkedList.addFirst(new Employee("User3", 18));
        linkedList.addFirst(new Employee("User3", 55));
        // Employee employee1 = new Employee("AAA", 33);
        // Employee employee2 = new Employee("AAA", 33);

        // System.out.println(employee1.equals(employee2));

        // Employee res = linkedList.contains(new Employee("User3", 44));
        // System.out.println(res);

        // System.out.println();

        System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Ascending));
        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Descending));
        // System.out.println();
        // System.out.println(linkedList);

        linkedList.revert();

        System.out.println();
        System.out.println(linkedList);

    }

}
