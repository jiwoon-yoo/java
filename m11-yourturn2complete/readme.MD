YourTurn2Complete Project
Introduction
YourTurn2Complete is a Java project that demonstrates object-oriented programming concepts such as abstraction, inheritance, and polymorphism. It includes classes managing members of a service and a specialized queue system for member services.

Contents
1. Member Abstract Class
Stores member information: name, email, and member status.
Constructor accepts name and email, sets instance variables.
Getters for all instance variables.
Abstract method getEmployeeScriptForMemberPickup.
2. RegularMember Concrete Class
Extends Member.
Sets memberStatus to REGULAR.
Implements getEmployeeScriptForMemberPickup with a script for regular members.
3. PlatinumMember Concrete Class
Extends Member.
Sets memberStatus to PLATINUM.
Implements getEmployeeScriptForMemberPickup with a special script for platinum members.
4. MemberStatus Enum
Enumerated type with values REGULAR and PLATINUM.
5. RentalEngine Class
Manages a queue system for members.
Two queues: platinumQueue for platinum members and regularQueue for regular members.
Two methods:
addMemberToQueue - Accepts a Member and returns a Boolean. Platinum members take precedence over regular members in the queue.
getNextMemberInQueue - Accepts nothing and returns the next member to be waited on. Always gives precedence to platinum members.
6. Start2b Class
Demonstrates the functionality of the RentalEngine class.
Adds members to the queue and prints the scripts for the next members in the queue.






YourTurn2Complete 프로젝트
소개
YourTurn2Complete는 자바를 사용한 객체 지향 프로그래밍 개념을 보여주는 프로젝트입니다. 이 프로젝트는 서비스 회원 관리 및 회원 서비스를 위한 특수한 대기열 시스템을 구현한 클래스들로 구성되어 있습니다.

내용
1. Member 추상 클래스
회원 정보를 저장합니다: 이름, 이메일 및 회원 상태.
생성자는 이름과 이메일을 받아 적절한 인스턴스 변수를 설정합니다.
모든 인스턴스 변수에 대한 게터가 있습니다.
getEmployeeScriptForMemberPickup라는 추상 메서드가 있습니다.
2. RegularMember 구체 클래스
Member를 확장합니다.
memberStatus를 REGULAR로 설정합니다.
getEmployeeScriptForMemberPickup를 일반 회원을 위한 스크립트로 구현합니다.
3. PlatinumMember 구체 클래스
Member를 확장합니다.
memberStatus를 PLATINUM으로 설정합니다.
getEmployeeScriptForMemberPickup를 특별한 스크립트로 구현합니다.
4. MemberStatus Enum
값으로 REGULAR 및 PLATINUM을 가지는 Enum 타입.
5. RentalEngine 클래스
회원을 위한 대기열 시스템을 관리합니다.
두 개의 큐: platinumQueue는 플래티넘 회원, regularQueue는 일반 회원을 위한 것.
두 가지 메서드:
addMemberToQueue - Member를 받아 Boolean을 반환합니다. 대기열에서 플래티넘 회원은 일반 회원보다 우선권을 가집니다.
getNextMemberInQueue - 아무것도 받지 않고 대기 중인 다음 회원을 반환합니다. 항상 플래티넘 회원에게 우선권을 부여합니다.
6. Start2b 클래스
RentalEngine 클래스의 기능을 시연합니다.
대기열에 회원을 추가하고 대기열에서 다음 회원의 스크립트를 출력합니다.
