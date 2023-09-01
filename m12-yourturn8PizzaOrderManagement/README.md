Mama's Pizza Order and Manufacturing Engine

Mama's Pizza Order and Manufacturing Engine is a simple system designed to process and manufacture pizza orders. This project is developed in Java and includes various classes and interfaces for managing customers, employees, orders, and the processing and preparation of pizza orders.

Features
The Mama's Pizza Engine provides the following key features:

Customer Information Management: It allows the management of customer names, phone numbers, and addresses.

Order Processing: Orders can be added, pizza preparation can be initiated, and completed orders can be processed.

Queue Management: It manages the queue of orders waiting to be processed and keeps track of the order processing stages.

Order Status Tracking: It tracks the current status of orders (pending, preparing, complete).

Order Details: It provides detailed information about orders in the queue and those that have been completed.

Classes and Interfaces
The project consists of the following main classes and interfaces:

Customer: This class represents customer information, including names, phone numbers, and addresses.

Employee: The Employee class represents employees and implements the IBaker and IOrderTaker interfaces, providing order processing and preparation functionalities.

MamasPizzaEngine: This class serves as the order processing engine, managing the order queue and order status.

PizzaOrder: PizzaOrder represents pizza orders and includes customer information, pizza size, toppings, and order status.

Size: An enumeration defining pizza sizes (SMALL, MEDIUM, LARGE).

Toppings: An enumeration defining pizza toppings (CHEESE, PINEAPPLE, EXTRACHEESE, EXTRAPINEAPPLE).

OrderStatus: An enumeration defining order statuses (PENDING, PREPARING, COMPLETE).

IBaker and IOrderTaker interfaces: These interfaces are implemented by the Employee class and define methods related to order processing and preparation.

Utilization of Facade Pattern and Polymorphism
The Mama's Pizza Order and Manufacturing Engine project leverages the Facade pattern and polymorphism to structure the code concisely, hide complexity, and enhance flexibility. These patterns and concepts are utilized as follows:

Facade Pattern
The Facade pattern is implemented through the Employee class, which implements the IOrderTaker and IBaker interfaces. This class abstracts the complexity of interacting with the MamasPizzaEngine and provides a simplified interface. While client code uses the orderTaker and baker objects to perform order processing and preparation, the actual operations are carried out internally using the MamasPizzaEngine object. This enhances code readability and abstracts order and preparation tasks effectively.

Utilization of Polymorphism
Polymorphism is employed in the Employee class, which implements both the IOrderTaker and IBaker interfaces. This allows the Employee class to receive and process orders while simultaneously handling pizza preparation. It means that client code can utilize the Employee class as either an IOrderTaker or IBaker, enhancing code reusability and flexibility.

Furthermore, the MamasPizzaEngine class also encapsulates the order processing and preparation engine using the Facade pattern. Client code indirectly interacts with the MamasPizzaEngine object through the Employee class.

These design patterns and polymorphism contribute to making the project more manageable, maintainable, and adaptable.




Mama's Pizza 주문 및 제조 엔진
Mama's Pizza 주문 및 제조 엔진은 피자 주문을 처리하고 제조하는 간단한 시스템입니다. 이 프로젝트는 Java로 개발되었으며, 고객, 직원, 주문, 그리고 주문 처리 및 제조를 관리하기 위한 여러 클래스와 인터페이스를 포함하고 있습니다.

기능
Mama's Pizza 엔진은 다음과 같은 주요 기능을 제공합니다:

고객 정보 관리: 고객 이름, 전화번호 및 주소를 관리할 수 있습니다.

주문 처리: 주문을 추가하고, 주문 제조를 시작하며, 제조가 완료된 주문을 처리할 수 있습니다.

주문 큐 관리: 주문이 처리되기를 대기 중인 큐를 관리하고, 주문 처리 단계를 관리합니다.

주문 상태 추적: 주문의 현재 상태 (대기 중, 제조 중, 완료)를 추적합니다.

주문 상세 정보: 주문 큐 및 완료된 주문의 상세 정보를 확인할 수 있습니다.

클래스 및 인터페이스
프로젝트는 다음과 같은 주요 클래스와 인터페이스로 구성됩니다:

Customer: 고객 정보를 나타내는 클래스입니다. 이름, 전화번호 및 주소를 관리합니다.

Employee: 직원을 나타내는 클래스로, IBaker 및 IOrderTaker 인터페이스를 구현하여 주문 처리 및 제조 기능을 제공합니다.

MamasPizzaEngine: 주문 처리 엔진 클래스로, 주문 큐 및 주문 상태 관리를 수행합니다.

PizzaOrder: 피자 주문을 나타내는 클래스로, 고객 정보, 피자 크기, 토핑 및 주문 상태를 관리합니다.

Size: 피자 크기를 정의하는 열거형입니다 (SMALL, MEDIUM, LARGE).

Toppings: 토핑 종류를 정의하는 열거형입니다 (CHEESE, PINEAPPLE, EXTRACHEESE, EXTRAPINEAPPLE).

OrderStatus: 주문 상태를 정의하는 열거형입니다 (PENDING, PREPARING, COMPLETE).

IBaker 및 IOrderTaker 인터페이스: 직원 클래스가 구현하는 인터페이스로, 주문 처리 및 제조 관련 메서드를 정의합니다.


Facade 패턴 및 다형성 활용
Mama's Pizza 주문 및 제조 엔진 프로젝트는 Facade 패턴과 다형성을 활용하여 코드를 간결하게 구조화하고, 복잡성을 숨기며, 프로젝트의 유연성을 향상시킵니다. 이러한 패턴 및 개념은 다음과 같이 사용됩니다:

Facade 패턴
Facade 패턴은 IOrderTaker 및 IBaker 인터페이스를 구현한 Employee 클래스를 통해 구현되었습니다. 이 클래스는 MamasPizzaEngine에 대한 클라이언트의 복잡성을 숨기고 단순한 인터페이스를 제공합니다. 클라이언트 코드에서 orderTaker 및 baker 객체를 사용하여 주문 처리 및 제조 작업을 수행하는 동안, 실제로는 내부적으로 MamasPizzaEngine 객체를 활용하여 모든 작업을 수행합니다. 이로써 코드의 가독성이 향상되며, 주문 및 제조 작업이 간단하게 추상화됩니다.

다형성 활용
다형성은 IOrderTaker 및 IBaker 인터페이스를 구현한 Employee 클래스에서 활용되었습니다. Employee 클래스는 두 인터페이스를 구현하여 주문을 받고 처리하며, 동시에 주문을 제조할 수 있습니다. 이는 클라이언트 코드가 Employee 클래스를 IOrderTaker 또는 IBaker로 사용할 수 있음을 의미하며, 코드의 재사용성과 유연성을 높입니다.

또한, MamasPizzaEngine 클래스도 Facade 패턴을 활용하여 주문 처리 및 제조 엔진을 캡슐화합니다. 클라이언트 코드에서는 MamasPizzaEngine 객체를 직접 다루지 않고, Employee 클래스를 통해 간접적으로 상호작용합니다.
