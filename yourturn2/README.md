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


"Cake" 클래스를 작성하여 다음과 같은 인스턴스 변수를 가지도록 하세요:

numberOfCandles (양초의 개수)
icingFlavour (크림맛)
message (메시지)
"describeCake" 메서드를 작성하여 Cake의 설명을 포함한 문자열을 반환하도록 하세요.

이제 "Start" 클래스를 작성하고 main 메서드를 작성하여 Cake 객체를 인스턴스화하세요!

5개의 양초, 초콜릿 크림, "Happy Birthday"라는 메시지를 가진 Cake 객체를 인스턴스화하세요.

두 번째 Cake 객체를 인스턴스화하세요. 이 객체에는 50개의 양초, 바닐라 크림 및 "축하합니다!"라는 메시지가 있어야 합니다.

describeCake 메서드를 사용하여 각 Cake 객체의 설명을 출력하세요.

다음으로, 프로그램의 모든 변수에 대해 다음과 같이 설명하세요:
• 기본형 vs 참조형
• 인스턴스 vs 로컬
• 변수 내부에 저장되는 내용은 무엇인가요?
• 변수는 어디에 저장되나요?

마지막으로, describeCake 메서드에서 JVM이 반환되기 직전의 프로그램의 메모리 다이어그램(Stack, Heap, Method 영역)을 그려보세요.

답변: 이 문제의 답은 "yourturn2aComplete" 패키지 안에 있습니다.

이제 우리는 getter와 setter를 사용하여 인스턴스 변수를 보호해 보겠습니다. 양초의 수가 음수로 설정되지 않도록 보장하세요. 그렇지 않은 경우에는 예외를 던져주세요. 
다음으로, 생성자를 추가하여 세 개의 인스턴스 변수를 설정하는 데 생성자 주입(Constructor Injection)을 사용하세요. 마지막으로, 빈 생성자를 추가하고, 테스트 클래스를 수정하여 빈 생성자를 사용하여 Cake 객체를 인스턴스화하고, 생성자 주입을 사용하여 또 다른 Cake 객체를 설정하세요.
