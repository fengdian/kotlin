package com.wxf.grammer
//函数的定义
fun sum(a :Int,b:Int):Int{
	return a+b
}
fun sub(a:Int,b:Int)=a-b
//if 语句
fun max(a:Int,b:Int):Int{
	if(a>b){
		return a
	}else{
		return b
	}
}
fun min(a:Int,b:Int):Int =if(a>b) b else a
//when语句
fun prasize(obj:String):String =
		when(obj){
			"wxf" -> "12"
			else  -> "不是本人"
					
		}
fun main(args: Array<String>) {
	//函数定义
	println("a+b="+sum(45,89))
	println("a-b="+sub(78,28))
	//变量初始化
	var x = 5//自动初始化
	var a:Int = 12//立即初始化
	var b:Int  //未初始化需要声明类型
	println("a=$a\tx=$x")
	//字符串
  // 使用变量名作为模板:
	  val s1 = "a is $a"
	  println(s1)
	  a = 2
	  // 使用表达式作为模板:
	  val s2 = "${s1.replace("is", "was")}, but now is $a"
	  println(s2)
	//if语句
	println("6和9最大值${max(6,9)}")
	println("6和9最大值${min(6,9)}")
	//for 循环
	var items = listOf("a","b","c")
	for(item in items){
		print(item)
		print("\t")
	}
	for(index in items.indices){
		print(items[index])
		print("\t")
	}
	//while循环
	var  index =0
	while(index<items.size){
		print(items[index])
		index++
	}
	println("")
	//when 语句
	println(prasize("wxf"))
	println(prasize("渣渣"))
		 x = 10
	  val y = 9
	  if (x in 1..y+1) {
	      println("fits in range")
	  }
	
	
	
}
