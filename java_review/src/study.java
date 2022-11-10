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


    추상화 abstract :
    인스턴스 생성 불가
    미완성 이다.
    상속받아 구현 가능하다

    인터페이스 interface : 
    일반 메서드와 멤버변수 를 갖지 못한다. (추상 클래스는 가능)
    추상 메서드와 상수만을 가질 수 있다.
    인터페이스로 부터만 상속 가능
    인터페이스는 다중 상속이 가능
    implements 를 통해 구현
    


    Exception 예외처리 : 

    try{

    }catch (Exception e1 ){
    }catch (Exception e2 ){
    }catch (Exception e3 ){

    }
     다중 catch 가능  


     */
}
