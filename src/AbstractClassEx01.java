abstract class SmartPhone {
    String call = "전화";
    String sns = "SNS";
    String search = "인터넷 검색";
    String game = "게임";
    String company, name, color, size, weight, price;
    public void purpose() { // 일반 메소드
        System.out.println("사용목적 : " + call + " / " + sns + " / " + search + " / " + game);
    }

    abstract public void spec(); // 추상 메소드 : 오버라이딩 필수!
}

class IPhone extends SmartPhone {
    public void spec() { // 오버라이딩
        company = "애플"; name = "아이폰 7"; color = "흰색";
        size = "11.94cm"; weight = "138g"; price = "73만원";
        System.out.println(company + "/" + name + "/" + color + "/" + size + "/" + weight + "/" + price);
    }
}

class Galaxy extends SmartPhone {
    public void spec() { // 오버라이딩
        company = "삼성"; name = "갤럭시 s7"; color = "흰색";
        size = "13.97cm"; weight = "152g"; price = "45만원";
        System.out.println(company + "/" + name + "/" + color + "/" + size + "/" + weight + "/" + price);
    }
}

public class AbstractClassEx01 {
    public static void main(String[] args) {
//		SmartPhone sp = new SmartPhone(); // 추상 클래스로 인스턴스 생성 불가
        IPhone ip = new IPhone();
        ip.spec();
        ip.purpose();
        Galaxy gx = new Galaxy();
        gx.spec();
        gx.purpose();
    }
}
        //1. 추상 클래스 및 추상 메소드는 abstract 키워드를 앞에 붙여 정의한다. 이때 추상 메소드는 내용을 갖지 않고 시그니처만 정의한다.(중괄호가 없고 세미콜론으로 마무리한다.)
        //2. 추상 메소드는 자식 클래스에서 반드시 오버라이딩을 하여야 한다. 이때 abstract를 제외한 나머지 시그니처를 동일하게 작성한다.
        //3. 그 외 추상 클래스는 일반 상속과 동일한 특징을 갖는다.(extends 사용, 단일 상속, 생성자 호출 등)