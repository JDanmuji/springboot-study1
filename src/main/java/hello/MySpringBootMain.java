package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootApplication;

//MySpringBootApplication : 안에 @ComponentScan 기능이 존재
// ComponentScan 을 사용할 떄 경로를 따로 지정하지 않았으면
//해당 기능을 사용하는 현재 위치의 하위 디렉토리를 전체 스캔을 진행
// 그중 Component 로 등록되어있는 클래스들을 다 지정해놓은 걸 읽게 되면서 해당 부분을 인식
@MySpringBootApplication
public class MySpringBootMain {

    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
