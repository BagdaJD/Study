```
@main def hello() = println("Hello, World!")
--------------
@main def hello(): Unit = println("Hello, World!")

В этом коде hello - это метод. 
Он определяется с помощью def и объявляется в качестве основного метода с помощью аннотации @main. 
Он выводит строку “Hello, World!” на стандартный вывод (STDOUT) с помощью метода `println`
```
Скомпилировать программу можно через 
`scalac hello.scala` - аналог javac
`scala hello` - запуск метода

//Нельзя называть главные метод(с аннотацией main), также как и object ,  @main
### Ввод
Будем использовать метод `readLine` из объекта **_scala.io.StdIn_**. Чтобы использовать этот метод, вам нужно сначала его импортировать, например:
```
object Main{
	import scala.io.StdIn.readLine 
	@main def helloInteractive() =  println("Please enter your name:") 
	val name = readLine() 
	println("Hello, " + name + "!")
}
//x.toInt - перевод в Int
//x.toDouble -

//print, println - вывод
```
//Импорт можно вставить либо до программы(класса, объекта)
### REPL
**Scala REPL (“Read-Evaluate-Print-Loop”)** - это интерпретатор командной строки, который используется в качестве “игровой площадки” для тестирования Scala кода. Для того чтобы запустить сеанс **REPL**, надо выполнить команду `scala` или `scala3` в зависимости от операционной системы, затем будет выведено приглашение “Welcome”, подобное этому:
```
$ scala Welcome to Scala 3.5.1 (1.8.0_322, Java OpenJDK 64-Bit Server VM). Type in expressions for evaluation. Or try :help. scala> _
-----------------

```
**REPL** — это интерпретатор командной строки, поэтому он ждет, пока вы что-нибудь наберете. Теперь можно вводить выражения Scala, чтобы увидеть, как они работают:
```
scala> 1 + 1 
val res0: Int = 2 
------------
scala> 2 + 2 
val res1: Int = 4
```
**Импортирование:**
```
import scala.math.pow - только pow
------
import scala.math.* - сразу все 

var a = pow(2, 2)
var r = math.cos()
```
**Мат.пакет** - *==**scala.math**==*