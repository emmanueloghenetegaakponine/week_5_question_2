fun editVowels(s:String): String {
    val re = StringBuilder()
    for(c in s) {
        if (c != 'A' && C != 'a'
            && c != 'E' && c != 'e'
            && c != 'I' && c != 'i'
            && c != 'O' && c != 'o'
            && c != 'U' && c != 'u'){
            re.append(c)
        }

    }

    return re.tostring()
}

fun main(){
    println(removeVowels(s: "Kotlin Programming Language"))
}