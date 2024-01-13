Browser History Simulation
This Java program simulates a basic web browser's navigation history. The Browser class implements the Browsable interface and uses two stacks, backHistory and forwardHistory, to manage the user's browsing history.

Features:
Current URL Management:

The currentURL variable stores the URL of the currently visited site.
Backward Navigation:

The goBack method allows the user to navigate to the previous site. The current URL is added to the forwardHistory stack, and the URL from the backHistory stack becomes the current URL.
Forward Navigation:

The goForward method allows the user to navigate to the next site if available in the forwardHistory stack. The current URL is added to the backHistory stack, and the URL from the forwardHistory stack becomes the current URL.
URL Navigation:

The gotoURL method allows the user to navigate to a specified URL. The current URL is added to the backHistory stack, and the specified URL becomes the current URL. The forwardHistory stack is cleared.




사용 방법
이 Java 프로그램은 기본적인 웹 브라우저의 탐색 이력을 시뮬레이션합니다. Browser 클래스는 Browsable 인터페이스를 구현하며, 사용자의 탐색 이력을 관리하기 위해 두 개의 스택, backHistory와 forwardHistory를 사용합니다.

주요 기능:
현재 URL 관리:

currentURL 변수는 현재 방문 중인 사이트의 URL을 저장합니다.
뒤로 가기:

goBack 메서드를 사용하여 사용자는 이전 사이트로 이동할 수 있습니다. 현재 URL은 forwardHistory 스택에 추가되고, backHistory 스택에서 URL이 현재 URL이 됩니다.
앞으로 가기:

goForward 메서드를 사용하여 사용자는 forwardHistory 스택에서 다음 사이트로 이동할 수 있습니다. 현재 URL은 backHistory 스택에 추가되고, forwardHistory 스택에서 URL이 현재 URL이 됩니다.
URL 탐색:

gotoURL 메서드를 사용하여 사용자는 지정된 URL로 이동할 수 있습니다. 현재 URL은 backHistory 스택에 추가되고, 지정된 URL이 현재 URL이 됩니다. forwardHistory 스택은 지워집니다.
