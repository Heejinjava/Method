# 챕터4에 대해서 정리해보자
1.조건문

1)단순 if문

if문은 조건식을 만족하면 if문 안에 있는 작업을 수행할 수 있도록 해준다.

    구조는
    
    if(조건식) {
    
        ~ 작업 내용~
    
    }

입니다.

if문을 통해 특정 이벤트를 발생시킬 수 있다.

다음은 2의 배수일 때 2의 배수라고 출력시켜주는 프로그램이다.

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("정수를 입력해주세요 : ");

      int num = sc.nextInt();

      if(num % 2 == 0) {

      System.out.println("입력하신 숫자는 2의 배수입니다.");

       }

    }

2)else문

if문의 조건식에 맞지 않다면, 다른 작업을 할 수 있게 해주는 else 문이다.

else문은 혼자서 사용할 수 없고, else 문이 전에 if 문이 존재해야 사용할 수 있다.

구조는

    else {
    
        ~ 작업 내용 ~
    
    }

이다.

다음은 if 문의 예제에서 else문을 추가한 프로그램이다.

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력해주세요 : ");
      int num = sc.nextInt();
      if(num % 2 == 0) {
      System.out.println("입력하신 숫자는 2의 배수입니다.");
      }
      else {
      System.out.println("입력하신 숫자는 2의 배수가 아닙니다.");
      }
    }

3)else-if 문

if 문과 else문만 사용하면, 최대 2가지 선택지밖에 만들 수가 없다. 

따라서 else-if 문을 이용한다면, 더 세부적으로 많이 조건을 만들 수 있다.

else-if 문은 반드시 if 문과 else 문 사이에  존재해야한다.

    else if(조건식) {
    
        ~ 작업 내용 ~
    
    }

다음은 위의 예제에서 else-if 문을 추가한 예제이다.

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력해주세요 : ");
      int num = sc.nextInt();
      if(num % 2 == 0) {
      System.out.println("입력하신 숫자는 2의 배수입니다.");
      }
      else if(num % 3 == 0) {
      System.out.println("입력하신 숫자는 3의 배수입니다.");
      }
      else {
      System.out.println("입력하신 숫자는 2의 배수가 아닙니다.");
      }
    }

핵심은 if 문, else if문, else 문 중 무조건 1개의 조건만 실행된다는 점이다.

4)switch문

조건이 까다로워서 else-if 문을 많이 사용하게 된다면, 코드가 가독성이 떨어질수 있고 유지보수가 힘들다.

이렇게 많은 else-if 문을 사용하기 보다는, switch 문을 이용하면 더 깔끔하게 코드를 짤 수 있다.

    switch(식) {
    
        case 값:
    
            ~ 작업 내용 ~
    
    defalut:
    
            ~ 작업 내용 ~
    
    }
switch 문은 case는 여러개 줄 수 있습니다. 이것들이 조건이라고 할 수 있다.

switch의 식에는 어떠한 값들이 들어가고, 그 값과 case값을 비교해서 똑같은 곳의 작업 내용을 수행한다.

default 는 식의 값이 case 의 값과 일치하는 것이 없을 때 수행되는 곳으로 else와 비슷한 역할을 한다고 보면 된다.

다음은 성적을 판별해주는 프로그램입니다.

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("점수를 입력해주세요 : ");
      int num = sc.nextInt();
      switch(num / 10) {
      case 10:
      System.out.println("A");
      break;
      case 9:
      System.out.println("B");
      case 8:
      case 7:
      System.out.println("C");
      break;
      case 6:
      case 5:
      System.out.println("D");
      break;
      case 4:
      case 3:
      case 2:
      case 1:
      System.out.println("E");
      break;
      default:
      System.out.println("F");
      break;
      }
    }

중간 중간 작업 내용에 break; 라는 분기문이 있는데, 

이는 반복문을 종료시켜주는 분기문으로, switch 문을 빠져나가는데 사용된다.

break가 없을 때는 break 전까지의 case들을 모두 실행한다.

break가 있을 때는 switch 문을 빠져나가게 된다.

2. 반복문

1)for문

정해진 횟수 안에서 반복을 진행한다. 

반복 횟수가 정해졌을 때 많이 사용하는 반복문이다.

for문의 기본적인 구조는 다음과 같다.

    for(초기문; 조건식; 반복 후 작업) {
    
        ~작업 내용~
    
    }

보통 초기문에서 변수 초기화가 진행되고,

조건식에서 언제까지 반복할지, 조건식으로 횟수를 정해주고,

반복 후 작업에서는 초기문에서 조건식까지의 만족을 조절해준다.

반복문은 배열이라는 개념에서 많이 사용된다. 

배열의 원소를 참조할 때, 반복문이 유용하다.

다음은 for 문을 통해 초기식~조건식까지의 값들을 출력해주는 프로그램이다.

보통 초기식에서는 변수의 선언과 초기화가 같이 이루어지고,

조건식에서 언제까지 반복할지 정해주고,

한 번의 반복 작업이 끝나고는 변수의 증가 또는 감소를 통해 조건식까지 반복을 하도록 설정한다.

    public static void main(String[] args) {		
      for(int i = 0; i < 5; i++) {
      System.out.println(i); //0~4 출력
      }
    }

2)while문

while 문은 for 문과는 다르게 특정 조건식 한개로, 조건식을 만족하는 동안에는 계속 반복을 수행한다.

while문은 보통 반복 횟수가 정해져 있지 않고, 조건에 따라서 계속할지 중단할지를 결정할 때, 사용한다.

    while(조건식) {
    
        ~작업 내용~
    
    }

의 구조를 가지고 있다.

다음은 변수 i가 0이 아닐 때 동안 출력을 시켜주고, 변수 i를 1씩 줄여준다.

조건식에서 조건을 확인하고, 그 안의 내용인 작업문을 수행한다.

i--에서 0이 되더라도, 조건식에서 i는 1이였기 때문에 출력이 진행된다.

    public static void main(String[] args) {
      int i = 3;
      while(i != 0){
      i--;
      System.out.println(i);
      }
    }

3)do-while문

do-while 문은 while 문과 비슷하지만, while문은 조건식을 먼저 보고, 그 안의 작업을 수행하지만, 

do-while문은 안의 작업을 먼저보고, 조건식을 본 뒤 반복을 수행할지, 말지를 결정한다.

다음은 do-while문의 구조이다.

    do {
    
        ~작업 내용~
    
    } while(조건식);

따라서 do-while문은 무조건 최소한 1번의 반복을 진행할 때 많이 사용한다.

다음은 그냥 변수 i가 0이 아닐때 동안 반복하는 프로그램이다. 

조건식보다, 작업문을 먼저 보기 때문에, i가 0이더라도, 출력이 진행되는 모습이다.

    public static void main(String[] args) {
      int i = 0;
      do{
      System.out.println(i);
      } while(i != 0);
    }

4)다중 for문

for문을 중첩시켜서 다중 for문을 만들 수 있다.

다음은 간단한 별찍기 문제이다.

    public static void main(String[] args) {
      for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
      System.out.print("*");
      }
      System.out.println();
      }
    }
다중 for문에서 특히 2중 for문은 나중에 2차원 배열이라는 것을 다룰 때, 많이 사용된다.

3.분기문

1)continue 문

반복문을 빠져나가지 않으면서, 다음 반복을 진행하는 분기문이다.

다음은 1~100까지 출력하는 반복문에서, 변수 i가 5의 배수가 아니면, continue를 통해 다음 반복으로 진행하는 프로그램이다. 

따라서 5의 배수만 출력할 수 있게 해주는 구조이다.

    public static void main(String[] args) {
      for(int i = 1; i <= 100; i++) {
      if(i % 5 != 0) continue;
      System.out.print(i+" ");
      }
    }

2)break 문

반복문 하나를 완전히 빠져 나갈 때 사용한다. 

반복문이 여러개 있을 때, 제일 안쪽의 반복문 1개를 벗어난다.

다음은 1~100까지 출력하는 반복문이 존재하는데, 

만약 변수 i가 20이라면 break를 통해 반복문을 탈출하는

프로그램이다.

    public static void main(String[] args) {
      for(int i = 1; i <= 100; i++) {
        System.out.print(i+" ");
        if(i == 20) {
        System.out.println("\n반복문을 탈출합니다.");
        break;
        }
      }
    }