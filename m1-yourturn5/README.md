Write a class called CellPhone which
    - has an instance variable called powerOn which is boolean and set to true when the phone is on and false when the phone
is off.
    - has an instance variable called inUse which is boolean and set to true when the phone is being used and false when the
phone is hung up

-has a method called powerButton which will turn the phone on if it was off and off if it was on.

-has a method called makeCall which accept an int, make sure the phone is on, make sure the phone isn't inUse and then will
print "Calling....<the number passed in>"  It should also set the inUse instance variable to true.  If an attempt is made to try to make a call with phone off, throw an exception

-has a method called hangUp which will hang up the phone by making the inUse variable to false


CellPhone이라는 클래스를 작성하되,

powerOn이라는 boolean 인스턴스 변수가 있습니다. 이 변수는 전화가 켜질 때 true로 설정되고, 전화가 꺼질 때 false로 설정됩니다.

inUse라는 boolean 인스턴스 변수가 있습니다. 이 변수는 전화가 사용 중일 때 true로 설정되고, 전화가 끊어질 때 false로 설정됩니다.

powerButton이라는 메서드가 있습니다. 이 메서드는 전화가 꺼져 있을 경우 켜고, 켜져 있을 경우 끄는 역할을 합니다.

makeCall이라는 메서드가 있습니다. 이 메서드는 int를 인자로 받으며, 전화가 켜져 있는지 확인하고, 전화가 사용 중이 아닌지 확인한 후 "Calling....<전화번호>"를 출력합니다. 또한 inUse 인스턴스 변수를 true로 설정합니다. 전화가 꺼진 상태에서 전화를 거는 시도를 하면 예외를 던집니다.

hangUp이라는 메서드가 있습니다. 이 메서드는 전화를 끊어서 inUse 변수를 false로 설정합니다.
