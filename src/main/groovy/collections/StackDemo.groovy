package collections

import collections.ListInterface.Student

class StackDemo {
    static Stack<Student> studentStack = new Stack<>()

    public static void main(String[] args) {
        studentStack.push(new Student('Oanh', 8, 'Hung Yen'))
        studentStack.push(new Student('Trang', 7, 'Hai Duong'))
        studentStack.push(new Student('Ha', 9, 'Ha Noi'))
        studentStack.push(new Student('Kien', 9, 'Hung Yen'))
        studentStack.push(new Student('Huan', 8, 'Ha Noi'))
        studentStack.push(new Student('Dung', 8, 'Ha Noi'))

        println studentStack
        studentStack.pop()
        println 'Stack after pop()' + studentStack
        Student studentTop = studentStack.peek()
        println 'top student' + studentTop
        println 'stack student is empty ?'+studentStack.isEmpty()
    }
}
