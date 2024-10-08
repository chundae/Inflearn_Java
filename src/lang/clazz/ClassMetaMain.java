package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) {

        Class clazz = String.class; // 1. 클래스에서 조회
//        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
//        Class clazz3 = Class.forName("java.lang.String"); // 3. 문자열에서 조회

        //모든 필드 출력 getDeclaredFields
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //모든 메서드 출력 getDeclaredMethods
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스 출력 getSupperClass
        System.out.println("Supper class = " + clazz.getSuperclass().getName());

        //인터페이스 정보 getInterface
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("i = " + i.getName());
        }
    }
}
