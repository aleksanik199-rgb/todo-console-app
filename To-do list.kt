package Project

fun main() {
    val taskList = mutableListOf<String>()

    while (true){
        println("1 - Добавить")
        println("2 - Показать")
        println("3 - Удалить")
        println("4 - Выход")

        val choice = readln().toInt()

        when(choice){
            1 -> {
                print("Введите задачу: ")
                val list = readln()
                taskList.add(list)
                println("Задача добавлена: $list")
            }
            2 -> {
                if(taskList.isEmpty()){
                    println("Список пуст")
                }else{
                    println("----Список дел----")
                    for (item in taskList){
                        println("Задача: $item")
                    }
                }
            }
            3 -> {
                for ((index, task) in taskList.withIndex()){
                    println("${index + 1}. $task")
                }
                if (taskList.isNotEmpty()){
                    print("Введите номер для удаления: ")
                    val number = readln().toInt()
                    if (number in 1..taskList.size) {
                        taskList.removeAt(number - 1)
                        println("Задача удалена")
                    }else {
                        println("Некорректный номер")
                    }
                }
            }
            4 -> break
            else -> {
                println("Ошибка ввода")
            }
        }
    }
}