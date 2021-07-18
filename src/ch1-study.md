# 챕터1에 대해서 정리해보자
1.자바란?

자바는 객체 지향 언어로써 객체란 데이터의 분산을 막기 위해서 데이터와 기능을 하나로 묶은 그룹
프로그램을 다수의 "객체"로 만들고, 이들이 서로 상호작용을 통해 만들어지는 방식이다.
에러가 나더라도 해당 객체만  점검하면 간단하게 해결할 수 있음. 그렇기 때문에 유지보수도 쉽고 편함.
하나하나의 독립된 "객체"들의 그룹으로 생각하면 되고, 객체간의 메시지를 주고 받음으로서 쉽게 연결이 가능함

2.JVM이란?

1)Java Virtual Machine 은 자바를 실행하기 위한 자바 가상머신이다. 자바와 운영체제 사이에서 중계자 역할을 하며, 자바가 운영체제 종류에 영향을 받지 않고 실행 가능하도록 한다.

2)운영체제 위에서 동작하는 프로세스로 자바 코드를 컴파일 해서 얻은 바이트 코드를 해당 운영체제가 이해할 수 있는 기계어로 바꿔실행 시켜주는 역할을 한다.

3)GC(Garbase Collection)을 이용하여 자동으로 메모리 관리를 해준다.

3.컴파일 하는 방법

1)컴파일
- java 파일로 작성된 코드를 .class 파일(바이트코드)로 만드는 것
- JDK(Java Development Kit)에 포함된 Java Complier(javac)를 통해 컴파일.

2)상위버전으로 컴파일된 .class파일은 하위버전의 java 명령으로 실행되지 않는다.

4.JVM의 구성요소

1)class loader
runtime 시점에 클래스를 로딩하게 해주며 클래스의 인스턴스를 생성하면 클래스 로더를 통해 메모리에 로드하게 된다.

2)runtime data areas
Jvm이 프로그램을 수행하기 위해 os로 부터 별도로 할당 받은 메모리 공간을 말하며, runtime data areas는 크게 5가지 영역으로 나눌 수 있다.

3)execution engine
load된 class의 bytecode를 실행하는 runtime module이 바로 execution engine이다. class loader를 통해 jvm 내의 runtime data areas에 배치된 바이트 코드는 execution engine에 의해 실행된다.

4)Garbage Collector
Garbage Collector(GC)는 Heap 메모리 영역에 생성된 객체들 중에 참조되지 않은 객체들을 제거하는 역할을 한다. GC의 동작시간은 일정하게 정해져 있지 않기 때문에 언제 객체를 정리할지는 알 수 없다. 즉 바로 참조가 없어지자마자 작동하는 것이 아니라는 것이다. 또한 GC를 수행하는 동안 GC Thread를 제외한 다른 모든 Thread는 일시정지상태가 된다.

특히, Full GC가 일어나는 수초간 모든 Thread가 정지한다면 심각한 장애로 이어질 수 있다.

최초 JVM이 나왔을때 Interpreter(한 줄씩 해석하고 실행) 이였기 때문에 속도가 느리다는 단점이 있었지만 JIT compiler (just in time) 방식을 통해 이 점을 보완해왔다. JIT는 bytecode를 어셈블러 같은 nativecode로 바꿔서 실행이 빠르지만 역시 변환하는데 비용이 발생한다. 이 같은 이유 때문에 jvm은 모든 코드를 jit compiler 방식으로 실행하지 않고 interpreter 방식을 사용하다 일정 기준이 넘어가면 jit compiler 방식으로 실행한다.