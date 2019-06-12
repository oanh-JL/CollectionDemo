package collections.ListInterface

class LinkedListCollection {

    static LinkedList<Student> studentLinkedList = new LinkedList<>()

    public static void main(String[] args) {

        studentLinkedList.add(new Student('Oanh', 9, 'Hung Yen'))
        studentLinkedList.add(new Student('Trang', 8,'Hai Duong'))
        studentLinkedList.add(new Student('Kien', 6, 'Hai Phong'))
        studentLinkedList.add(new Student('Hieu', 10, 'Lam Dong'))
        studentLinkedList.add(new Student('Hai', 7, 'Da Nang'))
        studentLinkedList.add(new Student('Ha', 4, 'Hung Yen'))

        Student newStudent = new Student('Dung', 8, 'ha Nam')

        studentLinkedList.add(3,newStudent)
        println 'Add method'
        studentLinkedList.each {
            println it
        }
        Student studentAdd = new Student('Ngoc', 9, 'hai Duong')
        studentLinkedList.addFirst(studentAdd)
        println 'Add first method'
        studentLinkedList.each {
            println it
        }
        println 'Add last method'
        studentLinkedList.addLast(studentAdd)
        studentLinkedList.each {
            println it
        }

        println 'getFirst() method'
        println studentLinkedList.getFirst()

        println 'getLast() method'
        println studentLinkedList.getLast()

        println 'removeFirst()'
        studentLinkedList.removeFirst()
        studentLinkedList.each {
            println it
        }
        println 'RemoveLast method'
        studentLinkedList.removeLast()
        studentLinkedList.each {
            println it
        }
        println 'duyet phan tu list bang iterator'
        Iterator<Student> iteratorStudentName = studentLinkedList.iterator()
       while ( iteratorStudentName.hasNext()) {
           println iteratorStudentName.next().name
       }
        println 'duyet phan tu list bang listIterator'
        ListIterator<Student> listIteratorStudent = studentLinkedList.listIterator()
        while (listIteratorStudent.hasPrevious()) {
            println listIteratorStudent.previous()
        }

    }
}
