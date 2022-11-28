public class ThreadClassStudy {
    /*
    쓰레드 구현 방법:
    1. Thread클래스 상속
    2. Runnable 인터페이스 구현 (상속X)일반적인 방법
    */
    
    
//  1. Thread클래스 상속
protected static class ThreadExtends extends Thread {
    @Override
    public void run(){ /* 작업내용 */ //  run() 를 오버라이딩
        for (int i=0 ; i<5 ; i++ ){
            System.out.print(getName());
            System.out.println(" THREAD > "+Thread.currentThread().getName());
        }
    } 
}
//  2. Runnable 인터페이스 구현

protected static class RunnableImplements implements Runnable{
    public void run(){/* 작업내용 */    // Runnable run() 구현
        for (int i=0 ; i<5 ; i++){
            //  Thread.currentThread() - 현재 실행중인 쓰레드를 반환
            System.out.println(Thread.currentThread().getName());
        }
    } 
}

//  메인 메서드
    public static void main(String[] args) {
        
        //  1. Thread클래스 상속
        ThreadExtends t_extends = new ThreadExtends();

        //  2. Runnable 인터페이스 구현
        Runnable r_impl = new RunnableImplements();
        Thread r_impl_thread = new Thread(r_impl);

        //  실행
        r_impl_thread.run();    // 단순 메서드 실행 싱글 쓰레드
        t_extends.run();
        r_impl_thread.start();  //  start() 로 해야 멀티 쓰레드 
        t_extends.start();



        
    }

}