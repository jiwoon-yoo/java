
FileManager for Item Objects
The FileManager class in the demo1 package provides functionality to persist Item objects to and load them from disk. This class includes methods to save an ArrayList<Item> to a CSV file on disk and to load the stored data from a CSV file back into an ArrayList<Item>.

Compression and Restoration of Item Objects
This class compresses Item objects into a CSV file for storage and restores the data when loading, converting it back into Item objects. The process of compression and restoration works as follows:

Compression of Item Objects (Deflating)
The saveCartToDisk method takes an ArrayList<Item> cart as input.
It stores the SKU, description, and price information of each Item object by separating them with commas and saves them to the CSV file.
Restoration of Item Objects (Re-Inflating)
The loadCartFromDisk method loads the CSV file from the disk.
It extracts the SKU, description, and price information of each line's data by splitting them at commas.
Using the extracted information, it creates Item objects and adds them to an ArrayList<Item>.

Exception Handling
The FileManager class handles exceptions that may occur during file operations. It catches FileNotFoundException when a file is not found and throws a custom CorruptedFileException if the loaded file appears to be corrupted.



아이템 객체를 위한 FileManager
demo1 패키지의 FileManager 클래스는 Item 객체를 디스크에 유지하고 불러오는 기능을 제공합니다. 이 클래스에는 ArrayList<Item>을 CSV 파일로 디스크에 저장하고, 저장된 데이터를 CSV 파일에서 불러와 ArrayList<Item>으로 변환하는 메서드가 포함되어 있습니다.

아이템 객체의 압축 및 복원
이 클래스는 아이템 객체를 CSV 파일에 압축하여 저장하고, 불러올 때 해당 데이터를 복원하여 아이템 객체로 다시 변환합니다. 이러한 압축 및 복원 작업을 수행하는 과정은 다음과 같습니다:

아이템 객체 압축 (Deflating)
saveCartToDisk 메서드는 ArrayList<Item>인 카트를 받습니다.
각 아이템 객체의 SKU, 설명 및 가격 정보를 쉼표로 구분하여 CSV 파일에 저장합니다.
아이템 객체 복원 (Re-Inflating)
loadCartFromDisk 메서드는 디스크의 CSV 파일을 불러옵니다.
각 줄의 데이터를 쉼표로 구분하여 아이템 객체의 SKU, 설명 및 가격 정보를 추출합니다.
추출한 정보를 사용하여 Item 객체를 생성하고, 이를 ArrayList<Item>에 추가합니다.

예외 처리
FileManager 클래스는 파일 작업 중 발생할 수 있는 예외를 처리합니다. 파일을 찾지 못했을 때 FileNotFoundException 예외를 처리하며, 불러온 파일이 손상되었을 경우에는 사용자 정의 CorruptedFileException을 던집니다.
