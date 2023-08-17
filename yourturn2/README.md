Write a Cake class that has the following instance variables:

-  numberOfCandles
-  icingFlavour
-  message

A method called describeCake that returns a String containing a description of the Cake

Now, write a Start class with a main method and start instantiating
Cake objects!

Instantiate a Cake object with 5 candles, chocolate icing, and a message that says:  Happy Birthday.

Instantiate a second Cake object that has 50 candles, vanilla icing and a message that says:  Congratulations!

Use the describeCake method to print out a description of each Cake object






Next, describe every variable in your program as to:
•	primitive vs reference
•	instance vs local
•	what is stored inside of the variable?
•	Where is the variable stored/

Finally, draw a memory diagram (Stack, Heap, Method areas) of the program just before the JVM returns from the describeCake method.

ANSWER:  The answers to this problem is in the package called yourturn2aComplete





Now let's protect our instance variables by using getters and setters
Ensure that the number of candles is not set to a negative number.  If it is, throw and exception
Next, add a constructor to allow constructor injection to set the three instance variables.
Finally, you'll want to add an empty constructor

Now, make changes to your test class to instantiate a Cake object using the empty constructor and using setter-injection to set it up and instantiate another Cake object using constructor-injection to set it up 





다음은 번역된 내용입니다:

다음과 같은 인스턴스 변수를 가진 Cake 클래스를 작성하십시오:

numberOfCandles (촛불의 개수)
icingFlavour (아이싱 풍미)
message (메시지)
Cake의 설명을 포함하는 String을 반환하는 describeCake라는 메서드를 작성하십시오.

이제 main 메서드를 가진 Start 클래스를 작성하고 Cake 객체를 인스턴스화하십시오!

촛불이 5개인 Cake 객체를 인스턴스화하고 초콜릿 아이싱, "생일 축하해요"라는 메시지로 설정하십시오.

두 번째 Cake 객체를 인스턴스화하고 촛불이 50개, 바닐라 아이싱 및 "축하해요!"라는 메시지로 설정하십시오.

describeCake 메서드를 사용하여 각 Cake 객체의 설명을 출력하십시오.

이제 프로그램의 모든 변수를 다음과 같이 설명하십시오:
• 기본 자료형 vs 참조 자료형
• 인스턴스 변수 vs 지역 변수
• 변수 내에 저장된 내용은 무엇인가?
• 변수는 어디에 저장되어 있는가?

마지막으로, describeCake 메서드에서 JVM이 반환되기 직전의 프로그램의 메모리 다이어그램(Stack, Heap, Method 영역)을 그려보십시오.

답변: 이 문제의 답은 yourturn2aComplete라는 패키지에 있습니다.

이제 우리의 인스턴스 변수를 보호하기 위해 getter와 setter를 사용하겠습니다.
촛불의 개수가 음수로 설정되지 않도록 하십시오. 그렇다면 예외를 던집니다.
그 다음, 세 인스턴스 변수를 설정하기 위해 생성자를 추가하십시오.
마지막으로, 빈 생성자를 추가하십시오.

이제 테스트 클래스를 수정하여 빈 생성자를 사용하여 Cake 객체를 인스턴스화하고 설정하기 위해 setter 주입을 사용하여 다른 Cake 객체를 생성하십시오. 생성자 주입을 사용하여 설정하십시오.
