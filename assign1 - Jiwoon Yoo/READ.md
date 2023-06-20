1.	Create a Folder in your Java Code Folder called assign1-<your name>.  Open VSCode and open that folder.
2.	Create an enumerated type called BirthdayMonth that has the following possible values:
a.	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, NOV, DEC


3.	Create a class called Customer:
a.	The customer needs a first name, a last name, a customer ID, a BirthdayMonth, and an email address..
b.	Build a constructor that takes firstName, lastName, birthdayMonth, and emailAddress.  
Notice that you are not asking for customerID. 
You will generate your ownCustomerID that is unique for every Customer object????
i.	Add a class (static) variable called nextAvailableID to your Customer Class.
ii.	In the constructor, you will assign the value of the class variable, nextAvailableID, to the instance variable customerID and then you will increment the nextAvailableID by one.  
iii.	That way, each time you instantiate a new Customer Object, the customerID will be unique and 1 greater than the last customerID assignened.  This works because nextAvailableID is static and exists outside of any objects. ???? 
4.	Write a class called Start 
a.	that will instantiate a customer using realistic data
b.	Print out the customerID for this customer.  It should be 0.

c.	Instantiate a second customer.  It’s customerID should automatically be 1.
d.	Create a ragged array of Customers with 3 Customers in the first row and 2 Customers in the second row.  Again, use realistic data when creating these Customers
e.	Use loops to print out the names of all Customers in the following format:
Customer1, Customer2, Customer3
Customer4, Customer5





5.	Write a Customer Relationship Management class called CRM that :
a.	Contains an instance variable called customers that is an Array that can hold 20 references to Customer objects.
b.	Contains an instance variable called numCustomers that always has the number of customers that have been added to the CRM system.


c.	A method called addCustomer that accepts a Customer, correctly adds that Customer to the customers array, and increments the numCustomers variable.
d.	A method called getAllCustomerEmails which returns a String containing all Customers email addresses, separated by semi-colons:
Email1@gmail.com; email2@gmail.com; email3@gmail.com; email4@gmail.com; email5@gmail.com;
e.	A method called printBirthdayCards that will print out birthday cards for every Customer who’s birthMonth is equal to the BirthdayMonth that was passed to it.
i.	For example, if Customer 3 and 5 have birthdays in May, and you called the method printBirthdayCards(BirthdayMonth.MAY) , you would print the following:
Dear <Customer3>,
Happy Birthday!  In honour of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000!
Best Regards,
<Your Name>
-------------------------------------------------------
Dear <Customer5>,
Happy Birthday!  In honour of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000!
Best Regards,
<Your Name>
6.	Return to your main method and write enough code to prove that all your CRM systems works as advertised.







<korean>
자바 코드 폴더 내에 "assign1-<당신의 이름>"라는 폴더를 생성하세요. VSCode를 열고 해당 폴더를 엽니다.
BirthdayMonth라는 열거형을 생성하세요. 가능한 값으로는 JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, NOV, DEC가 있습니다.
Customer 클래스를 생성하세요.
고객은 이름, 성, 고객 ID, 생일 월(BirthdayMonth), 이메일 주소가 필요합니다.
firstName, lastName, birthdayMonth, emailAddress를 인자로 받는 생성자를 작성하세요.
customerID는 입력받지 않고, 각 Customer 객체에 대해 고유한 customerID를 생성합니다.
Customer 클래스에 nextAvailableID라는 클래스(정적) 변수를 추가하세요.
생성자에서 nextAvailableID 값을 인스턴스 변수인 customerID에 할당한 후, nextAvailableID를 1 증가시킵니다.
이렇게 하면 새로운 Customer 객체를 인스턴스화할 때마다 customerID가 고유하게 설정되며, 이전 customerID보다 1이 큽니다. 이는 nextAvailableID가 정적으로 존재하여 객체 외부에 존재하기 때문에 가능합니다.
Start 클래스를 작성하세요.
현실적인 데이터를 사용하여 고객을 인스턴스화하고, 해당 고객의 customerID를 출력하세요. customerID는 0이어야 합니다.
두 번째 고객을 인스턴스화하세요. 해당 고객의 customerID는 자동으로 1이어야 합니다.
첫 번째 행에는 3명의 고객, 두 번째 행에는 2명의 고객을 가진 Customers 배열을 생성하세요. 현실적인 데이터를 사용하세요.
반복문을 사용하여 모든 고객의 이름을 다음 형식으로 출력하세요:
Customer1, Customer2, Customer3
Customer4, Customer5
CRM(Customer Relationship Management) 클래스를 작성하세요.
customers라는 배열을 가지는 인스턴스 변수와 CRM 시스템에 추가된 고객 수를 나타내는 numCustomers라는 인스턴스 변수를 포함해야 합니다.
고객을 추가하는 addCustomer 메서드와 모든 고객의 이메일 주소를 세미콜론으로 구분한 문자열을 반환하는 getAllCustomerEmails 메서드를 구현하세요.
BirthdayMonth와 일치하는 생일 월을 가진 모든 고객에 대해 생일 카드를 출력하는 printBirthdayCards 메서드를 작성하세요.
예를 들어, 고객 3번과 5번이 5월에 생일이 있다면, printBirthdayCards(BirthdayMonth.MAY)를 호출하면 다음과 같이 출력되어야 합니다:
Dear <Customer3>,
생일 축하합니다! 이번 달 생일을 축하로 100,000달러 이상 주문 시 2달러 할인 쿠폰을 드립니다!
성의를 담아,
<당신의 이름>
Dear <Customer5>,
생일 축하합니다! 이번 달 생일을 축하로 100,000달러 이상 주문 시 2달러 할인 쿠폰을 드립니다!
성의를 담아,
<당신의 이름>
main 메서드로 돌아가서 CRM 시스템이 설명한 대로 작동하는지 증명하는 충분한 코드를 작성하세요.
