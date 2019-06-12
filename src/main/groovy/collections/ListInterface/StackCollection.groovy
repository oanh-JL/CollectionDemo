package collections.ListInterface

class StackCollection {
    static Stack<Student> studentStack = new Stack<>()

    public static void main(String[] args) {
        studentStack.push(new Student('Oanh',8,'Hung yen'))
        studentStack.push(new Student('Trang',5,'Balem'))
        studentStack.push(new Student('Dung',6,'Balasia'))
        studentStack.push(new Student('Ha',9,'Maroc'))
        studentStack.add(new Student('Kine',10,'ha Noi'))
        studentStack.each {
            println it
        }
        println 'lay ddi phan tu dau tien: '+studentStack.pop()
        studentStack.each {
            println it
        }

        println 'lay ra phan tu dau '+studentStack.peek()
        studentStack.each {
            println it
        }
      }
}
