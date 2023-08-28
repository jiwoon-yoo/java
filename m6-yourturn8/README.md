
Vehicle Management System
The Vehicle Management System is a Java project that simulates a transportation system by modeling various entities like vehicles, drivers, passengers, and their interactions. This project showcases object-oriented programming principles and demonstrates the design and implementation of a simplified transportation simulation.

Features
Vehicles: The system includes a hierarchy of vehicles, including buses and cars. Each vehicle has an associated engine, license plate, location, driver, and passenger list.

Drivers: Drivers are categorized into two types: Bus drivers and Car drivers. Each driver has a name, location, license type, and age. Drivers must be at least 16 years old to operate a vehicle.

Passengers: Passengers can be added to vehicles, and their location is tracked within the system. Passengers can embark and disembark from vehicles.

Engine: Each vehicle is equipped with an engine that can be started or stopped. The engine's running status affects the vehicle's ability to move.

Vehicle Operations: Vehicles can be driven to different locations, subject to certain conditions like having a driver and a running engine. Vehicles can honk their horns.

Queues and Status: The system maintains queues for pending orders and completed orders. Each order's status changes as it moves through the process of being prepared and picked up.

Classes and Relationships
Bus and Car: Subclasses of the Vehicle class that represent different types of vehicles with specialized behaviors and constraints.

Driver: A class representing a driver with a specific license type and age. Inherits from the Person class.

Engine: Represents the engine of a vehicle and can be started or stopped.

Person: Base class for individuals, including drivers and passengers, with a name and location.

Enums: LicenseType, Location, OrderStatus, and Size enums define various types and statuses within the system.

Usage
Create instances of vehicles, drivers, and passengers using the provided classes.

Simulate the transportation system by submitting orders, preparing orders, and allowing customers to pick up their orders.

Observe the interactions between vehicles, drivers, and passengers as they move through the system.

Interfaces:

Drivable
Honkable
Classes:

Engine
Vehicle
Note that Vehicle is an abstract class.
Vehicle implements both Drivable and Honkable interfaces.
Since Vehicle is abstract, you can decide where to implement the methods defined by the interfaces. You can choose to implement some of them in Vehicle and some in the concrete child classes.
Note that Vehicle is composed of an Engine (composition). This means the Engine is instantiated when an object inheriting from Vehicle is created and is destroyed when that object is garbage collected.
Bus and Car Classes:

Both Bus and Car inherit from Vehicle, and Vehicle implements Honkable and Drivable. This means that all the methods listed in Honkable and Drivable must be implemented either in Vehicle, Bus, or Car.
Methods implemented in Vehicle can be inherited by both Bus and Car. However, if Bus and Car need to implement the methods differently, it's better to implement them in the child classes.
For example, when we honk the horn on a Bus, the sound should be "AAAHHWWOOOOGAAA." When we honk the horn on a Car, the sound should be "beep beep." You should implement the honk method where it makes sense for each class.
Similarly, both Car and Bus need to return a list of the names of the passengers currently in them. The implementation of this method should be decided based on the class's specific behavior.
In some cases, you might want to implement part of a method in the child class and then call the super method to handle the rest. For example, take a look at the implementation of the driveTo method.
Additional Considerations for Various Methods:

The Driver constructor takes an integer representing age. If the age is less than 16, an exception should be thrown to indicate that the person is too young to be a driver.
The driveTo method moves the vehicle to a new Location. However, this action can only be performed if the vehicle has a driver and its engine is turned on. If these conditions are not met, an exception should be thrown.
When a bus drives to a new location, any passengers on board will also move to the new location.
Cars function similarly to buses, but with some distinctions:
Cars can accommodate a maximum of 4 passengers.
Drivers can hold either a CAR or BUS license. Regular persons cannot drive the car; a driver's license is required.
Drivers can also be passengers in either a bus or a car.





차량 관리 시스템
차량 관리 시스템은 자바 프로젝트로, 차량, 운전자, 승객 등 다양한 요소들의 상호작용을 모델링하여 교통 시스템을 시뮬레이션하는 프로그램입니다. 이 프로젝트는 객체지향 프로그래밍 원칙을 보여주며 간단한 교통 시뮬레이션의 설계와 구현을 보여줍니다.

기능
차량: 시스템에는 버스와 자동차 등 다양한 차량이 계층 구조로 포함되어 있습니다. 각 차량에는 엔진, 등록 번호, 위치, 운전자 및 승객 목록이 있습니다.

운전자: 운전자는 버스 운전자와 자동차 운전자로 구분됩니다. 각 운전자에는 이름, 위치, 면허 유형 및 나이가 있습니다. 운전자는 최소 16세 이상이어야 합니다.

승객: 승객은 차량에 추가되며 시스템 내에서 위치가 추적됩니다. 승객은 차량에 탑승하거나 내리는 것이 가능합니다.

엔진: 각 차량에는 시작 또는 중지할 수 있는 엔진이 장착되어 있습니다. 엔진의 가동 상태는 차량의 이동 능력에 영향을 줍니다.

차량 작업: 차량은 운전자와 가동 중인 엔진과 같은 특정 조건을 충족해야만 다른 위치로 운전될 수 있습니다. 차량은 경적을 울릴 수 있습니다.

대기열 및 상태: 시스템은 대기 중인 주문 및 완료된 주문을 위한 대기열을 유지합니다. 주문의 상태는 준비 및 수령 과정을 거치면서 변경됩니다.

클래스 및 관계
Bus 및 Car: Vehicle 클래스의 하위 클래스로, 특정한 동작과 제약 조건을 가진 다양한 유형의 차량을 나타냅니다.

Driver: 특정한 면허 유형과 나이를 가진 운전자를 나타내는 클래스입니다. Person 클래스를 상속받습니다.

Engine: 차량의 엔진을 나타내며 시작 또는 중지될 수 있습니다.

Person: 개인을 나타내는 기본 클래스로, 운전자 및 승객을 포함하여 이름과 위치를 가집니다.

열거형: LicenseType, Location, OrderStatus, Size 열거형은 시스템 내에서 다양한 유형과 상태를 정의합니다.

사용법
제공된 클래스를 사용하여 차량, 운전자 및 승객 인스턴스를 생성합니다.

주문을 제출하고 준비된 주문을 처리하며 고객이 주문을 수령하도록 교통 시스템을 시뮬레이션합니다.

차량, 운전자 및 승객 간의 상호작용이 시스템 내에서 어떻게 진행되는지 관찰합니다.

인터페이스:

Drivable
Honkable
클래스:

Engine
Vehicle
Vehicle은 추상 클래스임에 유의하십시오.
Vehicle은 Drivable과 Honkable 인터페이스를 모두 구현합니다.
Vehicle이 추상 클래스이므로 인터페이스에서 정의한 메서드를 구현할 위치를 선택할 수 있습니다. 일부 메서드를 Vehicle에 구현하고 일부 메서드를 구체적인 자식 클래스에 구현하는 것을 선택할 수 있습니다.
Vehicle은 Engine으로 구성됩니다 (합성). 즉, Vehicle을 상속하는 객체가 생성될 때 Engine이 인스턴스화되며 해당 객체가 가비지 컬렉션에 의해 삭제될 때 파괴됩니다.
Bus와 Car 클래스:

Bus와 Car 모두 Vehicle을 상속하며, Vehicle은 Honkable과 Drivable을 구현합니다. 따라서 Honkable과 Drivable에 나열된 모든 메서드를 Vehicle, Bus, 또는 Car에서 구현해야 합니다.
Vehicle에서 구현된 메서드는 Bus와 Car 모두에서 상속받을 수 있습니다. 그러나 Bus와 Car가 메서드를 서로 다르게 구현해야 하는 경우 해당 메서드를 자식 클래스에 구현하는 것이 좋습니다.
예를 들어, 버스의 경적을 울릴 때는 "AAAHHWWOOOOGAAA" 소리가 나와야 합니다. 자동차의 경우에는 "비프 비프" 소리가 나와야 합니다. 각 클래스에 적절한 위치에 경적 메서드를 구현해야 합니다.
마찬가지로 자동차와 버스는 탑승객 이름 목록을 반환해야 합니다. 이 메서드의 구현은 각 클래스의 동작에 따라 결정되어야 합니다.
때로는 메서드의 일부를 자식 클래스에서 구현한 다음 슈퍼 메서드를 호출하여 나머지를 처리할 수 있습니다. 예를 들어 driveTo 메서드의 구현을 살펴보세요.
기타 메서드에 대한 추가 고려 사항:

Driver 생성자는 나이를 나타내는 정수를 취합니다. 나이가 16 미만인 경우, 운전자로는 너무 어립니다라는 예외를 발생시켜야 합니다.
driveTo 메서드는 차량을 새 위치로 이동시킵니다. 그러나 차량에 운전자가 있고 엔진이 켜져 있는 경우에만 가능합니다. 이러한 조건을 충족하지 않는 경우 예외를 발생시켜야 합니다.
버스가 새 위치로 이동하면 탑승객도 새 위치로 이동합니다.
자동차는 버스와 유사하게 작동하지만 몇 가지 차이점이 있습니다.
자동차는 최대 4명의 탑승객을 수용할 수 있습니다.
운전자는 CAR 또는 BUS 라이센스를 소지할 수 있습니다. 일반 사람은 자동차를 운전할 수 없으며, 운전자의 라이센스가 필요합니다.
운전자는 자동차나 버스에서도 탑승객이 될 수 있습니다.
