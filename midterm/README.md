CCFunctions:
•	An interface that correctly identifies the methods listed in the diagram.  Correctly write the code for the interface as shown in the UML Diagram


CreditCard:
•	An abstract class as shown on the UML diagram.  Correctly write the code for CreditCard.

•	Methods:
***You must determine the best location to write the methods below.  Remember that you want to reduce the amount of duplicate code but want to make sure that Visa and VisaGold operate as they should.
o	various getters as needed
o	A method called addPurchase which accepts a double and returns a String
	The amount passed is the cost of the purchase
	If the purchase will put the card over the creditLimit (ie current balance + attempted purchase > credit limit), then do not complete the purchase and return a String saying “ Purchase Declined – Over Credit Limit”
	If the purchase does not put the card over the creditLimit, then complete the transaction, adding the purchase cost to the balance and then return the String “Purchase Approved!”
o	A method called makePayment which accepts a double and allows a payment to be applied against the credit card balance.  For example, if we call the makePayment method, the balance instance variable will be reduced by whatever value we pass to it .
o	an abstract method called calcBonusPoints.  To calculate bonus points for a Visa object, multiply the balance by .005 and to calcBonusPoints for VisaGold objects, multiply the balance by .01


Visa and VisaGold
•	These two concrete classes represent actual credit cards and will inherit from CreditCard and implement any required methods.  You must decide what methods to write here.
Start Class:
The Start class will create a polymorphic array of CreditCard objects that will include the following cardholders:
Name	 Object Type	Balance	Credit Limit
Rich	Visa object	1999.99	2000
Lori	Visa object	100.22	1500
Aiko	VisaGold object	900.43	1000

Next, print out the name associated with any cards that are over their limit.  ***If a card’s balance is greater than its limit, it is considered “over its limit”
Next, loop through the array, printing out:
•	The cardholder’s name
•	The current balance owing
•	the bonusPoints calculated by the calcBonusPoints method
•	make a $100 purchase.
•	print out “Paying off Credit Card”
•	submit a payment of exactly the balance owing on each card to ensure that the card’s balance is 0 and then print out the 0 balance to prove that the card has been paid off. (Do not do any math in your head!  Use the code to determine what payment is needed!)




<korean>
CCFunctions:
• UML 다이어그램에 나열된 메서드를 정확히 식별하는 인터페이스입니다. UML 다이어그램에 표시된대로 인터페이스의 코드를 올바르게 작성하세요.

CreditCard:
• UML 다이어그램에 표시된대로 추상 클래스입니다. CreditCard의 코드를 올바르게 작성하세요.

• 메서드:
*** 아래의 메서드를 작성할 가장 적합한 위치를 결정해야 합니다. 중복 코드를 최소화하되 Visa와 VisaGold가 정상적으로 작동하도록 해야 합니다.
o 필요한 경우 각종 getter 메서드
o addPurchase라는 메서드를 작성하세요. 이 메서드는 double을 받아들이고 String을 반환합니다.
 전달된 금액은 구매 비용입니다.
 구매로 인해 카드의 잔액이 신용 한도를 초과하게 될 경우(즉, 현재 잔액 + 시도한 구매 > 신용 한도), 구매를 완료하지 않고 "Purchase Declined - Over Credit Limit"라는 문자열을 반환합니다.
 구매로 인해 카드의 잔액이 신용 한도를 초과하지 않는 경우, 거래를 완료하고 구매 비용을 잔액에 추가한 다음 "Purchase Approved!"라는 문자열을 반환합니다.
o makePayment라는 메서드를 작성하세요. 이 메서드는 double을 받아들이고 신용 카드 잔액에 결제를 적용할 수 있습니다. 예를 들어, makePayment 메서드를 호출하면 잔액 인스턴스 변수가 전달한 값만큼 감소됩니다.
o calcBonusPoints라는 추상 메서드를 작성하세요. Visa 객체의 보너스 포인트를 계산하기 위해 잔액에 0.005를 곱하고, VisaGold 객체의 보너스 포인트를 계산하기 위해 잔액에 0.01을 곱하세요.

Visa와 VisaGold:
• 이 두 개의 구체적인 클래스는 실제 신용 카드를 나타내며, CreditCard를 상속하고 필요한 메서드를 구현할 것입니다. 여기에 작성할 메서드를 결정해야 합니다.

Start 클래스:
Start 클래스에서는 다음과 같은 카드 소지자를 포함하는 다형성 배열인 CreditCard 객체를 생성합니다:
이름 객체 타입 잔액 신용 한도
Rich Visa 객체 1999.99 2000
Lori Visa 객체 100.22 1500
Aiko VisaGold 객체 900.43 1000

다음으로, 한도를 초과한 카드에 연결된 이름을 출력하세요. ***잔액이 한도보다 큰 카드는 "한도 초과"로 간주됩니다.
그 다음으로 배열을 순환하면서 다음을 출력하세요:
• 카드 소지자의 이름
• 현재 잔액
• calcBonusPoints 메서드로 계산된 보너스 포인트
• $100의 구매를 진행하세요.
• "신용 카드 상환 중"을 출력하세요.
• 각 카드의 잔액과 동일한 금액의 지불을 제출하여 카드의 잔액이 0이 되었음을 증명하고, 0 잔액을 출력하세요. (머리로 계산하지 마세요! 코드를 사용하여 필요한 지불 금액을 결정하세요!)
