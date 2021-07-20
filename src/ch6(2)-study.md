# 챕터6에 대해서 정리해보자
1.클래스와 객체
클래스는 객체 모양을 선언한 틀이고, 객체는 클래스의 모양대로 생성된 실체이다.

객체는 인스턴스(Instance)라고도 한다. 객체들은 클래스에 선언된 동일한 속성을 가지지만, 객체마다 서로 다른 고유한 값으로 구분된다. 

2.클래스 구성

        //접근 권한 클래스 선언  클래스이름
        public       int       radus;     //원의 반지름 필드  /* 필드(변수)
        public String name;   //원의 이름 필드                            */
        
        public Circle(){    //원의 생성자 메소드            /*
        }
        public double getArea(){    //원의 면적 계산 메소드       메소드
            return 3.14*radius*radius;
         }                                                              */
        }
class 키워드로 클래스를 선언하며, 앞에 접근 지시자를 넣어서 다른 클래스들에서 이 클래스에 접근이 가능한지를 넣어줄 수 있다.

필드 = 변수

메소드 = 함수

필드나 메소드에도 접근 지시자를 넣어줄 수 있다. 따라서 이 클래스에 접근이 가능하더라도, 특정 메소드나 필드는 접근할 수 없게 할 수 있다.

3.객체 생성 방법

객체 생성 방법

반드시 new 키워드를 이용하여 생성한다. (new 키워드는 객체의 생성자를 호출합니다.)

객체에 대한 레퍼런스 변수를 선언하고, 객체를 생성할 수 있다. 객체를 생성하면, 클래스 타입의 크기가 메모리에 할당이 되고, 객체 내 생성자가 실행된다.

객체를 생성하고 . 연산자(객체 레퍼런스 멤버)를 통해 객체에 접근할 수 있다.

4.메소드

- main()메소드는 하나의 프로그램에 보통 하나만 존재한다
프로그램의 시작과 끝을 담당하는 메소드이다.
JVM에서 main()메소드를 호출한다.

- 프로그램이 가지는 여러 가지 기능을 구현해 놓은 것이다.

- 종류 : 리턴값이 있는 메소드와 없는 메소드

- 장점: 한 번의 메소드 정의로 여러 번 호출하여 사용할 수 있다

접근제어지시자 리턴형태 메소드명(인수들){

메소드에서 할 일;

}

 - 접근제어지시자: 해당 메소드에 접근할 수 있는 권한에 대한 명령어
ex) public, protected, 없음, private이 존재
   

- 리턴형태: 메소드에 리턴값이 있는 지 여부와 있을 경우 값의 데이터 타입을 지정한다
리턴형태를 입력하면 반드시 메소드에서 어떤 값이든 리턴해야 한다.
ex) void(리턴 값 없음), int, double, short, byte, char, boolean, String, ...
  

- 메소드명:변수명과 동일한 방식으로 지정한다
ex) 리턴 값이 있는 경우 : get~, 변수에 값을 지정하는 경우 : set~, 리턴값이 boolean일 때 : is~, 초기화 할 때 :init~
  

- 인수: parameter, arguments, 인수 등으로 불리우며, 메소드에서 작업할 때 필요한 값을 받아오는 역할
경우에 따라서는 없을 수도 있다 (단 없더라도 괄호는 입력해야 함)
인수가 여러 개면 각각에 데이터타입을 따로 입력해줘야 한다
  

 - main메소드가 있는 클래스에서의 메소드는 전부 static으로 선언해야 한다


- return 키워드
return 값: 특정 값을 리턴한다 (리턴값이 있는 메소드에서 필수 사용)
return : 현재 메소드에서 강제 종료(리턴값이 없는 메소드에서 사용 가능)


인스턴스 메소드에서 static변수로 접근 가능
static메소드에서 인스턴스변수로 접근 불가능
- static메소드는 static변수를 제외하고 다른 변수는 건드리지 못한다.


- 일반변수의 값을 접근하지 않는 경우에 static으로 선언한다.

5.오버로딩 

 - 같은 클래스내에 같은 이름의 메소드를 다시 선언할 수 있는 기능이다.

 - 매개변수의 데이터타입이나 개수를 통해 구분할 수 있어야 한다.
    메소드 호출시 구분이 되어야 하며, 리턴타입으로는 구분 안된다.

6.오버라이딩

 - 상위 클래스의 메소드를 하위 클래스에서 재정의한다.

 - 하위 클래스에서 상위 클래스의 메소드를 호출시 super.메소드명()으로 호출한다.

 - 하위 클래스의 인스턴스에서는 상위 클래스의 메소드를 호출 할 수 없다.

7.오버로딩 오버라이딩 차이점

오버로딩은 매게변수나 타입이 달라야하지만 오버라이딩은 동일해야하며

오버로딩은 리턴 타입이 무엇이든 상관없으나 오버라이딩은 동일해야 한다.

8.생성자

 - 클래스를 이용하여 인스턴스를 생성할 때 호출되는 메소드이다. 
   호출되는 시기는 인스턴스 생성시에만 호출 되며,일반적인 상황에서는 호출 불가하다.
인스턴스 생성시 한 번만 실행된다.

 - 모든 클래스는 반드시 하나 이상의 생성자를 보유하고 있어야 한다.
생성자가 없으면 자동으로 자바 컴파일러가 생성자를 만든다.

 - 생성자 이름은  반드시 클래스 이름과 동일하게 지어야 한다.

 - 생성자도 일종의 메소드이지만, 리턴타입은 없다.

 - 일반적인 상황에서는 호출이 불가하며, 다른 생성자에서만 호출 가능하다.

 - 다른 메소드들에 비해 가장 먼저 실행되므로 보통  변수값의 초기화에 사용 된다.




 