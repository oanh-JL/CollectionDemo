package collections.ListInterface

import collections.MapDemo

class ArrayListCollection {
    static ArrayList<Student> STUDENTS = new ArrayList<>()

    public static void main(String[] args) {
        STUDENTS.add(new Student('Oanh', 9, 'Hung Yen'))
        STUDENTS.add(new Student('Kien', 7, 'Hung Yen'))
        STUDENTS.add(new Student('Trang', 9, 'Hai Duong'))
        STUDENTS.add(new Student('Ly', 9, 'Hai Duong'))
        STUDENTS.add(new Student('Ha', 9, 'Ha Noi'))
        STUDENTS.collect({
            student -> println student.getName() + "\t" + Math.floor(student.getDiem() * 0.4) + "\t" + student.getProvince()
        })
        Map<String, Student> studentGroupBy = STUDENTS.groupBy {
            it.province
        }
        studentGroupBy.each {
            it -> println it.key + '\t' + it.value.toString()
        }
        ArrayList<Student> findAllStudentByOrder = STUDENTS.findAll {
            it -> (it.province == 'Hung Yen')
        }
        findAllStudentByOrder.each {
            it -> println it
        }
        LinkedList<Student> studentLinkedList = STUDENTS.sort{
            it-> it.diem
        }
        studentLinkedList.each {
            println it
        }
        float Tong = STUDENTS.sum {
            it.diem
        }
        println 'Tong diem la: ' + Tong

        String newObject = 'ToukaChan 9 Tokyo'
        ArrayList<String> splitString = newObject.split(' ')
        Student newStudent = new Student(splitString[0], Float.parseFloat(splitString[1]), splitString[2])
        println newStudent
        STUDENTS.add(newStudent)

        LinkedHashMap<String, Float> studentCollectEntry = STUDENTS.collectEntries {
            [(it.name): it.diem]
        }
        studentCollectEntry.each {
            it-> println it
        }
    }
}
