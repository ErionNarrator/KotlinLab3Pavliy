package bills

class bill{
    fun sam()
    {
        println("Введите кол купюр наменалом 1")
        val n = readln().toInt()
        println("Введите кол купюр наменалом 2")
        val a = readln().toInt()
        println("Введите кол купюр наменалом 5")
        val b = readln().toInt()
        println("Введите кол купюр наменалом 10")
        val c = readln().toInt()
        val sum = (n*1+a*2+b*5+c*10)
        println("Сумма купюр: $sum")
    }
}

class evro {
    fun rub() {
        println("Введите количество рублей которые хотите конвертировать в евро ")
        val r = readln().toDouble()
        val e = r/104.74
        println("Кол евро: $e")
    }
}

class task3 {
    fun pc() {
        println("Назовите свой процессор")
        val n = readln()
        println("Введите тактовая частота процессора (МГц)")
        val a = readln().toDouble()
        println("Введите - объем оперативной памяти")
        val b = readln().toDouble()
        val q = (0.1*a) + b
        println("Качество: $q вашего: $n")
        println("Введите объем винчестера")
        val p = readln().toInt()
        val qr = q + 0.5*p
        println("Качество: $qr")
    }

}


