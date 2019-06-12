package collections.MapInterface

class TreeMapCollection {

    public static void main(String[] args) {
        SortedMap<String, String> studentTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            int compare(String s1, String s2) {
                return s2.compareTo(s1)
            }
        })

        studentTreeMap.put('Oanh', 'Hung Yen')
        studentTreeMap.put('Ly', 'Hai Duong')
        studentTreeMap.put('Trang', 'Hai Duong')
        studentTreeMap.put('He', 'ha Noi')
        studentTreeMap.put('Dung', 'Hai Phòng')
        studentTreeMap.put('Duy', 'bac can')
        println studentTreeMap

        Map.Entry<String,String> entryLower = studentTreeMap.lowerEntry('Alan')
        println 'get element have key after Balan ' +entryLower
        Map.Entry<String,String> entryHigher = studentTreeMap.higherEntry('PoPo')
        println 'get Element have key higher PoPo '+ entryHigher
        Map.Entry<String, String> firstEntry = studentTreeMap.pollFirstEntry()
        println 'removed first element' + firstEntry

        Map.Entry<String, String> lastEntry = studentTreeMap.pollLastEntry()
        println 'removed last element' +lastEntry
        



    }
}
