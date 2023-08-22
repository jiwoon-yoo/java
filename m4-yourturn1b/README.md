package yourturn1b;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
/*
 * Test your code from 1a by writing a class with a main method in yourturn1b.
 *
 * Instantiate an Animal object...Remember, Animal isn't in this package so we
 * have to import it!
 *



 * Your Turn 1b:
 * In the yourturn1b package, make two classes named after your favourite kinds
 * of animals (for instance, Lion and Dog) Your class should be named after the


 * KIND of animal it represents. For instance, Lion, Tiger, Dog etc.
 * Make these two classes inherit from Animal - Whoops...what do we have to do
 * to the access modifiers in our Animal class? How can we see the Animal class
 * that's in the yourturn1a package from this code which is in the yourturn1b
 * package?
 * In the Start class with the main method, instantiate one of each kind of
 * these animals in the main method and prove that the makeNoise and eat methods
 * work!
 *


 * YourTurn 1c:
 * Override the makeNoise method in each class so that the Object makes the
 * correct kind of noise. For instance, a Lion should ROAR! A Dog should BARK!
 * uh oh...why can't you see name from the makeNoise method? How can you fix it?
 * YourTurn 1d:
 * Now, add a constructor to the Animal class so that you can set the name,
 * numberOfLegs, and favFood through constructor injection.
 * Make changes to your main method in the Start class to allow your code to use
 * 'constructor injection'
 * Uh oh...what went wrong? Why? Can you fix it?
 *
 * Hmmm....in our Animal class, we don't know what kind of animal it will be so
 * we need to pass in numberOfLegs to the constructor. However, if we Make a Dog
 * class that extends animal, we know that dogs have four legs so we should make
 * our Dog constructor only need the name and favFood passed to it. However, our
 * Animal class still expects 3 arguments to be passed to it. How can we do
 * this?
 *
 * YourTurn 1e:
 * Make Animal abstract and make makeNoise an abstract method - Now, make a
 * third Class that inherits from Animal called Snake. Do what you need to do in
 * order to get Snake to work correctly.
 * */


 * Your Turn 1b:
 * yourturn1b 패키지에, 당신이 좋아하는 동물 종류에 해당하는 두 개의 클래스를 만드세요
 * (예: Lion과 Dog). 클래스의 이름은 해당 동물 종류를 나타내야 합니다. 예를 들어 Lion, Tiger, Dog 등이 될 수 있습니다.
 * 이 두 클래스를 Animal 클래스에서 상속받도록 만드세요 - 어머나... Animal 클래스의 접근 한정자를 어떻게 변경해야 할까요?
 * yourturn1a 패키지에 있는 Animal 클래스를 yourturn1b 패키지의 이 코드에서 어떻게 볼 수 있을까요?
 * main 메서드를 가진 Start 클래스에서 각각의 동물 종류의 인스턴스를 생성하고, makeNoise와 eat 메서드가 작동하는지 증명하세요!
 *
 * YourTurn 1c:
 * 각 클래스에서 makeNoise 메서드를 오버라이드하여 올바른 종류의 소리가 나도록 만드세요.
 * 예를 들어, Lion은 으르렁거릴 것입니다! Dog는 왈츠할 것입니다! 응? makeNoise 메서드에서 name을 왜 볼 수 없을까요?
 * 어떻게 고칠 수 있을까요?
 *
 * YourTurn 1d:
 * 이제 Animal 클래스에 생성자를 추가하여 이름, 다리의 수, 좋아하는 음식을 생성자 주입을 통해 설정할 수 있도록 하세요.
 * Start 클래스의 main 메서드를 수정하여 '생성자 주입'을 사용하도록 코드를 변경하세요.
 * 응? 무슨 문제가 생겼을까요? 왜 그럴까요? 고칠 수 있을까요?
 *
 * 흠... Animal 클래스에서 어떤 종류의 동물이 될지 모르므로 생성자에 numberOfLegs를 전달해야 합니다.
 * 그러나 Dog 클래스를 만들 때, 개는 네 다리를 가지므로 Dog 생성자는 이름과 좋아하는 음식만 전달받아야 할 것입니다.
 * 그러나 Animal 클래스는 여전히 3개의 인수가 전달되어야 한다고 예상하고 있습니다.
 * 어떻게 해결할 수 있을까요?
 *
 * YourTurn 1e:
 * Animal을 추상 클래스로 만들고 makeNoise를 추상 메서드로 만드세요.
 * 이제 Animal에서 상속받은 Snake라는 세 번째 클래스를 만드세요. Snake가 올바르게 작동하도록 필요한 작업을 수행하세요.
 */
