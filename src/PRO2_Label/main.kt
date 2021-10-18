package PRO2_Label

fun main() {
    //LABEL
//    => penanda
//    loopI@ for (i in 0..10){
//        loopJ@ for (j in 0..10){
//            println("$i * $j = ${i * j}")
//        }
//    }

//    Kegunaan label => dapat diintegrasikan pada break, continue & return
//    dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti
    breaklabel()
    continuelabel()
    val returnlabel = returnlabel("bii") returnlable@{
        if (it == "") return@returnlable
        else println("Label $it")
    }
}

fun breaklabel(){
    loopI@ for (i in 0..10){
        loopJ@ for (j in 0..10){
            if (j == 5) break@loopI
            println("$i * $j = ${i * j}")
        }
    }
}

fun continuelabel(){
    loopI@ for (i in 0..10){
        loopJ@ for (j in 0..10){
            if (j == 5) continue@loopI
            println("$i * $j = ${i * j}")
        }
    }
}

fun returnlabel(label:String, operate:(String) -> Unit): Unit = operate(label)

//By Venonymous