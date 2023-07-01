 

PROG 24178	
Faculty of Applied Computing and Technology	Assignment #2

1.	Download the .zip file and open in VSCode.  Notice that there are a few more files and folders than you are used to.  No problem!  Just write your code in the ‘src\assignment2’ folder.
2.	Notice that I have given you the Customer Class that includes two methods called isAlphabeticallyBefore and isAlphabeticallyAfter which return Booleans.  These methods will be useful to you.
3.	Build a Node Class that will contain a Customer object and a link to the next Node object in the list.
4.	Build your own implementation of a LinkedList class that can hold Customer objects  This is a true linked-list and does not use arrays or ArrayList.  Choose good variable and method names for your program.
a.	This class will have:
i.	 an instance variable of type Node called head which will hold a reference to the first node in the list.
ii.	A method called addCustomer which will accept a Customer and will return nothing.  This method will insert the Customer into the list alphabetically.
1.	This method is quite tricky.  Here are some things to think of:
2.	We need to cover off the case where the list is currently empty or where the customer passed in comes alphabetically before the customer that is currently at the beginning of the list.
3.	We also need to cover off the case where the customer needs to be inserted in the middle or the end of the list.
4.	The best way to do this is to draw pictures showing the list before and the list after the method runs and then, when it breaks (because nobody ever figures it out perfectly the first time ;->), use the debugger to show you exactly where your mistake is!

5.	Write a method called toString which will return a String that includes all of the customers in the list in alphabetical order.
6.	Write a method called printBirthdayCardsForSpecifiedMonth that will print out birthday cards for anyone with the same birthday month as the one passed in as an int.


7.	Bonus Mark -Write a method called reverse that will print an alphabetical List of Customers from Z-A (ie backwards from how it is stored)  Think about this…there is an easy way to do this with what we have learned.  Note that you may not leave the linked-list altered in any way after printing it out backwards!  Hopefully your solution will stack up against other solutions.  You may use any class that Java provides to accomplish this.



8.	Make sure your code is correct by running the Start Class.  Here is the output that you should get:
List of All Customers:
	Agnus Skinner
	Barny Gumble
	Bleeding Gums Murphy
	Carl Carlson
	Comic Book Guy
	Crusty the Clown
	Lenny Leonard
	Moe Szyslak
	Rainer Wolfcastle
	Waylon Smithers


Happy Birthday Barny Gumble
Please accept our coupon for $10 off of your next purchase of more than $100,000

Happy Birthday Bleeding Gums Murphy
Please accept our coupon for $10 off of your next purchase of more than $100,000

Happy Birthday Comic Book Guy
Please accept our coupon for $10 off of your next purchase of more than $100,000

Bonus Question - The names in reverse:
Waylon Smithers
Rainer Wolfcastle
Moe Szyslak
Lenny Leonard
Crusty the Clown
Comic Book Guy
Carl Carlson
Bleeding Gums Murphy
Barny Gumble
Agnus Skinner





<korean>
.zip 파일을 다운로드하고 VSCode에서 엽니다. 일반적으로 사용하는 것보다 몇 가지 파일과 폴더가 더 있음을 알 수 있습니다. 문제 없습니다! 코드를 'src\assignment2' 폴더에 작성하세요.

isAlphabeticallyBefore와 isAlphabeticallyAfter라는 두 개의 메서드가 포함된 Customer 클래스를 제공했음을 알려드립니다. 이러한 메서드는 유용할 것입니다.

Customer 객체와 목록에서 다음 Node 객체로의 링크를 포함하는 Node 클래스를 작성하세요.

ArrayList나 배열을 사용하지 않고도 Customer 객체를 보유할 수 있는 LinkedList 클래스의 구현을 작성하세요. 이는 진정한 연결 리스트입니다. 프로그램에 적절한 변수와 메서드 이름을 선택하세요.
a. 이 클래스에는 다음과 같은 요소가 있어야 합니다:
i. head라는 Node 유형의 인스턴스 변수로서, 목록의 첫 번째 노드에 대한 참조를 보관합니다.
ii. Customer를 받아들이고 아무 것도 반환하지 않는 addCustomer라는 메서드를 가져야 합니다. 이 메서드는 고객을 알파벳순으로 목록에 삽입합니다.
1. 이 메서드는 꽤 까다로울 수 있습니다. 다음 사항을 고려해 보세요.
2. 목록이 현재 비어 있거나 전달된 고객이 현재 목록의 시작 부분에 있는 고객보다 알파벳순으로 먼저 올 경우에 대비해야 합니다.
3. 고객을 목록의 중간이나 끝에 삽입해야 하는 경우에 대비해야 합니다.
4. 이를 위해 목록이 메서드 실행 전과 후에 어떻게 되는지를 나타내는 그림을 그린 다음 (처음부터 완벽하게 이해하는 사람은 없으므로 ;->), 디버거를 사용하여 실제로 어디서 잘못되었는지 확인하세요!

모든 고객을 알파벳순으로 포함하는 문자열을 반환하는 toString이라는 메서드를 작성하세요.

지정된 월과 동일한 생일 월을 가진 고객에 대해 생일 카드를 출력하는 printBirthdayCardsForSpecifiedMonth 메서드를 작성하세요. 인자로 int 형식을 받습니다.

보너스 점수 - 명단을 Z-A(저장된 순서의 역순)로 알파벳순으로 역순으로 인쇄하는 reverse라는 메서드를 작성하세요. 이에 대한 간단한 방법이 있습니다. 주어진 기능만으로 이를 쉽게 수행할 수 있습니다. 연결 리스트를 역순으로 인쇄한 후에도 변경하지 않아야 합니다! 여러분의 솔루션이 다른 솔루션과도 비교될 수 있도록 합니다. 이를 위해 Java가 제공하는 클래스를 사용할 수 있습니다.

Start 클래스를 실행하여 코드가 올바른지 확인하세요. 다음은 얻어야 하는 출력입니다:
모든 고객 목록:
Agnus Skinner
Barny Gumble
Bleeding Gums Murphy
Carl Carlson
Comic Book Guy
Crusty the Clown
Lenny Leonard
Moe Szyslak
Rainer Wolfcastle
Waylon Smithers

생일 축하합니다 Barny Gumble
100,000달러 이상 구매 시 다음 구매에 대한 10달러 할인 쿠폰을 받아주세요.

생일 축하합니다 Bleeding Gums Murphy
100,000달러 이상 구매 시 다음 구매에 대한 10달러 할인 쿠폰을 받아주세요.

생일 축하합니다 Comic Book Guy
100,000달러 이상 구매 시 다음 구매에 대한 10달러 할인 쿠폰을 받아주세요.

보너스 질문 - 역순으로 된 이름:
Waylon Smithers
Rainer Wolfcastle
Moe Szyslak
Lenny Leonard
Crusty the Clown
Comic Book Guy
Carl Carlson
Bleeding Gums Murphy
Barny Gumble
Agnus Skinner
