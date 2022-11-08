public class AnonymousClass {
    Object iv = new Object(){ 
        void method(){
            System.out.println("익명 클래스1");
        } 
    };

    static Object cv = new Object(){
        void method(){
            System.out.println("익명 클래스2");
        } 
    };
    
    void method (){
        Object iv = new Object(){ 
            void method(){
                System.out.println("익명 클래스1");
            } 
        };
    }

    public static void main(String[] args) {
        
    }
}
