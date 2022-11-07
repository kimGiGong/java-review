public class study {
    /*  자바의 특징 :

        객체지향 프로그래밍 언어 
        운영체제에 독립적이 가장 중요한 특징
        Garbage Collection 자동 메모리 관리
        네트워크와 분산처리를 지원
        멀티쓰레드 지원
        동적 로딩지원



        자바 서버쪽 프로그래밍 : 

        Servlet , JSP (Java Server Pages)



        JVM :

        Java App <--> JVM <--> OS <--> 하드웨어

        상수 == final 의 변수명
        리터럴 == 값 자체

        기본형 == 자료형 int double ...etc
        참조형 == 객체 type



        Class Math


    */



    // 이름 붙은 반복문 :
    public static void main(String[] args) {
        Loof : for(int i =0 ; i<10 ; i++){
            for(int j =0 ; j<10 ; j++){
                if(i==5){
                        break Loof;
                    }
                    System.out.println(i+""+j);
                }
            }
    }
    //
    //



    /*
    
    String Class :
    charAt(int index) == 해당 위치 char 반환
    length()
    substring(int from ,int to) == from ~ to 문자열 반환
    toCharArray() == Char 배열로 받기
    deeptoString == 다차원 배열 출력



    객체지향 언어 :

    코드 재사용성이 높다
    코드관리가 용이
    신뢰성이 높은 프로그래밍이 가능


    클래스 :

    static 변수 == class 변수  사용 ==> ClassName.ClassVariableName
    Constructor 
    생성자 안에서 자신의 다른 생성자를 호출할땐 this(int, int) 를 사용하여 호출해야한다.

     */




}
