public class UserDemoApp{

  public static void main(String[] args){

    User chewie = new User("Chewbacca");

    System.out.println(chewie.userName);
    System.out.println(User.userName);

    User vader = new User("Vader");

    System.out.println(vader.userName);
    System.out.println(chewie.userName);
  }
}
