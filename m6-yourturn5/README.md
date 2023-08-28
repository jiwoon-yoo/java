Build the Address Class. Do do not make up your own instance variable names! Build a constructor as shown 
and all getters and setters.
4. Build an abstract Person class with instance variables that may only be seen by child classes outside of the 
package. Make all methods concrete with the exception of doWork which will be abstract. Notice the 
constructor in the diagram. Note that you don’t have to write setters for this class.
a. The speak method will accept a String and will print: <name> says: <sentence> -- where name is the 
name instance variable of the object and sentence is the String passed to the method.
5. Create the classes Professor and Student which will inherit from Person. 
a. When a call to the doWork method is called in a Professor object, the method will print out: “<name> is 
teaching”.
b. When a call to the doWork method is called in a Student object, the method will print out: “<name> is 
studying”.
6. You have been given a partially written Course class with an array of Persons as an instance variable. 
a. Make Course implement the ICoursable Interface.
b. The listPeopleByCity method will use a loop to print out the name, streetAddress, city, and postalCode 
of any Person objects that live in the city passed to the method
c. The makeEveryoneWork method will use a loop to make everyone doWork!
???
7. Add code to the StartMidterm Class to make the program run and output the following:
People in Springfield:
Bart: 742 Evergreen Terrage, Springfield, P3U4T2
Lisa: 742 Evergreen Terrage, Springfield, P3U4T2
Maggie: 742 Evergreen Terrage, Springfield, P3U4T2
People in Brampton:
Rich: 1 First Street, Brampton, L3E4D2
Making everyone do work!
Rich is teaching
Bart is studying
Lisa is studying
Maggie is studying
8. Answer any questions that are found in the comment

"Address" 클래스를 구현하세요. 자체 인스턴스 변수 이름을 마음대로 정하지 마세요! 다이어그램에 표시된대로 생성자와 모든 Getter 및 Setter를 구축하세요.
4. 추상 "Person" 클래스를 구축하세요. 이 클래스의 인스턴스 변수는 패키지 외부의 자식 클래스에서만 볼 수 있어야 합니다. "doWork" 메서드를 제외한 모든 메서드를 구체화하세요. "doWork" 메서드는 추상 메서드여야 합니다. 다이어그램의 생성자에 주목하세요. 이 클래스에는 Setter를 작성할 필요가 없습니다.
a. "speak" 메서드는 문자열을 인수로 받아서 "<name> says: <sentence>"와 같은 형식으로 출력합니다. 여기서 "name"은 객체의 이름 인스턴스 변수이고 "sentence"는 메서드에 전달된 문자열입니다.

"Professor"와 "Student" 클래스를 생성하세요. 이들 클래스는 "Person"을 상속받아야 합니다.
a. "Professor" 객체에서 "doWork" 메서드를 호출하면 메서드는 "<name> is teaching"을 출력합니다.
b. "Student" 객체에서 "doWork" 메서드를 호출하면 메서드는 "<name> is studying"을 출력합니다.
부분적으로 작성된 "Course" 클래스가 주어지며, 이 클래스는 "Persons" 배열을 인스턴스 변수로 가지고 있습니다.
a. "Course" 클래스가 "ICoursable" 인터페이스를 구현하도록 만드세요.
b. "listPeopleByCity" 메서드는 주어진 도시에 거주하는 "Person" 객체의 이름, 거리 주소, 도시 및 우편 코드를 출력하기 위해 반복문을 사용합니다.
c. "makeEveryoneWork" 메서드는 반복문을 사용하여 모든 사람들이 "doWork"를 수행하도록 합니다!
???
"StartMidterm" 클래스에 코드를 추가하여 프로그램을 실행하고 다음과 같은 출력을 생성하세요:
Springfield에 있는 사람들:
Bart: 742 Evergreen Terrage, Springfield, P3U4T2
Lisa: 742 Evergreen Terrage, Springfield, P3U4T2
Maggie: 742 Evergreen Terrage, Springfield, P3U4T2
Brampton에 있는 사람들:
Rich: 1 First Street, Brampton, L3E4D2
모두 일하게 만들기!
Rich는 가르치고 있습니다
Bart는 공부하고 있습니다
Lisa는 공부하고 있습니다
Maggie는 공부하고 있습니다
주석에서 발견되는 질문에 답하세요.
