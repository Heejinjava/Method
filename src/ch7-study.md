# 챕터7에 대해서 정리해보자
1.상속
- 상위(부모, super)클래스에서 하위(자식, sub)클래스에 멤버를 상속시켜줘서 사용할 수 있게 하는 것이다.
- 상속은 extends라는 키워드로 지정할 수 있고, 하나의 클래스만 상속받을 수 있다(다중상속 불가)
- 하위클래스의 생성자에서 첫 줄에 반드시 상위클래스의 생성자를 호출해야 한다(super() 를 이용)
  호출하지 않으면 기본(default)생성자가 자동으로 호출된다
- 단계가 많아도 상속이 가능하며, 몇단계위의 메소드도 가져다 쓸 수 있다
- private 으로 선언된 멤버도 상속은 이루어 진다(단, 접근은 다른 방식(메소드등)을 통해서 해야 한다)
- 자바의 모든 클래스는 Object클래스를 상속받아서 사용된다

2.접근제어자

클래스, 메소드, 변수 등의 멤버에 관련된 값과 기능에 접근 할 수 있는 권한을 지시하는 명령어

private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다

                      같은 클래스        동일 패키지          상속 클래스          기타 영역

      private	        O            	 X                    X                 X
      
      default               O                O                    X                 X    
      
      protected             O                O                    O                 X
      
      public                O                O                    O                 O

- 하나의 파일에 여러 개의 클래스를 정의할 경우 public으로 지정되는 클래스가 파일의 이름이 된다.
- 하나의 파일에 여러 개의 클래스를 정의할 경우 public으로 지정되는 클래스는 하나만 가능하다.

private

접근제어자가 private으로 설정되었다면 private 이 붙은 변수, 메소드는 해당 클래스에서만 접근이 가능하다.

default

접근제어자를 별도로 설정하지 않는다면 접근제어자가 없는 변수, 메소드는 default 접근제어자가 되어 해당 패키지 내에서만 접근이 가능하다.

protected

접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능하다.

public

접근제어자가 public으로 설정되었다면 public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.

3.다형성

하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미한다.

자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있다.

- 참조 변수의 다형성

자바에서는 다형성을 위해 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하고 있다.

이때 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 같거나 적어야 참조할 수 있다.

      class Parent { ... }
      
      class Child extends Parent { ... }
      
      ...
      
      Parent pa = new Parent(); // 허용
      
      Child ch = new Child();   // 허용
      
      Parent pc = new Child();  // 허용
      
      Child cp = new Parent();  // 오류 발생.

참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수와 같다.

그리고 부모 클래스 타입의 참조 변수로도 자식 클래스 타입의 인스턴스를 참조할 수 있다.

참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 적기 때문이다.

하지만 반대의 경우인 자식 클래스 타입의 참조 변수로는 부모 클래스 타입의 인스턴스를 참조할 수 없다.

참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 많기 때문이다.

- 참조 변수의 타입 변환

 문법 - (변환할타입의클래스이름) 변환할참조변수

1. 서로 상속 관계에 있는 클래스 사이에만 타입 변환을 할 수 있다.


2. 자식 클래스 타입에서 부모 클래스 타입으로의 타입 변환은 생략할 수 있다.


3. 하지만 부모 클래스 타입에서 자식 클래스 타입으로의 타입 변환은 반드시 명시해야 한다.

        class Parent { ... }
        
        class Child extends Parent { ... }
        
        class Brother extends Parent { ... }
        
        ...
        
        Parent pa01 = null;
        
        Child ch = new Child();
        
        Parent pa02 = new Parent();
        
        Brother br = null;
        
        pa01 = ch;          // pa01 = (Parent)ch; 와 같으며, 타입 변환을 생략할 수 있음.
        
        br = (Brother)pa02; // 타입 변환을 생략할 수 없음.
        
        br = (Brother)ch;   // 직접적인 상속 관계가 아니므로, 오류 발생.

- instanceof 연산자

문법 - 참조변수 instanceof 클래스이름

이러한 다형성으로 인해 런타임에 참조 변수가 실제로 참조하고 있는 인스턴스의 타입을 확인할 필요성이 생긴다.

자바에서는 instanceof 연산자를 제공하여, 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 확인할 수 있도록 해준다.

    class Parent { }
    
    class Child extends Parent { }
    
    class Brother extends Parent { }
    
    
    
    public class Polymorphism01 {
    
        public static void main(String[] args) {
    
            Parent p = new Parent();
    
            System.out.println(p instanceof Object); // true
    
            System.out.println(p instanceof Parent); // true
    
            System.out.println(p instanceof Child);  // false
    
            System.out.println();
    
     
    
            Parent c = new Child();
    
            System.out.println(c instanceof Object); // true
    
            System.out.println(c instanceof Parent); // true
    
            System.out.println(c instanceof Child);  // true
    
        }
    
    }


 