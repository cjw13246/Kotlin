package com.example.androidlab


//초기화 미루기 lateinit 키워드
// lateinit 은 var(변수) 키워드에만 사용가능하며 Int, Long, Short,Double, Float ,Boolean , Byte 타입엔 사용 불가
//lateinit var data1 : Int // 오류!
//lateinit val data2 : String //오류!
//lateinit var data3 : String // 성공!


//초기화미루기 lazy
val data4: Int by lazy{
    println("in lazy")
    10
    20
}


fun main()
{
    println("cjw")
    println(data4)
    println(data4)
    fun sum(no: Int):Int {
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return sum
    }

    val name: String = """kk
        |an
        |g""".trimMargin()

    println("name : $name, sum: ${sum(10)}, plus : ${10 + 20}")
}