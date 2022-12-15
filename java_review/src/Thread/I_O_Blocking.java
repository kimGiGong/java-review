package Thread;

import javax.swing.JOptionPane;

class I_O_Blocking{

    protected static class TimeCount extends Thread{
        public void run(){
            for(int i=10 ; i>0 ; i-- ){
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (Exception e) { }
                
            }
        }
    }   //  extend Thread class

    public static void main(String[] args) {
        TimeCount TC = new TimeCount();
        TC.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력한 값은 "+input+"이다");
    }



    //  멀티쓰레드(듀얼) 카운트 다운이 시작되면서 도중에 입력값을 기다린다.

    // 쓰레드 우선순위

    /*
    
    리턴타입 void 메서드 setPriority(int newPriority)  쓰레드 우선순위 지정
    리턴타입 int  메서드 getPriority()                 쓰레드 우선순위 반환

    우선순위 1 ~ 10

     */
}
