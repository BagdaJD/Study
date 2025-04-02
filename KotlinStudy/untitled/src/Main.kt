fun realSort(list: MutableList<Int>): MutableList<Int> {
    val list: MutableList<Int> = list
    for (i in 0..<list.size - 1) {
        for (j in 0..<list.size - i - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }

    return list
}


fun sort(collection: List<Int>): List<Int> {
    var list: MutableList<Int> = collection.toMutableList();
    //... = colleaction as MutableList;
    list = realSort(list)
    return list.toList()
}

fun sort(vararg numbers: Int): List<Int> {
    var list: MutableList<Int> = mutableListOf()
    for (num in numbers) {
        list.add(num)
    }
    list = realSort(list)
    return list.toList()
}

fun sort(array: Array<Int>): List<Int> {
    var list: MutableList<Int> = array.toMutableList()
    list = realSort(list)

    return list.toList()
}

fun sum(vararg numbers: Int): Int {
    var res = 0
    for (num in numbers) {
        res += num
    }
    return res
}
fun getVolumeParall(a : Int, b: Int = a, c : Int = a) = a * b * c
fun main() {
    val x: Int = readln().toInt()
    println(getVolumeParall(x))
    println(getVolumeParall(x, x))
    println(getVolumeParall(x, x, x))
}
