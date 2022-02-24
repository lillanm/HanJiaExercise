package BD.lillanm._arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //目标：自定义数组的排序规则：Comparator比较器对象
        //1.Arrays的sort方法对于有值特性的数组是默认升序排序
        int[] ages = {34,12,42,23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //2.降序排序（自定义比较器对象，只能支持引用类型的排序）；
        Integer[] ages1 = {34,12,42,23};
        /*
        参数一：被排序的数组，必须是引用类型的元素
        参数二：匿名内部类对象，代表了一个比较器对象
         */
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则
                /*if (o1>o2){
                    return 1;
                }else if (o1<o2){
                    return -1;
                }
                return 0;//默认升序*/
                //return o1-o2;//默认升序
                return o2 - o1;//这样可以降序
            }
        });
        System.out.println(Arrays.toString(ages1));

        Student[] student  = new Student[3];
        student[0] = new Student("lillanm","男",666.6);
        student[1] = new Student("lili","男",100.5);
        student[2] = new Student("梁锦轩","男",749.5);
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScores(),o2.getScores());
            }
        });
        System.out.println(Arrays.toString(student));

    }
}
