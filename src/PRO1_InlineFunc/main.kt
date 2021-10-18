package PRO1_InlineFunc

fun helo1(name: () -> String): String{
    return "Hello ${name()}"
}

inline fun helo2(name: () -> String): String{
    return "Hello ${name()}"
}

inline fun helo3(first:() -> String, noinline last:() -> String): String{
    return "Hello ${first()} ${last()}"
}

fun main() {
    // INLINE FUNC
//    Saat kotlin di running/compile, maka dia akan menjadi javaclass/java binary code
//    High order func adalah fitur yang sangat populer, akan tetapi dapat mempengaruhi perfoma aplikasi saat berjalan
//    Dalam java tidak ada functional programming tetapi object oriented, itu sebabnya high order func dapat berdampak,
//    karna saat memanggil HO func dalam java, akan membuat object baru, sehingga aplikasi akan membuat object lambda
//    berulang ulang, akan terasa impact nya jika penggunaannya banyak.
//    Dalam kotlin, inlie func adlaah kemampuan merubah HO func menjadi inline func. Dimana code didalam HO func akan
//    diduplicate agar saat runtime, aplikasi tidak perlu membuat object lambda berulang
//    FUngsiny mirip seperti tail-recursive yang ketika di compile akan menjadi looping biasa, jadi saat lambda di compile
//    akan menjadi function biasa
    println(helo1 { "hase" })
    println(helo1 { "momy" })

//    buat liat beda nya ke tools -> kotlin -> show kotlin binary
    println(helo2 { "hase" })
    println(helo2 { "momy" })
//    sebutuhnya aja, krn kalo semua dijadikan inline, bytecode nya akan besar, karna menduplikat terus



    //NOINLINE
//    keywords untuk membuat sebuat parameter tetap menjadi lambda/anonym atau tidak merubahnya menjadi inline func
//    inline fun nama(first: () -> String, noinline last: () -> String){
//
//    } -> Local inline functions are not yet supported in inline functions

    println(helo3({"Edogawa"}, {"Conan"}))
}

//By Venonymous