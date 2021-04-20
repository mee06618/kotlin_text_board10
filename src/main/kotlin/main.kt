fun main(){
    var num:ArrayList<String> = readLine()!!.split(" ").map{it.toString()} as ArrayList<String>
    var count=0
    while(count<10 ) {

        for (i in 0 until num.size - count - 1) {
            if (num[i] > num[i + 1]) {
                var temp = num[i + 1]
                num[i + 1] = num[i]
                num[i] = temp

            }


        }
        count++
    }


    println(num)
    num.reverse()
    println(num)
}