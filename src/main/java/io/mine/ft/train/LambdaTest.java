package io.mine.ft.train;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.mine.ft.train.bean.Student;

//https://www.cnblogs.com/linlinismine/p/9283532.html
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<Student>> studentsMap = new HashMap<>();
		
		Set<Student> students = new HashSet<>();
//        for(Student student : students){
//            List<Student> studentList = studentsMap.getOrDefault(student.getSex(), new ArrayList<>());
//            studentList.add(student);
//            studentsMap.put(student.getSex(),studentList);
//        }
		//@FunctionalInterface标注了这是一个函数式接口
		IntBinaryOperator binaryOperator = (int a, int b) -> {
		    return a + b;
		};
		
		int result = binaryOperator.applyAsInt(1, 2);
		System.out.println("result = " + result); //(int a) -> {return a * a;} //求平方
		
		
		Stream<Student> stream = students.stream();
		
		Map<String,List<Student>> studentsMap2 = students.stream().collect(Collectors.groupingBy(Student::getSex));

	}

}
