
•	Download the .zip file and open in VSCode.  
•	There are 2 packages in this project:
o	A3startclass includes the Start class which has the main method.
o	A3allotherclasses is where you will place all other classes.  
•	You will have to correctly import classes to make the Start class work.
Person:
•	Add a comment to indicate the relationship between Person and Heart 
•	Add a comment to indicate the relationship between Person and Book
•	Add a comment to indicate the relationship between Person and Bookshelf 
•	whatBookDoIHave will return a String that either contains <name> has no book  if the instance variable Book is null or <name> has the book: <title> if the instance variable book holds a reference to a Book object.
•	retrieveBookFromBookshelf accepts a String title and a BookShelf.  It will call the retrieveBookFromBookshelf method in the Bookshelf class and place the returned value in the book instance variable.
•	putBookOnBookshelf will accept a Bookshelf object and place the book that is in the book instance variable onto the Bookshelf object by calling the addBookToBookshelf method of the Bookshelf object

•	makeHeartPump will call the oneMinute method of the Heart Object
Bookshelf
•	Contains an instance variable called books that is an array of 10 Book objects
•	addBookToBookshelf accepts a Book object and adds it to the first element of the books array that holds a null value.
•	
•	retrieveBookFromBookshelf accepts a String containing a title and looks for a Book object in the array that has a title instance variable that matches.  If it finds one, it returns the Book object.  (If you return a Book, you should remove it from the shelf by setting that element to null!) If it doesn’t find the Book object, it returns null
•	displayBooks will PRINT out the titles of all Book objects that are stored in the books array.	//
•	howManyBooks will return the number of array elements in the books array that are not null
Heart
•	oneMinute method will print out the heartBeat instance variable as many times as the bpm instance variable is set to.



<korean>

• .zip 파일을 다운로드하고 VSCode에서 열어주세요.
• 이 프로젝트에는 2개의 패키지가 있습니다:
o A3startclass: main 메서드가 있는 Start 클래스가 포함되어 있습니다.
o A3allotherclasses: 다른 모든 클래스를 배치할 위치입니다.
• Start 클래스가 작동하도록 클래스를 올바르게 import해야 합니다.
Person:
• Person과 Heart 사이의 관계를 나타내는 주석을 추가하세요.
• Person과 Book 사이의 관계를 나타내는 주석을 추가하세요.
• Person과 Bookshelf 사이의 관계를 나타내는 주석을 추가하세요.
• whatBookDoIHave 메서드는 instance 변수 Book이 null인 경우 <name> has no book을 반환하고, Book 객체에 대한 참조가 있는 경우 <name> has the book: <title>을 반환하는 문자열을 반환합니다.
• retrieveBookFromBookshelf 메서드는 String title과 BookShelf를 받아들입니다. 이는 Bookshelf 클래스의 retrieveBookFromBookshelf 메서드를 호출하고 반환된 값을 book 인스턴스 변수에 저장합니다.
• putBookOnBookshelf 메서드는 Bookshelf 객체를 받아들이고, book 인스턴스 변수에 있는 책을 Bookshelf 객체에 addBookToBookshelf 메서드를 호출하여 배치합니다.

• makeHeartPump 메서드는 Heart 객체의 oneMinute 메서드를 호출합니다.
Bookshelf:
• books라는 인스턴스 변수가 10개의 Book 객체 배열을 포함합니다.
• addBookToBookshelf 메서드는 Book 객체를 받아들이고, null 값을 가진 books 배열의 첫 번째 요소에 추가합니다.
• retrieveBookFromBookshelf 메서드는 제목 인스턴스 변수와 일치하는 Book 객체를 배열에서 찾습니다. 찾으면 해당 Book 객체를 반환합니다. (Book을 반환하는 경우 해당 요소를 null로 설정하여 책장에서 제거해야 합니다!) Book 객체를 찾지 못한 경우 null을 반환합니다.
• displayBooks 메서드는 books 배열에 저장된 모든 Book 객체의 제목을 출력합니다.
• howManyBooks 메서드는 books 배열에서 null이 아닌 요소의 수를 반환합니다.
Heart:
• oneMinute 메서드는 heartBeat 인스턴스 변수를 bpm 인스턴스 변수로 설정한 횟수만큼 출력합니다.
