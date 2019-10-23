package com.example.calculadora

class engine{
    fun suma(a:Int,b:Int): Int {
        return a.plus(b)
    }
    fun resta(a:Int,b:Int):Int{
        return a.minus(b)
    }
    fun div(a: Int,b: Int):Int{
        return a.div(b)
    }
    fun multi(a: Int,b: Int):Int{
        println("a:$a times b:$b")
        return a.times(b)
    }
    fun percent(a:Int):Int{
        return a.div(100)
    }
    fun action(selec:String,a:Int,b:Int):Int{
        var result = 0
        when (selec){
            "+" -> result = suma(a,b)
            "-" -> result = resta(a,b)
            "x" -> result = multi(a,b)
            "/" -> result = div(a,b)
            "%" -> result = percent(a)
            ""  -> result = b
        }
        return result
    }
}