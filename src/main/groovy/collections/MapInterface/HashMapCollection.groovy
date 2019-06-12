package collections.MapInterface

import collections.ListInterface.Student

class HashMapCollection {
    static HashMap<Integer, Student> studentHashMap = new HashMap<>()


    public static void main(String[] args) {

        studentHashMap.put(4, new Student('An', 7, 'Hung Yen'))
        studentHashMap.put(5, new Student('Bin', 8, 'Hung Yen'))
        studentHashMap.put(7, new Student('Bin', 8, 'Hung Yen'))
        studentHashMap.put(1, new Student('Oanh', 9, 'Hung Yen'))
        studentHashMap.put(2, new Student('Trang', 5, 'Hai Duong'))
        studentHashMap.put(3, new Student('Ly', 6, 'Hai Duong'))


        Set<Map.Entry<Integer,Student>> studentEntry = studentHashMap.entrySet()
        studentEntry.each {
            println it.value
        }

        studentHashMap.collect{
            it -> println it.value.name+'\t'+ Math.round(it.value.diem*0.4*100)/100 +'\t'+ it.value.province
        }
        Map<String, Student> studentGroupBy = studentHashMap.groupBy {
            it -> it.value.province
        }
        studentGroupBy.each {
            it -> println it
        }
        HashMap<Integer, Student> listGoodStudent = studentHashMap.findAll {
            it -> Math.round(it.value.diem * 0.4*100)/100 > 3.2
        }
        println listGoodStudent
        List<Student> listStudentValue =new ArrayList<Student>(studentHashMap.values())
        println ' danh sach student parse map to list '+listStudentValue

        HashMap<Integer, String> hashMap = new HashMap<>()

        hashMap.put(4, "four")
        hashMap.put(5, "Five")
        hashMap.put(1, "One")
        hashMap.put(0, "Zero")
        hashMap.put(2, "Two")
        Integer keyHash = 2
        if(hashMap.containsKey(keyHash)) {
            String valueHash = hashMap.get(keyHash)
            println 'value cua '+keyHash+' la: '+valueHash
        }


    }
}
