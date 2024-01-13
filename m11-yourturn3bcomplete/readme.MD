RoomCharge Class:

Represents a room charge with a description and cost.
Includes a constructor to initialize the description and cost.
Provides methods to get the description and cost.
HotelManager Class:

Manages hotel-related operations, including assigning guests to rooms, checking guests out, and adding room charges.
Uses a HashMap to store guests with room numbers.
Provides methods:
assignGuestToRoom: Assigns a guest to a room, checking for existing occupants.
checkOut: Checks a guest out of a room, removing the guest and displaying room charges.
addRoomCharge: Adds a room charge to a guest in a specific room.
Guest Class:

Represents a guest with a name and a list of room charges.
Includes a constructor to initialize the guest's name.
Provides methods:
addRoomCharge: Adds a room charge to the guest's list.
getRoomCharges: Generates a string listing the guest's room charges.
Start Class (Main):

Creates an instance of HotelManager.
Demonstrates various operations such as assigning guests to rooms, adding room charges, and checking guests out.







RoomCharge 클래스:

설명과 비용을 가진 객실 비용을 나타냅니다.
설명과 비용을 초기화하는 생성자가 포함되어 있습니다.
설명과 비용을 가져오는 메서드를 제공합니다.
HotelManager 클래스:

호텔과 관련된 작업을 관리합니다. 게스트를 객실에 할당하고, 체크아웃하고, 객실 비용을 추가하는 등의 작업을 수행합니다.
게스트를 객실 번호와 함께 저장하기 위해 HashMap을 사용합니다.
다음 메서드를 제공합니다:
assignGuestToRoom: 게스트를 객실에 할당하며 기존 투숙객 여부를 확인합니다.
checkOut: 게스트를 객실에서 체크아웃하고 게스트 및 객실 비용을 표시합니다.
addRoomCharge: 특정 객실의 게스트에게 객실 비용을 추가합니다.
Guest 클래스:

이름과 객실 비용 목록을 가진 게스트를 나타냅니다.
게스트의 이름을 초기화하는 생성자가 포함되어 있습니다.
다음 메서드를 제공합니다:
addRoomCharge: 게스트의 객실 비용 목록에 객실 비용을 추가합니다.
getRoomCharges: 게스트의 객실 비용 목록을 나열하는 문자열을 생성합니다.
Start 클래스 (Main):

HotelManager의 인스턴스를 생성합니다.
게스트를 객실에 할당하고, 객실 비용을 추가하고, 게스트를 체크아웃하는 등 다양한 작업을 보여줍니다.
