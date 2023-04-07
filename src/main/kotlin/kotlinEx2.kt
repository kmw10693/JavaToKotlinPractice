fun main() {

    /* SAFE CALL 함수
    null이 들어갈수 있는 변수에 대해서는 .을 바로 쓸수가 없다.
    null이 아니면 뒤에 것을 실행하되, null이면 null 출력
    */
    val str: String? = "ABC"
    println(str?.length)

    /*
    Elvis 연산자
    전체 식 결과가 null이면 0을 출력한다.
    */
    val str2: String? = null
    println(str2?.length ?: 0)
}

/*
    특정 문자 여부를 판별하는 3개의 함수
    str은 null이 가능하므로, ?를 써준다.
*/
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

// startsWithA1을 Safe Call 적용한 함수
fun startsWithA1S(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null){
        return null
    }
    return str.startsWith("A")
}


// startsWithA2을 Safe Call 적용한 함수
fun startsWithA2S(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

// startsWithA3을 Safe Call 적용한 함수
fun startsWithA3S(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// nullable 한 필드지만, 무조건 null이 아닐때 처리 방법
fun startsWithNotNull(str: String?): Boolean {
    return str!!.startsWith("A")
}
