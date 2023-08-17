Write a Car class that has instance variables to track:

    - the licensePlateNumber
    - the model
    - the colour
    - the year the car was manufactured...

Make sure that your instance variables are protected from tampering (make them private)

Provide a full constructor and an empty constructor and getters/setters for all of them.

If a calling class tries to set the year instance variable to any date before 2000 or after 2015, 
throw an exception

Next, write a class called Start that has a main method.  Now, instantiate two Car objects, one using the full constructor
and one using the empty constructor and the setters to populate the instance variables. 




Car 클래스를 작성하여 다음과 같은 인스턴스 변수들을 추적할 수 있도록 합니다:

diff
Copy code
- 등록번호 (licensePlateNumber)
- 모델 (model)
- 색상 (colour)
- 제조년도 (the year the car was manufactured)...
인스턴스 변수가 임의로 변경되는 것을 방지하기 위해 변수들을 보호하세요 (private로 설정).

전체 생성자와 빈 생성자를 제공하고, 각각에 대한 getter와 setter도 제공하세요.

호출하는 클래스에서 제조년도 인스턴스 변수를 2000년 이전 또는 2015년 이후의 날짜로 설정하려고 할 때, 예외를 던져주세요.

다음으로, main 메서드를 포함하는 Start 클래스를 작성하세요. 이제 두 개의 Car 객체를 생성하세요. 하나는 전체 생성자를 사용하여 생성하고, 다른 하나는 빈 생성자와 setter를 사용하여 인스턴스 변수들을 채워 생성하세요.
