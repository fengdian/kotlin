package com.wxf.grammer
//�����Ķ���
fun sum(a :Int,b:Int):Int{
	return a+b
}
fun sub(a:Int,b:Int)=a-b
//if ���
fun max(a:Int,b:Int):Int{
	if(a>b){
		return a
	}else{
		return b
	}
}
fun min(a:Int,b:Int):Int =if(a>b) b else a
//when���
fun prasize(obj:String):String =
		when(obj){
			"wxf" -> "��Т��"
			else  -> "���Ǳ���"
					
		}
fun main(args: Array<String>) {
	//��������
	println("a+b="+sum(45,89))
	println("a-b="+sub(78,28))
	//������ʼ��
	var x = 5//�Զ���ʼ��
	var a:Int = 12//������ʼ��
	var b:Int  //δ��ʼ����Ҫ��������
	println("a=$a\tx=$x")
	//�ַ���
  // ʹ�ñ�������Ϊģ��:
	  val s1 = "a is $a"
	  println(s1)
	  a = 2
	  // ʹ�ñ��ʽ��Ϊģ��:
	  val s2 = "${s1.replace("is", "was")}, but now is $a"
	  println(s2)
	//if���
	println("6��9���ֵ${max(6,9)}")
	println("6��9���ֵ${min(6,9)}")
	//for ѭ��
	var items = listOf("a","b","c")
	for(item in items){
		print(item)
		print("\t")
	}
	for(index in items.indices){
		print(items[index])
		print("\t")
	}
	//whileѭ��
	var  index =0
	while(index<items.size){
		print(items[index])
		index++
	}
	println("")
	//when ���
	println(prasize("wxf"))
	println(prasize("����"))
		 x = 10
	  val y = 9
	  if (x in 1..y+1) {
	      println("fits in range")
	  }
	
	
	
}
