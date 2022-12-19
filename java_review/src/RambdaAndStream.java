public class RambdaAndStream {

    /*
    
    람다식 작성방법

        // 익명 객체로서 인터페이스를 구현하는 형태로 사용한다.

        메서드에서 "이름 과 반환타입 제거" */
        int max  (int a, int b){
            return a > b ? a : b;
        }
        // --->  (int a, int b) -> { return a > b ? a : b ; }
        
        //메서드에서 {body} 부분을 문장에서 식으로 변경(식으로 변경시 ";" 세미콜른이 없어야한다) 
        // --->  (int a, int b) -> a > b ? a : b

        //  매개 변수가 한개 인 경우 괄호와 타입도 생략가능
        // ---> a -> a + a
               
        //  괄호 안에 문장이 return 일 경우 {} 중괄호 생략 불가능하다
        // ---> (int c , int d) -> { return c > d ? c:d; }

    
        
    
}