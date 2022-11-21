public class CollectionsFramework {

    /*

    Collection :
    Collection 은 인터페이스
    Collections 는 클래스

    3개의 분류

    List: ArrayList , LinkedList , Stack , Vector
    중복허용 , 저장순서 유지

    Set : HashSet , TreeSet
    중복 불가 , 저장순서 없음

    Map : HashMap , TreeMap , Hashtable , Properties
    하나의 쌍으로 묶어서 저장
    키 : 중복불가 , 값 : 중복가능

     */



     /*
    ArrayList :
    중간에 추가와 삭제를 하면 값을 하나씩 올리거나 내려 덮어쓰기작업을 통해 수정해야 해서 작업시간이 오래걸린다 
    읽기 속도는 빠르다
     */

     /*
    LinkedList :
    크기를 변경할 수 없고 
    비순차적 데이터의 추가 삭제에 시간이 많이 걸린다.(중간데이터 추가삭제 어려움)
    읽기 속도 느림
    추가 삭제가 빠르다
     */

    /*
    Stack : 
    LIFO(Last In First Out) undo-redo , 수식계산 , 웹브라우저 뒤로/앞으로 등에 쓰임

    Queue : 
    Last In Last Out
    최근 사용문서, 버퍼 , 인쇄작업 대기 목록 등에 쓰임
     */

     // Arrays 클래스 :
     // 2차원 배열 toString은 deepToString(arr) 을 통해 가능하다 (3차원 배열도 가능)


    /*
    Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
    Comparable : 기본 정렬기준을 구현하는데 사용
    */


    /*
    HashSet : 해쉬셋!
    중복불가 , 중복요소시 저장하지 않고 false 반환 
    저장순서 없음
     */


    /*
    Collections 클래스 :

    메서드 : 
    동기화 컬렉션 : List syncList = Collections.synchronizedList(new ArrayList(...));
    변경불가 컬렉션 : 'unmodififiable'를 붙여 주면된다 unmodififiableList(List list)
    싱글톤 컬렉션 : 'singleton'을 붙여 주면된다 singletonList(Object obj)
    종류제한 단일 컬렉션 : 'checked'를 붙여주고 Class type을 지정해주면 된다 checkedList(List list, Class type) 
    종류 제한은 지네릭스 타입이 있으므로 제넥릭스를 사용하면된다.

     */

    /*
    Generics : 
    와일드 카드 
    extends 와 super를 이용해 제네릭스 타입에 다형성을 적용할수 있다.
    <? extends T> 와일드카드의 상한 제한 T와 그 자손들만 사용가능 (상속받은 클래스 사용가능)
    <? super T>   와일드카드의 하한 제한 T와 그 조상들만 사용가능 (T클래스의 조상클래스만 사용가능)
    <?>         제한 없음. 모든타입 <? extends Object> 와 동일
    
     */

    public static void main(String[] args) {
        
    }


}