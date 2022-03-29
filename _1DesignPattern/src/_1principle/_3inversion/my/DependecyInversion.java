package _1principle._3inversion.my;

/***
 * @Author szq
 * @Description  接口传递
 *@Date 2021/9/4 10:09
 * @Param 
 * @return 
 **/
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
 class Email {
    public String getInfo(){
        return "电子邮件信息：hello world";
    }

}
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }


}