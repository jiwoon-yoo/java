Unzip Assignment4 and open in VSCode.

In this assignment we are going to build a Nerdle game!  Nerdle is very similar to the popular game Wordle without being similar enough to get us sued ;-P

I was originally going to make you build the whole thing yourself which would require you to learn all about TextFlow on your own but, after speaking to a number of students about current workloads in other classes, I have remembered how much I hated all the profs dumping things on us towards the end of the term and I have taken pity on you ;->  

Instead, I have given you everything you need with the exception of the NerdleEngine class.  Hopefully you will use the extra time to work on your project!

See the attached video to understand how Nerdle works.

You have been given a class called GuessResponse.  This is a POJO (plain old java object) that contains three pieces of information:
•	guessNumber – what guess number is this responding to
•	guess – what is the word that the user guessed
•	letterStatus which is an array of 5 ints
o	Each element of the array contains either a 0 (the corresponding letter in the guess is not in the secret word), a 1 (the corresponding letter in the guess is in the secret word but is in the wrong position), or a 2 (the corresponding letter in the guess is in the secret word and in the correct position)
•	Note that all Nerdle words only have 1 of each kind of letter in them.  This makes things easier!
You have also been given the Start class, the fxml and the controller for Nerdle.  All you have to do is to write the NerdleEngine class so that your game works correctly.
As for the NerdleEngine, here are some notes:
•	You should have an instance variable called guessNumber which will represent which guess number the user is on.
•	You should have an instance variable that contains the secretWord that the user is trying to guess.
•	The constructor should call the selectSecretWordFromFile method so that it can place a random secret word in the secretWord instance variable.  This will be the word that the user is trying to guess.
•	The private method called selectSevretWordFromFile will accept no arguments and return a String.  This method will read the contents of the words.txt file and will randomly return one of the words from it.  Be sure that you protect your code from things like missing files etc.
•	A method called makeGuess will accept a String (the user’s guess) and return a GuessResponse object.  Remember that GuessResponse has three fields in it that this method must correctly set.
o	This method will compare the user’s guess with the secretWord instance variable and relay that information via the GuessResponse object.
o	The letterStatus field in the GuessResponse is an int array with 5 elements.
	Each element will have either a 0, a 1, or a 2 in it.
	For example, if the secretWord was BEACH and the user had guessed SNAKE, the array would look like this:
•	[0,0,2,0,1]  -This indicates that:
o	 the S in Snake is not a letter in the secretWord (BEACH) [0,x,x,x,x]
o	The N in sNake is not a letter in the secretWord (BEACH) [x,0,x,x,x]
o	The A in snAke is a letter in the secretWord (BEACH) and is in the same position as it is in BEACH. [x,x,2,x,x]
o	The K in snaKe is not a letter in the secretWord (BEACH)[x,x,x,0,x]
o	The E in snakE is a letter in the secretWord (BEACH) but it is not in the correct position [x,x,x,x,1]




<korean>
압축 파일을 풀고 VSCode에서 열어주세요.

이 과제에서는 Nerdle 게임을 만들 것입니다! Nerdle은 Wordle이라는 인기 있는 게임과 매우 유사하지만 저희를 소송당할만큼 유사하지는 않습니다 ;-P

원래는 TextFlow에 대해 모두 직접 배우도록 하여 전체 게임을 직접 만들도록 할 예정이었습니다. 그러나 다른 수업의 현재 작업 부하에 대해 몇 명의 학생들과 이야기한 후에는 학기 말에 교수들이 우리에게 많은 일을 던지는 것이 얼마나 싫었는지 기억이 나서 동정심을 느꼈습니다 ;->

대신, NerdleEngine 클래스를 제외한 모든 것을 제공해 드렸습니다. 희망컨대 여분의 시간을 프로젝트에 할애하여 작업할 수 있기를 바랍니다!

Nerdle이 어떻게 작동하는지 이해하기 위해 첨부된 동영상을 확인하세요.

GuessResponse라는 클래스가 제공되었습니다. 이는 세 가지 정보를 포함하는 POJO(Plain Old Java Object)입니다:
• guessNumber - 이에 대한 응답으로 어떤 추측 번호인지
• guess - 사용자가 추측한 단어
• letterStatus - 5개의 정수 배열입니다.
각 배열 요소에는 0(추측한 단어의 해당하는 글자가 비밀 단어에 없음), 1(추측한 단어의 해당하는 글자가 비밀 단어에 있지만 올바른 위치에 있지 않음) 또는 2(추측한 단어의 해당하는 글자가 비밀 단어에 있고 올바른 위치에 있음) 중 하나가 포함됩니다.
• 모든 Nerdle 단어에는 각 종류의 글자가 하나씩만 들어 있습니다. 이렇게 하면 작업이 쉬워집니다!

또한 Start 클래스, fxml 및 Nerdle의 컨트롤러가 제공되었습니다. 단지 NerdleEngine 클래스를 작성하여 게임이 올바르게 작동하도록 하면 됩니다.

NerdleEngine에 대해 몇 가지 참고 사항이 있습니다:
• guessNumber라는 인스턴스 변수를 가져야 합니다. 이는 사용자가 현재 몇 번째 추측을 하는지를 나타냅니다.
• 사용자가 추측하려는 비밀 단어를 포함하는 인스턴스 변수가 있어야 합니다.
• 생성자는 selectSecretWordFromFile 메서드를 호출하여 secretWord 인스턴스 변수에 임의의 비밀 단어를 배치할 수 있도록 해야 합니다. 이 단어는 사용자가 추측하려는 단어입니다.
• selectSecretWordFromFile라는 비공개 메서드는 인수를 받지 않고 String을 반환합니다. 이 메서드는 words.txt 파일의 내용을 읽고 그 중 하나의 단어를 무작위로 반환합니다. 파일이 없는 등의 문제에서 코드를 보호하도록 주의해야 합니다.
• makeGuess라는 메서드는 String(사용자의 추측)를 받아들이고 GuessResponse 객체를 반환할 것입니다. GuessResponse에는 세 개의 필드가 있으며 이 메서드에서 올바르게 설정해야 합니다.
• 이 메서드는 사용자의 추측을 secretWord 인스턴스 변수와 비교하고 해당 정보를 GuessResponse 객체를 통해 전달해야 합니다.
• GuessResponse의 letterStatus 필드는 5개의 요소로 구성된 int 배열입니다.
각 요소는 0, 1 또는 2를 가집니다.
예를 들어, secretWord가 BEACH이고 사용자가 SNAKE를 추측한 경우 배열은 다음과 같을 것입니다:
[0,0,2,0,1] - 이는 다음을 나타냅니다:
o Snake의 S는 비밀 단어(BEACH)에 포함되지 않음을 나타냅니다. [0,x,x,x,x]
o sNake의 N은 비밀 단어(BEACH)에 포함되지 않음을 나타냅니다. [x,0,x,x,x]
o snAke의 A는 비밀 단어(BEACH)에 포함되며 BEACH의 위치와 동일한 위치에 있습니다. [x,x,2,x,x]
o snaKe의 K는 비밀 단어(BEACH)에 포함되지 않음을 나타냅니다. [x,x,x,0,x]
o snakE의 E는 비밀 단어(BEACH)에 포함되지만 올바른 위치에 있지 않음을 나타냅니다. [x,x,x,x,1]
