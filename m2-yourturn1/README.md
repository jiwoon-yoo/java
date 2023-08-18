Treasure Hunt Program Description
This program, StartTreasureHunt, simulates a treasure hunt scenario using a chain of Treasure objects. Each Treasure object represents a location with a certain number of gold coins. The program establishes relationships between the treasures to create a sequential order.

Treasure Class
The Treasure class represents a treasure location and holds the following information:

goldCoin: An integer indicating the number of gold coins at the treasure location.
nextTreasure: A reference to the next treasure in the sequence.
prevTreasure: A reference to the previous treasure in the sequence.
The Treasure class provides methods to set and get the next and previous treasures, as well as the number of gold coins at the current treasure.

StartTreasureHunt Class
The StartTreasureHunt class is the main class that initiates the treasure hunt simulation. It creates several Treasure objects and establishes connections between them using the setNextTreasure and setPrevTreasure methods.

The program then performs a series of actions, including accessing the relationships between the treasures and calculating the total number of gold coins in certain sequences. These actions demonstrate how the treasure objects and their relationships are utilized in the context of the program.

Important Note: In the comments of the code, there are lines of code that are commented out. These lines of code represent different scenarios that you can uncomment and observe how they affect the program's behavior. Some of them might lead to exceptions due to the specific relationships established between the treasure objects.

At the end of the program, memory diagram drawings and print statements are used to showcase the interactions and calculations that take place within the program.

Overall, this program provides an interactive way to explore the concept of linked objects and their relationships within a treasure hunt scenario.




보물 찾기 프로그램 설명
이 프로그램인 StartTreasureHunt은 보물 찾기 시나리오를 시뮬레이션하는 프로그램입니다. 각각의 Treasure 객체는 일정한 개수의 금화를 가진 위치를 나타냅니다. 프로그램은 보물들 간에 순차적인 순서를 만들기 위해 관계를 설정합니다.

Treasure 클래스
Treasure 클래스는 보물 위치를 나타내며 다음 정보를 보유합니다:

goldCoin: 해당 보물 위치의 금화 개수를 나타내는 정수입니다.
nextTreasure: 시퀀스에서 다음 보물에 대한 참조입니다.
prevTreasure: 시퀀스에서 이전 보물에 대한 참조입니다.
Treasure 클래스는 다음과 이전 보물을 설정하고 가져오는 메서드뿐만 아니라 현재 보물의 금화 개수를 설정하고 가져올 수 있는 메서드를 제공합니다.

StartTreasureHunt 클래스
StartTreasureHunt 클래스는 보물 찾기 시뮬레이션을 시작하는 주요 클래스입니다. 여러 개의 Treasure 객체를 생성하고 setNextTreasure와 setPrevTreasure 메서드를 사용하여 그들 사이의 연결을 설정합니다.

프로그램은 다음과 같은 일련의 동작을 수행합니다. 이 동작에는 보물들 간의 관계에 접근하고 특정 순서에서 금화의 총 개수를 계산하는 것이 포함됩니다. 이러한 동작은 보물 객체와 그들의 관계가 프로그램의 맥락에서 어떻게 활용되는지를 보여줍니다.

중요한 참고: 코드의 주석에는 주석 처리된 코드 줄이 있습니다. 이 코드 줄들은 해제하여 프로그램의 동작에 어떤 영향을 미치는지 관찰할 수 있는 다양한 시나리오를 나타냅니다. 그 중 일부는 특정 보물 객체 간에 설정된 관계 때문에 예외가 발생할 수 있습니다.

프로그램의 마지막 부분에서는 메모리 다이어그램 그리기와 출력 문장을 사용하여 프로그램 내에서 어떤 상호 작용과 계산이 이루어지는지를 시각적으로 보여줍니다.

전반적으로 이 프로그램은 보물 찾기 시나리오 내에서 연결된 객체와 그들의 관계를 탐구하는 상호 작용적인 방법을 제공합니다.
